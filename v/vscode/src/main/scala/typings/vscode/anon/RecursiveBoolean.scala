package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecursiveBoolean extends StObject {
  
  val recursive: Boolean
}
object RecursiveBoolean {
  
  inline def apply(recursive: Boolean): RecursiveBoolean = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursiveBoolean]
  }
  
  extension [Self <: RecursiveBoolean](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
