package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backwardMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Backward", JSImport.Default)
  @js.native
  val default: SFC[BackwardProps] = js.native
  
  @js.native
  trait BackwardProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BackwardProps {
    
    @scala.inline
    def apply(): BackwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackwardProps]
    }
    
    @scala.inline
    implicit class BackwardPropsMutableBuilder[Self <: BackwardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BackwardProps]
  
  /* This means you don't have to write `default`, but can instead just say `backwardMod.foo` */
  override def _to: SFC[BackwardProps] = default
}
