package typings.typeorm

import typings.std.Error
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.log
import typings.typeorm.typeormStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @js.native
  trait Logger extends StObject {
    
    /**
      * Logs events from the migrations run process.
      */
    def logMigration(message: String): js.Any = js.native
    def logMigration(message: String, queryRunner: QueryRunner): js.Any = js.native
    
    /**
      * Logs query and parameters used in it.
      */
    def logQuery(query: String): js.Any = js.native
    def logQuery(query: String, parameters: js.Array[js.Any]): js.Any = js.native
    def logQuery(query: String, parameters: js.Array[js.Any], queryRunner: QueryRunner): js.Any = js.native
    def logQuery(query: String, parameters: Unit, queryRunner: QueryRunner): js.Any = js.native
    
    /**
      * Logs query that is failed.
      */
    def logQueryError(error: String, query: String): js.Any = js.native
    def logQueryError(error: String, query: String, parameters: js.Array[js.Any]): js.Any = js.native
    def logQueryError(error: String, query: String, parameters: js.Array[js.Any], queryRunner: QueryRunner): js.Any = js.native
    def logQueryError(error: String, query: String, parameters: Unit, queryRunner: QueryRunner): js.Any = js.native
    def logQueryError(error: Error, query: String): js.Any = js.native
    def logQueryError(error: Error, query: String, parameters: js.Array[js.Any]): js.Any = js.native
    def logQueryError(error: Error, query: String, parameters: js.Array[js.Any], queryRunner: QueryRunner): js.Any = js.native
    def logQueryError(error: Error, query: String, parameters: Unit, queryRunner: QueryRunner): js.Any = js.native
    
    /**
      * Logs query that is slow.
      */
    def logQuerySlow(time: Double, query: String): js.Any = js.native
    def logQuerySlow(time: Double, query: String, parameters: js.Array[js.Any]): js.Any = js.native
    def logQuerySlow(time: Double, query: String, parameters: js.Array[js.Any], queryRunner: QueryRunner): js.Any = js.native
    def logQuerySlow(time: Double, query: String, parameters: Unit, queryRunner: QueryRunner): js.Any = js.native
    
    /**
      * Logs events from the schema build process.
      */
    def logSchemaBuild(message: String): js.Any = js.native
    def logSchemaBuild(message: String, queryRunner: QueryRunner): js.Any = js.native
    
    @JSName("log")
    def log_info(level: info, message: js.Any): js.Any = js.native
    @JSName("log")
    def log_info(level: info, message: js.Any, queryRunner: QueryRunner): js.Any = js.native
    /**
      * Perform logging using given logger, or by default to the console.
      * Log has its own level and message.
      */
    @JSName("log")
    def log_log(level: log, message: js.Any): js.Any = js.native
    @JSName("log")
    def log_log(level: log, message: js.Any, queryRunner: QueryRunner): js.Any = js.native
    @JSName("log")
    def log_warn(level: warn, message: js.Any): js.Any = js.native
    @JSName("log")
    def log_warn(level: warn, message: js.Any, queryRunner: QueryRunner): js.Any = js.native
  }
}
