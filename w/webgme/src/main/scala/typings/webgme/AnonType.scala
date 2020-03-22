package typings.webgme

import typings.webgme.webgmeStrings.memory
import typings.webgme.webgmeStrings.mongo
import typings.webgme.webgmeStrings.redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  /**
    * Type of database to store the data (metadata e.g. _users is always stored in mongo), 
    * can be 'mongo', 'redis' or 'memory'.
    *   config.storage.database.type = 'mongo';
    */
  var `type`: mongo | redis | memory
}

object AnonType {
  @scala.inline
  def apply(`type`: mongo | redis | memory): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

