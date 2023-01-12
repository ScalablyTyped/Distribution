package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsArrangeBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ArrangeBold", JSImport.Default)
  @js.native
  val default: FC[ArrangeBoldProps] = js.native
  
  trait ArrangeBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrangeBoldProps {
    
    inline def apply(): ArrangeBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrangeBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrangeBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrangeBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsArrangeBoldMod.foo` */
  override def _to: FC[ArrangeBoldProps] = default
}
