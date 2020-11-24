package typings.urlParse.anon

import typings.urlParse.mod.QueryParser
import typings.urlParse.mod.StringifyQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parse extends js.Object {
  
  def parse(query: String): js.Object = js.native
  @JSName("parse")
  var parse_Original: QueryParser = js.native
  
  def stringify(query: js.Object): String = js.native
  @JSName("stringify")
  var stringify_Original: StringifyQuery = js.native
}
