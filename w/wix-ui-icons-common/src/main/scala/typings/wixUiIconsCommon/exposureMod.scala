package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exposureMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Exposure", JSImport.Default)
  @js.native
  val default: SFC[ExposureProps] = js.native
  
  @js.native
  trait ExposureProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ExposureProps {
    
    @scala.inline
    def apply(): ExposureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExposureProps]
    }
    
    @scala.inline
    implicit class ExposurePropsMutableBuilder[Self <: ExposureProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ExposureProps]
  
  /* This means you don't have to write `default`, but can instead just say `exposureMod.foo` */
  override def _to: SFC[ExposureProps] = default
}
