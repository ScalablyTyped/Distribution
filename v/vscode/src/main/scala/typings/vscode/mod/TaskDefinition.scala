package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val `type`: String
}

object TaskDefinition {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): TaskDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TaskDefinition]
  }
}

