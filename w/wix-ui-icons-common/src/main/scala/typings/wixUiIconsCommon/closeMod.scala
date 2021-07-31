package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/Close", JSImport.Default)
  @js.native
  val default: SFC[CloseProps] = js.native
  
  trait CloseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CloseProps {
    
    @scala.inline
    def apply(): CloseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseProps]
    }
    
    @scala.inline
    implicit class ClosePropsMutableBuilder[Self <: CloseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CloseProps]
  
  /* This means you don't have to write `default`, but can instead just say `closeMod.foo` */
  override def _to: SFC[CloseProps] = default
}
