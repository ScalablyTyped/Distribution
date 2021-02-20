package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCompleteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusComplete", JSImport.Default)
  @js.native
  val default: SFC[StatusCompleteProps] = js.native
  
  @js.native
  trait StatusCompleteProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusCompleteProps {
    
    @scala.inline
    def apply(): StatusCompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompleteProps]
    }
    
    @scala.inline
    implicit class StatusCompletePropsMutableBuilder[Self <: StatusCompleteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusCompleteProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusCompleteMod.foo` */
  override def _to: SFC[StatusCompleteProps] = default
}
