package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSizeAndRatioMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SizeAndRatio", JSImport.Default)
  @js.native
  val default: FC[SizeAndRatioProps] = js.native
  
  trait SizeAndRatioProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SizeAndRatioProps {
    
    inline def apply(): SizeAndRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeAndRatioProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeAndRatioProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SizeAndRatioProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSizeAndRatioMod.foo` */
  override def _to: FC[SizeAndRatioProps] = default
}
