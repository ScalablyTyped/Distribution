package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsVideoBoxBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/VideoBoxBold", JSImport.Default)
  @js.native
  val default: FC[VideoBoxBoldProps] = js.native
  
  trait VideoBoxBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VideoBoxBoldProps {
    
    inline def apply(): VideoBoxBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoBoxBoldProps]
    }
    
    extension [Self <: VideoBoxBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VideoBoxBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsVideoBoxBoldMod.foo` */
  override def _to: FC[VideoBoxBoldProps] = default
}
