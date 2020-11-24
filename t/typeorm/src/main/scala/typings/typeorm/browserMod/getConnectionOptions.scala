package typings.typeorm.browserMod

import typings.typeorm.connectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "getConnectionOptions")
@js.native
object getConnectionOptions extends js.Object {
  
  def apply(): js.Promise[ConnectionOptions] = js.native
  def apply(connectionName: String): js.Promise[ConnectionOptions] = js.native
}
