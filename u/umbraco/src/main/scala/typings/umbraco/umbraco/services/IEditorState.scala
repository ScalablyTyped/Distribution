package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
  * it is possible to modify this object, so should be used with care
  */
@js.native
trait IEditorState extends js.Object {
  var current: js.Any = js.native
  var state: IState = js.native
}

object IEditorState {
  @scala.inline
  def apply(current: js.Any, state: IState): IEditorState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorState]
  }
  @scala.inline
  implicit class IEditorStateOps[Self <: IEditorState] (val x: Self) extends AnyVal {
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
    def setCurrent(value: js.Any): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: IState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

