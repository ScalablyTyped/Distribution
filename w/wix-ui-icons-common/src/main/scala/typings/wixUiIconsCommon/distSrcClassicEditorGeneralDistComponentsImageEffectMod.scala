package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsImageEffectMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ImageEffect", JSImport.Default)
  @js.native
  val default: FC[ImageEffectProps] = js.native
  
  trait ImageEffectProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ImageEffectProps {
    
    inline def apply(): ImageEffectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageEffectProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageEffectProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ImageEffectProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsImageEffectMod.foo` */
  override def _to: FC[ImageEffectProps] = default
}
