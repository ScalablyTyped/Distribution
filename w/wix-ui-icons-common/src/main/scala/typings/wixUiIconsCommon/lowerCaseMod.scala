package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowerCaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LowerCase", JSImport.Default)
  @js.native
  val default: SFC[LowerCaseProps] = js.native
  
  @js.native
  trait LowerCaseProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LowerCaseProps {
    
    @scala.inline
    def apply(): LowerCaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LowerCaseProps]
    }
    
    @scala.inline
    implicit class LowerCasePropsMutableBuilder[Self <: LowerCaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LowerCaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `lowerCaseMod.foo` */
  override def _to: SFC[LowerCaseProps] = default
}
