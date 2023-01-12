package typings.wordpressCoreData.schemaMod.Schema

import typings.wordpressCoreData.anon.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme_supports: Formats
}
object Theme {
  
  inline def apply(theme_supports: Formats): Theme = {
    val __obj = js.Dynamic.literal(theme_supports = theme_supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setTheme_supports(value: Formats): Self = StObject.set(x, "theme_supports", value.asInstanceOf[js.Any])
  }
}
