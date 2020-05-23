package typings.vegaSchemaUrlParser.anon

import typings.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.`vega-lite`
import typings.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.vega
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library extends js.Object {
  var library: vega | `vega-lite`
  var version: String
}

object Library {
  @scala.inline
  def apply(library: vega | `vega-lite`, version: String): Library = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Library]
  }
}

