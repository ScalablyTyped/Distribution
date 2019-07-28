package typings.vscode

import typings.vscode.vscodeMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var uri: Uri
}

object Anon_Name {
  @scala.inline
  def apply(uri: Uri, name: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

