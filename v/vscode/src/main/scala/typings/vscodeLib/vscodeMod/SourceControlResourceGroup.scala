package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControlResourceGroup extends js.Object {
  /**
  		 * Whether this source control resource group is hidden when it contains
  		 * no [source control resource states](#SourceControlResourceState).
  		 */
  var hideWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * The id of this source control resource group.
  		 */
  val id: java.lang.String
  /**
  		 * The label of this source control resource group.
  		 */
  var label: java.lang.String
  /**
  		 * This group's collection of
  		 * [source control resource states](#SourceControlResourceState).
  		 */
  var resourceStates: js.Array[SourceControlResourceState]
  /**
  		 * Dispose this source control resource group.
  		 */
  def dispose(): scala.Unit
}

object SourceControlResourceGroup {
  @scala.inline
  def apply(
    dispose: () => scala.Unit,
    id: java.lang.String,
    label: java.lang.String,
    resourceStates: js.Array[SourceControlResourceState],
    hideWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined
  ): SourceControlResourceGroup = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), id = id, label = label, resourceStates = resourceStates)
    if (!js.isUndefined(hideWhenEmpty)) __obj.updateDynamic("hideWhenEmpty")(hideWhenEmpty)
    __obj.asInstanceOf[SourceControlResourceGroup]
  }
}

