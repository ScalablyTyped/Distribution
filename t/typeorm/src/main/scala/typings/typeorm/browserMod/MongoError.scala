package typings.typeorm.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "MongoError")
@js.native
class MongoError protected ()
  extends typings.typeorm.typingsMod.MongoError {
  def this(message: String) = this()
}
/* static members */
@JSImport("typeorm/browser", "MongoError")
@js.native
object MongoError extends js.Object {
  
  def create(options: js.Object): typings.typeorm.typingsMod.MongoError = js.native
}
