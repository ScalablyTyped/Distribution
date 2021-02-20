package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.nativescriptDriverMod.NativescriptDriver
import typings.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativescriptQueryRunnerMod {
  
  @JSImport("typeorm/browser/driver/nativescript/NativescriptQueryRunner", "NativescriptQueryRunner")
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
