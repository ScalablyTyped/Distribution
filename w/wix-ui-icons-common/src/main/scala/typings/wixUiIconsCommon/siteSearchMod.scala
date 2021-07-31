package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteSearchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteSearch", JSImport.Default)
  @js.native
  val default: SFC[SiteSearchProps] = js.native
  
  trait SiteSearchProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SiteSearchProps {
    
    @scala.inline
    def apply(): SiteSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteSearchProps]
    }
    
    @scala.inline
    implicit class SiteSearchPropsMutableBuilder[Self <: SiteSearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SiteSearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteSearchMod.foo` */
  override def _to: SFC[SiteSearchProps] = default
}
