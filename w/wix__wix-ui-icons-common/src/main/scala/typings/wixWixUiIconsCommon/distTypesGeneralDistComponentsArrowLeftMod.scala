package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsArrowLeftMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ArrowLeft", JSImport.Default)
  @js.native
  val default: FC[ArrowLeftProps] = js.native
  
  trait ArrowLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowLeftProps {
    
    inline def apply(): ArrowLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowLeftProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowLeftProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsArrowLeftMod.foo` */
  override def _to: FC[ArrowLeftProps] = default
}
