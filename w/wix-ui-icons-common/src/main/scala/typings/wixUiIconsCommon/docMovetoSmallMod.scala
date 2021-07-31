package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docMovetoSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocMovetoSmall", JSImport.Default)
  @js.native
  val default: SFC[DocMovetoSmallProps] = js.native
  
  trait DocMovetoSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DocMovetoSmallProps {
    
    @scala.inline
    def apply(): DocMovetoSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocMovetoSmallProps]
    }
    
    @scala.inline
    implicit class DocMovetoSmallPropsMutableBuilder[Self <: DocMovetoSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DocMovetoSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `docMovetoSmallMod.foo` */
  override def _to: SFC[DocMovetoSmallProps] = default
}
