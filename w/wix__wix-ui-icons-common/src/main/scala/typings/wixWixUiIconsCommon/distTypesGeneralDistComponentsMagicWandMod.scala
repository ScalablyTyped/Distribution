package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMagicWandMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MagicWand", JSImport.Default)
  @js.native
  val default: FC[MagicWandProps] = js.native
  
  trait MagicWandProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MagicWandProps {
    
    inline def apply(): MagicWandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MagicWandProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MagicWandProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MagicWandProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMagicWandMod.foo` */
  override def _to: FC[MagicWandProps] = default
}
