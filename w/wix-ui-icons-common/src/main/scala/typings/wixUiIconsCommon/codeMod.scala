package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Code", JSImport.Default)
  @js.native
  val default: SFC[CodeProps] = js.native
  
  @js.native
  trait CodeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CodeProps {
    
    @scala.inline
    def apply(): CodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeProps]
    }
    
    @scala.inline
    implicit class CodePropsMutableBuilder[Self <: CodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CodeProps]
  
  /* This means you don't have to write `default`, but can instead just say `codeMod.foo` */
  override def _to: SFC[CodeProps] = default
}
