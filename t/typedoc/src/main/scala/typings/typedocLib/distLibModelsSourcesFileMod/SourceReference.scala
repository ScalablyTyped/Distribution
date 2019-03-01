package typings
package typedocLib.distLibModelsSourcesFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceReference extends js.Object {
  var character: scala.Double
  var file: js.UndefOr[SourceFile] = js.undefined
  var fileName: java.lang.String
  var line: scala.Double
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object SourceReference {
  @scala.inline
  def apply(
    character: scala.Double,
    fileName: java.lang.String,
    line: scala.Double,
    file: SourceFile = null,
    url: java.lang.String = null
  ): SourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("character")(character)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("line")(line)
    if (file != null) __obj.updateDynamic("file")(file)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SourceReference]
  }
}

