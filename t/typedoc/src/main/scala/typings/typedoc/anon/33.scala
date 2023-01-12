package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeNotDocumented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var name: excludeNotDocumented
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal(name = "excludeNotDocumented")
    __obj.asInstanceOf[`33`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `33`] (val x: Self) extends AnyVal {
    
    inline def setName(value: excludeNotDocumented): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
