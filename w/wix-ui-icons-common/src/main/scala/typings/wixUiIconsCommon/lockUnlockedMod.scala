package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockUnlockedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LockUnlocked", JSImport.Default)
  @js.native
  val default: SFC[LockUnlockedProps] = js.native
  
  trait LockUnlockedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object LockUnlockedProps {
    
    inline def apply(): LockUnlockedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockUnlockedProps]
    }
    
    extension [Self <: LockUnlockedProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LockUnlockedProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockUnlockedMod.foo` */
  override def _to: SFC[LockUnlockedProps] = default
}
