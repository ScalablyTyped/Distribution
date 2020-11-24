package typings.typeorm.browserMod

import typings.typeorm.connectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Connection")
@js.native
class Connection protected ()
  extends typings.typeorm.connectionMod.Connection {
  def this(options: ConnectionOptions) = this()
}
