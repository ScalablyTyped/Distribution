package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moreMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/More", JSImport.Default)
  @js.native
  val default: SFC[MoreProps] = js.native
  
  trait MoreProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object MoreProps {
    
    inline def apply(): MoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoreProps]
    }
    
    extension [Self <: MoreProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MoreProps]
  
  /* This means you don't have to write `default`, but can instead just say `moreMod.foo` */
  override def _to: SFC[MoreProps] = default
}
