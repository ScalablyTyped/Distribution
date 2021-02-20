package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Template", JSImport.Default)
  @js.native
  val default: SFC[TemplateProps] = js.native
  
  @js.native
  trait TemplateProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TemplateProps {
    
    @scala.inline
    def apply(): TemplateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateProps]
    }
    
    @scala.inline
    implicit class TemplatePropsMutableBuilder[Self <: TemplateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TemplateProps]
  
  /* This means you don't have to write `default`, but can instead just say `templateMod.foo` */
  override def _to: SFC[TemplateProps] = default
}
