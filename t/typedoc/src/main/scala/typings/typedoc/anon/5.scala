package typings.typedoc.anon

import typings.typedoc.typedocStrings.inlineTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var name: inlineTags
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(name = "inlineTags")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setName(value: inlineTags): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
