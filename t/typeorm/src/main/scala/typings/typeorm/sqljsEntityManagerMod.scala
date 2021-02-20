package typings.typeorm

import typings.std.Uint8Array
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqljsEntityManagerMod {
  
  @JSImport("typeorm/browser/entity-manager/SqljsEntityManager", "SqljsEntityManager")
  @js.native
  class SqljsEntityManager protected () extends EntityManager {
    def this(connection: Connection) = this()
    def this(connection: Connection, queryRunner: QueryRunner) = this()
    
    var driver: js.Any = js.native
    
    /**
      * Returns the current database definition.
      */
    def exportDatabase(): Uint8Array = js.native
    
    /**
      * Loads either the definition from a file (Node.js) or localstorage (browser)
      * or uses the given definition to open a new database.
      */
    def loadDatabase(fileNameOrLocalStorageOrData: String): js.Promise[Unit] = js.native
    def loadDatabase(fileNameOrLocalStorageOrData: Uint8Array): js.Promise[Unit] = js.native
    
    /**
      * Saves the current database to a file (Node.js) or localstorage (browser)
      * if fileNameOrLocalStorage is not set options.location is used.
      */
    def saveDatabase(): js.Promise[Unit] = js.native
    def saveDatabase(fileNameOrLocalStorage: String): js.Promise[Unit] = js.native
  }
}
