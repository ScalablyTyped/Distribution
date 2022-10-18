package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsSettingsBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/SettingsBoldSmall", JSImport.Default)
  @js.native
  val default: FC[SettingsBoldSmallProps] = js.native
  
  trait SettingsBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SettingsBoldSmallProps {
    
    inline def apply(): SettingsBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsBoldSmallProps]
    }
    
    extension [Self <: SettingsBoldSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SettingsBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsSettingsBoldSmallMod.foo` */
  override def _to: FC[SettingsBoldSmallProps] = default
}
