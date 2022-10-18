package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import typings.wordpressComponents.flexItemMod.FlexItem.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexItemMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/flex/item", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object FlexItem {
    
    type Props = HTMLProps[HTMLDivElement]
  }
}
