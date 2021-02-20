package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipleChoicesSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MultipleChoicesSmall", JSImport.Default)
  @js.native
  val default: SFC[MultipleChoicesSmallProps] = js.native
  
  @js.native
  trait MultipleChoicesSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MultipleChoicesSmallProps {
    
    @scala.inline
    def apply(): MultipleChoicesSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipleChoicesSmallProps]
    }
    
    @scala.inline
    implicit class MultipleChoicesSmallPropsMutableBuilder[Self <: MultipleChoicesSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MultipleChoicesSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `multipleChoicesSmallMod.foo` */
  override def _to: SFC[MultipleChoicesSmallProps] = default
}
