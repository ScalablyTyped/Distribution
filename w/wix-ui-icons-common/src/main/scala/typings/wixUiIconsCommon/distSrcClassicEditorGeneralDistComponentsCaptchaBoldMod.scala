package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsCaptchaBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/CaptchaBold", JSImport.Default)
  @js.native
  val default: FC[CaptchaBoldProps] = js.native
  
  trait CaptchaBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CaptchaBoldProps {
    
    inline def apply(): CaptchaBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptchaBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptchaBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CaptchaBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsCaptchaBoldMod.foo` */
  override def _to: FC[CaptchaBoldProps] = default
}
