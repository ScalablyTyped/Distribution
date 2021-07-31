package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeAndRatioMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SizeAndRatio", JSImport.Default)
  @js.native
  val default: SFC[SizeAndRatioProps] = js.native
  
  trait SizeAndRatioProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SizeAndRatioProps {
    
    @scala.inline
    def apply(): SizeAndRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeAndRatioProps]
    }
    
    @scala.inline
    implicit class SizeAndRatioPropsMutableBuilder[Self <: SizeAndRatioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SizeAndRatioProps]
  
  /* This means you don't have to write `default`, but can instead just say `sizeAndRatioMod.foo` */
  override def _to: SFC[SizeAndRatioProps] = default
}
