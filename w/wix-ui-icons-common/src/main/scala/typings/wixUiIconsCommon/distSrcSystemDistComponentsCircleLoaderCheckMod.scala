package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsCircleLoaderCheckMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CircleLoaderCheck", JSImport.Default)
  @js.native
  val default: FC[CircleLoaderCheckProps] = js.native
  
  trait CircleLoaderCheckProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CircleLoaderCheckProps {
    
    inline def apply(): CircleLoaderCheckProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLoaderCheckProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircleLoaderCheckProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CircleLoaderCheckProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsCircleLoaderCheckMod.foo` */
  override def _to: FC[CircleLoaderCheckProps] = default
}
