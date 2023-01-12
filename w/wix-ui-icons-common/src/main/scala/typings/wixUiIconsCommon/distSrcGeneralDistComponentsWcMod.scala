package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsWcMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Wc", JSImport.Default)
  @js.native
  val default: FC[WcProps] = js.native
  
  trait WcProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WcProps {
    
    inline def apply(): WcProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WcProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WcProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WcProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsWcMod.foo` */
  override def _to: FC[WcProps] = default
}
