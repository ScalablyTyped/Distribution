package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracks the parent object for complex editors by exposing it as an object reference via editorState.current.entity
  * it is possible to modify this object, so should be used with care
  */
trait IEditorState extends StObject {
  
  var current: js.Any
  
  var state: IState
}
object IEditorState {
  
  @scala.inline
  def apply(current: js.Any, state: IState): IEditorState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorState]
  }
  
  @scala.inline
  implicit class IEditorStateMutableBuilder[Self <: IEditorState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: js.Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: IState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
