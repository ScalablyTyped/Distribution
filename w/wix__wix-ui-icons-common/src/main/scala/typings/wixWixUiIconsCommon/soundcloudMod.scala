package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundcloudMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Soundcloud", JSImport.Default)
  @js.native
  val default: FC[SoundcloudProps] = js.native
  
  trait SoundcloudProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SoundcloudProps {
    
    inline def apply(): SoundcloudProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundcloudProps]
    }
    
    extension [Self <: SoundcloudProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SoundcloudProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundcloudMod.foo` */
  override def _to: FC[SoundcloudProps] = default
}
