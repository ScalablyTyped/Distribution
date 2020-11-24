package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.cordovaCordovaDriverMod.CordovaDriver
import typings.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/cordova/CordovaQueryRunner", JSImport.Namespace)
@js.native
object cordovaCordovaQueryRunnerMod extends js.Object {
  
  @js.native
  class CordovaQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: CordovaDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_CordovaQueryRunner: CordovaDriver = js.native
    
    /**
      * Insert a new row with given values into the given table.
      * Returns value of the generated column if given and generate column exist in the table.
      // todo: implement new syntax
      async insert(tableName: string, keyValues: ObjectLiteral): Promise<InsertResult> {
      const keys = Object.keys(keyValues);
      const columns = keys.map(key => `"${key}"`).join(", ");
      const values = keys.map(key => "?").join(",");
      const generatedColumns = this.connection.hasMetadata(tableName) ? this.connection.getMetadata(tableName).generatedColumns : [];
      const sql = columns.length > 0 ? (`INSERT INTO "${tableName}"(${columns}) VALUES (${values})`) : `INSERT INTO "${tableName}" DEFAULT VALUES`;
      const parameters = keys.map(key => keyValues[key]);
      return new Promise<InsertResult>(async (ok, fail) => {
      this.driver.connection.logger.logQuery(sql, parameters, this);
      const __this = this;
      const databaseConnection = await this.connect();
      databaseConnection.executeSql(sql, parameters, (resultSet: any) => {
      const generatedMap = generatedColumns.reduce((map, generatedColumn) => {
      const value = generatedColumn.isPrimary && generatedColumn.generationStrategy === "increment" && resultSet.insertId ? resultSet.insertId : keyValues[generatedColumn.databaseName];
      if (!value) return map;
      return OrmUtils.mergeDeep(map, generatedColumn.createValueMap(value));
      }, {} as ObjectLiteral);
      ok({
      result: undefined,
      generatedMap: Object.keys(generatedMap).length > 0 ? generatedMap : undefined
      });
      }, (err: any) => {
      __this.driver.connection.logger.logQueryError(err, sql, parameters, this);
      fail(err);
      });
      });
      }*/
    /**
      * Parametrizes given object of values. Used to create column=value queries.
      */
    /* protected */ def parametrize(objectLiteral: ObjectLiteral): js.Array[String] = js.native
    /* protected */ def parametrize(objectLiteral: ObjectLiteral, startIndex: Double): js.Array[String] = js.native
  }
}
