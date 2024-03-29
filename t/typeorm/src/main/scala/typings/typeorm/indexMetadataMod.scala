package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import typings.typeorm.anon.ArgsColumns
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.embeddedMetadataMod.EmbeddedMetadata
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.namingStrategyInterfaceMod.NamingStrategyInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMetadataMod {
  
  @JSImport("typeorm/browser/metadata/IndexMetadata", "IndexMetadata")
  @js.native
  class IndexMetadata protected () extends StObject {
    def this(options: ArgsColumns) = this()
    
    /**
      * Builds some depend index properties.
      * Must be called after all entity metadata's properties map, columns and relations are built.
      */
    def build(namingStrategy: NamingStrategyInterface): this.type = js.native
    
    /**
      * Map of column names with order set.
      * Used only by MongoDB driver.
      */
    var columnNamesWithOrderingMap: StringDictionary[Double] = js.native
    
    /**
      * Indexed columns.
      */
    var columns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Embedded metadata if this index was applied on embedded.
      */
    var embeddedMetadata: js.UndefOr[EmbeddedMetadata] = js.native
    
    /**
      * Entity metadata of the class to which this index is applied.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Specifies a time to live, in seconds.
      * This option is only supported for mongodb database.
      */
    var expireAfterSeconds: js.UndefOr[Double] = js.native
    
    /**
      * User specified column names.
      */
    var givenColumnNames: js.UndefOr[
        (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]) | js.Array[String]
      ] = js.native
    
    /**
      * User specified index name.
      */
    var givenName: js.UndefOr[String] = js.native
    
    /**
      * Builds the index in the background so that building an index an does not block other database activities.
      * This option is only supported for mongodb database.
      */
    var isBackground: js.UndefOr[Boolean] = js.native
    
    /**
      * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
      * Works only in MySQL.
      */
    var isFulltext: Boolean = js.native
    
    /**
      * If true, the index only references documents with the specified field.
      * These indexes use less space but behave differently in some situations (particularly sorts).
      * This option is only supported for mongodb database.
      */
    var isSparse: js.UndefOr[Boolean] = js.native
    
    /**
      * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
      * Works only in MySQL.
      */
    var isSpatial: Boolean = js.native
    
    /**
      * Indicates if this index must be unique.
      */
    var isUnique: Boolean = js.native
    
    /**
      * Final index name.
      * If index name was given by a user then it stores normalized (by naming strategy) givenName.
      * If index name was not given then its generated.
      */
    var name: String = js.native
    
    /**
      * Fulltext parser.
      * Works only in MySQL.
      */
    var parser: js.UndefOr[String] = js.native
    
    /**
      * Indicates if this index must synchronize with database index.
      */
    var synchronize: Boolean = js.native
    
    /**
      * Target class to which metadata is applied.
      */
    var target: js.UndefOr[js.Function | String] = js.native
    
    /**
      * Index filter condition.
      */
    var where: js.UndefOr[String] = js.native
  }
}
