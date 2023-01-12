package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsPremiumBoldSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/PremiumBoldSmall", JSImport.Default)
  @js.native
  val default: FC[PremiumBoldSmallProps] = js.native
  
  trait PremiumBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PremiumBoldSmallProps {
    
    inline def apply(): PremiumBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PremiumBoldSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PremiumBoldSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PremiumBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsPremiumBoldSmallMod.foo` */
  override def _to: FC[PremiumBoldSmallProps] = default
}
