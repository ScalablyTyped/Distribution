package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hintMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Hint", JSImport.Default)
  @js.native
  val default: SFC[HintProps] = js.native
  
  trait HintProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HintProps {
    
    inline def apply(): HintProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HintProps]
    }
    
    extension [Self <: HintProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HintProps]
  
  /* This means you don't have to write `default`, but can instead just say `hintMod.foo` */
  override def _to: SFC[HintProps] = default
}
