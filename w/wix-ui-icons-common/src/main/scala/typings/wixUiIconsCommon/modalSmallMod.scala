package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ModalSmall", JSImport.Default)
  @js.native
  val default: SFC[ModalSmallProps] = js.native
  
  trait ModalSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ModalSmallProps {
    
    @scala.inline
    def apply(): ModalSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalSmallProps]
    }
    
    @scala.inline
    implicit class ModalSmallPropsMutableBuilder[Self <: ModalSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ModalSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalSmallMod.foo` */
  override def _to: SFC[ModalSmallProps] = default
}
