package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsMatchHeightWidthMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/MatchHeight_Width", JSImport.Default)
  @js.native
  val default: FC[MatchHeightWidthProps] = js.native
  
  trait MatchHeightWidthProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MatchHeightWidthProps {
    
    inline def apply(): MatchHeightWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchHeightWidthProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchHeightWidthProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MatchHeightWidthProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsMatchHeightWidthMod.foo` */
  override def _to: FC[MatchHeightWidthProps] = default
}
