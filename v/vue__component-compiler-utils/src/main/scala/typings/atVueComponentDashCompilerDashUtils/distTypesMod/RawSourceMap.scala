package typings.atVueComponentDashCompilerDashUtils.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawSourceMap extends StartOfSourceMap {
  var mappings: String
  var names: js.Array[String]
  var sources: js.Array[String]
  var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
  var version: String
}

object RawSourceMap {
  @scala.inline
  def apply(
    mappings: String,
    names: js.Array[String],
    sources: js.Array[String],
    version: String,
    file: String = null,
    sourceRoot: String = null,
    sourcesContent: js.Array[String] = null
  ): RawSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawSourceMap]
  }
}

