package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FacebookSmall", JSImport.Default)
  @js.native
  val default: SFC[FacebookSmallProps] = js.native
  
  trait FacebookSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FacebookSmallProps {
    
    inline def apply(): FacebookSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacebookSmallProps]
    }
    
    extension [Self <: FacebookSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FacebookSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `facebookSmallMod.foo` */
  override def _to: SFC[FacebookSmallProps] = default
}
