package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsTextAreaBulletListMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/TextAreaBulletList", JSImport.Default)
  @js.native
  val default: FC[TextAreaBulletListProps] = js.native
  
  trait TextAreaBulletListProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TextAreaBulletListProps {
    
    inline def apply(): TextAreaBulletListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaBulletListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaBulletListProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TextAreaBulletListProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsTextAreaBulletListMod.foo` */
  override def _to: FC[TextAreaBulletListProps] = default
}
