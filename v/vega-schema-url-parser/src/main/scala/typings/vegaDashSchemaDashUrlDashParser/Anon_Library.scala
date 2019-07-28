package typings.vegaDashSchemaDashUrlDashParser

import typings.vegaDashSchemaDashUrlDashParser.vegaDashSchemaDashUrlDashParserStrings.`vega-lite`
import typings.vegaDashSchemaDashUrlDashParser.vegaDashSchemaDashUrlDashParserStrings.vega
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Library extends js.Object {
  var library: vega | `vega-lite`
  var version: String
}

object Anon_Library {
  @scala.inline
  def apply(library: vega | `vega-lite`, version: String): Anon_Library = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version)
  
    __obj.asInstanceOf[Anon_Library]
  }
}

