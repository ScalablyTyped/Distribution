package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.postSavedStateMod.PostSavedState.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postSavedStateMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-saved-state", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostSavedState {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var forceIsDirty: js.UndefOr[Boolean] = js.undefined
      
      var forceIsSaving: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setForceIsDirty(value: Boolean): Self = StObject.set(x, "forceIsDirty", value.asInstanceOf[js.Any])
        
        inline def setForceIsDirtyUndefined: Self = StObject.set(x, "forceIsDirty", js.undefined)
        
        inline def setForceIsSaving(value: Boolean): Self = StObject.set(x, "forceIsSaving", value.asInstanceOf[js.Any])
        
        inline def setForceIsSavingUndefined: Self = StObject.set(x, "forceIsSaving", js.undefined)
      }
    }
  }
}
