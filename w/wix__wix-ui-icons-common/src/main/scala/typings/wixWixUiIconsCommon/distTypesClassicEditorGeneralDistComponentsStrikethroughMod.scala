package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsStrikethroughMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Strikethrough", JSImport.Default)
  @js.native
  val default: FC[StrikethroughProps] = js.native
  
  trait StrikethroughProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StrikethroughProps {
    
    inline def apply(): StrikethroughProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrikethroughProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrikethroughProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StrikethroughProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsStrikethroughMod.foo` */
  override def _to: FC[StrikethroughProps] = default
}
