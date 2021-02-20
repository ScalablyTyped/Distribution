package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.DbCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Db")
@js.native
class Db protected ()
  extends typings.typeorm.mongodbTypingsMod.Db {
  def this(databaseName: String, serverConfig: typings.typeorm.mongodbTypingsMod.Mongos) = this()
  def this(databaseName: String, serverConfig: typings.typeorm.mongodbTypingsMod.ReplSet) = this()
  /**
    *
    * @param databaseName The name of the database this instance represents.
    * @param serverConfig The server topology for the database.
    * @param options Optional.
    */
  def this(databaseName: String, serverConfig: typings.typeorm.mongodbTypingsMod.Server) = this()
  def this(
    databaseName: String,
    serverConfig: typings.typeorm.mongodbTypingsMod.Mongos,
    options: DbCreateOptions
  ) = this()
  def this(
    databaseName: String,
    serverConfig: typings.typeorm.mongodbTypingsMod.ReplSet,
    options: DbCreateOptions
  ) = this()
  def this(
    databaseName: String,
    serverConfig: typings.typeorm.mongodbTypingsMod.Server,
    options: DbCreateOptions
  ) = this()
}
