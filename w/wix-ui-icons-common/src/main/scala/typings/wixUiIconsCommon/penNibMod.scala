package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object penNibMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PenNib", JSImport.Default)
  @js.native
  val default: SFC[PenNibProps] = js.native
  
  trait PenNibProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PenNibProps {
    
    inline def apply(): PenNibProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibProps]
    }
    
    extension [Self <: PenNibProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PenNibProps]
  
  /* This means you don't have to write `default`, but can instead just say `penNibMod.foo` */
  override def _to: SFC[PenNibProps] = default
}
