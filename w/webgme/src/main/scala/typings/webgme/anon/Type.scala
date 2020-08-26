package typings.webgme.anon

import typings.webgme.webgmeStrings.memory
import typings.webgme.webgmeStrings.mongo
import typings.webgme.webgmeStrings.redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  /**
    * Type of database to store the data (metadata e.g. _users is always stored in mongo), 
    * can be 'mongo', 'redis' or 'memory'.
    *   config.storage.database.type = 'mongo';
    */
  var `type`: mongo | redis | memory = js.native
}

object Type {
  @scala.inline
  def apply(`type`: mongo | redis | memory): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setType(value: mongo | redis | memory): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

