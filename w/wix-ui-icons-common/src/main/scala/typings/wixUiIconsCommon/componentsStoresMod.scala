package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsStoresMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Stores", JSImport.Default)
  @js.native
  val default: FC[StoresProps] = js.native
  
  trait StoresProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StoresProps {
    
    inline def apply(): StoresProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoresProps]
    }
    
    extension [Self <: StoresProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StoresProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsStoresMod.foo` */
  override def _to: FC[StoresProps] = default
}
