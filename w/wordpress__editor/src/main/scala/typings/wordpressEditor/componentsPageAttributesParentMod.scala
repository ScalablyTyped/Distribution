package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.componentsPageAttributesParentMod.PageAttributesParent.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPageAttributesParentMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/page-attributes/parent", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PageAttributesParent {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
    }
  }
}
