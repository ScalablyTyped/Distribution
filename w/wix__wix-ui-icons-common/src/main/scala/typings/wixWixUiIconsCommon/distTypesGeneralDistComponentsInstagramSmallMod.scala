package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsInstagramSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/InstagramSmall", JSImport.Default)
  @js.native
  val default: FC[InstagramSmallProps] = js.native
  
  trait InstagramSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InstagramSmallProps {
    
    inline def apply(): InstagramSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstagramSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstagramSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InstagramSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsInstagramSmallMod.foo` */
  override def _to: FC[InstagramSmallProps] = default
}
