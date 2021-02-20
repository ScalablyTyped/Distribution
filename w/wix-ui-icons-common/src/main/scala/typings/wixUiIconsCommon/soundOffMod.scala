package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundOffMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SoundOff", JSImport.Default)
  @js.native
  val default: SFC[SoundOffProps] = js.native
  
  @js.native
  trait SoundOffProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SoundOffProps {
    
    @scala.inline
    def apply(): SoundOffProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundOffProps]
    }
    
    @scala.inline
    implicit class SoundOffPropsMutableBuilder[Self <: SoundOffProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SoundOffProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundOffMod.foo` */
  override def _to: SFC[SoundOffProps] = default
}
