package typings.typedoc.anon

import typings.typedoc.typedocStrings.blockTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var name: blockTags
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal(name = "blockTags")
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`] (val x: Self) extends AnyVal {
    
    inline def setName(value: blockTags): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
