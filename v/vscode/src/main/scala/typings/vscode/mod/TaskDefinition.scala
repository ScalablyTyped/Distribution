package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinition
  extends StObject
     with /**
  * Additional debug type specific properties.
  */
/* key */ StringDictionary[Any] {
  
  /**
    * The task definition describing the task provided by an extension.
    * Usually a task provider defines more properties to identify
    * a task. They need to be defined in the package.json of the
    * extension under the 'taskDefinitions' extension point. The npm
    * task definition for example looks like this
    * ```typescript
    * interface NpmTaskDefinition extends TaskDefinition {
    *     script: string;
    * }
    * ```
    *
    * Note that type identifier starting with a '$' are reserved for internal
    * usages and shouldn't be used by extensions.
    */
  val `type`: String
}
object TaskDefinition {
  
  inline def apply(`type`: String): TaskDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinition]
  }
  
  extension [Self <: TaskDefinition](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
