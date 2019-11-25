package typings.typescript.typescriptMod

import typings.typescript.typescriptStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinedCodeFixScope extends js.Object {
  var fileName: String
  var `type`: file
}

object CombinedCodeFixScope {
  @scala.inline
  def apply(fileName: String, `type`: file): CombinedCodeFixScope = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedCodeFixScope]
  }
}

