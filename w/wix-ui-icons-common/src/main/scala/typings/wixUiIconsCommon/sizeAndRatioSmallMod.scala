package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeAndRatioSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SizeAndRatioSmall", JSImport.Default)
  @js.native
  val default: SFC[SizeAndRatioSmallProps] = js.native
  
  trait SizeAndRatioSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SizeAndRatioSmallProps {
    
    inline def apply(): SizeAndRatioSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeAndRatioSmallProps]
    }
    
    extension [Self <: SizeAndRatioSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SizeAndRatioSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sizeAndRatioSmallMod.foo` */
  override def _to: SFC[SizeAndRatioSmallProps] = default
}
