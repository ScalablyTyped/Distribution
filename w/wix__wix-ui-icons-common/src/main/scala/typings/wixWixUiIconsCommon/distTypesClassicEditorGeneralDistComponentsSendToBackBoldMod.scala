package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsSendToBackBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/SendToBackBold", JSImport.Default)
  @js.native
  val default: FC[SendToBackBoldProps] = js.native
  
  trait SendToBackBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SendToBackBoldProps {
    
    inline def apply(): SendToBackBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendToBackBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendToBackBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SendToBackBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsSendToBackBoldMod.foo` */
  override def _to: FC[SendToBackBoldProps] = default
}
