package typings
package yesqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sql extends js.Object {
  var sql: java.lang.String
  var values: js.Array[_]
}

object Anon_Sql {
  @scala.inline
  def apply(sql: java.lang.String, values: js.Array[_]): Anon_Sql = {
    val __obj = js.Dynamic.literal(sql = sql, values = values)
  
    __obj.asInstanceOf[Anon_Sql]
  }
}

