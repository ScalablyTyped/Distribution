package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DateChecked", JSImport.Default)
  @js.native
  val default: SFC[DateCheckedProps] = js.native
  
  trait DateCheckedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DateCheckedProps {
    
    inline def apply(): DateCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateCheckedProps]
    }
    
    extension [Self <: DateCheckedProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DateCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `dateCheckedMod.foo` */
  override def _to: SFC[DateCheckedProps] = default
}
