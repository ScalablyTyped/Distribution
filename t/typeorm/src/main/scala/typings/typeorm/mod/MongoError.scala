package typings.typeorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "MongoError")
@js.native
class MongoError protected ()
  extends typings.typeorm.mongodbTypingsMod.MongoError {
  def this(message: String) = this()
}
/* static members */
@JSImport("typeorm", "MongoError")
@js.native
object MongoError extends js.Object {
  
  def create(options: js.Object): typings.typeorm.mongodbTypingsMod.MongoError = js.native
}
