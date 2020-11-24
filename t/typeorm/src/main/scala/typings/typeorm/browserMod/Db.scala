package typings.typeorm.browserMod

import typings.typeorm.typingsMod.DbCreateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Db")
@js.native
class Db protected ()
  extends typings.typeorm.typingsMod.Db {
  def this(databaseName: String, serverConfig: typings.typeorm.typingsMod.Mongos) = this()
  def this(databaseName: String, serverConfig: typings.typeorm.typingsMod.ReplSet) = this()
  /**
    *
    * @param databaseName The name of the database this instance represents.
    * @param serverConfig The server topology for the database.
    * @param options Optional.
    */
  def this(databaseName: String, serverConfig: typings.typeorm.typingsMod.Server) = this()
  def this(databaseName: String, serverConfig: typings.typeorm.typingsMod.Mongos, options: DbCreateOptions) = this()
  def this(databaseName: String, serverConfig: typings.typeorm.typingsMod.ReplSet, options: DbCreateOptions) = this()
  def this(databaseName: String, serverConfig: typings.typeorm.typingsMod.Server, options: DbCreateOptions) = this()
}
