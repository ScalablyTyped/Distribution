package typings.typedoc.distLibModelsSourcesFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceReference extends js.Object {
  var character: Double
  var file: js.UndefOr[SourceFile] = js.undefined
  var fileName: String
  var line: Double
  var url: js.UndefOr[String] = js.undefined
}

object SourceReference {
  @scala.inline
  def apply(character: Double, fileName: String, line: Double, file: SourceFile = null, url: String = null): SourceReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceReference]
  }
}

