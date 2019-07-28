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
    val __obj = js.Dynamic.literal(character = character, fileName = fileName, line = line)
    if (file != null) __obj.updateDynamic("file")(file)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SourceReference]
  }
}

