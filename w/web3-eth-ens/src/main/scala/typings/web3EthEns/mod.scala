package typings.web3EthEns

import org.scalablytyped.runtime.StringDictionary
import typings.web3Core.mod.PromiEvent
import typings.web3Core.mod.TransactionConfig
import typings.web3Core.mod.TransactionReceipt
import typings.web3CoreHelpers.mod.TransactionRevertInstructionError
import typings.web3EthContract.mod.Contract
import typings.web3EthEns.web3EthEnsStrings.bzz
import typings.web3EthEns.web3EthEnsStrings.ipfs
import typings.web3EthEns.web3EthEnsStrings.onion
import typings.web3EthEns.web3EthEnsStrings.onion3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-ens", "Ens")
  @js.native
  open class Ens protected () extends StObject {
    def this(eth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eth */ Any) = this()
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getAddress(name: String): js.Promise[String] = js.native
    def getAddress(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getAddress(name: String, callback: js.Function2[/* error */ js.Error, /* address */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getContent(name: String): js.Promise[String] = js.native
    def getContent(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getContent(name: String, callback: js.Function2[/* error */ js.Error, /* contentHash */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getContenthash(name: String): js.Promise[ContentHash] = js.native
    def getContenthash(name: String, callback: js.Function1[/* value */ ContentHash, Unit]): js.Promise[ContentHash] = js.native
    def getContenthash(name: String, callback: js.Function2[/* error */ js.Error, /* contenthash */ ContentHash, Unit]): js.Promise[ContentHash] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getMultihash(name: String): js.Promise[String] = js.native
    def getMultihash(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getMultihash(name: String, callback: js.Function2[/* error */ js.Error, /* multihash */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getOwner(name: String): js.Promise[String] = js.native
    def getOwner(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getOwner(name: String, callback: js.Function2[/* error */ js.Error, /* owner */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getPubkey(name: String): js.Promise[StringDictionary[String]] = js.native
    def getPubkey(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[StringDictionary[String]] = js.native
    def getPubkey(
      name: String,
      callback: js.Function2[/* error */ js.Error, /* result */ StringDictionary[String], Unit]
    ): js.Promise[StringDictionary[String]] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getResolver(name: String): js.Promise[Contract] = js.native
    def getResolver(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[Contract] = js.native
    def getResolver(name: String, callback: js.Function2[/* error */ js.Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getTTL(name: String): js.Promise[String] = js.native
    def getTTL(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getTTL(name: String, callback: js.Function2[/* error */ js.Error, /* ttl */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getText(name: String, key: String): js.Promise[String] = js.native
    def getText(name: String, key: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getText(
      name: String,
      key: String,
      callback: js.Function2[/* error */ js.Error, /* ensName */ String, Unit]
    ): js.Promise[String] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def isApprovedForAll(owner: String, operator: String): js.Promise[Boolean] = js.native
    def isApprovedForAll(owner: String, operator: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[Boolean] = js.native
    def isApprovedForAll(
      owner: String,
      operator: String,
      callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]
    ): js.Promise[Boolean] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def recordExists(name: String): js.Promise[Boolean] = js.native
    def recordExists(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[Boolean] = js.native
    def recordExists(name: String, callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): js.Promise[Boolean] = js.native
    
    var registry: Registry = js.native
    
    var registryAddress: String | Null = js.native
    
    /**
      * @deprecated Please use the "getResolver" method instead of "resolver"
      */
    def resolver(name: String): js.Promise[Contract] = js.native
    def resolver(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[Contract] = js.native
    def resolver(name: String, callback: js.Function2[/* error */ js.Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
    
    def setAddress(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setAddress(
      name: String,
      address: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setAddress(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setAddress(
      name: String,
      address: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setApprovalForAll(operator: String, approved: Boolean): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setApprovalForAll(
      operator: String,
      approved: Boolean,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setApprovalForAll(operator: String, approved: Boolean, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setApprovalForAll(
      operator: String,
      approved: Boolean,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setContent(name: String, hash: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setContent(
      name: String,
      hash: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setContent(name: String, hash: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setContent(
      name: String,
      hash: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setContenthash(name: String, hash: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setContenthash(
      name: String,
      hash: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setContenthash(name: String, hash: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setContenthash(
      name: String,
      hash: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setMultihash(name: String, hash: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setMultihash(
      name: String,
      hash: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setMultihash(name: String, hash: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setMultihash(
      name: String,
      hash: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setOwner(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setOwner(
      name: String,
      address: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setOwner(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setOwner(
      name: String,
      address: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setPubkey(name: String, x: String, y: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setPubkey(
      name: String,
      x: String,
      y: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setPubkey(name: String, x: String, y: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setPubkey(
      name: String,
      x: String,
      y: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setRecord(name: String, owner: String, resolver: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setRecord(
      name: String,
      owner: String,
      resolver: String,
      ttl: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setRecord(name: String, owner: String, resolver: String, ttl: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setRecord(
      name: String,
      owner: String,
      resolver: String,
      ttl: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setRecord(name: String, owner: String, resolver: String, ttl: Double): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setRecord(
      name: String,
      owner: String,
      resolver: String,
      ttl: Double,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setRecord(name: String, owner: String, resolver: String, ttl: Double, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setRecord(
      name: String,
      owner: String,
      resolver: String,
      ttl: Double,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setResolver(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setResolver(
      name: String,
      address: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setResolver(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setResolver(
      name: String,
      address: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setSubnodeOwner(name: String, label: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeOwner(
      name: String,
      label: String,
      address: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeOwner(name: String, label: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeOwner(
      name: String,
      label: String,
      address: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setSubnodeRecord(name: String, label: String, owner: String, resolver: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeRecord(
      name: String,
      label: String,
      owner: String,
      resolver: String,
      ttl: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeRecord(
      name: String,
      label: String,
      owner: String,
      resolver: String,
      ttl: String,
      txConfig: TransactionConfig
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeRecord(
      name: String,
      label: String,
      owner: String,
      resolver: String,
      ttl: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeRecord(name: String, label: String, owner: String, resolver: String, ttl: Double): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeRecord(
      name: String,
      label: String,
      owner: String,
      resolver: String,
      ttl: Double,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeRecord(
      name: String,
      label: String,
      owner: String,
      resolver: String,
      ttl: Double,
      txConfig: TransactionConfig
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeRecord(
      name: String,
      label: String,
      owner: String,
      resolver: String,
      ttl: Double,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setTTL(name: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(name: String, ttl: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(name: String, ttl: Double): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: Double,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(name: String, ttl: Double, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: Double,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setText(name: String, key: String, value: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setText(
      name: String,
      key: String,
      value: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setText(name: String, key: String, value: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setText(
      name: String,
      key: String,
      value: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def supportsInterface(name: String, interfaceId: String): js.Promise[Boolean] = js.native
    def supportsInterface(name: String, interfaceId: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[Boolean] = js.native
    def supportsInterface(
      name: String,
      interfaceId: String,
      callback: js.Function2[/* error */ js.Error, /* supported */ Boolean, Unit]
    ): js.Promise[Boolean] = js.native
  }
  
  @JSImport("web3-eth-ens", "Registry")
  @js.native
  open class Registry protected () extends StObject {
    def this(ens: Ens) = this()
    
    var contract: Contract | Null = js.native
    
    var ens: Ens = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getOwner(name: String): js.Promise[String] = js.native
    def getOwner(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getOwner(name: String, callback: js.Function2[/* error */ js.Error, /* address */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getResolver(name: String): js.Promise[Contract] = js.native
    def getResolver(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[Contract] = js.native
    def getResolver(name: String, callback: js.Function2[/* error */ js.Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
    
    /**
      * @deprecated This callback signature is deprecated
      */
    def getTTl(name: String): js.Promise[String] = js.native
    def getTTl(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def getTTl(name: String, callback: js.Function2[/* error */ js.Error, /* ttl */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated Please use the "getOwner" method instead of "owner"
      */
    def owner(name: String): js.Promise[String] = js.native
    def owner(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[String] = js.native
    def owner(name: String, callback: js.Function2[/* error */ js.Error, /* address */ String, Unit]): js.Promise[String] = js.native
    
    /**
      * @deprecated Please use the "getResolver" method instead of "resolver"
      */
    def resolver(name: String): js.Promise[Contract] = js.native
    def resolver(name: String, callback: js.Function1[/* value */ Any, Unit]): js.Promise[Contract] = js.native
    def resolver(name: String, callback: js.Function2[/* error */ js.Error, /* contract */ Contract, Unit]): js.Promise[Contract] = js.native
    
    def setOwner(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setOwner(
      name: String,
      address: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setOwner(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setOwner(
      name: String,
      address: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setResolver(name: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setResolver(
      name: String,
      address: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setResolver(name: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setResolver(
      name: String,
      address: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setSubnodeOwner(name: String, label: String, address: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeOwner(
      name: String,
      label: String,
      address: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeOwner(name: String, label: String, address: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setSubnodeOwner(
      name: String,
      label: String,
      address: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    
    def setTTL(name: String, ttl: String): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: String,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(name: String, ttl: String, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: String,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(name: String, ttl: Double): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: Double,
      txConfig: Unit,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(name: String, ttl: Double, txConfig: TransactionConfig): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
    def setTTL(
      name: String,
      ttl: Double,
      txConfig: TransactionConfig,
      callback: js.Function2[
          /* error */ js.Error | TransactionRevertInstructionError, 
          /* receipt */ TransactionReceipt, 
          Unit
        ]
    ): PromiEvent[TransactionReceipt | TransactionRevertInstructionError] = js.native
  }
  
  trait ContentHash extends StObject {
    
    var decoded: String | Null
    
    var error: js.UndefOr[js.Error | Null] = js.undefined
    
    var protocolType: ipfs | bzz | onion | onion3 | Null
  }
  object ContentHash {
    
    inline def apply(): ContentHash = {
      val __obj = js.Dynamic.literal(decoded = null, protocolType = null)
      __obj.asInstanceOf[ContentHash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentHash] (val x: Self) extends AnyVal {
      
      inline def setDecoded(value: String): Self = StObject.set(x, "decoded", value.asInstanceOf[js.Any])
      
      inline def setDecodedNull: Self = StObject.set(x, "decoded", null)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProtocolType(value: ipfs | bzz | onion | onion3): Self = StObject.set(x, "protocolType", value.asInstanceOf[js.Any])
      
      inline def setProtocolTypeNull: Self = StObject.set(x, "protocolType", null)
    }
  }
}
