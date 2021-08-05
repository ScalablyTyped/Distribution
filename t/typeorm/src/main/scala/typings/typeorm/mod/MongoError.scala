package typings.typeorm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "MongoError")
@js.native
class MongoError protected ()
  extends typings.typeorm.mongodbTypingsMod.MongoError {
  def this(message: String) = this()
}
/* static members */
object MongoError {
  
  @JSImport("typeorm", "MongoError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(options: js.Object): typings.typeorm.mongodbTypingsMod.MongoError = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.mongodbTypingsMod.MongoError]
}
