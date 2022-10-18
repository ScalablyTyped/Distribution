package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsMoreSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/MoreSmall", JSImport.Default)
  @js.native
  val default: FC[MoreSmallProps] = js.native
  
  trait MoreSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoreSmallProps {
    
    inline def apply(): MoreSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoreSmallProps]
    }
    
    extension [Self <: MoreSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoreSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsMoreSmallMod.foo` */
  override def _to: FC[MoreSmallProps] = default
}
