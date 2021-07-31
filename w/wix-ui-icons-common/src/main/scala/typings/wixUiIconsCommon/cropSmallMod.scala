package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CropSmall", JSImport.Default)
  @js.native
  val default: SFC[CropSmallProps] = js.native
  
  trait CropSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CropSmallProps {
    
    @scala.inline
    def apply(): CropSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropSmallProps]
    }
    
    @scala.inline
    implicit class CropSmallPropsMutableBuilder[Self <: CropSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CropSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cropSmallMod.foo` */
  override def _to: SFC[CropSmallProps] = default
}
