package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsArrowDownMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ArrowDown", JSImport.Default)
  @js.native
  val default: FC[ArrowDownProps] = js.native
  
  trait ArrowDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowDownProps {
    
    inline def apply(): ArrowDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowDownProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsArrowDownMod.foo` */
  override def _to: FC[ArrowDownProps] = default
}
