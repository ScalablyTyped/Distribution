package typings
package umbracoLib.umbracoNs.servicesNs

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
  def getGlobalState(key: java.lang.String): IGlobalState
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
  def getMenuState(key: java.lang.String): IStateObject
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
  def getSectionState(key: java.lang.String): ISectionState
  /** function to validate and set the state on a state object */
  def getState(stateObj: IStateObject, key: java.lang.String, stateObjName: java.lang.String): IStateObject
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
  def getTreeState(key: java.lang.String): ITreeState
  /**
          * @ngdoc function
          * @name umbraco.services.angularHelper#setGlobalState
          * @methodOf umbraco.services.appState
          * @function
          *
          * @description
          * Sets a global state value by key
          */
  def setGlobalState(key: java.lang.String, value: scala.Boolean): scala.Unit
  /**
          * @ngdoc function
          * @name umbraco.services.angularHelper#setMenuState
          * @methodOf umbraco.services.appState
          * @function
          *
          * @description
          * Sets a section state value by key
          */
  def setMenuState(key: java.lang.String, value: IMenuState): scala.Unit
  /**
          * @ngdoc function
          * @name umbraco.services.angularHelper#setSectionState
          * @methodOf umbraco.services.appState
          * @function
          *
          * @description
          * Sets a section state value by key
          */
  def setSectionState(key: java.lang.String, value: ISectionState): scala.Unit
  /** function to validate and set the state on a state object */
  def setState(stateObj: IStateObject, key: java.lang.String, value: js.Any, stateObjName: java.lang.String): scala.Unit
  /**
          * @ngdoc function
          * @name umbraco.services.angularHelper#setTreeState
          * @methodOf umbraco.services.appState
          * @function
          *
          * @description
          * Sets a section state value by key
          */
  def setTreeState(key: java.lang.String, value: ITreeState): scala.Unit
}

