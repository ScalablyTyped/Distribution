package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsSelectFillLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/SelectFillLarge", JSImport.Default)
  @js.native
  val default: FC[SelectFillLargeProps] = js.native
  
  trait SelectFillLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SelectFillLargeProps {
    
    inline def apply(): SelectFillLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectFillLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectFillLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SelectFillLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsSelectFillLargeMod.foo` */
  override def _to: FC[SelectFillLargeProps] = default
}
