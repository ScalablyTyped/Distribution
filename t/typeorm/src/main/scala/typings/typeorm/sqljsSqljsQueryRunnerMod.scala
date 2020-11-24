package typings.typeorm

import typings.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.sqljsSqljsDriverMod.SqljsDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/sqljs/SqljsQueryRunner", JSImport.Namespace)
@js.native
object sqljsSqljsQueryRunnerMod extends js.Object {
  
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
