package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tshirtMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TShirt", JSImport.Default)
  @js.native
  val default: SFC[TShirtProps] = js.native
  
  trait TShirtProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TShirtProps {
    
    @scala.inline
    def apply(): TShirtProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TShirtProps]
    }
    
    @scala.inline
    implicit class TShirtPropsMutableBuilder[Self <: TShirtProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TShirtProps]
  
  /* This means you don't have to write `default`, but can instead just say `tshirtMod.foo` */
  override def _to: SFC[TShirtProps] = default
}
