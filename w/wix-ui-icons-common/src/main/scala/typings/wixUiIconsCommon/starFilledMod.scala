package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StarFilled", JSImport.Default)
  @js.native
  val default: SFC[StarFilledProps] = js.native
  
  @js.native
  trait StarFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StarFilledProps {
    
    @scala.inline
    def apply(): StarFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarFilledProps]
    }
    
    @scala.inline
    implicit class StarFilledPropsMutableBuilder[Self <: StarFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StarFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `starFilledMod.foo` */
  override def _to: SFC[StarFilledProps] = default
}
