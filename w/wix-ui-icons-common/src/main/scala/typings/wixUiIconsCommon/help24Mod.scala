package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object help24Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/Help24", JSImport.Default)
  @js.native
  val default: SFC[Help24Props] = js.native
  
  trait Help24Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object Help24Props {
    
    inline def apply(): Help24Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Help24Props]
    }
    
    extension [Self <: Help24Props](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[Help24Props]
  
  /* This means you don't have to write `default`, but can instead just say `help24Mod.foo` */
  override def _to: SFC[Help24Props] = default
}
