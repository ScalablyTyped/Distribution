package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeGlobeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeGlobe", JSImport.Default)
  @js.native
  val default: FC[DistributeGlobeProps] = js.native
  
  trait DistributeGlobeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeGlobeProps {
    
    inline def apply(): DistributeGlobeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeGlobeProps]
    }
    
    extension [Self <: DistributeGlobeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeGlobeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeGlobeMod.foo` */
  override def _to: FC[DistributeGlobeProps] = default
}
