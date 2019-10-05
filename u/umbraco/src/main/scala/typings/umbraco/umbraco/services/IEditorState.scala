package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
  * it is possible to modify this object, so should be used with care
  */
trait IEditorState extends js.Object {
  var current: js.Any
  var state: IState
}

object IEditorState {
  @scala.inline
  def apply(current: js.Any, state: IState): IEditorState = {
    val __obj = js.Dynamic.literal(current = current, state = state)
  
    __obj.asInstanceOf[IEditorState]
  }
}

