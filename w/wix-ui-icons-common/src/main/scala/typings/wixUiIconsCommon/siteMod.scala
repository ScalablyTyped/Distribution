package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Site", JSImport.Default)
  @js.native
  val default: SFC[SiteProps] = js.native
  
  @js.native
  trait SiteProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SiteProps {
    
    @scala.inline
    def apply(): SiteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteProps]
    }
    
    @scala.inline
    implicit class SitePropsMutableBuilder[Self <: SiteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SiteProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteMod.foo` */
  override def _to: SFC[SiteProps] = default
}
