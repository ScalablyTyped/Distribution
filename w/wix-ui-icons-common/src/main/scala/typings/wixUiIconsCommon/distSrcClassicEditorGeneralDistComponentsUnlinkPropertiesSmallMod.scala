package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsUnlinkPropertiesSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UnlinkPropertiesSmall", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnlinkPropertiesSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnlinkPropertiesSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsUnlinkPropertiesSmallMod.foo` */
  override def _to: FC[UnlinkPropertiesSmallProps] = default
}
