package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsArrowLeftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowLeftSmall", JSImport.Default)
  @js.native
  val default: FC[ArrowLeftSmallProps] = js.native
  
  trait ArrowLeftSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowLeftSmallProps {
    
    inline def apply(): ArrowLeftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowLeftSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowLeftSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowLeftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsArrowLeftSmallMod.foo` */
  override def _to: FC[ArrowLeftSmallProps] = default
}
