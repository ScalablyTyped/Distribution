package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var uri: vscodeLib.vscodeMod.Uri
}

object Anon_Name {
  @scala.inline
  def apply(uri: vscodeLib.vscodeMod.Uri, name: java.lang.String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

