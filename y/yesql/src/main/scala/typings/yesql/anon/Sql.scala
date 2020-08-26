package typings.yesql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sql[TParams /* <: js.Object */] extends js.Object {
  var sql: String = js.native
  var values: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
  ] = js.native
}

object Sql {
  @scala.inline
  def apply[/* <: js.Object */ TParams](
    sql: String,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
    ]
  ): Sql[TParams] = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sql[TParams]]
  }
  @scala.inline
  implicit class SqlOps[Self <: Sql[_], /* <: js.Object */ TParams] (val x: Self with Sql[TParams]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any)*
    ): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
        ]
    ): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

