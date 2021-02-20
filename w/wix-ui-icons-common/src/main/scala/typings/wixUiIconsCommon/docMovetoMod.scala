package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docMovetoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocMoveto", JSImport.Default)
  @js.native
  val default: SFC[DocMovetoProps] = js.native
  
  @js.native
  trait DocMovetoProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocMovetoProps {
    
    @scala.inline
    def apply(): DocMovetoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocMovetoProps]
    }
    
    @scala.inline
    implicit class DocMovetoPropsMutableBuilder[Self <: DocMovetoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DocMovetoProps]
  
  /* This means you don't have to write `default`, but can instead just say `docMovetoMod.foo` */
  override def _to: SFC[DocMovetoProps] = default
}
