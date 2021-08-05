package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DeleteSmall", JSImport.Default)
  @js.native
  val default: SFC[DeleteSmallProps] = js.native
  
  trait DeleteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DeleteSmallProps {
    
    inline def apply(): DeleteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSmallProps]
    }
    
    extension [Self <: DeleteSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DeleteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `deleteSmallMod.foo` */
  override def _to: SFC[DeleteSmallProps] = default
}
