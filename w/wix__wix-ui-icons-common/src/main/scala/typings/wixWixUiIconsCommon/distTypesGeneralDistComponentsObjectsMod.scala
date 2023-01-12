package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsObjectsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Objects", JSImport.Default)
  @js.native
  val default: FC[ObjectsProps] = js.native
  
  trait ObjectsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ObjectsProps {
    
    inline def apply(): ObjectsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ObjectsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsObjectsMod.foo` */
  override def _to: FC[ObjectsProps] = default
}
