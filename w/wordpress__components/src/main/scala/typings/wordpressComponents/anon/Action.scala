package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import typings.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action
  extends StObject
     with _OptionCompletion {
  
  var action: `insert-at-caret`
  
  var value: ReactNode
}
object Action {
  
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal(action = "insert-at-caret")
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `insert-at-caret`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
