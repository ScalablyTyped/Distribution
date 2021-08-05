package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskFilter extends StObject {
  
  /**
    * The task type to return;
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The task version as used in the tasks.json file.
    * The string support the package.json semver notation.
    */
  var version: js.UndefOr[String] = js.undefined
}
object TaskFilter {
  
  inline def apply(): TaskFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskFilter]
  }
  
  extension [Self <: TaskFilter](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
