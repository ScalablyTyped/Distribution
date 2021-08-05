package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockLockedSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LockLockedSmall", JSImport.Default)
  @js.native
  val default: SFC[LockLockedSmallProps] = js.native
  
  trait LockLockedSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object LockLockedSmallProps {
    
    inline def apply(): LockLockedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockLockedSmallProps]
    }
    
    extension [Self <: LockLockedSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LockLockedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockLockedSmallMod.foo` */
  override def _to: SFC[LockLockedSmallProps] = default
}
