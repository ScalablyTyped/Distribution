package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsEsignatureboldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ESignatureBold", JSImport.Default)
  @js.native
  val default: FC[ESignatureBoldProps] = js.native
  
  trait ESignatureBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ESignatureBoldProps {
    
    inline def apply(): ESignatureBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESignatureBoldProps]
    }
    
    extension [Self <: ESignatureBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ESignatureBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsEsignatureboldMod.foo` */
  override def _to: FC[ESignatureBoldProps] = default
}
