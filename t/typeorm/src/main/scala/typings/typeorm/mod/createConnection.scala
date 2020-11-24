package typings.typeorm.mod

import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(): js.Promise[typings.typeorm.connectionConnectionMod.Connection] = js.native
  def apply(name: String): js.Promise[typings.typeorm.connectionConnectionMod.Connection] = js.native
  def apply(options: ConnectionOptions): js.Promise[typings.typeorm.connectionConnectionMod.Connection] = js.native
}
