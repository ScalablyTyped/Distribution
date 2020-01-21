package typings.yarnpkgLockfile

import typings.yarnpkgLockfile.yarnpkgLockfileStrings.conflict
import typings.yarnpkgLockfile.yarnpkgLockfileStrings.merge
import typings.yarnpkgLockfile.yarnpkgLockfileStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConflict extends js.Object {
  var `object`: js.Any
  var `type`: success | merge | conflict
}

object AnonConflict {
  @scala.inline
  def apply(`object`: js.Any, `type`: success | merge | conflict): AnonConflict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConflict]
  }
}

