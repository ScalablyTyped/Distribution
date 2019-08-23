package typings.atYarnpkgLockfile

import typings.atYarnpkgLockfile.atYarnpkgLockfileStrings.conflict
import typings.atYarnpkgLockfile.atYarnpkgLockfileStrings.merge
import typings.atYarnpkgLockfile.atYarnpkgLockfileStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conflict extends js.Object {
  var `object`: js.Any
  var `type`: success | merge | conflict
}

object Anon_Conflict {
  @scala.inline
  def apply(`object`: js.Any, `type`: success | merge | conflict): Anon_Conflict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Conflict]
  }
}

