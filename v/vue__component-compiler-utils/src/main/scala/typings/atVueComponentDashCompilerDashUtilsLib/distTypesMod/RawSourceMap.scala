package typings
package atVueComponentDashCompilerDashUtilsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawSourceMap extends StartOfSourceMap {
  var mappings: java.lang.String
  var names: js.Array[java.lang.String]
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var version: java.lang.String
}

object RawSourceMap {
  @scala.inline
  def apply(
    mappings: java.lang.String,
    names: js.Array[java.lang.String],
    sources: js.Array[java.lang.String],
    version: java.lang.String,
    file: java.lang.String = null,
    sourceRoot: java.lang.String = null,
    sourcesContent: js.Array[java.lang.String] = null
  ): RawSourceMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mappings")(mappings)
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("sources")(sources)
    __obj.updateDynamic("version")(version)
    if (file != null) __obj.updateDynamic("file")(file)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourcesContent != null) __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[RawSourceMap]
  }
}

