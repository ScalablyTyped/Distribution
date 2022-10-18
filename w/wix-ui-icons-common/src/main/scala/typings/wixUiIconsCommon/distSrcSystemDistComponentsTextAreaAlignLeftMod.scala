package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsTextAreaAlignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignLeft", JSImport.Default)
  @js.native
  val default: FC[TextAreaAlignLeftProps] = js.native
  
  trait TextAreaAlignLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaAlignLeftProps {
    
    inline def apply(): TextAreaAlignLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignLeftProps]
    }
    
    extension [Self <: TextAreaAlignLeftProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaAlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsTextAreaAlignLeftMod.foo` */
  override def _to: FC[TextAreaAlignLeftProps] = default
}
