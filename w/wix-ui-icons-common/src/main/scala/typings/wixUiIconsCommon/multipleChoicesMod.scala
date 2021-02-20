package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipleChoicesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MultipleChoices", JSImport.Default)
  @js.native
  val default: SFC[MultipleChoicesProps] = js.native
  
  @js.native
  trait MultipleChoicesProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MultipleChoicesProps {
    
    @scala.inline
    def apply(): MultipleChoicesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipleChoicesProps]
    }
    
    @scala.inline
    implicit class MultipleChoicesPropsMutableBuilder[Self <: MultipleChoicesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MultipleChoicesProps]
  
  /* This means you don't have to write `default`, but can instead just say `multipleChoicesMod.foo` */
  override def _to: SFC[MultipleChoicesProps] = default
}
