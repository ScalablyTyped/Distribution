package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsThemeManagerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/ThemeManager", JSImport.Default)
  @js.native
  val default: FC[ThemeManagerProps] = js.native
  
  trait ThemeManagerProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ThemeManagerProps {
    
    inline def apply(): ThemeManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeManagerProps]
    }
    
    extension [Self <: ThemeManagerProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ThemeManagerProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsThemeManagerMod.foo` */
  override def _to: FC[ThemeManagerProps] = default
}
