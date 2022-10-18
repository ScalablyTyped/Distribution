package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsMicrophoneSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MicrophoneSmall", JSImport.Default)
  @js.native
  val default: FC[MicrophoneSmallProps] = js.native
  
  trait MicrophoneSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MicrophoneSmallProps {
    
    inline def apply(): MicrophoneSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrophoneSmallProps]
    }
    
    extension [Self <: MicrophoneSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MicrophoneSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsMicrophoneSmallMod.foo` */
  override def _to: FC[MicrophoneSmallProps] = default
}
