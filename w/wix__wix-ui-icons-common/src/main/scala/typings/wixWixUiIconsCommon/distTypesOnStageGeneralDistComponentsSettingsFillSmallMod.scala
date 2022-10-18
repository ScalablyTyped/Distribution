package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsSettingsFillSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/SettingsFillSmall", JSImport.Default)
  @js.native
  val default: FC[SettingsFillSmallProps] = js.native
  
  trait SettingsFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SettingsFillSmallProps {
    
    inline def apply(): SettingsFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsFillSmallProps]
    }
    
    extension [Self <: SettingsFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SettingsFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsSettingsFillSmallMod.foo` */
  override def _to: FC[SettingsFillSmallProps] = default
}
