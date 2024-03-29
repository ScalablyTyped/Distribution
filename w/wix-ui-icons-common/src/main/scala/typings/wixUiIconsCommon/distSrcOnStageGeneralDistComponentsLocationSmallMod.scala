package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsLocationSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/LocationSmall", JSImport.Default)
  @js.native
  val default: FC[LocationSmallProps] = js.native
  
  trait LocationSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LocationSmallProps {
    
    inline def apply(): LocationSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LocationSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsLocationSmallMod.foo` */
  override def _to: FC[LocationSmallProps] = default
}
