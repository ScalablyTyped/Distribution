package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeObjectMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/CodeObject", JSImport.Default)
  @js.native
  val default: FC[CodeObjectProps] = js.native
  
  trait CodeObjectProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CodeObjectProps {
    
    inline def apply(): CodeObjectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeObjectProps]
    }
    
    extension [Self <: CodeObjectProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CodeObjectProps]
  
  /* This means you don't have to write `default`, but can instead just say `codeObjectMod.foo` */
  override def _to: FC[CodeObjectProps] = default
}
