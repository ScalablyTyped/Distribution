package typings.webgme.anon

import typings.webgme.webgmeStrings.memory
import typings.webgme.webgmeStrings.mongo
import typings.webgme.webgmeStrings.redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * Type of database to store the data (metadata e.g. _users is always stored in mongo), 
    * can be 'mongo', 'redis' or 'memory'.
    *   config.storage.database.type = 'mongo';
    */
  var `type`: mongo | redis | memory
}

object Type {
  @scala.inline
  def apply(`type`: mongo | redis | memory): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

