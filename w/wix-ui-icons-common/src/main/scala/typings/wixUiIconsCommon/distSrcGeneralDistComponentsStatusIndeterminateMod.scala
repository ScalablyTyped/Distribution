package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsStatusIndeterminateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusIndeterminate", JSImport.Default)
  @js.native
  val default: FC[StatusIndeterminateProps] = js.native
  
  trait StatusIndeterminateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StatusIndeterminateProps {
    
    inline def apply(): StatusIndeterminateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusIndeterminateProps]
    }
    
    extension [Self <: StatusIndeterminateProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StatusIndeterminateProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsStatusIndeterminateMod.foo` */
  override def _to: FC[StatusIndeterminateProps] = default
}
