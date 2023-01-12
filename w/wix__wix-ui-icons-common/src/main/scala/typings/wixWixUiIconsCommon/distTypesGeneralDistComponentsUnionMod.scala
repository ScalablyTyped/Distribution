package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUnionMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Union", JSImport.Default)
  @js.native
  val default: FC[UnionProps] = js.native
  
  trait UnionProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnionProps {
    
    inline def apply(): UnionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnionProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnionProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUnionMod.foo` */
  override def _to: FC[UnionProps] = default
}
