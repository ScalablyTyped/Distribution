package typings.typeorm.browserMod

import typings.typeorm.connectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(): js.Promise[typings.typeorm.connectionMod.Connection] = js.native
  def apply(name: String): js.Promise[typings.typeorm.connectionMod.Connection] = js.native
  def apply(options: ConnectionOptions): js.Promise[typings.typeorm.connectionMod.Connection] = js.native
}
