package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsUnlinkPropertiesSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/UnlinkPropertiesSmall", JSImport.Default)
  @js.native
  val default: FC[UnlinkPropertiesSmallProps] = js.native
  
  trait UnlinkPropertiesSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnlinkPropertiesSmallProps {
    
    inline def apply(): UnlinkPropertiesSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnlinkPropertiesSmallProps]
    }
    
    extension [Self <: UnlinkPropertiesSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnlinkPropertiesSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsUnlinkPropertiesSmallMod.foo` */
  override def _to: FC[UnlinkPropertiesSmallProps] = default
}
