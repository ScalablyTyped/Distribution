package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsNumberMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Number", JSImport.Default)
  @js.native
  val default: FC[NumberProps] = js.native
  
  trait NumberProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NumberProps {
    
    inline def apply(): NumberProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NumberProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsNumberMod.foo` */
  override def _to: FC[NumberProps] = default
}
