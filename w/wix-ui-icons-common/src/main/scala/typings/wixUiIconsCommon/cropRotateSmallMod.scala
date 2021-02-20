package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropRotateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CropRotateSmall", JSImport.Default)
  @js.native
  val default: SFC[CropRotateSmallProps] = js.native
  
  @js.native
  trait CropRotateSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CropRotateSmallProps {
    
    @scala.inline
    def apply(): CropRotateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropRotateSmallProps]
    }
    
    @scala.inline
    implicit class CropRotateSmallPropsMutableBuilder[Self <: CropRotateSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CropRotateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cropRotateSmallMod.foo` */
  override def _to: SFC[CropRotateSmallProps] = default
}
