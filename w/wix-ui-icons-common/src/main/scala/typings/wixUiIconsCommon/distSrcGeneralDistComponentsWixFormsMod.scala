package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsWixFormsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixForms", JSImport.Default)
  @js.native
  val default: FC[WixFormsProps] = js.native
  
  trait WixFormsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixFormsProps {
    
    inline def apply(): WixFormsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixFormsProps]
    }
    
    extension [Self <: WixFormsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixFormsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsWixFormsMod.foo` */
  override def _to: FC[WixFormsProps] = default
}
