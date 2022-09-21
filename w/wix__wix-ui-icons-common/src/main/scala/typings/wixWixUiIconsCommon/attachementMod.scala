package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachementMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Attachement", JSImport.Default)
  @js.native
  val default: FC[AttachementProps] = js.native
  
  trait AttachementProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AttachementProps {
    
    inline def apply(): AttachementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachementProps]
    }
    
    extension [Self <: AttachementProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AttachementProps]
  
  /* This means you don't have to write `default`, but can instead just say `attachementMod.foo` */
  override def _to: FC[AttachementProps] = default
}
