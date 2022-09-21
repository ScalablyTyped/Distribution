package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHtmlMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Html", JSImport.Default)
  @js.native
  val default: FC[HtmlProps] = js.native
  
  trait HtmlProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HtmlProps {
    
    inline def apply(): HtmlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlProps]
    }
    
    extension [Self <: HtmlProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HtmlProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsHtmlMod.foo` */
  override def _to: FC[HtmlProps] = default
}
