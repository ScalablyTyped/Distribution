package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsTextAreaAlignJustifyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignJustify", JSImport.Default)
  @js.native
  val default: FC[TextAreaAlignJustifyProps] = js.native
  
  trait TextAreaAlignJustifyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaAlignJustifyProps {
    
    inline def apply(): TextAreaAlignJustifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignJustifyProps]
    }
    
    extension [Self <: TextAreaAlignJustifyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaAlignJustifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsTextAreaAlignJustifyMod.foo` */
  override def _to: FC[TextAreaAlignJustifyProps] = default
}
