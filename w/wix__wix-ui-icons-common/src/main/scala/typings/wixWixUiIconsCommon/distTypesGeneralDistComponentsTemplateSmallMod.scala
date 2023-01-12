package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTemplateSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TemplateSmall", JSImport.Default)
  @js.native
  val default: FC[TemplateSmallProps] = js.native
  
  trait TemplateSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TemplateSmallProps {
    
    inline def apply(): TemplateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TemplateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTemplateSmallMod.foo` */
  override def _to: FC[TemplateSmallProps] = default
}
