package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plusXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/PlusXSmall", JSImport.Default)
  @js.native
  val default: FC[PlusXSmallProps] = js.native
  
  trait PlusXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PlusXSmallProps {
    
    inline def apply(): PlusXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlusXSmallProps]
    }
    
    extension [Self <: PlusXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PlusXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `plusXSmallMod.foo` */
  override def _to: FC[PlusXSmallProps] = default
}
