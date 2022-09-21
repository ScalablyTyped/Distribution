package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockFillSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/LockFillSmall", JSImport.Default)
  @js.native
  val default: FC[LockFillSmallProps] = js.native
  
  trait LockFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LockFillSmallProps {
    
    inline def apply(): LockFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockFillSmallProps]
    }
    
    extension [Self <: LockFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LockFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lockFillSmallMod.foo` */
  override def _to: FC[LockFillSmallProps] = default
}
