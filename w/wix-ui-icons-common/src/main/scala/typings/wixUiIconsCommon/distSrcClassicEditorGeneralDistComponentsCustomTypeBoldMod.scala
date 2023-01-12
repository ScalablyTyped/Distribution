package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsCustomTypeBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/CustomTypeBold", JSImport.Default)
  @js.native
  val default: FC[CustomTypeBoldProps] = js.native
  
  trait CustomTypeBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CustomTypeBoldProps {
    
    inline def apply(): CustomTypeBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomTypeBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomTypeBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CustomTypeBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsCustomTypeBoldMod.foo` */
  override def _to: FC[CustomTypeBoldProps] = default
}
