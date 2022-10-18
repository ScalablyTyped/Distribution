package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsTextAreaAlignCenterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignCenter", JSImport.Default)
  @js.native
  val default: FC[TextAreaAlignCenterProps] = js.native
  
  trait TextAreaAlignCenterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaAlignCenterProps {
    
    inline def apply(): TextAreaAlignCenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignCenterProps]
    }
    
    extension [Self <: TextAreaAlignCenterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaAlignCenterProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsTextAreaAlignCenterMod.foo` */
  override def _to: FC[TextAreaAlignCenterProps] = default
}
