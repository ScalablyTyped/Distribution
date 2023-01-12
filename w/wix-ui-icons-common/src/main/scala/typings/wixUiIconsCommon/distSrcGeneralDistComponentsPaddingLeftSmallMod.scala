package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsPaddingLeftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PaddingLeftSmall", JSImport.Default)
  @js.native
  val default: FC[PaddingLeftSmallProps] = js.native
  
  trait PaddingLeftSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PaddingLeftSmallProps {
    
    inline def apply(): PaddingLeftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaddingLeftSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaddingLeftSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PaddingLeftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsPaddingLeftSmallMod.foo` */
  override def _to: FC[PaddingLeftSmallProps] = default
}
