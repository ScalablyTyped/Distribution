package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockUnlockedBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/LockUnlockedBold", JSImport.Default)
  @js.native
  val default: FC[LockUnlockedBoldProps] = js.native
  
  trait LockUnlockedBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LockUnlockedBoldProps {
    
    inline def apply(): LockUnlockedBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockUnlockedBoldProps]
    }
    
    extension [Self <: LockUnlockedBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LockUnlockedBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockUnlockedBoldMod.foo` */
  override def _to: FC[LockUnlockedBoldProps] = default
}
