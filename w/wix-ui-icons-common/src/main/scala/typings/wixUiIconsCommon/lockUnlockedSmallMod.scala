package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockUnlockedSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LockUnlockedSmall", JSImport.Default)
  @js.native
  val default: SFC[LockUnlockedSmallProps] = js.native
  
  @js.native
  trait LockUnlockedSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LockUnlockedSmallProps {
    
    @scala.inline
    def apply(): LockUnlockedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockUnlockedSmallProps]
    }
    
    @scala.inline
    implicit class LockUnlockedSmallPropsMutableBuilder[Self <: LockUnlockedSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LockUnlockedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockUnlockedSmallMod.foo` */
  override def _to: SFC[LockUnlockedSmallProps] = default
}
