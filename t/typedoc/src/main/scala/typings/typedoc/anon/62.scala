package typings.typedoc.anon

import typings.typedoc.typedocStrings.externalPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var name: externalPattern
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal(name = "externalPattern")
    __obj.asInstanceOf[`62`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `62`] (val x: Self) extends AnyVal {
    
    inline def setName(value: externalPattern): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
