package typings.stylableCore.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Names extends StObject {
  
  var names: Record[String, String]
}
object Names {
  
  inline def apply(names: Record[String, String]): Names = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
  
  extension [Self <: Names](x: Self) {
    
    inline def setNames(value: Record[String, String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
