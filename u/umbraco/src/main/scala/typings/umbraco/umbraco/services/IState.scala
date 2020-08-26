package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
  * it is possible to modify this object, so should be used with care */
@js.native
trait IState extends js.Object {
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getCurrent
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Returns an object reference to the current editor entity.
    * the entity is the root object of the editor.
    * EditorState is used by property/parameter editors that need
    * access to the entire entity being edited, not just the property/parameter
    *
    * editorState.current can not be overwritten, you should only read values from it
    * since modifying individual properties should be handled by the property editors
    */
  def getCurrent(): js.Any = js.native
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#reset
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Since the editorstate entity is read-only, you cannot set it to null
    * only through the reset() method
    */
  def reset(): Unit = js.native
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#set
    * @methodOf umbraco.services.editorState
    * @function
    *
    * @description
    * Sets the current entity object for the currently active editor
    * This is only used when implementing an editor with a complex model
    * like the content editor, where the model is modified by several
    * child controllers.
    */
  def set(entity: js.Object): Unit = js.native
}

object IState {
  @scala.inline
  def apply(getCurrent: () => js.Any, reset: () => Unit, set: js.Object => Unit): IState = {
    val __obj = js.Dynamic.literal(getCurrent = js.Any.fromFunction0(getCurrent), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IState]
  }
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCurrent(value: () => js.Any): Self = this.set("getCurrent", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: js.Object => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

