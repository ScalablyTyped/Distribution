package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HelpSmall", JSImport.Default)
  @js.native
  val default: SFC[HelpSmallProps] = js.native
  
  trait HelpSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HelpSmallProps {
    
    @scala.inline
    def apply(): HelpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpSmallProps]
    }
    
    @scala.inline
    implicit class HelpSmallPropsMutableBuilder[Self <: HelpSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HelpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpSmallMod.foo` */
  override def _to: SFC[HelpSmallProps] = default
}
