package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsBooleanBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/BooleanBold", JSImport.Default)
  @js.native
  val default: FC[BooleanBoldProps] = js.native
  
  trait BooleanBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BooleanBoldProps {
    
    inline def apply(): BooleanBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BooleanBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BooleanBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BooleanBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsBooleanBoldMod.foo` */
  override def _to: FC[BooleanBoldProps] = default
}
