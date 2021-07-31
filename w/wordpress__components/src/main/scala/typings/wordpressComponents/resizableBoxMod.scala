package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.reResizable.mod.ResizableProps
import typings.react.mod.ComponentType
import typings.wordpressComponents.resizableBoxMod.ResizableBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizableBoxMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/resizable-box", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ResizableBox {
    
    type Props = ResizableProps
  }
}
