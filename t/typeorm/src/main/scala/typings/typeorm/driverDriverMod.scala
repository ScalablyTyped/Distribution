package typings.typeorm

import typings.typeorm.anon.LengthPrecision
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.schemaBuilderSchemaBuilderMod.SchemaBuilder
import typings.typeorm.tableTableColumnMod.TableColumn
import typings.typeorm.typesColumnTypesMod.ColumnType
import typings.typeorm.typesDataTypeDefaultsMod.DataTypeDefaults
import typings.typeorm.typesMappedColumnTypesMod.MappedColumnTypes
import typings.typeorm.typesReplicationModeMod.ReplicationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/Driver", JSImport.Namespace)
@js.native
object driverDriverMod extends js.Object {
  
  @js.native
  trait Driver extends js.Object {
    
    /**
      * Makes any action after connection (e.g. create extensions in Postgres driver).
      */
    def afterConnect(): js.Promise[Unit] = js.native
    
    /**
      * Build full table name with database name, schema name and table name.
      * E.g. "myDB"."mySchema"."myTable"
      */
    def buildTableName(tableName: String): String = js.native
    def buildTableName(tableName: String, schema: js.UndefOr[scala.Nothing], database: String): String = js.native
    def buildTableName(tableName: String, schema: String): String = js.native
    def buildTableName(tableName: String, schema: String, database: String): String = js.native
    
    /**
      * Performs connection to the database.
      * Depend on driver type it may create a connection pool.
      */
    def connect(): js.Promise[Unit] = js.native
    
    /**
      * Normalizes "default" value of the column.
      */
    def createFullType(column: TableColumn): String = js.native
    
    /**
      * Creates generated map of values generated or returned by database after INSERT query.
      */
    def createGeneratedMap(metadata: EntityMetadata, insertResult: js.Any): js.UndefOr[ObjectLiteral] = js.native
    def createGeneratedMap(
      metadata: EntityMetadata,
      insertResult: js.Any,
      entityIndex: js.UndefOr[scala.Nothing],
      entityNum: Double
    ): js.UndefOr[ObjectLiteral] = js.native
    def createGeneratedMap(metadata: EntityMetadata, insertResult: js.Any, entityIndex: Double): js.UndefOr[ObjectLiteral] = js.native
    def createGeneratedMap(metadata: EntityMetadata, insertResult: js.Any, entityIndex: Double, entityNum: Double): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Creates an escaped parameter.
      */
    def createParameter(parameterName: String, index: Double): String = js.native
    
    /**
      * Creates a query runner used for common queries.
      */
    def createQueryRunner(mode: ReplicationMode): QueryRunner = js.native
    
    /**
      * Synchronizes database schema (creates tables, indices, etc).
      */
    def createSchemaBuilder(): SchemaBuilder = js.native
    
    /**
      * Default values of length, precision and scale depends on column data type.
      * Used in the cases when length/precision/scale is not specified by user.
      */
    var dataTypeDefaults: DataTypeDefaults = js.native
    
    /**
      * Master database used to perform all write queries.
      *
      * todo: probably move into query runner.
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * Closes connection with database and releases all resources.
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    /**
      * Escapes a table name, column name or an alias.
      *
      * todo: probably escape should be able to handle dots in the names and automatically escape them
      */
    def escape(name: String): String = js.native
    
    /**
      * Replaces parameters in the given sql with special escaping character
      * and an array of parameter names to be passed to a query.
      */
    def escapeQueryWithParameters(sql: String, parameters: ObjectLiteral, nativeParameters: ObjectLiteral): js.Tuple2[String, js.Array[_]] = js.native
    
    /**
      * Differentiate columns of this table and columns from the given column metadatas columns
      * and returns only changed.
      */
    def findChangedColumns(tableColumns: js.Array[TableColumn], columnMetadatas: js.Array[ColumnMetadata]): js.Array[ColumnMetadata] = js.native
    
    /**
      * Calculates column length taking into account the default length values.
      */
    def getColumnLength(column: ColumnMetadata): String = js.native
    
    /**
      * Returns true if driver supports fulltext indices.
      */
    def isFullTextColumnTypeSupported(): Boolean = js.native
    
    /**
      * Indicates if replication is enabled.
      */
    var isReplicated: Boolean = js.native
    
    /**
      * Returns true if driver supports RETURNING / OUTPUT statement.
      */
    def isReturningSqlSupported(): Boolean = js.native
    
    /**
      * Returns true if driver supports uuid values generation on its own.
      */
    def isUUIDGenerationSupported(): Boolean = js.native
    
    /**
      * Orm has special columns and we need to know what database column types should be for those types.
      * Column types are driver dependant.
      */
    var mappedDataTypes: MappedColumnTypes = js.native
    
    /**
      * Max length allowed by the DBMS for aliases (execution of queries).
      */
    var maxAliasLength: js.UndefOr[Double] = js.native
    
    /**
      * Normalizes "default" value of the column.
      */
    def normalizeDefault(columnMetadata: ColumnMetadata): String = js.native
    
    /**
      * Normalizes "isUnique" value of the column.
      */
    def normalizeIsUnique(column: ColumnMetadata): Boolean = js.native
    
    /**
      * Transforms type of the given column to a database column type.
      */
    def normalizeType(column: LengthPrecision): String = js.native
    
    /**
      * Obtains a new database connection to a master server.
      * Used for replication.
      * If replication is not setup then returns default connection's database connection.
      */
    def obtainMasterConnection(): js.Promise[_] = js.native
    
    /**
      * Obtains a new database connection to a slave server.
      * Used for replication.
      * If replication is not setup then returns master (default) connection's database connection.
      */
    def obtainSlaveConnection(): js.Promise[_] = js.native
    
    /**
      * Connection options.
      */
    var options: BaseConnectionOptions = js.native
    
    /**
      * Prepares given value to a value to be persisted, based on its column type.
      */
    def prepareHydratedValue(value: js.Any, column: ColumnMetadata): js.Any = js.native
    
    /**
      * Prepares given value to a value to be persisted, based on its column type and metadata.
      */
    def preparePersistentValue(value: js.Any, column: ColumnMetadata): js.Any = js.native
    
    /**
      * Gets list of spatial column data types.
      */
    var spatialTypes: js.Array[ColumnType] = js.native
    
    /**
      * Gets list of supported column data types by a driver.
      */
    var supportedDataTypes: js.Array[ColumnType] = js.native
    
    /**
      * Indicates if tree tables are supported by this driver.
      */
    var treeSupport: Boolean = js.native
    
    /**
      * Gets list of column data types that support length by a driver.
      */
    var withLengthColumnTypes: js.Array[ColumnType] = js.native
    
    /**
      * Gets list of column data types that support precision by a driver.
      */
    var withPrecisionColumnTypes: js.Array[ColumnType] = js.native
    
    /**
      * Gets list of column data types that support scale by a driver.
      */
    var withScaleColumnTypes: js.Array[ColumnType] = js.native
  }
}
