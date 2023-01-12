package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDistributeGlobeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeGlobeSmall", JSImport.Default)
  @js.native
  val default: FC[DistributeGlobeSmallProps] = js.native
  
  trait DistributeGlobeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeGlobeSmallProps {
    
    inline def apply(): DistributeGlobeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeGlobeSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DistributeGlobeSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeGlobeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDistributeGlobeSmallMod.foo` */
  override def _to: FC[DistributeGlobeSmallProps] = default
}
