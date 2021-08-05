package typings.typeorm

import typings.std.MethodDecorator
import typings.typeorm.optionsTransactionOptionsMod.TransactionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionTransactionMod {
  
  @JSImport("typeorm/decorator/transaction/Transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Transaction(): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Transaction")().asInstanceOf[MethodDecorator]
  inline def Transaction(connectionName: String): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Transaction")(connectionName.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  inline def Transaction(options: TransactionOptions): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Transaction")(options.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
}
