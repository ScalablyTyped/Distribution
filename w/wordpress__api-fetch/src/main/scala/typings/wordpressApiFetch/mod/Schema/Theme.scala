package typings.wordpressApiFetch.mod.Schema

import typings.wordpressApiFetch.anon.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends StObject {
  
  var theme_supports: Formats = js.native
}
object Theme {
  
  @scala.inline
  def apply(theme_supports: Formats): Theme = {
    val __obj = js.Dynamic.literal(theme_supports = theme_supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme_supports(value: Formats): Self = StObject.set(x, "theme_supports", value.asInstanceOf[js.Any])
  }
}
