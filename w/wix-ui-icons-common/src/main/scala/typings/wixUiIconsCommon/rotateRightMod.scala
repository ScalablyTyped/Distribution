package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RotateRight", JSImport.Default)
  @js.native
  val default: SFC[RotateRightProps] = js.native
  
  trait RotateRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object RotateRightProps {
    
    @scala.inline
    def apply(): RotateRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateRightProps]
    }
    
    @scala.inline
    implicit class RotateRightPropsMutableBuilder[Self <: RotateRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RotateRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `rotateRightMod.foo` */
  override def _to: SFC[RotateRightProps] = default
}
