package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsEditorXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EditorXSmall", JSImport.Default)
  @js.native
  val default: FC[EditorXSmallProps] = js.native
  
  trait EditorXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EditorXSmallProps {
    
    inline def apply(): EditorXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorXSmallProps]
    }
    
    extension [Self <: EditorXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EditorXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsEditorXSmallMod.foo` */
  override def _to: FC[EditorXSmallProps] = default
}
