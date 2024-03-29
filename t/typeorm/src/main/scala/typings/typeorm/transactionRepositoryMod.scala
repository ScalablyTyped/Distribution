package typings.typeorm

import typings.std.ParameterDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionRepositoryMod {
  
  @JSImport("typeorm/browser/decorator/transaction/TransactionRepository", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TransactionRepository(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransactionRepository")().asInstanceOf[ParameterDecorator]
  inline def TransactionRepository(entityType: js.Function): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransactionRepository")(entityType.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
}
