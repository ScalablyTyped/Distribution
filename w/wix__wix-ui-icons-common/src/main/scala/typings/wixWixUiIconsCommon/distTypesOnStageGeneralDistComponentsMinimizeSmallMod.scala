package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsMinimizeSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/MinimizeSmall", JSImport.Default)
  @js.native
  val default: FC[MinimizeSmallProps] = js.native
  
  trait MinimizeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MinimizeSmallProps {
    
    inline def apply(): MinimizeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimizeSmallProps]
    }
    
    extension [Self <: MinimizeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MinimizeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsMinimizeSmallMod.foo` */
  override def _to: FC[MinimizeSmallProps] = default
}
