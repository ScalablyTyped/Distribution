package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Home", JSImport.Default)
  @js.native
  val default: FC[HomeProps] = js.native
  
  trait HomeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HomeProps {
    
    inline def apply(): HomeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HomeProps]
    }
    
    extension [Self <: HomeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HomeProps]
  
  /* This means you don't have to write `default`, but can instead just say `homeMod.foo` */
  override def _to: FC[HomeProps] = default
}
