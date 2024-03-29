package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsCutOutMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/CutOut", JSImport.Default)
  @js.native
  val default: FC[CutOutProps] = js.native
  
  trait CutOutProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CutOutProps {
    
    inline def apply(): CutOutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutOutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CutOutProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CutOutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsCutOutMod.foo` */
  override def _to: FC[CutOutProps] = default
}
