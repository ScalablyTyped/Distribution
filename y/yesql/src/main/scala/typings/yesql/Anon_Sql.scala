package typings.yesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sql[TParams /* <: js.Object */] extends js.Object {
  var sql: String
  var values: js.Array[
    /* import warning: ImportType.apply Failed type conversion: TParams[keyof TParams] */ js.Any
  ]
}

object Anon_Sql {
  @scala.inline
  def apply[TParams /* <: js.Object */](
    sql: String,
    values: js.Array[
      /* import warning: ImportType.apply Failed type conversion: TParams[keyof TParams] */ js.Any
    ]
  ): Anon_Sql[TParams] = {
    val __obj = js.Dynamic.literal(sql = sql, values = values)
  
    __obj.asInstanceOf[Anon_Sql[TParams]]
  }
}

