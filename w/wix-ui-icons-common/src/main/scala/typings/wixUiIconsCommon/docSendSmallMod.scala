package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docSendSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocSendSmall", JSImport.Default)
  @js.native
  val default: SFC[DocSendSmallProps] = js.native
  
  @js.native
  trait DocSendSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocSendSmallProps {
    
    @scala.inline
    def apply(): DocSendSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocSendSmallProps]
    }
    
    @scala.inline
    implicit class DocSendSmallPropsMutableBuilder[Self <: DocSendSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DocSendSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `docSendSmallMod.foo` */
  override def _to: SFC[DocSendSmallProps] = default
}
