package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsOpenModalSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OpenModalSmall", JSImport.Default)
  @js.native
  val default: FC[OpenModalSmallProps] = js.native
  
  trait OpenModalSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object OpenModalSmallProps {
    
    inline def apply(): OpenModalSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenModalSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenModalSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[OpenModalSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsOpenModalSmallMod.foo` */
  override def _to: FC[OpenModalSmallProps] = default
}
