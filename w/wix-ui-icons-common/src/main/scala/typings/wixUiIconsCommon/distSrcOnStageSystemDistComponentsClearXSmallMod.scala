package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsClearXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/ClearXSmall", JSImport.Default)
  @js.native
  val default: FC[ClearXSmallProps] = js.native
  
  trait ClearXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ClearXSmallProps {
    
    inline def apply(): ClearXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearXSmallProps]
    }
    
    extension [Self <: ClearXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ClearXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsClearXSmallMod.foo` */
  override def _to: FC[ClearXSmallProps] = default
}
