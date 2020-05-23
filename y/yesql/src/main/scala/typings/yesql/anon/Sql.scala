package typings.yesql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sql[TParams /* <: js.Object */] extends js.Object {
  var sql: String
  var values: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
  ]
}

object Sql {
  @scala.inline
  def apply[TParams](
    sql: String,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
    ]
  ): Sql[TParams] = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sql[TParams]]
  }
}

