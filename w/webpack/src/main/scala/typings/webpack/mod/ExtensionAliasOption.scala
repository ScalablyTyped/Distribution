package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAliasOption extends StObject {
  
  var alias: String | js.Array[String]
  
  var `extension`: String
}
object ExtensionAliasOption {
  
  inline def apply(alias: String | js.Array[String], `extension`: String): ExtensionAliasOption = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAliasOption]
  }
  
  extension [Self <: ExtensionAliasOption](x: Self) {
    
    inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
