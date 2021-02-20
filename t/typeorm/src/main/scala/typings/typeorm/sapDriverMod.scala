package typings.typeorm

import typings.typeorm.anon.Precision
import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.EntityMetadata
import typings.typeorm.browserMod.TableColumn
import typings.typeorm.driverMod.Driver
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.sapConnectionOptionsMod.SapConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapDriverMod {
  
  @JSImport("typeorm/browser/driver/sap/SapDriver", "SapDriver")
  @js.native
  class SapDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    /**
      * Hana Pool instance.
      */
    var client: js.Any = js.native
    
    /**
      * Connection used by driver.
      */
    var connection: Connection = js.native
    
    /**
      * Creates column type definition including length, precision and scale
      */
    def createFullType(column: TableColumn): String = js.native
    
    /**
      * Creates generated map of values generated or returned by database after INSERT query.
      */
    def createGeneratedMap(metadata: EntityMetadata, insertResult: ObjectLiteral): js.Any = js.native
    
    def getColumnLength(column: TableColumn): String = js.native
    
    /**
      * If driver dependency is not given explicitly, then try to load it via "require".
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Pool for master database.
      */
    var master: js.Any = js.native
    
    /**
      * Max length allowed by SAP HANA for aliases (identifiers).
      * @see https://help.sap.com/viewer/4fe29514fd584807ac9f2a04f6754767/2.0.03/en-US/20a760537519101497e3cfe07b348f3c.html
      */
    @JSName("maxAliasLength")
    var maxAliasLength_SapDriver: Double = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: Precision): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_SapDriver: SapConnectionOptions = js.native
    
    /**
      * Pool for slave databases.
      * Used in replication.
      */
    var slaves: js.Array[_] = js.native
  }
}
