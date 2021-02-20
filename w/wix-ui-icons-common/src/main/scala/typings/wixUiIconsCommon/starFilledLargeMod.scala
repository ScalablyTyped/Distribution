package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starFilledLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/StarFilledLarge", JSImport.Default)
  @js.native
  val default: SFC[StarFilledLargeProps] = js.native
  
  @js.native
  trait StarFilledLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StarFilledLargeProps {
    
    @scala.inline
    def apply(): StarFilledLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarFilledLargeProps]
    }
    
    @scala.inline
    implicit class StarFilledLargePropsMutableBuilder[Self <: StarFilledLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StarFilledLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `starFilledLargeMod.foo` */
  override def _to: SFC[StarFilledLargeProps] = default
}
