package typings.wxServerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatabase extends js.Object {
  var database: String
  var functions: String
  var storage: String
}

object AnonDatabase {
  @scala.inline
  def apply(database: String, functions: String, storage: String): AnonDatabase = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatabase]
  }
}

