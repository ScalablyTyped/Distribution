package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  /** True if it is intended that this reference form a circularity */
  var circular: js.UndefOr[scala.Boolean] = js.undefined
  /** The path as the user originally wrote it */
  var originalPath: js.UndefOr[java.lang.String] = js.undefined
  /** A normalized path on disk */
  var path: java.lang.String
  /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
  var prepend: js.UndefOr[scala.Boolean] = js.undefined
}

object ProjectReference {
  @scala.inline
  def apply(
    path: java.lang.String,
    circular: js.UndefOr[scala.Boolean] = js.undefined,
    originalPath: java.lang.String = null,
    prepend: js.UndefOr[scala.Boolean] = js.undefined
  ): ProjectReference = {
    val __obj = js.Dynamic.literal(path = path)
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (originalPath != null) __obj.updateDynamic("originalPath")(originalPath)
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend)
    __obj.asInstanceOf[ProjectReference]
  }
}

