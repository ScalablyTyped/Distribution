package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsCodeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Code", JSImport.Default)
  @js.native
  val default: FC[CodeProps] = js.native
  
  trait CodeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CodeProps {
    
    inline def apply(): CodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CodeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsCodeMod.foo` */
  override def _to: FC[CodeProps] = default
}
