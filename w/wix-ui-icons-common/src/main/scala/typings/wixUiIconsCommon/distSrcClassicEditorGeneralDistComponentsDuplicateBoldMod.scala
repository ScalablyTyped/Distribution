package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsDuplicateBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/DuplicateBold", JSImport.Default)
  @js.native
  val default: FC[DuplicateBoldProps] = js.native
  
  trait DuplicateBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DuplicateBoldProps {
    
    inline def apply(): DuplicateBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplicateBoldProps]
    }
    
    extension [Self <: DuplicateBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DuplicateBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsDuplicateBoldMod.foo` */
  override def _to: FC[DuplicateBoldProps] = default
}
