package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinition
  extends /**
		 * Additional attributes of a concrete task definition.
		 */
/* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  		 * The task definition descibing the task provided by an extension.
  		 * Usually a task provider defines more properties to identify
  		 * a task. They need to be defined in the package.json of the
  		 * extension under the 'taskDefinitions' extension point. The npm
  		 * task definition for example looks like this
  		 * ```typescript
  		 * interface NpmTaskDefinition extends TaskDefinition {
  		 *     script: string;
  		 * }
  		 * ```
  		 */
  val `type`: java.lang.String
}

object TaskDefinition {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /**
  		 * Additional attributes of a concrete task definition.
  		 */
  /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): TaskDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TaskDefinition]
  }
}

