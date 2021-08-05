package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TransferSmall", JSImport.Default)
  @js.native
  val default: SFC[TransferSmallProps] = js.native
  
  trait TransferSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TransferSmallProps {
    
    inline def apply(): TransferSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferSmallProps]
    }
    
    extension [Self <: TransferSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TransferSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `transferSmallMod.foo` */
  override def _to: SFC[TransferSmallProps] = default
}
