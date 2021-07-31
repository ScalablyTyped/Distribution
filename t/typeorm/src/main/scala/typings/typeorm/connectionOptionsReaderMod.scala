package typings.typeorm

import typings.typeorm.anon.ConfigName
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionOptionsReaderMod {
  
  @JSImport("typeorm/browser/connection/ConnectionOptionsReader", "ConnectionOptionsReader")
  @js.native
  class ConnectionOptionsReader () extends StObject {
    def this(options: ConfigName) = this()
    
    /**
      * Returns all connection options read from the ormconfig.
      */
    def all(): js.Promise[js.Array[ConnectionOptions]] = js.native
    
    /**
      * Gets configuration file name.
      */
    val baseConfigName: String = js.native
    
    /**
      * Gets directory where configuration file should be located.
      */
    val baseDirectory: String = js.native
    
    /**
      * Gets directory where configuration file should be located and configuration file name.
      */
    val baseFilePath: String = js.native
    
    /**
      * Gets a connection with a given name read from ormconfig.
      * If connection with such name would not be found then it throw error.
      */
    def get(name: String): js.Promise[ConnectionOptions] = js.native
    
    /**
      * Checks if there is a TypeORM configuration file.
      */
    def has(name: String): js.Promise[Boolean] = js.native
    
    /**
      * Loads all connection options from a configuration file.
      *
      * todo: get in count NODE_ENV somehow
      */
    /* protected */ def load(): js.Promise[js.UndefOr[js.Array[ConnectionOptions]]] = js.native
    
    /* protected */ def normalizeConnectionOptions(connectionOptions: js.Array[ConnectionOptions]): js.Array[ConnectionOptions] = js.native
    /**
      * Normalize connection options.
      */
    /* protected */ def normalizeConnectionOptions(connectionOptions: ConnectionOptions): js.Array[ConnectionOptions] = js.native
    
    var options: js.UndefOr[ConfigName] = js.native
  }
}
