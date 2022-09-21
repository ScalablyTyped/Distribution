package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ObjectsSmall", JSImport.Default)
  @js.native
  val default: FC[ObjectsSmallProps] = js.native
  
  trait ObjectsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ObjectsSmallProps {
    
    inline def apply(): ObjectsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectsSmallProps]
    }
    
    extension [Self <: ObjectsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ObjectsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `objectsSmallMod.foo` */
  override def _to: FC[ObjectsSmallProps] = default
}
