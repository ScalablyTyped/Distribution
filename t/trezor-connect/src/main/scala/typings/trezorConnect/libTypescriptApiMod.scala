package typings.trezorConnect

import typings.trezorConnect.anon.CustomCancelButton
import typings.trezorConnect.anon.DeviceEventeventstring
import typings.trezorConnect.anon.DeviceProgress
import typings.trezorConnect.anon.DeviceType
import typings.trezorConnect.anon.Event
import typings.trezorConnect.anon.Message
import typings.trezorConnect.anon.OmitButtonRequestcodecode
import typings.trezorConnect.anon.Permissions
import typings.trezorConnect.anon.Progress
import typings.trezorConnect.anon.Type
import typings.trezorConnect.anon.manifestManifestPartialCo
import typings.trezorConnect.libTypescriptAccountMod.AccountInfo
import typings.trezorConnect.libTypescriptAccountMod.ComposeParams
import typings.trezorConnect.libTypescriptAccountMod.GetAccountInfo
import typings.trezorConnect.libTypescriptAccountMod.PrecomposeParams
import typings.trezorConnect.libTypescriptAccountMod.PrecomposedTransaction
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainAccountBalanceHistory
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainDisconnect
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainDisconnected
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEstimateFee
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEstimatedFee
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainEvent
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainFiatRatesForTimestamps
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetAccountBalanceHistory
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetCurrentFiatRates
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetFiatRatesForTimestamps
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainGetTransactions
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSetCustomBackend
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSubscribe
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSubscribeFiatRates
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainSubscribed
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainTimestampedFiatRates
import typings.trezorConnect.libTypescriptBackendBlockchainMod.BlockchainTransactions
import typings.trezorConnect.libTypescriptEventsMod.ButtonRequestData
import typings.trezorConnect.libTypescriptEventsMod.TransportEvent
import typings.trezorConnect.libTypescriptEventsMod.UiEvent
import typings.trezorConnect.libTypescriptEventsMod.UiResponse
import typings.trezorConnect.libTypescriptMiscMod.CipherKeyValue
import typings.trezorConnect.libTypescriptMiscMod.CipheredValue
import typings.trezorConnect.libTypescriptMiscMod.CustomMessage
import typings.trezorConnect.libTypescriptMiscMod.Login
import typings.trezorConnect.libTypescriptMiscMod.LoginChallenge
import typings.trezorConnect.libTypescriptMiscMod.RequestLoginAsync
import typings.trezorConnect.libTypescriptMiscMod.SetProxy
import typings.trezorConnect.libTypescriptNetworksBinanceMod.BinanceAddress
import typings.trezorConnect.libTypescriptNetworksBinanceMod.BinanceGetAddress
import typings.trezorConnect.libTypescriptNetworksBinanceMod.BinanceGetPublicKey
import typings.trezorConnect.libTypescriptNetworksBinanceMod.BinancePublicKey
import typings.trezorConnect.libTypescriptNetworksBinanceMod.BinanceSignTransaction
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.Address
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.GetAddress
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.GetPublicKey
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.HDNodeResponse
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.PushTransaction
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.PushedTransaction
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.SignMessage
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.SignTransaction
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.SignedTransaction
import typings.trezorConnect.libTypescriptNetworksBitcoinMod.VerifyMessage
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoAddress
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoGetAddress
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoGetNativeScriptHash
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoGetPublicKey
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoNativeScriptHash
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoPublicKey
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoSignTransaction
import typings.trezorConnect.libTypescriptNetworksCardanoMod.CardanoSignedTxData
import typings.trezorConnect.libTypescriptNetworksCoinInfoMod.CoinInfo
import typings.trezorConnect.libTypescriptNetworksCoinInfoMod.GetCoinInfo
import typings.trezorConnect.libTypescriptNetworksEosMod.EosGetPublicKey
import typings.trezorConnect.libTypescriptNetworksEosMod.EosPublicKey
import typings.trezorConnect.libTypescriptNetworksEosMod.EosSignTransaction
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumAddress
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumGetAddress
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumGetPublicKey
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignMessage
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTransaction
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTypedData
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTypedDataTypes
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTypedHashAndData
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignedTx
import typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumVerifyMessage
import typings.trezorConnect.libTypescriptNetworksNemMod.NEMAddress
import typings.trezorConnect.libTypescriptNetworksNemMod.NEMGetAddress
import typings.trezorConnect.libTypescriptNetworksNemMod.NEMSignTransaction
import typings.trezorConnect.libTypescriptNetworksRippleMod.RippleAddress
import typings.trezorConnect.libTypescriptNetworksRippleMod.RippleGetAddress
import typings.trezorConnect.libTypescriptNetworksRippleMod.RippleSignTransaction
import typings.trezorConnect.libTypescriptNetworksRippleMod.RippleSignedTx
import typings.trezorConnect.libTypescriptNetworksStellarMod.StellarAddress
import typings.trezorConnect.libTypescriptNetworksStellarMod.StellarGetAddress
import typings.trezorConnect.libTypescriptNetworksStellarMod.StellarSignTransaction
import typings.trezorConnect.libTypescriptNetworksStellarMod.StellarSignedTx
import typings.trezorConnect.libTypescriptNetworksTezosMod.TezosAddress
import typings.trezorConnect.libTypescriptNetworksTezosMod.TezosGetAddress
import typings.trezorConnect.libTypescriptNetworksTezosMod.TezosGetPublicKey
import typings.trezorConnect.libTypescriptNetworksTezosMod.TezosPublicKey
import typings.trezorConnect.libTypescriptNetworksTezosMod.TezosSignTransaction
import typings.trezorConnect.libTypescriptParamsMod.Bundle
import typings.trezorConnect.libTypescriptParamsMod.CommonParams
import typings.trezorConnect.libTypescriptParamsMod.ConnectSettings
import typings.trezorConnect.libTypescriptParamsMod.DefaultMessage
import typings.trezorConnect.libTypescriptParamsMod.Manifest
import typings.trezorConnect.libTypescriptParamsMod.Success
import typings.trezorConnect.libTypescriptParamsMod.Unsuccessful
import typings.trezorConnect.libTypescriptTrezorDeviceMod.Device
import typings.trezorConnect.libTypescriptTrezorDeviceMod.DeviceStateResponse
import typings.trezorConnect.libTypescriptTrezorManagementMod.ApplyFlags
import typings.trezorConnect.libTypescriptTrezorManagementMod.ChangePin
import typings.trezorConnect.libTypescriptTrezorManagementMod.FirmwareUpdate
import typings.trezorConnect.libTypescriptTrezorManagementMod.FirmwareUpdateBinary
import typings.trezorConnect.libTypescriptTrezorManagementMod.RecoveryDevice
import typings.trezorConnect.libTypescriptTrezorManagementMod.ResetDevice
import typings.trezorConnect.libTypescriptTrezorProtobufMod.ApplySettings
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceSignedTx
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosSignedTx
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EthereumTypedDataSignature
import typings.trezorConnect.libTypescriptTrezorProtobufMod.Features
import typings.trezorConnect.libTypescriptTrezorProtobufMod.MessageSignature
import typings.trezorConnect.libTypescriptTrezorProtobufMod.NEMSignedTx
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TezosSignedTx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptApiMod {
  
  object TrezorConnect {
    
    @JSImport("trezor-connect/lib/typescript/api", "TrezorConnect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Increment saved flag on device
      */
    inline def applyFlags(params: CommonParams & ApplyFlags): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyFlags")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Applies device setup
      */
    inline def applySettings(params: CommonParams & ApplySettings): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("applySettings")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Asks device to initiate seed backup procedure
      */
    inline def backupDevice(): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("backupDevice")().asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    inline def backupDevice(params: CommonParams): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("backupDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    // Binance
    inline def binanceGetAddress(params: CommonParams & BinanceGetAddress): js.Promise[Success[BinanceAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BinanceAddress] | Unsuccessful]]
    inline def binanceGetAddress(params: CommonParams & Bundle[BinanceGetAddress]): js.Promise[Success[js.Array[BinanceAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[BinanceAddress]] | Unsuccessful]]
    
    inline def binanceGetPublicKey(params: CommonParams & Bundle[BinanceGetPublicKey]): js.Promise[Success[js.Array[BinancePublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[BinancePublicKey]] | Unsuccessful]]
    inline def binanceGetPublicKey(params: CommonParams & BinanceGetPublicKey): js.Promise[Success[BinancePublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BinancePublicKey] | Unsuccessful]]
    
    inline def binanceSignTransaction(params: CommonParams & BinanceSignTransaction): js.Promise[Success[BinanceSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BinanceSignedTx] | Unsuccessful]]
    
    inline def blockchainDisconnect(params: CommonParams & BlockchainDisconnect): js.Promise[Success[BlockchainDisconnected] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainDisconnect")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainDisconnected] | Unsuccessful]]
    
    /**
      * Backend operations
      */
    inline def blockchainEstimateFee(params: CommonParams & BlockchainEstimateFee): js.Promise[Success[BlockchainEstimatedFee] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainEstimateFee")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainEstimatedFee] | Unsuccessful]]
    
    inline def blockchainGetAccountBalanceHistory(params: BlockchainGetAccountBalanceHistory): js.Promise[Success[js.Array[BlockchainAccountBalanceHistory]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetAccountBalanceHistory")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[BlockchainAccountBalanceHistory]] | Unsuccessful]]
    
    inline def blockchainGetCurrentFiatRates(params: BlockchainGetCurrentFiatRates): js.Promise[Success[BlockchainTimestampedFiatRates] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetCurrentFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainTimestampedFiatRates] | Unsuccessful]]
    
    inline def blockchainGetFiatRatesForTimestamps(params: BlockchainGetFiatRatesForTimestamps): js.Promise[Success[BlockchainFiatRatesForTimestamps] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetFiatRatesForTimestamps")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainFiatRatesForTimestamps] | Unsuccessful]]
    
    inline def blockchainGetTransactions(params: CommonParams & BlockchainGetTransactions): js.Promise[Success[BlockchainTransactions] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetTransactions")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainTransactions] | Unsuccessful]]
    
    inline def blockchainSetCustomBackend(params: CommonParams & BlockchainSetCustomBackend): js.Promise[Success[Boolean] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSetCustomBackend")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Boolean] | Unsuccessful]]
    
    inline def blockchainSubscribe(params: CommonParams & BlockchainSubscribe): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSubscribe")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def blockchainSubscribeFiatRates(params: BlockchainSubscribeFiatRates): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSubscribeFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def blockchainUnsubscribe(params: CommonParams & BlockchainSubscribe): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainUnsubscribe")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def blockchainUnsubscribeFiatRates(params: BlockchainSubscribeFiatRates): js.Promise[Success[BlockchainSubscribed] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainUnsubscribeFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[BlockchainSubscribed] | Unsuccessful]]
    
    inline def cancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Unit]
    inline def cancel(params: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def cardanoGetAddress(params: CommonParams & Bundle[CardanoGetAddress]): js.Promise[Success[js.Array[CardanoAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[CardanoAddress]] | Unsuccessful]]
    // Cardano (ADA)
    inline def cardanoGetAddress(params: CommonParams & CardanoGetAddress): js.Promise[Success[CardanoAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoAddress] | Unsuccessful]]
    
    inline def cardanoGetNativeScriptHash(params: CommonParams & CardanoGetNativeScriptHash): js.Promise[Success[CardanoNativeScriptHash] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetNativeScriptHash")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoNativeScriptHash] | Unsuccessful]]
    
    inline def cardanoGetPublicKey(params: CommonParams & CardanoGetPublicKey): js.Promise[Success[CardanoPublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoPublicKey] | Unsuccessful]]
    inline def cardanoGetPublicKey(params: CommonParams & Bundle[CardanoGetPublicKey]): js.Promise[Success[js.Array[CardanoPublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[CardanoPublicKey]] | Unsuccessful]]
    
    inline def cardanoSignTransaction(params: CommonParams & CardanoSignTransaction): js.Promise[Success[CardanoSignedTxData] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CardanoSignedTxData] | Unsuccessful]]
    
    /**
      * Change pin
      */
    inline def changePin(params: CommonParams & ChangePin): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("changePin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    inline def cipherKeyValue(params: CommonParams & Bundle[CipherKeyValue]): js.Promise[Success[js.Array[CipheredValue]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[CipheredValue]] | Unsuccessful]]
    /**
      * Asks device to encrypt value using the private key derived by given BIP32
      * path and the given key. IV is always computed automatically.
      */
    inline def cipherKeyValue(params: CommonParams & CipherKeyValue): js.Promise[Success[CipheredValue] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CipheredValue] | Unsuccessful]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Requests a payment from the users wallet to a set of given outputs.
      * Internally a BIP-0044 account discovery is performed and user is presented
      * with a list of accounts. After account selection user is presented with
      * list of fee selection. After selecting a fee transaction is signed and
      * returned in hexadecimal format. Change output is added automatically, if
      * needed.
      */
    inline def composeTransaction(params: CommonParams & ComposeParams): js.Promise[Success[SignedTransaction] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[SignedTransaction] | Unsuccessful]]
    inline def composeTransaction(params: CommonParams & PrecomposeParams): js.Promise[Success[js.Array[PrecomposedTransaction]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[PrecomposedTransaction]] | Unsuccessful]]
    
    // // Developer mode
    inline def customMessage(params: CommonParams & CustomMessage): js.Promise[Success[Any] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("customMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Any] | Unsuccessful]]
    
    inline def disableWebUSB(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableWebUSB")().asInstanceOf[Unit]
    
    inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
    
    // EOS
    inline def eosGetPublicKey(params: CommonParams & EosGetPublicKey): js.Promise[Success[EosPublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EosPublicKey] | Unsuccessful]]
    inline def eosGetPublicKey(params: CommonParams & Bundle[EosGetPublicKey]): js.Promise[Success[js.Array[EosPublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[EosPublicKey]] | Unsuccessful]]
    
    inline def eosSignTransaction(params: CommonParams & EosSignTransaction): js.Promise[Success[EosSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EosSignedTx] | Unsuccessful]]
    
    // Ethereum and Ethereum-like
    inline def ethereumGetAddress(params: CommonParams & EthereumGetAddress): js.Promise[Success[EthereumAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumAddress] | Unsuccessful]]
    inline def ethereumGetAddress(params: CommonParams & Bundle[EthereumGetAddress]): js.Promise[Success[js.Array[EthereumAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[EthereumAddress]] | Unsuccessful]]
    
    inline def ethereumGetPublicKey(params: CommonParams & Bundle[EthereumGetPublicKey]): js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful]]
    inline def ethereumGetPublicKey(params: CommonParams & EthereumGetPublicKey): js.Promise[Success[HDNodeResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[HDNodeResponse] | Unsuccessful]]
    
    inline def ethereumSignMessage(params: CommonParams & EthereumSignMessage): js.Promise[Success[MessageSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[MessageSignature] | Unsuccessful]]
    
    inline def ethereumSignTransaction(params: CommonParams & Bundle[EthereumSignTransaction]): js.Promise[Success[js.Array[EthereumSignedTx]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[EthereumSignedTx]] | Unsuccessful]]
    inline def ethereumSignTransaction(params: CommonParams & EthereumSignTransaction): js.Promise[Success[EthereumSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumSignedTx] | Unsuccessful]]
    
    inline def ethereumSignTypedData[T /* <: EthereumSignTypedDataTypes */](params: EthereumSignTypedHashAndData[T] & CommonParams): js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTypedData")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful]]
    /**
      * @param params Passing:
      * - {@link Ethereum.EthereumSignTypedData} is required for Trezor T
      * - {@link Ethereum.EthereumSignTypedHash} is required for Trezor 1 compatability
      */
    inline def ethereumSignTypedData[T /* <: EthereumSignTypedDataTypes */](params: EthereumSignTypedData[T] & CommonParams): js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTypedData")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[EthereumTypedDataSignature] | Unsuccessful]]
    
    inline def ethereumVerifyMessage(params: CommonParams & EthereumVerifyMessage): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumVerifyMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Sends FirmwareErase message followed by FirmwareUpdate message
      */
    inline def firmwareUpdate(params: CommonParams & FirmwareUpdate & FirmwareUpdateBinary): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("firmwareUpdate")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Bitcoin, Bitcoin-like, Ethereum-like, Ripple
      * Gets an info of specified account.
      */
    inline def getAccountInfo(params: CommonParams & GetAccountInfo): js.Promise[Success[AccountInfo] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[AccountInfo] | Unsuccessful]]
    inline def getAccountInfo(params: CommonParams & Bundle[GetAccountInfo]): js.Promise[Success[js.Array[AccountInfo]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[AccountInfo]] | Unsuccessful]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Display requested address derived by given BIP32 path on device and
      * returns it to caller. User is asked to confirm the export on Trezor.
      */
    inline def getAddress(params: CommonParams & GetAddress): js.Promise[Success[Address] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Address] | Unsuccessful]]
    inline def getAddress(params: CommonParams & Bundle[GetAddress]): js.Promise[Success[js.Array[Address]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[Address]] | Unsuccessful]]
    
    /**
      * Get static coin info
      */
    inline def getCoinInfo(params: GetCoinInfo): js.Promise[Success[CoinInfo] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoinInfo")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[CoinInfo] | Unsuccessful]]
    
    /**
      * Retrieves device state associated with passphrase.
      */
    inline def getDeviceState(): js.Promise[Success[DeviceStateResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceState")().asInstanceOf[js.Promise[Success[DeviceStateResponse] | Unsuccessful]]
    inline def getDeviceState(params: CommonParams): js.Promise[Success[DeviceStateResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceState")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DeviceStateResponse] | Unsuccessful]]
    
    /**
      * Retrieves the set of features associated with the device.
      */
    inline def getFeatures(): js.Promise[Success[Features] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")().asInstanceOf[js.Promise[Success[Features] | Unsuccessful]]
    inline def getFeatures(params: CommonParams): js.Promise[Success[Features] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Features] | Unsuccessful]]
    
    inline def getPublicKey(params: CommonParams & Bundle[GetPublicKey]): js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[HDNodeResponse]] | Unsuccessful]]
    /**
      * Bitcoin and Bitcoin-like
      * Retrieves BIP32 extended public derived by given BIP32 path.
      * User is presented with a description of the requested key and asked to
      * confirm the export.
      */
    inline def getPublicKey(params: CommonParams & GetPublicKey): js.Promise[Success[HDNodeResponse] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[HDNodeResponse] | Unsuccessful]]
    
    /**
      * Retrieves the settings that TrezorConnect was initialized with.
      */
    inline def getSettings(): js.Promise[Success[ConnectSettings] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[js.Promise[Success[ConnectSettings] | Unsuccessful]]
    
    /**
      * Initializes TrezorConnect.
      * `manifest` is required
      */
    inline def init(settings: manifestManifestPartialCo): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Set TrezorConnect manifest.
      */
    inline def manifest(params: Manifest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def nemGetAddress(params: CommonParams & Bundle[NEMGetAddress]): js.Promise[Success[js.Array[NEMAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[NEMAddress]] | Unsuccessful]]
    // NEM
    inline def nemGetAddress(params: CommonParams & NEMGetAddress): js.Promise[Success[NEMAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[NEMAddress] | Unsuccessful]]
    
    inline def nemSignTransaction(params: CommonParams & NEMSignTransaction): js.Promise[Success[NEMSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[NEMSignedTx] | Unsuccessful]]
    
    inline def off(`type`: String, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on(`type`: /* "ui-request_window" */ String, cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Event listeners
      */
    inline def on(
      `type`: /* "DEVICE_EVENT" */ /* "TRANSPORT_EVENT" */ /* "UI_EVENT" */ /* "BLOCKCHAIN_EVENT" */ /* "ui-request_pin" */ /* "ui-request_word" */ /* "ui-invalid_pin" */ /* "ui-button" */ /* "ui-address_validation" */ /* "ui-request_permission" */ /* "ui-request_confirmation" */ /* "ui-device_bootloader_mode" */ /* "ui-device_firmware_old" */ /* "ui-firmware-progress" */ /* "ui-custom_request" */ String,
      cb: js.Function1[
          js.UndefOr[
            (TransportEvent & Event & UiEvent & BlockchainEvent) | ButtonRequestData | (/* event */ CustomCancelButton) | (/* event */ Device) | typings.trezorConnect.anon.Device | (/* event */ DeviceEventeventstring) | (/* event */ DeviceProgress) | DeviceType | (/* event */ Message) | (/* event */ OmitButtonRequestcodecode) | (/* event */ Permissions) | Type
          ], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on_R[R](`type`: /* "ui-bundle_progress" */ String, cb: js.Function1[/* event */ Progress[R], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Bitcoin, Bitcoin-like, Ethereum-like, Ripple
      * Broadcasts the transaction to the selected network.
      */
    inline def pushTransaction(params: CommonParams & PushTransaction): js.Promise[Success[PushedTransaction] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[PushedTransaction] | Unsuccessful]]
    
    /**
      * Reboots device (currently only T1 with fw >= 1.10.0) in bootloader mode
      */
    inline def rebootToBootloader(): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rebootToBootloader")().asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    inline def rebootToBootloader(params: CommonParams): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rebootToBootloader")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Ask device to initiate recovery procedure
      */
    inline def recoveryDevice(params: CommonParams & RecoveryDevice): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("recoveryDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    inline def removeAllListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Unit]
    
    inline def renderWebUSBButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderWebUSBButton")().asInstanceOf[Unit]
    
    /**
      * Challenge-response authentication via Trezor.
      * To protect against replay attacks you should use a server-side generated
      * and randomized challengeHidden for every attempt. You can also provide a
      * visual challenge that will be shown on the device.
      */
    inline def requestLogin(params: RequestLoginAsync & CommonParams): js.Promise[Success[Login] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Login] | Unsuccessful]]
    inline def requestLogin(params: LoginChallenge & CommonParams): js.Promise[Success[Login] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[Login] | Unsuccessful]]
    
    /**
      * Performs device setup and generates a new seed.
      */
    inline def resetDevice(params: CommonParams & ResetDevice): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    inline def rippleGetAddress(params: CommonParams & Bundle[RippleGetAddress]): js.Promise[Success[js.Array[RippleAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[RippleAddress]] | Unsuccessful]]
    // Ripple
    inline def rippleGetAddress(params: CommonParams & RippleGetAddress): js.Promise[Success[RippleAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[RippleAddress] | Unsuccessful]]
    
    inline def rippleSignTransaction(params: CommonParams & RippleSignTransaction): js.Promise[Success[RippleSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[RippleSignedTx] | Unsuccessful]]
    
    /**
      * Set tor proxy for @trezor/blockchain-link connections
      */
    inline def setProxy(params: SetProxy): js.Promise[
        Success[typings.trezorConnect.libTypescriptTrezorProtobufMod.Success] | Unsuccessful
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setProxy")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        Success[typings.trezorConnect.libTypescriptTrezorProtobufMod.Success] | Unsuccessful
      ]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to sign a message using the private key derived by given BIP32
      * path.
      */
    inline def signMessage(params: CommonParams & SignMessage): js.Promise[Success[MessageSignature] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("signMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[MessageSignature] | Unsuccessful]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to sign given inputs and outputs of pre-composed transaction.
      * User is asked to confirm all transaction details on Trezor.
      */
    inline def signTransaction(params: CommonParams & SignTransaction): js.Promise[Success[SignedTransaction] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("signTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[SignedTransaction] | Unsuccessful]]
    
    inline def stellarGetAddress(params: CommonParams & Bundle[StellarGetAddress]): js.Promise[Success[js.Array[StellarAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[StellarAddress]] | Unsuccessful]]
    // Stellar
    inline def stellarGetAddress(params: CommonParams & StellarGetAddress): js.Promise[Success[StellarAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[StellarAddress] | Unsuccessful]]
    
    inline def stellarSignTransaction(params: CommonParams & StellarSignTransaction): js.Promise[Success[StellarSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[StellarSignedTx] | Unsuccessful]]
    
    // // Tezos
    inline def tezosGetAddress(params: CommonParams & TezosGetAddress): js.Promise[Success[TezosAddress] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[TezosAddress] | Unsuccessful]]
    inline def tezosGetAddress(params: CommonParams & Bundle[TezosGetAddress]): js.Promise[Success[js.Array[TezosAddress]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[TezosAddress]] | Unsuccessful]]
    
    inline def tezosGetPublicKey(params: CommonParams & TezosGetPublicKey): js.Promise[Success[TezosPublicKey] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[TezosPublicKey] | Unsuccessful]]
    inline def tezosGetPublicKey(params: CommonParams & Bundle[TezosGetPublicKey]): js.Promise[Success[js.Array[TezosPublicKey]] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[js.Array[TezosPublicKey]] | Unsuccessful]]
    
    inline def tezosSignTransaction(params: CommonParams & TezosSignTransaction): js.Promise[Success[TezosSignedTx] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[TezosSignedTx] | Unsuccessful]]
    
    inline def uiResponse(response: UiResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uiResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to verify a message using the signer address and signature.
      */
    inline def verifyMessage(params: CommonParams & VerifyMessage): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    
    /**
      * Resets device to factory defaults and removes all private data.
      */
    inline def wipeDevice(): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")().asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
    inline def wipeDevice(params: CommonParams): js.Promise[Success[DefaultMessage] | Unsuccessful] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Success[DefaultMessage] | Unsuccessful]]
  }
}
