package typings.yarnpkgLockfile.anon

import typings.yarnpkgLockfile.yarnpkgLockfileStrings.conflict
import typings.yarnpkgLockfile.yarnpkgLockfileStrings.merge
import typings.yarnpkgLockfile.yarnpkgLockfileStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var `object`: js.Any
  var `type`: success | merge | conflict
}

object Object {
  @scala.inline
  def apply(`object`: js.Any, `type`: success | merge | conflict): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

