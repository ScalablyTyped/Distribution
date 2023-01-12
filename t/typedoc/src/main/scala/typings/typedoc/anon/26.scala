package typings.typedoc.anon

import typings.typedoc.typedocStrings.watch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var name: watch
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal(name = "watch")
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `26`] (val x: Self) extends AnyVal {
    
    inline def setName(value: watch): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
