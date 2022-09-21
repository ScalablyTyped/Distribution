package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Share", JSImport.Default)
  @js.native
  val default: FC[ShareProps] = js.native
  
  trait ShareProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShareProps {
    
    inline def apply(): ShareProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareProps]
    }
    
    extension [Self <: ShareProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShareProps]
  
  /* This means you don't have to write `default`, but can instead just say `shareMod.foo` */
  override def _to: FC[ShareProps] = default
}
