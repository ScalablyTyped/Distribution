package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RenameSmall", JSImport.Default)
  @js.native
  val default: FC[RenameSmallProps] = js.native
  
  trait RenameSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RenameSmallProps {
    
    inline def apply(): RenameSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenameSmallProps]
    }
    
    extension [Self <: RenameSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RenameSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `renameSmallMod.foo` */
  override def _to: FC[RenameSmallProps] = default
}
