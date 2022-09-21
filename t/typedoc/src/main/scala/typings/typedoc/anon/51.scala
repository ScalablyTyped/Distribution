package typings.typedoc.anon

import typings.typedoc.typedocStrings.searchInComments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var name: searchInComments
}
object `51` {
  
  inline def apply(): `51` = {
    val __obj = js.Dynamic.literal(name = "searchInComments")
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setName(value: searchInComments): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
