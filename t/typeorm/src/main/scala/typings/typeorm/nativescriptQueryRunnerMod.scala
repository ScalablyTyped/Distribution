package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.nativescriptDriverMod.NativescriptDriver
import typings.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/nativescript/NativescriptQueryRunner", JSImport.Namespace)
@js.native
object nativescriptQueryRunnerMod extends js.Object {
  
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
