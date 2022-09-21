package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaLinkMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaLink", JSImport.Default)
  @js.native
  val default: FC[TextAreaLinkProps] = js.native
  
  trait TextAreaLinkProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaLinkProps {
    
    inline def apply(): TextAreaLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaLinkProps]
    }
    
    extension [Self <: TextAreaLinkProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaLinkMod.foo` */
  override def _to: FC[TextAreaLinkProps] = default
}
