package typings.typeorm.typingsMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/typings", "MongoError")
@js.native
class MongoError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
/* static members */
object MongoError {
  
  @JSImport("typeorm/browser/driver/mongodb/typings", "MongoError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(options: js.Object): MongoError = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[MongoError]
}
