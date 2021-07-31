package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalLinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ExternalLink", JSImport.Default)
  @js.native
  val default: SFC[ExternalLinkProps] = js.native
  
  trait ExternalLinkProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ExternalLinkProps {
    
    @scala.inline
    def apply(): ExternalLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalLinkProps]
    }
    
    @scala.inline
    implicit class ExternalLinkPropsMutableBuilder[Self <: ExternalLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ExternalLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `externalLinkMod.foo` */
  override def _to: SFC[ExternalLinkProps] = default
}
