package typings.typedoc.anon

import typings.typedoc.typedocStrings.entryPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var name: entryPoints
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(name = "entryPoints")
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`] (val x: Self) extends AnyVal {
    
    inline def setName(value: entryPoints): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
