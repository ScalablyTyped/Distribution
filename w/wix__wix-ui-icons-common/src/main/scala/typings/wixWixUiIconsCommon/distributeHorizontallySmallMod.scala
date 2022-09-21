package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributeHorizontallySmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DistributeHorizontallySmall", JSImport.Default)
  @js.native
  val default: FC[DistributeHorizontallySmallProps] = js.native
  
  trait DistributeHorizontallySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeHorizontallySmallProps {
    
    inline def apply(): DistributeHorizontallySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeHorizontallySmallProps]
    }
    
    extension [Self <: DistributeHorizontallySmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeHorizontallySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distributeHorizontallySmallMod.foo` */
  override def _to: FC[DistributeHorizontallySmallProps] = default
}
