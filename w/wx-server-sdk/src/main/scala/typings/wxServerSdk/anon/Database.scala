package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  var database: String
  var functions: String
  var storage: String
}

object Database {
  @scala.inline
  def apply(database: String, functions: String, storage: String): Database = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
}

