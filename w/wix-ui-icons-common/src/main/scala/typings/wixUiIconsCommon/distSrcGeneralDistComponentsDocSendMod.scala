package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDocSendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocSend", JSImport.Default)
  @js.native
  val default: FC[DocSendProps] = js.native
  
  trait DocSendProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocSendProps {
    
    inline def apply(): DocSendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocSendProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocSendProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocSendProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDocSendMod.foo` */
  override def _to: FC[DocSendProps] = default
}
