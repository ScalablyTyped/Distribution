package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserAddSmall", JSImport.Default)
  @js.native
  val default: SFC[UserAddSmallProps] = js.native
  
  trait UserAddSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object UserAddSmallProps {
    
    @scala.inline
    def apply(): UserAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAddSmallProps]
    }
    
    @scala.inline
    implicit class UserAddSmallPropsMutableBuilder[Self <: UserAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UserAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userAddSmallMod.foo` */
  override def _to: SFC[UserAddSmallProps] = default
}
