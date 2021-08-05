package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortAZMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortAZ", JSImport.Default)
  @js.native
  val default: SFC[SortAZProps] = js.native
  
  trait SortAZProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SortAZProps {
    
    inline def apply(): SortAZProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAZProps]
    }
    
    extension [Self <: SortAZProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SortAZProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortAZMod.foo` */
  override def _to: SFC[SortAZProps] = default
}
