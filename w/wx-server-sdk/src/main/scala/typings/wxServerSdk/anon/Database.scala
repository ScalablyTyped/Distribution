package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var database: String = js.native
  var functions: String = js.native
  var storage: String = js.native
}

object Database {
  @scala.inline
  def apply(database: String, functions: String, storage: String): Database = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
  @scala.inline
  implicit class DatabaseOps[Self <: Database] (val x: Self) extends AnyVal {
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctions(value: String): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
  }
  
}

