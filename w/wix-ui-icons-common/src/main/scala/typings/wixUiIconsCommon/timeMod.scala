package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Time", JSImport.Default)
  @js.native
  val default: SFC[TimeProps] = js.native
  
  trait TimeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TimeProps {
    
    inline def apply(): TimeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeProps]
    }
    
    extension [Self <: TimeProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TimeProps]
  
  /* This means you don't have to write `default`, but can instead just say `timeMod.foo` */
  override def _to: SFC[TimeProps] = default
}
