package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Block", JSImport.Default)
  @js.native
  val default: SFC[BlockProps] = js.native
  
  trait BlockProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object BlockProps {
    
    inline def apply(): BlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps]
    }
    
    extension [Self <: BlockProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BlockProps]
  
  /* This means you don't have to write `default`, but can instead just say `blockMod.foo` */
  override def _to: SFC[BlockProps] = default
}
