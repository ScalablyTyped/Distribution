package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.SourceFileMode.Modules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var file: typings.typedoc.optionsDeclarationMod.SourceFileMode.File
  var modules: Modules
}

object File {
  @scala.inline
  def apply(file: typings.typedoc.optionsDeclarationMod.SourceFileMode.File, modules: Modules): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

