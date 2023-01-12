package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDistributeHorizontallyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DistributeHorizontally", JSImport.Default)
  @js.native
  val default: FC[DistributeHorizontallyProps] = js.native
  
  trait DistributeHorizontallyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeHorizontallyProps {
    
    inline def apply(): DistributeHorizontallyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeHorizontallyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DistributeHorizontallyProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeHorizontallyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDistributeHorizontallyMod.foo` */
  override def _to: FC[DistributeHorizontallyProps] = default
}
