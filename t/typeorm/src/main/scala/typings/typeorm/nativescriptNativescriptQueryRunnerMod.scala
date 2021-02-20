package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.nativescriptNativescriptDriverMod.NativescriptDriver
import typings.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativescriptNativescriptQueryRunnerMod {
  
  @JSImport("typeorm/driver/nativescript/NativescriptQueryRunner", "NativescriptQueryRunner")
  @js.native
  class NativescriptQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: NativescriptDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_NativescriptQueryRunner: NativescriptDriver = js.native
    
    /**
      * Parametrizes given object of values. Used to create column=value queries.
      */
    /* protected */ def parametrize(objectLiteral: ObjectLiteral): js.Array[String] = js.native
    /* protected */ def parametrize(objectLiteral: ObjectLiteral, startIndex: Double): js.Array[String] = js.native
  }
}
