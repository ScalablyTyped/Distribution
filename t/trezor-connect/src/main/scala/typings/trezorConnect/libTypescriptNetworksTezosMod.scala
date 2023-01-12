package typings.trezorConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNetworksTezosMod {
  
  trait TezosAddress extends StObject {
    
    var address: String
    
    var path: js.Array[Double]
    
    var serializedPath: String
  }
  object TezosAddress {
    
    inline def apply(address: String, path: js.Array[Double], serializedPath: String): TezosAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait TezosDelegationOperation extends StObject {
    
    var counter: Double
    
    var delegate: String
    
    var fee: Double
    
    var gas_limit: Double
    
    var source: String
    
    var storage_limit: Double
  }
  object TezosDelegationOperation {
    
    inline def apply(
      counter: Double,
      delegate: String,
      fee: Double,
      gas_limit: Double,
      source: String,
      storage_limit: Double
    ): TezosDelegationOperation = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosDelegationOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosDelegationOperation] (val x: Self) extends AnyVal {
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setDelegate(value: String): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
    }
  }
  
  trait TezosGetAddress extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var path: String | js.Array[Double]
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object TezosGetAddress {
    
    inline def apply(path: String | js.Array[Double]): TezosGetAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosGetAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosGetAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  trait TezosGetPublicKey extends StObject {
    
    var path: String | js.Array[Double]
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object TezosGetPublicKey {
    
    inline def apply(path: String | js.Array[Double]): TezosGetPublicKey = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosGetPublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosGetPublicKey] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  trait TezosManagerTransfer extends StObject {
    
    var amount: Double
    
    var destination: String
  }
  object TezosManagerTransfer {
    
    inline def apply(amount: Double, destination: String): TezosManagerTransfer = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosManagerTransfer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosManagerTransfer] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
  
  trait TezosOperation extends StObject {
    
    var delegation: js.UndefOr[TezosDelegationOperation] = js.undefined
    
    var origination: js.UndefOr[TezosOriginationOperation] = js.undefined
    
    var reveal: js.UndefOr[TezosRevealOperation] = js.undefined
    
    var transaction: js.UndefOr[TezosTransactionOperation] = js.undefined
  }
  object TezosOperation {
    
    inline def apply(): TezosOperation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TezosOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosOperation] (val x: Self) extends AnyVal {
      
      inline def setDelegation(value: TezosDelegationOperation): Self = StObject.set(x, "delegation", value.asInstanceOf[js.Any])
      
      inline def setDelegationUndefined: Self = StObject.set(x, "delegation", js.undefined)
      
      inline def setOrigination(value: TezosOriginationOperation): Self = StObject.set(x, "origination", value.asInstanceOf[js.Any])
      
      inline def setOriginationUndefined: Self = StObject.set(x, "origination", js.undefined)
      
      inline def setReveal(value: TezosRevealOperation): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
      
      inline def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
      
      inline def setTransaction(value: TezosTransactionOperation): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
  }
  
  trait TezosOriginationOperation extends StObject {
    
    var balance: Double
    
    var counter: Double
    
    var delegate: js.UndefOr[String] = js.undefined
    
    var fee: Double
    
    var gas_limit: Double
    
    var script: String | js.Array[Double]
    
    var source: String
    
    var storage_limit: Double
  }
  object TezosOriginationOperation {
    
    inline def apply(
      balance: Double,
      counter: Double,
      fee: Double,
      gas_limit: Double,
      script: String | js.Array[Double],
      source: String,
      storage_limit: Double
    ): TezosOriginationOperation = {
      val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosOriginationOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosOriginationOperation] (val x: Self) extends AnyVal {
      
      inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setDelegate(value: String): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String | js.Array[Double]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptVarargs(value: Double*): Self = StObject.set(x, "script", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
    }
  }
  
  trait TezosParametersManager extends StObject {
    
    var cancel_delegate: js.UndefOr[Boolean] = js.undefined
    
    var set_delegate: js.UndefOr[String] = js.undefined
    
    var transfer: js.UndefOr[TezosManagerTransfer] = js.undefined
  }
  object TezosParametersManager {
    
    inline def apply(): TezosParametersManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TezosParametersManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosParametersManager] (val x: Self) extends AnyVal {
      
      inline def setCancel_delegate(value: Boolean): Self = StObject.set(x, "cancel_delegate", value.asInstanceOf[js.Any])
      
      inline def setCancel_delegateUndefined: Self = StObject.set(x, "cancel_delegate", js.undefined)
      
      inline def setSet_delegate(value: String): Self = StObject.set(x, "set_delegate", value.asInstanceOf[js.Any])
      
      inline def setSet_delegateUndefined: Self = StObject.set(x, "set_delegate", js.undefined)
      
      inline def setTransfer(value: TezosManagerTransfer): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
      
      inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    }
  }
  
  trait TezosPublicKey extends StObject {
    
    var path: js.Array[Double]
    
    var publicKey: String
    
    var serializedPath: String
  }
  object TezosPublicKey {
    
    inline def apply(path: js.Array[Double], publicKey: String, serializedPath: String): TezosPublicKey = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosPublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosPublicKey] (val x: Self) extends AnyVal {
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait TezosRevealOperation extends StObject {
    
    var counter: Double
    
    var fee: Double
    
    var gas_limit: Double
    
    var public_key: String
    
    var source: String
    
    var storage_limit: Double
  }
  object TezosRevealOperation {
    
    inline def apply(
      counter: Double,
      fee: Double,
      gas_limit: Double,
      public_key: String,
      source: String,
      storage_limit: Double
    ): TezosRevealOperation = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosRevealOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosRevealOperation] (val x: Self) extends AnyVal {
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
      
      inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
    }
  }
  
  trait TezosSignTransaction extends StObject {
    
    var branch: String
    
    var operation: TezosOperation
    
    var path: String | js.Array[Double]
  }
  object TezosSignTransaction {
    
    inline def apply(branch: String, operation: TezosOperation, path: String | js.Array[Double]): TezosSignTransaction = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosSignTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosSignTransaction] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: TezosOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait TezosTransactionOperation extends StObject {
    
    var amount: Double
    
    var counter: Double
    
    var destination: String
    
    var fee: Double
    
    var gas_limit: Double
    
    var parameters: js.UndefOr[js.Array[Double]] = js.undefined
    
    var parameters_manager: js.UndefOr[TezosParametersManager] = js.undefined
    
    var source: String
    
    var storage_limit: Double
  }
  object TezosTransactionOperation {
    
    inline def apply(
      amount: Double,
      counter: Double,
      destination: String,
      fee: Double,
      gas_limit: Double,
      source: String,
      storage_limit: Double
    ): TezosTransactionOperation = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], storage_limit = storage_limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[TezosTransactionOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TezosTransactionOperation] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Array[Double]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: Double*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setParameters_manager(value: TezosParametersManager): Self = StObject.set(x, "parameters_manager", value.asInstanceOf[js.Any])
      
      inline def setParameters_managerUndefined: Self = StObject.set(x, "parameters_manager", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStorage_limit(value: Double): Self = StObject.set(x, "storage_limit", value.asInstanceOf[js.Any])
    }
  }
}
