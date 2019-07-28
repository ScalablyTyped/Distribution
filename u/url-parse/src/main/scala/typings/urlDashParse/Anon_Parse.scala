package typings.urlDashParse

import typings.urlDashParse.urlDashParseMod.QueryParser
import typings.urlDashParse.urlDashParseMod.StringifyQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Parse extends js.Object {
  @JSName("parse")
  var parse_Original: QueryParser = js.native
  @JSName("stringify")
  var stringify_Original: StringifyQuery = js.native
  def parse(query: String): js.Object = js.native
  def stringify(query: js.Object): String = js.native
}

