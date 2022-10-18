package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseActionObject
  extends StObject
     with /* other */ StringDictionary[Any] {
  
  /**
    * The type of action that is executed.
    */
  var `type`: String
}
object BaseActionObject {
  
  inline def apply(`type`: String): BaseActionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseActionObject]
  }
  
  extension [Self <: BaseActionObject](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
