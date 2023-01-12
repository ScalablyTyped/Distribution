package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsIndeterminateXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/IndeterminateXSmall", JSImport.Default)
  @js.native
  val default: FC[IndeterminateXSmallProps] = js.native
  
  trait IndeterminateXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IndeterminateXSmallProps {
    
    inline def apply(): IndeterminateXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndeterminateXSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndeterminateXSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IndeterminateXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsIndeterminateXSmallMod.foo` */
  override def _to: FC[IndeterminateXSmallProps] = default
}
