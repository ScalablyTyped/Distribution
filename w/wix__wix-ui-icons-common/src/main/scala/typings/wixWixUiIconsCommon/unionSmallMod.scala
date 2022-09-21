package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/UnionSmall", JSImport.Default)
  @js.native
  val default: FC[UnionSmallProps] = js.native
  
  trait UnionSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnionSmallProps {
    
    inline def apply(): UnionSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnionSmallProps]
    }
    
    extension [Self <: UnionSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnionSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `unionSmallMod.foo` */
  override def _to: FC[UnionSmallProps] = default
}
