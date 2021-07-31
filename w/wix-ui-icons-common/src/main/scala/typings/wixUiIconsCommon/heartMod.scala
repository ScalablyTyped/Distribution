package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Heart", JSImport.Default)
  @js.native
  val default: SFC[HeartProps] = js.native
  
  trait HeartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HeartProps {
    
    @scala.inline
    def apply(): HeartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartProps]
    }
    
    @scala.inline
    implicit class HeartPropsMutableBuilder[Self <: HeartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HeartProps]
  
  /* This means you don't have to write `default`, but can instead just say `heartMod.foo` */
  override def _to: SFC[HeartProps] = default
}
