package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameUndefined extends StObject {
  
  var className: Unit
}
object ClassNameUndefined {
  
  inline def apply(className: Unit): ClassNameUndefined = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameUndefined]
  }
  
  extension [Self <: ClassNameUndefined](x: Self) {
    
    inline def setClassName(value: Unit): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
  }
}
