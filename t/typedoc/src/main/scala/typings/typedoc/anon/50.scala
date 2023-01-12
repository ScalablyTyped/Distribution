package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var name: excludeTags
}
object `50` {
  
  inline def apply(): `50` = {
    val __obj = js.Dynamic.literal(name = "excludeTags")
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `50`] (val x: Self) extends AnyVal {
    
    inline def setName(value: excludeTags): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
