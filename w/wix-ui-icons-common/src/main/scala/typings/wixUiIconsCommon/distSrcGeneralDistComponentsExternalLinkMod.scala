package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsExternalLinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ExternalLink", JSImport.Default)
  @js.native
  val default: FC[ExternalLinkProps] = js.native
  
  trait ExternalLinkProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExternalLinkProps {
    
    inline def apply(): ExternalLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalLinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExternalLinkProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExternalLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsExternalLinkMod.foo` */
  override def _to: FC[ExternalLinkProps] = default
}
