package typings.typeorm.mongodbTypingsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "MongoError")
@js.native
class MongoError protected () extends Error {
  def this(message: String) = this()
}
/* static members */
@JSImport("typeorm/driver/mongodb/typings", "MongoError")
@js.native
object MongoError extends js.Object {
  
  def create(options: js.Object): MongoError = js.native
}
