package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSoundOffMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SoundOff", JSImport.Default)
  @js.native
  val default: FC[SoundOffProps] = js.native
  
  trait SoundOffProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SoundOffProps {
    
    inline def apply(): SoundOffProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundOffProps]
    }
    
    extension [Self <: SoundOffProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SoundOffProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSoundOffMod.foo` */
  override def _to: FC[SoundOffProps] = default
}
