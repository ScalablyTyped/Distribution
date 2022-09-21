package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLockUnlockedSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/LockUnlockedSmall", JSImport.Default)
  @js.native
  val default: FC[LockUnlockedSmallProps] = js.native
  
  trait LockUnlockedSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LockUnlockedSmallProps {
    
    inline def apply(): LockUnlockedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockUnlockedSmallProps]
    }
    
    extension [Self <: LockUnlockedSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LockUnlockedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsLockUnlockedSmallMod.foo` */
  override def _to: FC[LockUnlockedSmallProps] = default
}
