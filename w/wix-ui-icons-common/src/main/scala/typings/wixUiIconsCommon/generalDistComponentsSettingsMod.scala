package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalDistComponentsSettingsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Settings", JSImport.Default)
  @js.native
  val default: FC[SettingsProps] = js.native
  
  trait SettingsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SettingsProps {
    
    inline def apply(): SettingsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsProps]
    }
    
    extension [Self <: SettingsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SettingsProps]
  
  /* This means you don't have to write `default`, but can instead just say `generalDistComponentsSettingsMod.foo` */
  override def _to: FC[SettingsProps] = default
}
