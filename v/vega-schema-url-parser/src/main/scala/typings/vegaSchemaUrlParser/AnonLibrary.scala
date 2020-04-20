package typings.vegaSchemaUrlParser

import typings.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.`vega-lite`
import typings.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.vega
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLibrary extends js.Object {
  var library: vega | `vega-lite`
  var version: String
}

object AnonLibrary {
  @scala.inline
  def apply(library: vega | `vega-lite`, version: String): AnonLibrary = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLibrary]
  }
}

