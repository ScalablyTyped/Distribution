package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusIndeterminateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusIndeterminateSmall", JSImport.Default)
  @js.native
  val default: FC[StatusIndeterminateSmallProps] = js.native
  
  trait StatusIndeterminateSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusIndeterminateSmallProps {
    
    inline def apply(): StatusIndeterminateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusIndeterminateSmallProps]
    }
    
    extension [Self <: StatusIndeterminateSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusIndeterminateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusIndeterminateSmallMod.foo` */
  override def _to: FC[StatusIndeterminateSmallProps] = default
}
