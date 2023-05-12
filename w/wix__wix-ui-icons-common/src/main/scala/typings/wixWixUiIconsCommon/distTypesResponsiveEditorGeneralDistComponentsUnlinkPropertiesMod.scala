package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsUnlinkPropertiesMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/UnlinkProperties", JSImport.Default)
  @js.native
  val default: FC[UnlinkPropertiesProps] = js.native
  
  trait UnlinkPropertiesProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnlinkPropertiesProps {
    
    inline def apply(): UnlinkPropertiesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnlinkPropertiesProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnlinkPropertiesProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnlinkPropertiesProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsUnlinkPropertiesMod.foo` */
  override def _to: FC[UnlinkPropertiesProps] = default
}
