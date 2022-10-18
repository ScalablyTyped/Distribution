package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsMinusCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/MinusCircle", JSImport.Default)
  @js.native
  val default: FC[MinusCircleProps] = js.native
  
  trait MinusCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MinusCircleProps {
    
    inline def apply(): MinusCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinusCircleProps]
    }
    
    extension [Self <: MinusCircleProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MinusCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsMinusCircleMod.foo` */
  override def _to: FC[MinusCircleProps] = default
}
