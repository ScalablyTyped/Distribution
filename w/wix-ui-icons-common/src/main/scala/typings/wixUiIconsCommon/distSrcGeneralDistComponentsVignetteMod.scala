package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsVignetteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Vignette", JSImport.Default)
  @js.native
  val default: FC[VignetteProps] = js.native
  
  trait VignetteProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VignetteProps {
    
    inline def apply(): VignetteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VignetteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VignetteProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VignetteProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsVignetteMod.foo` */
  override def _to: FC[VignetteProps] = default
}
