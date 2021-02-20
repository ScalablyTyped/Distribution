package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languagesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Languages", JSImport.Default)
  @js.native
  val default: SFC[LanguagesProps] = js.native
  
  @js.native
  trait LanguagesProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LanguagesProps {
    
    @scala.inline
    def apply(): LanguagesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguagesProps]
    }
    
    @scala.inline
    implicit class LanguagesPropsMutableBuilder[Self <: LanguagesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LanguagesProps]
  
  /* This means you don't have to write `default`, but can instead just say `languagesMod.foo` */
  override def _to: SFC[LanguagesProps] = default
}
