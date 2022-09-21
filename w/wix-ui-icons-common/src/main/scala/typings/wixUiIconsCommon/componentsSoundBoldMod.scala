package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSoundBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/SoundBold", JSImport.Default)
  @js.native
  val default: FC[SoundBoldProps] = js.native
  
  trait SoundBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SoundBoldProps {
    
    inline def apply(): SoundBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundBoldProps]
    }
    
    extension [Self <: SoundBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SoundBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsSoundBoldMod.foo` */
  override def _to: FC[SoundBoldProps] = default
}
