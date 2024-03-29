package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsMinimizeAllMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/MinimizeAll", JSImport.Default)
  @js.native
  val default: FC[MinimizeAllProps] = js.native
  
  trait MinimizeAllProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MinimizeAllProps {
    
    inline def apply(): MinimizeAllProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimizeAllProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimizeAllProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MinimizeAllProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsMinimizeAllMod.foo` */
  override def _to: FC[MinimizeAllProps] = default
}
