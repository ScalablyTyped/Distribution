package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaRightToLeftMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaRightToLeft", JSImport.Default)
  @js.native
  val default: FC[TextAreaRightToLeftProps] = js.native
  
  trait TextAreaRightToLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaRightToLeftProps {
    
    inline def apply(): TextAreaRightToLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaRightToLeftProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaRightToLeftProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaRightToLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaRightToLeftMod.foo` */
  override def _to: FC[TextAreaRightToLeftProps] = default
}
