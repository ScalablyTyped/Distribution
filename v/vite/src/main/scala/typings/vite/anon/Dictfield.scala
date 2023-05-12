package typings.vite.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictfield
  extends StObject
     with /* field */ StringDictionary[Any] {
  
  var browser: String | (Record[String, String | `false`])
  
  var dependencies: Record[String, String]
  
  var exports: String | (Record[String, Any]) | js.Array[String]
  
  var imports: Record[String, Any]
  
  var main: String
  
  var module: String
  
  var name: String
  
  var `type`: String
  
  var version: String
}
object Dictfield {
  
  inline def apply(
    browser: String | (Record[String, String | `false`]),
    dependencies: Record[String, String],
    exports: String | (Record[String, Any]) | js.Array[String],
    imports: Record[String, Any],
    main: String,
    module: String,
    name: String,
    `type`: String,
    version: String
  ): Dictfield = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictfield]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictfield] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: String | (Record[String, String | `false`])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setExports(value: String | (Record[String, Any]) | js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setImports(value: Record[String, Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
