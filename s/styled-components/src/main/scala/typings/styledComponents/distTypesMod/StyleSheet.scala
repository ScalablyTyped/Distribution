package typings.styledComponents.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheet extends StObject {
  
  var create: js.Function
}
object StyleSheet {
  
  inline def apply(create: js.Function): StyleSheet = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  extension [Self <: StyleSheet](x: Self) {
    
    inline def setCreate(value: js.Function): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
  }
}
