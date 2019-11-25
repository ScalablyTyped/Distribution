package typings.wxDashServerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Database extends js.Object {
  var database: String
  var functions: String
  var storage: String
}

object Anon_Database {
  @scala.inline
  def apply(database: String, functions: String, storage: String): Anon_Database = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Database]
  }
}

