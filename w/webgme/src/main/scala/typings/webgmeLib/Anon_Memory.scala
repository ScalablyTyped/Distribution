package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Memory extends js.Object {
  /**
    * Type of database to store the data (metadata e.g. _users is always stored in mongo), 
    * can be 'mongo', 'redis' or 'memory'.
    *   config.storage.database.type = 'mongo';
    */
  var `type`: webgmeLib.webgmeLibStrings.mongo | webgmeLib.webgmeLibStrings.redis | webgmeLib.webgmeLibStrings.memory
}

object Anon_Memory {
  @scala.inline
  def apply(
    `type`: webgmeLib.webgmeLibStrings.mongo | webgmeLib.webgmeLibStrings.redis | webgmeLib.webgmeLibStrings.memory
  ): Anon_Memory = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Memory]
  }
}

