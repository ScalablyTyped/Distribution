package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsExitFullScreenSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ExitFullScreenSmall", JSImport.Default)
  @js.native
  val default: FC[ExitFullScreenSmallProps] = js.native
  
  trait ExitFullScreenSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExitFullScreenSmallProps {
    
    inline def apply(): ExitFullScreenSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExitFullScreenSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExitFullScreenSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExitFullScreenSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsExitFullScreenSmallMod.foo` */
  override def _to: FC[ExitFullScreenSmallProps] = default
}
