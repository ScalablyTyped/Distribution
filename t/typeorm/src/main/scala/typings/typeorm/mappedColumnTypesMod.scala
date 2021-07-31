package typings.typeorm

import typings.typeorm.columnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappedColumnTypesMod {
  
  trait MappedColumnTypes extends StObject {
    
    /**
      * Column type for duration column in query result cache table.
      */
    var cacheDuration: ColumnType
    
    /**
      * Column type for identifier column in query result cache table.
      */
    var cacheId: ColumnType
    
    /**
      * Column type for identifier column in query result cache table.
      */
    var cacheIdentifier: ColumnType
    
    /**
      * Column type for query column in query result cache table.
      */
    var cacheQuery: ColumnType
    
    /**
      * Column type for result column in query result cache table.
      */
    var cacheResult: ColumnType
    
    /**
      * Column type for time column in query result cache table.
      */
    var cacheTime: ColumnType
    
    /**
      * Column type for the create date column.
      */
    var createDate: ColumnType
    
    /**
      * Default value should be used by a database for "created date" column.
      */
    var createDateDefault: String
    
    /**
      * Precision of datetime column. Used in MySql to define milliseconds.
      */
    var createDatePrecision: js.UndefOr[Double] = js.undefined
    
    /**
      * Column type for the delete date column.
      */
    var deleteDate: ColumnType
    
    /**
      * Nullable value should be used by a database for "deleted date" column.
      */
    var deleteDateNullable: Boolean
    
    /**
      * Precision of datetime column. Used in MySql to define milliseconds.
      */
    var deleteDatePrecision: js.UndefOr[Double] = js.undefined
    
    /**
      * Column type for metadata database name column in typeorm metadata table.
      */
    var metadataDatabase: ColumnType
    
    /**
      * Column type for metadata name column in typeorm metadata table.
      */
    var metadataName: ColumnType
    
    /**
      * Column type for metadata schema name column in typeorm metadata table.
      */
    var metadataSchema: ColumnType
    
    /**
      * Column type for metadata table name column in typeorm metadata table.
      */
    var metadataTable: ColumnType
    
    /**
      * Column type for metadata type column in typeorm metadata table.
      * Stores type of metadata. E.g. 'VIEW' or 'CHECK'
      */
    var metadataType: ColumnType
    
    /**
      * Column type for metadata value column in typeorm metadata table.
      */
    var metadataValue: ColumnType
    
    /**
      * Column type of id column used for migrations table.
      */
    var migrationId: ColumnType
    
    /**
      * Column type for migration name column used for migrations table.
      */
    var migrationName: ColumnType
    
    /**
      * Column type of timestamp column used for migrations table.
      */
    var migrationTimestamp: ColumnType
    
    /**
      * Column type for the tree level column.
      */
    var treeLevel: ColumnType
    
    /**
      * Column type for the update date column.
      */
    var updateDate: ColumnType
    
    /**
      * Default value should be used by a database for "updated date" column.
      */
    var updateDateDefault: String
    
    /**
      * Precision of datetime column. Used in MySql to define milliseconds.
      */
    var updateDatePrecision: js.UndefOr[Double] = js.undefined
    
    /**
      * Column type for the version column.
      */
    var version: ColumnType
  }
  object MappedColumnTypes {
    
    @scala.inline
    def apply(
      cacheDuration: ColumnType,
      cacheId: ColumnType,
      cacheIdentifier: ColumnType,
      cacheQuery: ColumnType,
      cacheResult: ColumnType,
      cacheTime: ColumnType,
      createDate: ColumnType,
      createDateDefault: String,
      deleteDate: ColumnType,
      deleteDateNullable: Boolean,
      metadataDatabase: ColumnType,
      metadataName: ColumnType,
      metadataSchema: ColumnType,
      metadataTable: ColumnType,
      metadataType: ColumnType,
      metadataValue: ColumnType,
      migrationId: ColumnType,
      migrationName: ColumnType,
      migrationTimestamp: ColumnType,
      treeLevel: ColumnType,
      updateDate: ColumnType,
      updateDateDefault: String,
      version: ColumnType
    ): MappedColumnTypes = {
      val __obj = js.Dynamic.literal(cacheDuration = cacheDuration.asInstanceOf[js.Any], cacheId = cacheId.asInstanceOf[js.Any], cacheIdentifier = cacheIdentifier.asInstanceOf[js.Any], cacheQuery = cacheQuery.asInstanceOf[js.Any], cacheResult = cacheResult.asInstanceOf[js.Any], cacheTime = cacheTime.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], createDateDefault = createDateDefault.asInstanceOf[js.Any], deleteDate = deleteDate.asInstanceOf[js.Any], deleteDateNullable = deleteDateNullable.asInstanceOf[js.Any], metadataDatabase = metadataDatabase.asInstanceOf[js.Any], metadataName = metadataName.asInstanceOf[js.Any], metadataSchema = metadataSchema.asInstanceOf[js.Any], metadataTable = metadataTable.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], metadataValue = metadataValue.asInstanceOf[js.Any], migrationId = migrationId.asInstanceOf[js.Any], migrationName = migrationName.asInstanceOf[js.Any], migrationTimestamp = migrationTimestamp.asInstanceOf[js.Any], treeLevel = treeLevel.asInstanceOf[js.Any], updateDate = updateDate.asInstanceOf[js.Any], updateDateDefault = updateDateDefault.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappedColumnTypes]
    }
    
    @scala.inline
    implicit class MappedColumnTypesMutableBuilder[Self <: MappedColumnTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDuration(value: ColumnType): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheId(value: ColumnType): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheIdentifier(value: ColumnType): Self = StObject.set(x, "cacheIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheQuery(value: ColumnType): Self = StObject.set(x, "cacheQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheResult(value: ColumnType): Self = StObject.set(x, "cacheResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheTime(value: ColumnType): Self = StObject.set(x, "cacheTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDate(value: ColumnType): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDateDefault(value: String): Self = StObject.set(x, "createDateDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDatePrecision(value: Double): Self = StObject.set(x, "createDatePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDatePrecisionUndefined: Self = StObject.set(x, "createDatePrecision", js.undefined)
      
      @scala.inline
      def setDeleteDate(value: ColumnType): Self = StObject.set(x, "deleteDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteDateNullable(value: Boolean): Self = StObject.set(x, "deleteDateNullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteDatePrecision(value: Double): Self = StObject.set(x, "deleteDatePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteDatePrecisionUndefined: Self = StObject.set(x, "deleteDatePrecision", js.undefined)
      
      @scala.inline
      def setMetadataDatabase(value: ColumnType): Self = StObject.set(x, "metadataDatabase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataName(value: ColumnType): Self = StObject.set(x, "metadataName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataSchema(value: ColumnType): Self = StObject.set(x, "metadataSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataTable(value: ColumnType): Self = StObject.set(x, "metadataTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataType(value: ColumnType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataValue(value: ColumnType): Self = StObject.set(x, "metadataValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationId(value: ColumnType): Self = StObject.set(x, "migrationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationName(value: ColumnType): Self = StObject.set(x, "migrationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationTimestamp(value: ColumnType): Self = StObject.set(x, "migrationTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLevel(value: ColumnType): Self = StObject.set(x, "treeLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDate(value: ColumnType): Self = StObject.set(x, "updateDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDateDefault(value: String): Self = StObject.set(x, "updateDateDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDatePrecision(value: Double): Self = StObject.set(x, "updateDatePrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDatePrecisionUndefined: Self = StObject.set(x, "updateDatePrecision", js.undefined)
      
      @scala.inline
      def setVersion(value: ColumnType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
