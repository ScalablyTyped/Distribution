package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CodeSmall", JSImport.Default)
  @js.native
  val default: SFC[CodeSmallProps] = js.native
  
  @js.native
  trait CodeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CodeSmallProps {
    
    @scala.inline
    def apply(): CodeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeSmallProps]
    }
    
    @scala.inline
    implicit class CodeSmallPropsMutableBuilder[Self <: CodeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CodeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `codeSmallMod.foo` */
  override def _to: SFC[CodeSmallProps] = default
}
