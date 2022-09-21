package typings.trezorConnect

import typings.trezorConnect.anon.AddressesAccountAddresses
import typings.trezorConnect.protobufMod.InternalInputScriptType
import typings.trezorConnect.protobufMod.MultisigRedeemScriptType
import typings.trezorConnect.protobufMod.PrevInput
import typings.trezorConnect.protobufMod.TxInput
import typings.trezorConnect.protobufMod.TxInputType
import typings.trezorConnect.protobufMod.TxOutputBinType
import typings.trezorConnect.protobufMod.TxOutputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitcoinMod {
  
  trait Address
    extends StObject
       with typings.trezorConnect.protobufMod.Address {
    
    var path: js.Array[Double]
    
    var serializedPath: String
  }
  object Address {
    
    inline def apply(address: String, path: js.Array[Double], serializedPath: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAddress extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var coin: js.UndefOr[String] = js.undefined
    
    var crossChain: js.UndefOr[Boolean] = js.undefined
    
    var multisig: js.UndefOr[MultisigRedeemScriptType] = js.undefined
    
    var path: String | js.Array[Double]
    
    var scriptType: js.UndefOr[InternalInputScriptType] = js.undefined
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object GetAddress {
    
    inline def apply(path: String | js.Array[Double]): GetAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAddress]
    }
    
    extension [Self <: GetAddress](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
      
      inline def setCoinUndefined: Self = StObject.set(x, "coin", js.undefined)
      
      inline def setCrossChain(value: Boolean): Self = StObject.set(x, "crossChain", value.asInstanceOf[js.Any])
      
      inline def setCrossChainUndefined: Self = StObject.set(x, "crossChain", js.undefined)
      
      inline def setMultisig(value: MultisigRedeemScriptType): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
      
      inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setScriptType(value: InternalInputScriptType): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
      
      inline def setScriptTypeUndefined: Self = StObject.set(x, "scriptType", js.undefined)
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  trait GetPublicKey extends StObject {
    
    var coin: js.UndefOr[String] = js.undefined
    
    var crossChain: js.UndefOr[Boolean] = js.undefined
    
    var path: String | js.Array[Double]
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object GetPublicKey {
    
    inline def apply(path: String | js.Array[Double]): GetPublicKey = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPublicKey]
    }
    
    extension [Self <: GetPublicKey](x: Self) {
      
      inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
      
      inline def setCoinUndefined: Self = StObject.set(x, "coin", js.undefined)
      
      inline def setCrossChain(value: Boolean): Self = StObject.set(x, "crossChain", value.asInstanceOf[js.Any])
      
      inline def setCrossChainUndefined: Self = StObject.set(x, "crossChain", js.undefined)
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  trait HDNodeResponse extends StObject {
    
    var chainCode: String
    
    var childNum: Double
    
    var depth: Double
    
    var fingerprint: Double
    
    var path: js.Array[Double]
    
    var publicKey: String
    
    var serializedPath: String
    
    var xpub: String
    
    var xpubSegwit: js.UndefOr[String] = js.undefined
  }
  object HDNodeResponse {
    
    inline def apply(
      chainCode: String,
      childNum: Double,
      depth: Double,
      fingerprint: Double,
      path: js.Array[Double],
      publicKey: String,
      serializedPath: String,
      xpub: String
    ): HDNodeResponse = {
      val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNum = childNum.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
      __obj.asInstanceOf[HDNodeResponse]
    }
    
    extension [Self <: HDNodeResponse](x: Self) {
      
      inline def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      inline def setChildNum(value: Double): Self = StObject.set(x, "childNum", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setFingerprint(value: Double): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
      
      inline def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
      
      inline def setXpubSegwit(value: String): Self = StObject.set(x, "xpubSegwit", value.asInstanceOf[js.Any])
      
      inline def setXpubSegwitUndefined: Self = StObject.set(x, "xpubSegwit", js.undefined)
    }
  }
  
  trait PushTransaction extends StObject {
    
    var coin: String
    
    var tx: String
  }
  object PushTransaction {
    
    inline def apply(coin: String, tx: String): PushTransaction = {
      val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushTransaction]
    }
    
    extension [Self <: PushTransaction](x: Self) {
      
      inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
      
      inline def setTx(value: String): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    }
  }
  
  trait PushedTransaction extends StObject {
    
    var txid: String
  }
  object PushedTransaction {
    
    inline def apply(txid: String): PushedTransaction = {
      val __obj = js.Dynamic.literal(txid = txid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushedTransaction]
    }
    
    extension [Self <: PushedTransaction](x: Self) {
      
      inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trezorConnect.anon.Binoutputs
    - typings.trezorConnect.anon.Branchid
  */
  trait RefTransaction extends StObject
  object RefTransaction {
    
    inline def Binoutputs(
      bin_outputs: js.Array[TxOutputBinType],
      hash: String,
      inputs: js.Array[PrevInput],
      lock_time: Double,
      outputs: Unit,
      version: Double
    ): typings.trezorConnect.anon.Binoutputs = {
      val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lock_time = lock_time.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.trezorConnect.anon.Binoutputs]
    }
    
    inline def Branchid(
      bin_outputs: Unit,
      hash: String,
      inputs: js.Array[TxInput],
      lock_time: Double,
      outputs: js.Array[TxOutputType],
      version: Double
    ): typings.trezorConnect.anon.Branchid = {
      val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lock_time = lock_time.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.trezorConnect.anon.Branchid]
    }
  }
  
  trait SignMessage extends StObject {
    
    var coin: String
    
    var hex: js.UndefOr[Boolean] = js.undefined
    
    var message: String
    
    var no_script_type: js.UndefOr[Boolean] = js.undefined
    
    var path: String | js.Array[Double]
  }
  object SignMessage {
    
    inline def apply(coin: String, message: String, path: String | js.Array[Double]): SignMessage = {
      val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignMessage]
    }
    
    extension [Self <: SignMessage](x: Self) {
      
      inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
      
      inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNo_script_type(value: Boolean): Self = StObject.set(x, "no_script_type", value.asInstanceOf[js.Any])
      
      inline def setNo_script_typeUndefined: Self = StObject.set(x, "no_script_type", js.undefined)
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait SignTransaction extends StObject {
    
    var account: js.UndefOr[AddressesAccountAddresses] = js.undefined
    
    var branchId: js.UndefOr[Double] = js.undefined
    
    var coin: String
    
    var decredStakingTicket: js.UndefOr[Boolean] = js.undefined
    
    var expiry: js.UndefOr[Double] = js.undefined
    
    var inputs: js.Array[TxInputType]
    
    var locktime: js.UndefOr[Double] = js.undefined
    
    var outputs: js.Array[TxOutputType]
    
    var overwintered: js.UndefOr[Boolean] = js.undefined
    
    var push: js.UndefOr[Boolean] = js.undefined
    
    var refTxs: js.UndefOr[js.Array[RefTransaction]] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
    
    var versionGroupId: js.UndefOr[Double] = js.undefined
  }
  object SignTransaction {
    
    inline def apply(coin: String, inputs: js.Array[TxInputType], outputs: js.Array[TxOutputType]): SignTransaction = {
      val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignTransaction]
    }
    
    extension [Self <: SignTransaction](x: Self) {
      
      inline def setAccount(value: AddressesAccountAddresses): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setBranchId(value: Double): Self = StObject.set(x, "branchId", value.asInstanceOf[js.Any])
      
      inline def setBranchIdUndefined: Self = StObject.set(x, "branchId", js.undefined)
      
      inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
      
      inline def setDecredStakingTicket(value: Boolean): Self = StObject.set(x, "decredStakingTicket", value.asInstanceOf[js.Any])
      
      inline def setDecredStakingTicketUndefined: Self = StObject.set(x, "decredStakingTicket", js.undefined)
      
      inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      inline def setInputs(value: js.Array[TxInputType]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: TxInputType*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setLocktime(value: Double): Self = StObject.set(x, "locktime", value.asInstanceOf[js.Any])
      
      inline def setLocktimeUndefined: Self = StObject.set(x, "locktime", js.undefined)
      
      inline def setOutputs(value: js.Array[TxOutputType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: TxOutputType*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setOverwintered(value: Boolean): Self = StObject.set(x, "overwintered", value.asInstanceOf[js.Any])
      
      inline def setOverwinteredUndefined: Self = StObject.set(x, "overwintered", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setRefTxs(value: js.Array[RefTransaction]): Self = StObject.set(x, "refTxs", value.asInstanceOf[js.Any])
      
      inline def setRefTxsUndefined: Self = StObject.set(x, "refTxs", js.undefined)
      
      inline def setRefTxsVarargs(value: RefTransaction*): Self = StObject.set(x, "refTxs", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionGroupId(value: Double): Self = StObject.set(x, "versionGroupId", value.asInstanceOf[js.Any])
      
      inline def setVersionGroupIdUndefined: Self = StObject.set(x, "versionGroupId", js.undefined)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait SignedTransaction extends StObject {
    
    var serializedTx: String
    
    var signatures: js.Array[String]
    
    var txid: js.UndefOr[String] = js.undefined
  }
  object SignedTransaction {
    
    inline def apply(serializedTx: String, signatures: js.Array[String]): SignedTransaction = {
      val __obj = js.Dynamic.literal(serializedTx = serializedTx.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedTransaction]
    }
    
    extension [Self <: SignedTransaction](x: Self) {
      
      inline def setSerializedTx(value: String): Self = StObject.set(x, "serializedTx", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value*))
      
      inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
      
      inline def setTxidUndefined: Self = StObject.set(x, "txid", js.undefined)
    }
  }
  
  trait TransactionOptions extends StObject {
    
    var branch_id: js.UndefOr[Double] = js.undefined
    
    var decred_staking_ticket: js.UndefOr[Boolean] = js.undefined
    
    var expiry: js.UndefOr[Double] = js.undefined
    
    var lock_time: js.UndefOr[Double] = js.undefined
    
    var overwintered: js.UndefOr[Boolean] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
    
    var version_group_id: js.UndefOr[Double] = js.undefined
  }
  object TransactionOptions {
    
    inline def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    extension [Self <: TransactionOptions](x: Self) {
      
      inline def setBranch_id(value: Double): Self = StObject.set(x, "branch_id", value.asInstanceOf[js.Any])
      
      inline def setBranch_idUndefined: Self = StObject.set(x, "branch_id", js.undefined)
      
      inline def setDecred_staking_ticket(value: Boolean): Self = StObject.set(x, "decred_staking_ticket", value.asInstanceOf[js.Any])
      
      inline def setDecred_staking_ticketUndefined: Self = StObject.set(x, "decred_staking_ticket", js.undefined)
      
      inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      inline def setLock_time(value: Double): Self = StObject.set(x, "lock_time", value.asInstanceOf[js.Any])
      
      inline def setLock_timeUndefined: Self = StObject.set(x, "lock_time", js.undefined)
      
      inline def setOverwintered(value: Boolean): Self = StObject.set(x, "overwintered", value.asInstanceOf[js.Any])
      
      inline def setOverwinteredUndefined: Self = StObject.set(x, "overwintered", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersion_group_id(value: Double): Self = StObject.set(x, "version_group_id", value.asInstanceOf[js.Any])
      
      inline def setVersion_group_idUndefined: Self = StObject.set(x, "version_group_id", js.undefined)
    }
  }
  
  trait VerifyMessage extends StObject {
    
    var address: String
    
    var coin: String
    
    var hex: js.UndefOr[Boolean] = js.undefined
    
    var message: String
    
    var signature: String
  }
  object VerifyMessage {
    
    inline def apply(address: String, coin: String, message: String, signature: String): VerifyMessage = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coin = coin.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyMessage]
    }
    
    extension [Self <: VerifyMessage](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
      
      inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
