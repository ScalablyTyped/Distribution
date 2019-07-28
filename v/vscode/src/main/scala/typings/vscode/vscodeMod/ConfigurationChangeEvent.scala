package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationChangeEvent extends js.Object {
  /**
  		 * Returns `true` if the given section for the given resource (if provided) is affected.
  		 *
  		 * @param section Configuration name, supports _dotted_ names.
  		 * @param resource A resource Uri.
  		 * @return `true` if the given section for the given resource (if provided) is affected.
  		 */
  def affectsConfiguration(section: String): Boolean = js.native
  def affectsConfiguration(section: String, resource: Uri): Boolean = js.native
}

