package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Music", JSImport.Default)
  @js.native
  val default: SFC[MusicProps] = js.native
  
  @js.native
  trait MusicProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MusicProps {
    
    @scala.inline
    def apply(): MusicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MusicProps]
    }
    
    @scala.inline
    implicit class MusicPropsMutableBuilder[Self <: MusicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MusicProps]
  
  /* This means you don't have to write `default`, but can instead just say `musicMod.foo` */
  override def _to: SFC[MusicProps] = default
}
