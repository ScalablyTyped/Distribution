package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsJswMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/JSW", JSImport.Default)
  @js.native
  val default: FC[JSWProps] = js.native
  
  trait JSWProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object JSWProps {
    
    inline def apply(): JSWProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSWProps]
    }
    
    extension [Self <: JSWProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[JSWProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsJswMod.foo` */
  override def _to: FC[JSWProps] = default
}
