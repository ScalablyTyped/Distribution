package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.sqljsDriverMod.SqljsDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqljsQueryRunnerMod {
  
  @JSImport("typeorm/browser/driver/sqljs/SqljsQueryRunner", "SqljsQueryRunner")
  @js.native
  class SqljsQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: SqljsDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_SqljsQueryRunner: SqljsDriver = js.native
  }
}
