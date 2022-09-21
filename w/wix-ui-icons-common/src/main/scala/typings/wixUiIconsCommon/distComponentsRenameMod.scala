package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsRenameMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Rename", JSImport.Default)
  @js.native
  val default: FC[RenameProps] = js.native
  
  trait RenameProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RenameProps {
    
    inline def apply(): RenameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenameProps]
    }
    
    extension [Self <: RenameProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RenameProps]
  
  /* This means you don't have to write `default`, but can instead just say `distComponentsRenameMod.foo` */
  override def _to: FC[RenameProps] = default
}
