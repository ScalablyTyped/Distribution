package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var name: excludeInternal
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal(name = "excludeInternal")
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `24`] (val x: Self) extends AnyVal {
    
    inline def setName(value: excludeInternal): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
