package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileInput extends js.Object {
  var fileInput: String
  var placeholderInput: String
  var preview: String
  var removeButton: String
  var removeFile: String
  var root: String
}

object Anon_FileInput {
  @scala.inline
  def apply(
    fileInput: String,
    placeholderInput: String,
    preview: String,
    removeButton: String,
    removeFile: String,
    root: String
  ): Anon_FileInput = {
    val __obj = js.Dynamic.literal(fileInput = fileInput, placeholderInput = placeholderInput, preview = preview, removeButton = removeButton, removeFile = removeFile, root = root)
  
    __obj.asInstanceOf[Anon_FileInput]
  }
}

