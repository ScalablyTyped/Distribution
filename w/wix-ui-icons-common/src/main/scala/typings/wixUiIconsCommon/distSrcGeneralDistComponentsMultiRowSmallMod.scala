package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsMultiRowSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MultiRowSmall", JSImport.Default)
  @js.native
  val default: FC[MultiRowSmallProps] = js.native
  
  trait MultiRowSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MultiRowSmallProps {
    
    inline def apply(): MultiRowSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiRowSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiRowSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MultiRowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsMultiRowSmallMod.foo` */
  override def _to: FC[MultiRowSmallProps] = default
}
