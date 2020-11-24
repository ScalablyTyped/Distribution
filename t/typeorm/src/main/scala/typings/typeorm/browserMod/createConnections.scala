package typings.typeorm.browserMod

import typings.typeorm.connectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "createConnections")
@js.native
object createConnections extends js.Object {
  
  def apply(): js.Promise[js.Array[typings.typeorm.connectionMod.Connection]] = js.native
  def apply(options: js.Array[ConnectionOptions]): js.Promise[js.Array[typings.typeorm.connectionMod.Connection]] = js.native
}
