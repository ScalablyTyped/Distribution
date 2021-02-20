package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HeartSmall", JSImport.Default)
  @js.native
  val default: SFC[HeartSmallProps] = js.native
  
  @js.native
  trait HeartSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HeartSmallProps {
    
    @scala.inline
    def apply(): HeartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartSmallProps]
    }
    
    @scala.inline
    implicit class HeartSmallPropsMutableBuilder[Self <: HeartSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HeartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `heartSmallMod.foo` */
  override def _to: SFC[HeartSmallProps] = default
}
