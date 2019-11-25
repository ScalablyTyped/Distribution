package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  /** True if it is intended that this reference form a circularity */
  var circular: js.UndefOr[Boolean] = js.undefined
  /** The path as the user originally wrote it */
  var originalPath: js.UndefOr[String] = js.undefined
  /** A normalized path on disk */
  var path: String
  /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
  var prepend: js.UndefOr[Boolean] = js.undefined
}

object ProjectReference {
  @scala.inline
  def apply(
    path: String,
    circular: js.UndefOr[Boolean] = js.undefined,
    originalPath: String = null,
    prepend: js.UndefOr[Boolean] = js.undefined
  ): ProjectReference = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (originalPath != null) __obj.updateDynamic("originalPath")(originalPath.asInstanceOf[js.Any])
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
}

