package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TemplateSmall", JSImport.Default)
  @js.native
  val default: SFC[TemplateSmallProps] = js.native
  
  @js.native
  trait TemplateSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TemplateSmallProps {
    
    @scala.inline
    def apply(): TemplateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateSmallProps]
    }
    
    @scala.inline
    implicit class TemplateSmallPropsMutableBuilder[Self <: TemplateSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TemplateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `templateSmallMod.foo` */
  override def _to: SFC[TemplateSmallProps] = default
}
