package typings.typedoc.anon

import typings.typedoc.typedocStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var name: theme
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal(name = "theme")
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setName(value: theme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
