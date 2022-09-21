package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaAlignRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaAlignRight", JSImport.Default)
  @js.native
  val default: FC[TextAreaAlignRightProps] = js.native
  
  trait TextAreaAlignRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaAlignRightProps {
    
    inline def apply(): TextAreaAlignRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaAlignRightProps]
    }
    
    extension [Self <: TextAreaAlignRightProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaAlignRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaAlignRightMod.foo` */
  override def _to: FC[TextAreaAlignRightProps] = default
}
