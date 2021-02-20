package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Document", JSImport.Default)
  @js.native
  val default: SFC[DocumentProps] = js.native
  
  @js.native
  trait DocumentProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocumentProps {
    
    @scala.inline
    def apply(): DocumentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentProps]
    }
    
    @scala.inline
    implicit class DocumentPropsMutableBuilder[Self <: DocumentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DocumentProps]
  
  /* This means you don't have to write `default`, but can instead just say `documentMod.foo` */
  override def _to: SFC[DocumentProps] = default
}
