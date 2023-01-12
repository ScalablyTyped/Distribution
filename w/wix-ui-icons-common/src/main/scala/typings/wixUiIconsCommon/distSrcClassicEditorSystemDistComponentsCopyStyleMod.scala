package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsCopyStyleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/CopyStyle", JSImport.Default)
  @js.native
  val default: FC[CopyStyleProps] = js.native
  
  trait CopyStyleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CopyStyleProps {
    
    inline def apply(): CopyStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyStyleProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CopyStyleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsCopyStyleMod.foo` */
  override def _to: FC[CopyStyleProps] = default
}
