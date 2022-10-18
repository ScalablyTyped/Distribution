package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTemplateMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Template", JSImport.Default)
  @js.native
  val default: FC[TemplateProps] = js.native
  
  trait TemplateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TemplateProps {
    
    inline def apply(): TemplateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateProps]
    }
    
    extension [Self <: TemplateProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TemplateProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTemplateMod.foo` */
  override def _to: FC[TemplateProps] = default
}
