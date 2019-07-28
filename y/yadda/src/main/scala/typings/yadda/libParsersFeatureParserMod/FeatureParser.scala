package typings.yadda.libParsersFeatureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureParser extends js.Object {
  def parse(text: String): SpecificationExport = js.native
  def parse(text: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
}

