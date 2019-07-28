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
    val __obj = js.Dynamic.literal(mappings = mappings, names = names, sources = sources, version = version)
    if (file != null) __obj.updateDynamic("file")(file)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[RawSourceMap]
  }
}

