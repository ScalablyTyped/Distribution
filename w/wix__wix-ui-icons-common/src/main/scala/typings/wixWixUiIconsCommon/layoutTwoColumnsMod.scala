package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutTwoColumnsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/LayoutTwoColumns", JSImport.Default)
  @js.native
  val default: FC[LayoutTwoColumnsProps] = js.native
  
  trait LayoutTwoColumnsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutTwoColumnsProps {
    
    inline def apply(): LayoutTwoColumnsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTwoColumnsProps]
    }
    
    extension [Self <: LayoutTwoColumnsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutTwoColumnsProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutTwoColumnsMod.foo` */
  override def _to: FC[LayoutTwoColumnsProps] = default
}
