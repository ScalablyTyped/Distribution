package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Redo", JSImport.Default)
  @js.native
  val default: SFC[RedoProps] = js.native
  
  trait RedoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object RedoProps {
    
    inline def apply(): RedoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedoProps]
    }
    
    extension [Self <: RedoProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RedoProps]
  
  /* This means you don't have to write `default`, but can instead just say `redoMod.foo` */
  override def _to: SFC[RedoProps] = default
}
