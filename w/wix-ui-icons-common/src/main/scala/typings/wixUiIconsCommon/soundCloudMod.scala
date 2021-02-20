package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundCloudMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SoundCloud", JSImport.Default)
  @js.native
  val default: SFC[SoundCloudProps] = js.native
  
  @js.native
  trait SoundCloudProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SoundCloudProps {
    
    @scala.inline
    def apply(): SoundCloudProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundCloudProps]
    }
    
    @scala.inline
    implicit class SoundCloudPropsMutableBuilder[Self <: SoundCloudProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SoundCloudProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundCloudMod.foo` */
  override def _to: SFC[SoundCloudProps] = default
}
