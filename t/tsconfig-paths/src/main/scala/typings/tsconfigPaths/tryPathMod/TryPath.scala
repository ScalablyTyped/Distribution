package typings.tsconfigPaths.tryPathMod

import typings.tsconfigPaths.tsconfigPathsStrings._package
import typings.tsconfigPaths.tsconfigPathsStrings.extension
import typings.tsconfigPaths.tsconfigPathsStrings.file
import typings.tsconfigPaths.tsconfigPathsStrings.index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryPath extends js.Object {
  val path: String
  val `type`: file | extension | index | _package
}

object TryPath {
  @scala.inline
  def apply(path: String, `type`: file | extension | index | _package): TryPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryPath]
  }
}

