package typings.webpack.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportsArgument extends StObject {
  
  /**
  		 * the name of the exports object
  		 */
  var exportsArgument: String
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
}
object ExportsArgument {
  
  inline def apply(exportsArgument: String, runtimeRequirements: Set[String]): ExportsArgument = {
    val __obj = js.Dynamic.literal(exportsArgument = exportsArgument.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportsArgument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportsArgument] (val x: Self) extends AnyVal {
    
    inline def setExportsArgument(value: String): Self = StObject.set(x, "exportsArgument", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
  }
}
