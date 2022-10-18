package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMicrophoneDisabledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MicrophoneDisabledSmall", JSImport.Default)
  @js.native
  val default: FC[MicrophoneDisabledSmallProps] = js.native
  
  trait MicrophoneDisabledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MicrophoneDisabledSmallProps {
    
    inline def apply(): MicrophoneDisabledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrophoneDisabledSmallProps]
    }
    
    extension [Self <: MicrophoneDisabledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MicrophoneDisabledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMicrophoneDisabledSmallMod.foo` */
  override def _to: FC[MicrophoneDisabledSmallProps] = default
}
