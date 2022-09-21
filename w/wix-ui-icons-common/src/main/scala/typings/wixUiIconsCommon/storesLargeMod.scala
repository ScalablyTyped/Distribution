package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storesLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/StoresLarge", JSImport.Default)
  @js.native
  val default: FC[StoresLargeProps] = js.native
  
  trait StoresLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StoresLargeProps {
    
    inline def apply(): StoresLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoresLargeProps]
    }
    
    extension [Self <: StoresLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StoresLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `storesLargeMod.foo` */
  override def _to: FC[StoresLargeProps] = default
}
