package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.appState
  * @function
  *
  * @description
  * Tracks the various application state variables when working in the back office, raises events when state changes.
  */
trait IAppState extends js.Object {
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getGlobalState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current global state value by key - we do not return an object reference here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getGlobalState(key: String): IGlobalState
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getMenuState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current menu state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getMenuState(key: String): IStateObject
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getSectionState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current section state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getSectionState(key: String): ISectionState
  /** function to validate and set the state on a state object */
  def getState(stateObj: IStateObject, key: String, stateObjName: String): IStateObject
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getTreeState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current tree state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getTreeState(key: String): ITreeState
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setGlobalState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a global state value by key
    */
  def setGlobalState(key: String, value: Boolean): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setMenuState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setMenuState(key: String, value: IMenuState): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setSectionState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setSectionState(key: String, value: ISectionState): Unit
  /** function to validate and set the state on a state object */
  def setState(stateObj: IStateObject, key: String, value: js.Any, stateObjName: String): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setTreeState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setTreeState(key: String, value: ITreeState): Unit
}

object IAppState {
  @scala.inline
  def apply(
    getGlobalState: String => IGlobalState,
    getMenuState: String => IStateObject,
    getSectionState: String => ISectionState,
    getState: (IStateObject, String, String) => IStateObject,
    getTreeState: String => ITreeState,
    setGlobalState: (String, Boolean) => Unit,
    setMenuState: (String, IMenuState) => Unit,
    setSectionState: (String, ISectionState) => Unit,
    setState: (IStateObject, String, js.Any, String) => Unit,
    setTreeState: (String, ITreeState) => Unit
  ): IAppState = {
    val __obj = js.Dynamic.literal(getGlobalState = js.Any.fromFunction1(getGlobalState), getMenuState = js.Any.fromFunction1(getMenuState), getSectionState = js.Any.fromFunction1(getSectionState), getState = js.Any.fromFunction3(getState), getTreeState = js.Any.fromFunction1(getTreeState), setGlobalState = js.Any.fromFunction2(setGlobalState), setMenuState = js.Any.fromFunction2(setMenuState), setSectionState = js.Any.fromFunction2(setSectionState), setState = js.Any.fromFunction4(setState), setTreeState = js.Any.fromFunction2(setTreeState))
    __obj.asInstanceOf[IAppState]
  }
}

