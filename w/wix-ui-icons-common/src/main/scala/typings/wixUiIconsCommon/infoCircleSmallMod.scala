package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/InfoCircleSmall", JSImport.Default)
  @js.native
  val default: SFC[InfoCircleSmallProps] = js.native
  
  trait InfoCircleSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object InfoCircleSmallProps {
    
    @scala.inline
    def apply(): InfoCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoCircleSmallProps]
    }
    
    @scala.inline
    implicit class InfoCircleSmallPropsMutableBuilder[Self <: InfoCircleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[InfoCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoCircleSmallMod.foo` */
  override def _to: SFC[InfoCircleSmallProps] = default
}
