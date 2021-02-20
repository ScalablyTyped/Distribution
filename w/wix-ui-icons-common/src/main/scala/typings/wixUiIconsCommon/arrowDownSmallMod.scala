package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowDownSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowDownSmall", JSImport.Default)
  @js.native
  val default: SFC[ArrowDownSmallProps] = js.native
  
  @js.native
  trait ArrowDownSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArrowDownSmallProps {
    
    @scala.inline
    def apply(): ArrowDownSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownSmallProps]
    }
    
    @scala.inline
    implicit class ArrowDownSmallPropsMutableBuilder[Self <: ArrowDownSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ArrowDownSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowDownSmallMod.foo` */
  override def _to: SFC[ArrowDownSmallProps] = default
}
