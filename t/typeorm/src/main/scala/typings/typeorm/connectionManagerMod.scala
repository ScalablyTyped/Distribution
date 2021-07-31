package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionManagerMod {
  
  @JSImport("typeorm/browser/connection/ConnectionManager", "ConnectionManager")
  @js.native
  class ConnectionManager () extends StObject {
    
    /**
      * List of connections registered in this connection manager.
      */
    val connections: js.Array[Connection] = js.native
    
    /**
      * Creates a new connection based on the given connection options and registers it in the manager.
      * Connection won't be established, you'll need to manually call connect method to establish connection.
      */
    def create(options: ConnectionOptions): Connection = js.native
    
    /**
      * Gets registered connection with the given name.
      * If connection name is not given then it will get a default connection.
      * Throws error if connection with the given name was not found.
      */
    def get(): Connection = js.native
    def get(name: String): Connection = js.native
    
    /**
      * Checks if connection with the given name exist in the manager.
      */
    def has(name: String): Boolean = js.native
  }
}
