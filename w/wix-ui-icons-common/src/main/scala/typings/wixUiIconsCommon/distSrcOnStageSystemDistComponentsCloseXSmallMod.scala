package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsCloseXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/CloseXSmall", JSImport.Default)
  @js.native
  val default: FC[CloseXSmallProps] = js.native
  
  trait CloseXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CloseXSmallProps {
    
    inline def apply(): CloseXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseXSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseXSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CloseXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsCloseXSmallMod.foo` */
  override def _to: FC[CloseXSmallProps] = default
}
