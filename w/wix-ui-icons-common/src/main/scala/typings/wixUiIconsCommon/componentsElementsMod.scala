package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsElementsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Elements", JSImport.Default)
  @js.native
  val default: FC[ElementsProps] = js.native
  
  trait ElementsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ElementsProps {
    
    inline def apply(): ElementsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementsProps]
    }
    
    extension [Self <: ElementsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ElementsProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsElementsMod.foo` */
  override def _to: FC[ElementsProps] = default
}
