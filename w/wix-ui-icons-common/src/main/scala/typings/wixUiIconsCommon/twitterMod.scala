package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Twitter", JSImport.Default)
  @js.native
  val default: SFC[TwitterProps] = js.native
  
  trait TwitterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TwitterProps {
    
    inline def apply(): TwitterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitterProps]
    }
    
    extension [Self <: TwitterProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TwitterProps]
  
  /* This means you don't have to write `default`, but can instead just say `twitterMod.foo` */
  override def _to: SFC[TwitterProps] = default
}
