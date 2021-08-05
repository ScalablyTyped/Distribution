package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/InfoCircle", JSImport.Default)
  @js.native
  val default: SFC[InfoCircleProps] = js.native
  
  trait InfoCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object InfoCircleProps {
    
    inline def apply(): InfoCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoCircleProps]
    }
    
    extension [Self <: InfoCircleProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[InfoCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoCircleMod.foo` */
  override def _to: SFC[InfoCircleProps] = default
}
