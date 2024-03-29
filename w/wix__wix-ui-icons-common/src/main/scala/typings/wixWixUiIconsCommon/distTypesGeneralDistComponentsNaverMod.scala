package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsNaverMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Naver", JSImport.Default)
  @js.native
  val default: FC[NaverProps] = js.native
  
  trait NaverProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object NaverProps {
    
    inline def apply(): NaverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NaverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NaverProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[NaverProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsNaverMod.foo` */
  override def _to: FC[NaverProps] = default
}
