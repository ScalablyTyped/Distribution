package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.componentsPostPendingStatusMod.PostPendingStatus.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPostPendingStatusMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-pending-status", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostPendingStatus {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
    }
  }
}
