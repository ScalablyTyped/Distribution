package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Parent", JSImport.Default)
  @js.native
  val default: FC[ParentProps] = js.native
  
  trait ParentProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ParentProps {
    
    inline def apply(): ParentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParentProps]
    }
    
    extension [Self <: ParentProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ParentProps]
  
  /* This means you don't have to write `default`, but can instead just say `parentMod.foo` */
  override def _to: FC[ParentProps] = default
}
