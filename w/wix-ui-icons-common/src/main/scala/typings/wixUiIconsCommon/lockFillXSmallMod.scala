package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockFillXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/LockFillXSmall", JSImport.Default)
  @js.native
  val default: FC[LockFillXSmallProps] = js.native
  
  trait LockFillXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LockFillXSmallProps {
    
    inline def apply(): LockFillXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockFillXSmallProps]
    }
    
    extension [Self <: LockFillXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LockFillXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockFillXSmallMod.foo` */
  override def _to: FC[LockFillXSmallProps] = default
}
