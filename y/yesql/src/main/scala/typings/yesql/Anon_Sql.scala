package typings.yesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sql extends js.Object {
  var sql: String
  var values: js.Array[_]
}

object Anon_Sql {
  @scala.inline
  def apply(sql: String, values: js.Array[_]): Anon_Sql = {
    val __obj = js.Dynamic.literal(sql = sql, values = values)
  
    __obj.asInstanceOf[Anon_Sql]
  }
}

