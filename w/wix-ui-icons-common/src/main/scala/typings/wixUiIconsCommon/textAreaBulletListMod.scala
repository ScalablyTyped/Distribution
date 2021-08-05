package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaBulletListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/TextAreaBulletList", JSImport.Default)
  @js.native
  val default: SFC[TextAreaBulletListProps] = js.native
  
  trait TextAreaBulletListProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAreaBulletListProps {
    
    inline def apply(): TextAreaBulletListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaBulletListProps]
    }
    
    extension [Self <: TextAreaBulletListProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAreaBulletListProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaBulletListMod.foo` */
  override def _to: SFC[TextAreaBulletListProps] = default
}
