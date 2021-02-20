package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LinkSmall", JSImport.Default)
  @js.native
  val default: SFC[LinkSmallProps] = js.native
  
  @js.native
  trait LinkSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LinkSmallProps {
    
    @scala.inline
    def apply(): LinkSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkSmallProps]
    }
    
    @scala.inline
    implicit class LinkSmallPropsMutableBuilder[Self <: LinkSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LinkSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `linkSmallMod.foo` */
  override def _to: SFC[LinkSmallProps] = default
}
