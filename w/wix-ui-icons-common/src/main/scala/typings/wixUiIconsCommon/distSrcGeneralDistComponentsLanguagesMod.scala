package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsLanguagesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Languages", JSImport.Default)
  @js.native
  val default: FC[LanguagesProps] = js.native
  
  trait LanguagesProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LanguagesProps {
    
    inline def apply(): LanguagesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguagesProps]
    }
    
    extension [Self <: LanguagesProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LanguagesProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsLanguagesMod.foo` */
  override def _to: FC[LanguagesProps] = default
}
