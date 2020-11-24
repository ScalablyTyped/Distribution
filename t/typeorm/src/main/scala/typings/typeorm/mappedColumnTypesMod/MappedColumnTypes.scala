package typings.typeorm.mappedColumnTypesMod

import typings.typeorm.columnTypesMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappedColumnTypes extends js.Object {
  
  /**
    * Column type for duration column in query result cache table.
    */
  var cacheDuration: ColumnType = js.native
  
  /**
    * Column type for identifier column in query result cache table.
    */
  var cacheId: ColumnType = js.native
  
  /**
    * Column type for identifier column in query result cache table.
    */
  var cacheIdentifier: ColumnType = js.native
  
  /**
    * Column type for query column in query result cache table.
    */
  var cacheQuery: ColumnType = js.native
  
  /**
    * Column type for result column in query result cache table.
    */
  var cacheResult: ColumnType = js.native
  
  /**
    * Column type for time column in query result cache table.
    */
  var cacheTime: ColumnType = js.native
  
  /**
    * Column type for the create date column.
    */
  var createDate: ColumnType = js.native
  
  /**
    * Default value should be used by a database for "created date" column.
    */
  var createDateDefault: String = js.native
  
  /**
    * Precision of datetime column. Used in MySql to define milliseconds.
    */
  var createDatePrecision: js.UndefOr[Double] = js.native
  
  /**
    * Column type for the delete date column.
    */
  var deleteDate: ColumnType = js.native
  
  /**
    * Nullable value should be used by a database for "deleted date" column.
    */
  var deleteDateNullable: Boolean = js.native
  
  /**
    * Precision of datetime column. Used in MySql to define milliseconds.
    */
  var deleteDatePrecision: js.UndefOr[Double] = js.native
  
  /**
    * Column type for metadata database name column in typeorm metadata table.
    */
  var metadataDatabase: ColumnType = js.native
  
  /**
    * Column type for metadata name column in typeorm metadata table.
    */
  var metadataName: ColumnType = js.native
  
  /**
    * Column type for metadata schema name column in typeorm metadata table.
    */
  var metadataSchema: ColumnType = js.native
  
  /**
    * Column type for metadata table name column in typeorm metadata table.
    */
  var metadataTable: ColumnType = js.native
  
  /**
    * Column type for metadata type column in typeorm metadata table.
    * Stores type of metadata. E.g. 'VIEW' or 'CHECK'
    */
  var metadataType: ColumnType = js.native
  
  /**
    * Column type for metadata value column in typeorm metadata table.
    */
  var metadataValue: ColumnType = js.native
  
  /**
    * Column type of id column used for migrations table.
    */
  var migrationId: ColumnType = js.native
  
  /**
    * Column type for migration name column used for migrations table.
    */
  var migrationName: ColumnType = js.native
  
  /**
    * Column type of timestamp column used for migrations table.
    */
  var migrationTimestamp: ColumnType = js.native
  
  /**
    * Column type for the tree level column.
    */
  var treeLevel: ColumnType = js.native
  
  /**
    * Column type for the update date column.
    */
  var updateDate: ColumnType = js.native
  
  /**
    * Default value should be used by a database for "updated date" column.
    */
  var updateDateDefault: String = js.native
  
  /**
    * Precision of datetime column. Used in MySql to define milliseconds.
    */
  var updateDatePrecision: js.UndefOr[Double] = js.native
  
  /**
    * Column type for the version column.
    */
  var version: ColumnType = js.native
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
  implicit class MappedColumnTypesOps[Self <: MappedColumnTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheDuration(value: ColumnType): Self = this.set("cacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheId(value: ColumnType): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheIdentifier(value: ColumnType): Self = this.set("cacheIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheQuery(value: ColumnType): Self = this.set("cacheQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheResult(value: ColumnType): Self = this.set("cacheResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheTime(value: ColumnType): Self = this.set("cacheTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: ColumnType): Self = this.set("createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateDefault(value: String): Self = this.set("createDateDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDate(value: ColumnType): Self = this.set("deleteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDateNullable(value: Boolean): Self = this.set("deleteDateNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataDatabase(value: ColumnType): Self = this.set("metadataDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataName(value: ColumnType): Self = this.set("metadataName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataSchema(value: ColumnType): Self = this.set("metadataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataTable(value: ColumnType): Self = this.set("metadataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataType(value: ColumnType): Self = this.set("metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataValue(value: ColumnType): Self = this.set("metadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationId(value: ColumnType): Self = this.set("migrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationName(value: ColumnType): Self = this.set("migrationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationTimestamp(value: ColumnType): Self = this.set("migrationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeLevel(value: ColumnType): Self = this.set("treeLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDate(value: ColumnType): Self = this.set("updateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateDefault(value: String): Self = this.set("updateDateDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ColumnType): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDatePrecision(value: Double): Self = this.set("createDatePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDatePrecision: Self = this.set("createDatePrecision", js.undefined)
    
    @scala.inline
    def setDeleteDatePrecision(value: Double): Self = this.set("deleteDatePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteDatePrecision: Self = this.set("deleteDatePrecision", js.undefined)
    
    @scala.inline
    def setUpdateDatePrecision(value: Double): Self = this.set("updateDatePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDatePrecision: Self = this.set("updateDatePrecision", js.undefined)
  }
}
