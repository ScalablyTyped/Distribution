package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redoSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RedoSmall", JSImport.Default)
  @js.native
  val default: SFC[RedoSmallProps] = js.native
  
  trait RedoSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object RedoSmallProps {
    
    inline def apply(): RedoSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedoSmallProps]
    }
    
    extension [Self <: RedoSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RedoSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `redoSmallMod.foo` */
  override def _to: SFC[RedoSmallProps] = default
}
