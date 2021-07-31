package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserSmall", JSImport.Default)
  @js.native
  val default: SFC[UserSmallProps] = js.native
  
  trait UserSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object UserSmallProps {
    
    @scala.inline
    def apply(): UserSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserSmallProps]
    }
    
    @scala.inline
    implicit class UserSmallPropsMutableBuilder[Self <: UserSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UserSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userSmallMod.foo` */
  override def _to: SFC[UserSmallProps] = default
}
