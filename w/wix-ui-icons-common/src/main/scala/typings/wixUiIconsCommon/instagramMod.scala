package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instagramMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Instagram", JSImport.Default)
  @js.native
  val default: SFC[InstagramProps] = js.native
  
  @js.native
  trait InstagramProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object InstagramProps {
    
    @scala.inline
    def apply(): InstagramProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstagramProps]
    }
    
    @scala.inline
    implicit class InstagramPropsMutableBuilder[Self <: InstagramProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[InstagramProps]
  
  /* This means you don't have to write `default`, but can instead just say `instagramMod.foo` */
  override def _to: SFC[InstagramProps] = default
}
