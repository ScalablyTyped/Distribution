package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minusXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/MinusXSmall", JSImport.Default)
  @js.native
  val default: FC[MinusXSmallProps] = js.native
  
  trait MinusXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MinusXSmallProps {
    
    inline def apply(): MinusXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinusXSmallProps]
    }
    
    extension [Self <: MinusXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MinusXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `minusXSmallMod.foo` */
  override def _to: FC[MinusXSmallProps] = default
}
