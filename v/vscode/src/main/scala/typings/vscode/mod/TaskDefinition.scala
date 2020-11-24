package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinition
  extends /**
  * Additional debug type specific properties.
  */
/* key */ StringDictionary[js.Any] {
  
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
  val `type`: String = js.native
}
object TaskDefinition {
  
  @scala.inline
  def apply(`type`: String): TaskDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinition]
  }
  
  @scala.inline
  implicit class TaskDefinitionOps[Self <: TaskDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
