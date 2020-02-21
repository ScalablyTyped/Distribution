package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationChangeEvent extends js.Object {
  /**
  		 * Returns `true` if the given section is affected in the provided scope.
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @param scope A scope in which to check.
  		 * @return `true` if the given section is affected in the provided scope.
  		 */
  def affectsConfiguration(section: String): Boolean = js.native
  def affectsConfiguration(section: String, scope: ConfigurationScope): Boolean = js.native
}

