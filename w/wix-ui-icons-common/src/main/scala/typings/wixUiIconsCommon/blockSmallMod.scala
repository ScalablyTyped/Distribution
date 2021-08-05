package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BlockSmall", JSImport.Default)
  @js.native
  val default: SFC[BlockSmallProps] = js.native
  
  trait BlockSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object BlockSmallProps {
    
    inline def apply(): BlockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockSmallProps]
    }
    
    extension [Self <: BlockSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BlockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `blockSmallMod.foo` */
  override def _to: SFC[BlockSmallProps] = default
}
