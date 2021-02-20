package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomOutMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ZoomOut", JSImport.Default)
  @js.native
  val default: SFC[ZoomOutProps] = js.native
  
  @js.native
  trait ZoomOutProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ZoomOutProps {
    
    @scala.inline
    def apply(): ZoomOutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOutProps]
    }
    
    @scala.inline
    implicit class ZoomOutPropsMutableBuilder[Self <: ZoomOutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ZoomOutProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomOutMod.foo` */
  override def _to: SFC[ZoomOutProps] = default
}
