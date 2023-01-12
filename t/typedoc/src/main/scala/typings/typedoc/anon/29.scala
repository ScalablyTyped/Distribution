package typings.typedoc.anon

import typings.typedoc.typedocStrings.darkHighlightTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var name: darkHighlightTheme
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(name = "darkHighlightTheme")
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`] (val x: Self) extends AnyVal {
    
    inline def setName(value: darkHighlightTheme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
