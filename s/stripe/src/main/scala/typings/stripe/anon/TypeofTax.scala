package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Tax.CalculationsResource
import typings.stripe.mod.Stripe.Tax.TransactionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTax extends StObject {
  
  val Calculation: TypeofCalculation
  
  val CalculationCreateParams: TypeofCalculationCreatePa
  
  val CalculationLineItem: TypeofCalculationLineItem
  
  var CalculationsResource: Instantiable0[typings.stripe.mod.Stripe.Tax.CalculationsResource]
  
  val Transaction: TypeofTransactionCustomerDetails
  
  val TransactionCreateReversalParams: Any
  
  val TransactionLineItem: Any
  
  var TransactionsResource: Instantiable0[typings.stripe.mod.Stripe.Tax.TransactionsResource]
}
object TypeofTax {
  
  inline def apply(
    Calculation: TypeofCalculation,
    CalculationCreateParams: TypeofCalculationCreatePa,
    CalculationLineItem: TypeofCalculationLineItem,
    CalculationsResource: Instantiable0[CalculationsResource],
    Transaction: TypeofTransactionCustomerDetails,
    TransactionCreateReversalParams: Any,
    TransactionLineItem: Any,
    TransactionsResource: Instantiable0[TransactionsResource]
  ): TypeofTax = {
    val __obj = js.Dynamic.literal(Calculation = Calculation.asInstanceOf[js.Any], CalculationCreateParams = CalculationCreateParams.asInstanceOf[js.Any], CalculationLineItem = CalculationLineItem.asInstanceOf[js.Any], CalculationsResource = CalculationsResource.asInstanceOf[js.Any], Transaction = Transaction.asInstanceOf[js.Any], TransactionCreateReversalParams = TransactionCreateReversalParams.asInstanceOf[js.Any], TransactionLineItem = TransactionLineItem.asInstanceOf[js.Any], TransactionsResource = TransactionsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTax] (val x: Self) extends AnyVal {
    
    inline def setCalculation(value: TypeofCalculation): Self = StObject.set(x, "Calculation", value.asInstanceOf[js.Any])
    
    inline def setCalculationCreateParams(value: TypeofCalculationCreatePa): Self = StObject.set(x, "CalculationCreateParams", value.asInstanceOf[js.Any])
    
    inline def setCalculationLineItem(value: TypeofCalculationLineItem): Self = StObject.set(x, "CalculationLineItem", value.asInstanceOf[js.Any])
    
    inline def setCalculationsResource(value: Instantiable0[CalculationsResource]): Self = StObject.set(x, "CalculationsResource", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: TypeofTransactionCustomerDetails): Self = StObject.set(x, "Transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionCreateReversalParams(value: Any): Self = StObject.set(x, "TransactionCreateReversalParams", value.asInstanceOf[js.Any])
    
    inline def setTransactionLineItem(value: Any): Self = StObject.set(x, "TransactionLineItem", value.asInstanceOf[js.Any])
    
    inline def setTransactionsResource(value: Instantiable0[TransactionsResource]): Self = StObject.set(x, "TransactionsResource", value.asInstanceOf[js.Any])
  }
}
