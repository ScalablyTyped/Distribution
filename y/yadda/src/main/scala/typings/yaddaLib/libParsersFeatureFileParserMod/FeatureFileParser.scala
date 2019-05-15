package typings
package yaddaLib.libParsersFeatureFileParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFileParser extends js.Object {
  def parse(file: java.lang.String): yaddaLib.libParsersFeatureParserMod.SpecificationExport = js.native
  def parse(
    file: java.lang.String,
    next: js.Function1[
      /* specification */ yaddaLib.libParsersFeatureParserMod.SpecificationExport, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

