package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PrintSmall", JSImport.Default)
  @js.native
  val default: SFC[PrintSmallProps] = js.native
  
  @js.native
  trait PrintSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PrintSmallProps {
    
    @scala.inline
    def apply(): PrintSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintSmallProps]
    }
    
    @scala.inline
    implicit class PrintSmallPropsMutableBuilder[Self <: PrintSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PrintSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `printSmallMod.foo` */
  override def _to: SFC[PrintSmallProps] = default
}
