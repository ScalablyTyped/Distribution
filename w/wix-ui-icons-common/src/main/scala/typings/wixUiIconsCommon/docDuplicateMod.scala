package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docDuplicateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocDuplicate", JSImport.Default)
  @js.native
  val default: SFC[DocDuplicateProps] = js.native
  
  @js.native
  trait DocDuplicateProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocDuplicateProps {
    
    @scala.inline
    def apply(): DocDuplicateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocDuplicateProps]
    }
    
    @scala.inline
    implicit class DocDuplicatePropsMutableBuilder[Self <: DocDuplicateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DocDuplicateProps]
  
  /* This means you don't have to write `default`, but can instead just say `docDuplicateMod.foo` */
  override def _to: SFC[DocDuplicateProps] = default
}
