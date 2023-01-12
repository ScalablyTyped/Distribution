package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsLockUnlockedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/LockUnlocked", JSImport.Default)
  @js.native
  val default: FC[LockUnlockedProps] = js.native
  
  trait LockUnlockedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LockUnlockedProps {
    
    inline def apply(): LockUnlockedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockUnlockedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LockUnlockedProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LockUnlockedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsLockUnlockedMod.foo` */
  override def _to: FC[LockUnlockedProps] = default
}
