package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListArrayMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ListArray", JSImport.Default)
  @js.native
  val default: FC[ListArrayProps] = js.native
  
  trait ListArrayProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ListArrayProps {
    
    inline def apply(): ListArrayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListArrayProps]
    }
    
    extension [Self <: ListArrayProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ListArrayProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsListArrayMod.foo` */
  override def _to: FC[ListArrayProps] = default
}
