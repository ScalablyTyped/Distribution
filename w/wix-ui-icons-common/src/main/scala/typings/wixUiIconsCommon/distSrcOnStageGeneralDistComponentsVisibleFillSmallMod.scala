package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsVisibleFillSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/VisibleFillSmall", JSImport.Default)
  @js.native
  val default: FC[VisibleFillSmallProps] = js.native
  
  trait VisibleFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VisibleFillSmallProps {
    
    inline def apply(): VisibleFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibleFillSmallProps]
    }
    
    extension [Self <: VisibleFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VisibleFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsVisibleFillSmallMod.foo` */
  override def _to: FC[VisibleFillSmallProps] = default
}
