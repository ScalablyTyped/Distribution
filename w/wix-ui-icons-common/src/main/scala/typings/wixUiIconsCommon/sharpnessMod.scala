package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharpnessMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Sharpness", JSImport.Default)
  @js.native
  val default: SFC[SharpnessProps] = js.native
  
  @js.native
  trait SharpnessProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SharpnessProps {
    
    @scala.inline
    def apply(): SharpnessProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharpnessProps]
    }
    
    @scala.inline
    implicit class SharpnessPropsMutableBuilder[Self <: SharpnessProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SharpnessProps]
  
  /* This means you don't have to write `default`, but can instead just say `sharpnessMod.foo` */
  override def _to: SFC[SharpnessProps] = default
}
