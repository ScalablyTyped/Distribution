package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDateCheckedMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DateChecked", JSImport.Default)
  @js.native
  val default: FC[DateCheckedProps] = js.native
  
  trait DateCheckedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DateCheckedProps {
    
    inline def apply(): DateCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateCheckedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateCheckedProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DateCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDateCheckedMod.foo` */
  override def _to: FC[DateCheckedProps] = default
}
