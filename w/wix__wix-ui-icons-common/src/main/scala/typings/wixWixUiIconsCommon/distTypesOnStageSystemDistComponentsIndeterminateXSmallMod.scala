package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsIndeterminateXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/IndeterminateXSmall", JSImport.Default)
  @js.native
  val default: FC[IndeterminateXSmallProps] = js.native
  
  trait IndeterminateXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IndeterminateXSmallProps {
    
    inline def apply(): IndeterminateXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndeterminateXSmallProps]
    }
    
    extension [Self <: IndeterminateXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IndeterminateXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsIndeterminateXSmallMod.foo` */
  override def _to: FC[IndeterminateXSmallProps] = default
}
