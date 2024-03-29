package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsChatDisabledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ChatDisabledSmall", JSImport.Default)
  @js.native
  val default: FC[ChatDisabledSmallProps] = js.native
  
  trait ChatDisabledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChatDisabledSmallProps {
    
    inline def apply(): ChatDisabledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatDisabledSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChatDisabledSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChatDisabledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsChatDisabledSmallMod.foo` */
  override def _to: FC[ChatDisabledSmallProps] = default
}
