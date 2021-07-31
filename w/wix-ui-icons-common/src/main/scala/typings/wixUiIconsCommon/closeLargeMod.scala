package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CloseLarge", JSImport.Default)
  @js.native
  val default: SFC[CloseLargeProps] = js.native
  
  trait CloseLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CloseLargeProps {
    
    @scala.inline
    def apply(): CloseLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseLargeProps]
    }
    
    @scala.inline
    implicit class CloseLargePropsMutableBuilder[Self <: CloseLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CloseLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `closeLargeMod.foo` */
  override def _to: SFC[CloseLargeProps] = default
}
