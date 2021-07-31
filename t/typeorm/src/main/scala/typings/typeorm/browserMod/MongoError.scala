package typings.typeorm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "MongoError")
@js.native
class MongoError protected ()
  extends typings.typeorm.typingsMod.MongoError {
  def this(message: String) = this()
}
/* static members */
object MongoError {
  
  @JSImport("typeorm/browser", "MongoError")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(options: js.Object): typings.typeorm.typingsMod.MongoError = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.typingsMod.MongoError]
}
