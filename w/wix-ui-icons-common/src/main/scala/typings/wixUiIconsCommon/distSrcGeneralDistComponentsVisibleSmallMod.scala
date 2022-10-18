package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsVisibleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VisibleSmall", JSImport.Default)
  @js.native
  val default: FC[VisibleSmallProps] = js.native
  
  trait VisibleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VisibleSmallProps {
    
    inline def apply(): VisibleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibleSmallProps]
    }
    
    extension [Self <: VisibleSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VisibleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsVisibleSmallMod.foo` */
  override def _to: FC[VisibleSmallProps] = default
}
