package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopLevelSymbol extends StObject {
  
  var name: String
}
object TopLevelSymbol {
  
  inline def apply(name: String): TopLevelSymbol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopLevelSymbol] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
