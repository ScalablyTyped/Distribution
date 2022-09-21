package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboxMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Inbox", JSImport.Default)
  @js.native
  val default: FC[InboxProps] = js.native
  
  trait InboxProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InboxProps {
    
    inline def apply(): InboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InboxProps]
    }
    
    extension [Self <: InboxProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `inboxMod.foo` */
  override def _to: FC[InboxProps] = default
}
