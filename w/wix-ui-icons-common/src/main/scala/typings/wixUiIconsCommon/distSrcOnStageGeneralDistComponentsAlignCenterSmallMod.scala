package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsAlignCenterSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/AlignCenterSmall", JSImport.Default)
  @js.native
  val default: FC[AlignCenterSmallProps] = js.native
  
  trait AlignCenterSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignCenterSmallProps {
    
    inline def apply(): AlignCenterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlignCenterSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignCenterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsAlignCenterSmallMod.foo` */
  override def _to: FC[AlignCenterSmallProps] = default
}
