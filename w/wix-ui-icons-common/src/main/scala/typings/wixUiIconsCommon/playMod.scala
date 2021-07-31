package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Play", JSImport.Default)
  @js.native
  val default: SFC[PlayProps] = js.native
  
  trait PlayProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PlayProps {
    
    @scala.inline
    def apply(): PlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayProps]
    }
    
    @scala.inline
    implicit class PlayPropsMutableBuilder[Self <: PlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PlayProps]
  
  /* This means you don't have to write `default`, but can instead just say `playMod.foo` */
  override def _to: SFC[PlayProps] = default
}
