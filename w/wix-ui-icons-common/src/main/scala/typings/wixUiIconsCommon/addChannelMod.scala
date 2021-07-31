package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addChannelMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AddChannel", JSImport.Default)
  @js.native
  val default: SFC[AddChannelProps] = js.native
  
  trait AddChannelProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AddChannelProps {
    
    @scala.inline
    def apply(): AddChannelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddChannelProps]
    }
    
    @scala.inline
    implicit class AddChannelPropsMutableBuilder[Self <: AddChannelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AddChannelProps]
  
  /* This means you don't have to write `default`, but can instead just say `addChannelMod.foo` */
  override def _to: SFC[AddChannelProps] = default
}
