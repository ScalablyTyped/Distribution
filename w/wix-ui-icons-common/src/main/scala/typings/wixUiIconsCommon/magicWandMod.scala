package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object magicWandMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MagicWand", JSImport.Default)
  @js.native
  val default: SFC[MagicWandProps] = js.native
  
  trait MagicWandProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object MagicWandProps {
    
    inline def apply(): MagicWandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MagicWandProps]
    }
    
    extension [Self <: MagicWandProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MagicWandProps]
  
  /* This means you don't have to write `default`, but can instead just say `magicWandMod.foo` */
  override def _to: SFC[MagicWandProps] = default
}
