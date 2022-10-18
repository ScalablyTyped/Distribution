package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsMatchHeightMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/MatchHeight", JSImport.Default)
  @js.native
  val default: FC[MatchHeightProps] = js.native
  
  trait MatchHeightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MatchHeightProps {
    
    inline def apply(): MatchHeightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchHeightProps]
    }
    
    extension [Self <: MatchHeightProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MatchHeightProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsMatchHeightMod.foo` */
  override def _to: FC[MatchHeightProps] = default
}
