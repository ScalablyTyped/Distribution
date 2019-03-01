package typings
package atVueComponentDashCompilerDashUtilsLib.distParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCCustomBlock extends js.Object {
  var attrs: org.scalablytyped.runtime.StringDictionary[
    java.lang.String | atVueComponentDashCompilerDashUtilsLib.atVueComponentDashCompilerDashUtilsLibNumbers.`true`
  ]
  var content: java.lang.String
  var end: scala.Double
  var map: js.UndefOr[atVueComponentDashCompilerDashUtilsLib.distTypesMod.RawSourceMap] = js.undefined
  var start: scala.Double
  var `type`: java.lang.String
}

object SFCCustomBlock {
  @scala.inline
  def apply(
    attrs: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | atVueComponentDashCompilerDashUtilsLib.atVueComponentDashCompilerDashUtilsLibNumbers.`true`
    ],
    content: java.lang.String,
    end: scala.Double,
    start: scala.Double,
    `type`: java.lang.String,
    map: atVueComponentDashCompilerDashUtilsLib.distTypesMod.RawSourceMap = null
  ): SFCCustomBlock = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attrs")(attrs)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[SFCCustomBlock]
  }
}

