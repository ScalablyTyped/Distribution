package typings.typedoc

import typings.typedoc.optionsDeclarationMod.SourceFileMode.File
import typings.typedoc.optionsDeclarationMod.SourceFileMode.Modules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: File
  var modules: Modules
}

object AnonFile {
  @scala.inline
  def apply(file: File, modules: Modules): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

