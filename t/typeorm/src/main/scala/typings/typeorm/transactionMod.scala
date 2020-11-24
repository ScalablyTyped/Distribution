package typings.typeorm

import typings.std.MethodDecorator
import typings.typeorm.transactionOptionsMod.TransactionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/transaction/Transaction", JSImport.Namespace)
@js.native
object transactionMod extends js.Object {
  
  def Transaction(): MethodDecorator = js.native
  def Transaction(connectionName: String): MethodDecorator = js.native
  def Transaction(options: TransactionOptions): MethodDecorator = js.native
}
