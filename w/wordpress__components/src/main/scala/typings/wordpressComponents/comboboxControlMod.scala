package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.Label
import typings.wordpressComponents.anon.Selected
import typings.wordpressComponents.comboboxControlMod.ComboboxControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboboxControlMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/combobox-control", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ComboboxControl {
    
    @js.native
    trait Props extends StObject {
      
      var allowReset: js.UndefOr[Boolean] = js.native
      
      var className: js.UndefOr[String] = js.native
      
      var help: js.UndefOr[ReactNode] = js.native
      
      var hideLabelFromVision: js.UndefOr[Boolean] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var messages: js.UndefOr[Selected] = js.native
      
      def onChange(): Unit = js.native
      def onChange(value: String): Unit = js.native
      
      var onFilterValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
      
      var options: js.Array[Label] = js.native
      
      var value: String = js.native
    }
  }
}
