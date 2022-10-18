package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsUpgradeAscendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/UpgradeAscend", JSImport.Default)
  @js.native
  val default: FC[UpgradeAscendProps] = js.native
  
  trait UpgradeAscendProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UpgradeAscendProps {
    
    inline def apply(): UpgradeAscendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpgradeAscendProps]
    }
    
    extension [Self <: UpgradeAscendProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UpgradeAscendProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsUpgradeAscendMod.foo` */
  override def _to: FC[UpgradeAscendProps] = default
}
