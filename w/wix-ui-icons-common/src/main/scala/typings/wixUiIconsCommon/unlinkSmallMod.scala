package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlinkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UnlinkSmall", JSImport.Default)
  @js.native
  val default: SFC[UnlinkSmallProps] = js.native
  
  @js.native
  trait UnlinkSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UnlinkSmallProps {
    
    @scala.inline
    def apply(): UnlinkSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnlinkSmallProps]
    }
    
    @scala.inline
    implicit class UnlinkSmallPropsMutableBuilder[Self <: UnlinkSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UnlinkSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `unlinkSmallMod.foo` */
  override def _to: SFC[UnlinkSmallProps] = default
}
