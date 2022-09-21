package typings.trezorConnect

import typings.trezorConnect.accountMod.AccountInfo
import typings.trezorConnect.accountMod.ComposeParams
import typings.trezorConnect.accountMod.GetAccountInfo
import typings.trezorConnect.accountMod.PrecomposeParams
import typings.trezorConnect.accountMod.PrecomposedTransaction
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
import typings.trezorConnect.binanceMod.BinanceAddress
import typings.trezorConnect.binanceMod.BinanceGetAddress
import typings.trezorConnect.binanceMod.BinanceGetPublicKey
import typings.trezorConnect.binanceMod.BinancePublicKey
import typings.trezorConnect.binanceMod.BinanceSignTransaction
import typings.trezorConnect.bitcoinMod.Address
import typings.trezorConnect.bitcoinMod.GetAddress
import typings.trezorConnect.bitcoinMod.GetPublicKey
import typings.trezorConnect.bitcoinMod.HDNodeResponse
import typings.trezorConnect.bitcoinMod.PushTransaction
import typings.trezorConnect.bitcoinMod.PushedTransaction
import typings.trezorConnect.bitcoinMod.SignMessage
import typings.trezorConnect.bitcoinMod.SignTransaction
import typings.trezorConnect.bitcoinMod.SignedTransaction
import typings.trezorConnect.bitcoinMod.VerifyMessage
import typings.trezorConnect.blockchainMod.BlockchainAccountBalanceHistory
import typings.trezorConnect.blockchainMod.BlockchainDisconnect
import typings.trezorConnect.blockchainMod.BlockchainDisconnected
import typings.trezorConnect.blockchainMod.BlockchainEstimateFee
import typings.trezorConnect.blockchainMod.BlockchainEstimatedFee
import typings.trezorConnect.blockchainMod.BlockchainEvent
import typings.trezorConnect.blockchainMod.BlockchainFiatRatesForTimestamps
import typings.trezorConnect.blockchainMod.BlockchainGetAccountBalanceHistory
import typings.trezorConnect.blockchainMod.BlockchainGetCurrentFiatRates
import typings.trezorConnect.blockchainMod.BlockchainGetFiatRatesForTimestamps
import typings.trezorConnect.blockchainMod.BlockchainGetTransactions
import typings.trezorConnect.blockchainMod.BlockchainSetCustomBackend
import typings.trezorConnect.blockchainMod.BlockchainSubscribe
import typings.trezorConnect.blockchainMod.BlockchainSubscribeFiatRates
import typings.trezorConnect.blockchainMod.BlockchainSubscribed
import typings.trezorConnect.blockchainMod.BlockchainTimestampedFiatRates
import typings.trezorConnect.blockchainMod.BlockchainTransactions
import typings.trezorConnect.cardanoMod.CardanoAddress
import typings.trezorConnect.cardanoMod.CardanoGetAddress
import typings.trezorConnect.cardanoMod.CardanoGetNativeScriptHash
import typings.trezorConnect.cardanoMod.CardanoGetPublicKey
import typings.trezorConnect.cardanoMod.CardanoNativeScriptHash
import typings.trezorConnect.cardanoMod.CardanoPublicKey
import typings.trezorConnect.cardanoMod.CardanoSignTransaction
import typings.trezorConnect.cardanoMod.CardanoSignedTxData
import typings.trezorConnect.coinInfoMod.CoinInfo
import typings.trezorConnect.coinInfoMod.GetCoinInfo
import typings.trezorConnect.deviceMod.Device
import typings.trezorConnect.deviceMod.DeviceStateResponse
import typings.trezorConnect.eosMod.EosGetPublicKey
import typings.trezorConnect.eosMod.EosPublicKey
import typings.trezorConnect.eosMod.EosSignTransaction
import typings.trezorConnect.ethereumMod.EthereumAddress
import typings.trezorConnect.ethereumMod.EthereumGetAddress
import typings.trezorConnect.ethereumMod.EthereumGetPublicKey
import typings.trezorConnect.ethereumMod.EthereumSignMessage
import typings.trezorConnect.ethereumMod.EthereumSignTransaction
import typings.trezorConnect.ethereumMod.EthereumSignTypedData
import typings.trezorConnect.ethereumMod.EthereumSignTypedDataTypes
import typings.trezorConnect.ethereumMod.EthereumSignTypedHashAndData
import typings.trezorConnect.ethereumMod.EthereumSignedTx
import typings.trezorConnect.ethereumMod.EthereumVerifyMessage
import typings.trezorConnect.eventsMod.ButtonRequestData
import typings.trezorConnect.eventsMod.TransportEvent
import typings.trezorConnect.eventsMod.UiEvent
import typings.trezorConnect.eventsMod.UiResponse
import typings.trezorConnect.managementMod.ApplyFlags
import typings.trezorConnect.managementMod.ChangePin
import typings.trezorConnect.managementMod.FirmwareUpdate
import typings.trezorConnect.managementMod.FirmwareUpdateBinary
import typings.trezorConnect.managementMod.RecoveryDevice
import typings.trezorConnect.managementMod.ResetDevice
import typings.trezorConnect.miscMod.CipherKeyValue
import typings.trezorConnect.miscMod.CipheredValue
import typings.trezorConnect.miscMod.CustomMessage
import typings.trezorConnect.miscMod.Login
import typings.trezorConnect.miscMod.LoginChallenge
import typings.trezorConnect.miscMod.RequestLoginAsync
import typings.trezorConnect.miscMod.SetProxy
import typings.trezorConnect.nemMod.NEMAddress
import typings.trezorConnect.nemMod.NEMGetAddress
import typings.trezorConnect.nemMod.NEMSignTransaction
import typings.trezorConnect.paramsMod.Bundle
import typings.trezorConnect.paramsMod.BundledResponse
import typings.trezorConnect.paramsMod.CommonParams
import typings.trezorConnect.paramsMod.ConnectSettings
import typings.trezorConnect.paramsMod.DefaultMessage
import typings.trezorConnect.paramsMod.Manifest
import typings.trezorConnect.paramsMod.Response
import typings.trezorConnect.protobufMod.ApplySettings
import typings.trezorConnect.protobufMod.BinanceSignedTx
import typings.trezorConnect.protobufMod.EosSignedTx
import typings.trezorConnect.protobufMod.EthereumTypedDataSignature
import typings.trezorConnect.protobufMod.Features
import typings.trezorConnect.protobufMod.MessageSignature
import typings.trezorConnect.protobufMod.NEMSignedTx
import typings.trezorConnect.protobufMod.Success
import typings.trezorConnect.protobufMod.TezosSignedTx
import typings.trezorConnect.rippleMod.RippleAddress
import typings.trezorConnect.rippleMod.RippleGetAddress
import typings.trezorConnect.rippleMod.RippleSignTransaction
import typings.trezorConnect.rippleMod.RippleSignedTx
import typings.trezorConnect.stellarMod.StellarAddress
import typings.trezorConnect.stellarMod.StellarGetAddress
import typings.trezorConnect.stellarMod.StellarSignTransaction
import typings.trezorConnect.stellarMod.StellarSignedTx
import typings.trezorConnect.tezosMod.TezosAddress
import typings.trezorConnect.tezosMod.TezosGetAddress
import typings.trezorConnect.tezosMod.TezosGetPublicKey
import typings.trezorConnect.tezosMod.TezosPublicKey
import typings.trezorConnect.tezosMod.TezosSignTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("trezor-connect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Increment saved flag on device
      */
    inline def applyFlags(params: CommonParams & ApplyFlags): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyFlags")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    /**
      * Applies device setup
      */
    inline def applySettings(params: CommonParams & ApplySettings): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("applySettings")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    /**
      * Asks device to initiate seed backup procedure
      */
    inline def backupDevice(): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("backupDevice")().asInstanceOf[Response[DefaultMessage]]
    inline def backupDevice(params: CommonParams): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("backupDevice")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    // Binance
    inline def binanceGetAddress(params: CommonParams & BinanceGetAddress): Response[BinanceAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BinanceAddress]]
    inline def binanceGetAddress(params: CommonParams & Bundle[BinanceGetAddress]): BundledResponse[BinanceAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[BinanceAddress]]
    
    inline def binanceGetPublicKey(params: CommonParams & BinanceGetPublicKey): Response[BinancePublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BinancePublicKey]]
    inline def binanceGetPublicKey(params: CommonParams & Bundle[BinanceGetPublicKey]): BundledResponse[BinancePublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[BinancePublicKey]]
    
    inline def binanceSignTransaction(params: CommonParams & BinanceSignTransaction): Response[BinanceSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("binanceSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BinanceSignedTx]]
    
    inline def blockchainDisconnect(params: CommonParams & BlockchainDisconnect): Response[BlockchainDisconnected] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainDisconnect")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainDisconnected]]
    
    /**
      * Backend operations
      */
    inline def blockchainEstimateFee(params: CommonParams & BlockchainEstimateFee): Response[BlockchainEstimatedFee] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainEstimateFee")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainEstimatedFee]]
    
    inline def blockchainGetAccountBalanceHistory(params: BlockchainGetAccountBalanceHistory): Response[js.Array[BlockchainAccountBalanceHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetAccountBalanceHistory")(params.asInstanceOf[js.Any]).asInstanceOf[Response[js.Array[BlockchainAccountBalanceHistory]]]
    
    inline def blockchainGetCurrentFiatRates(params: BlockchainGetCurrentFiatRates): Response[BlockchainTimestampedFiatRates] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetCurrentFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainTimestampedFiatRates]]
    
    inline def blockchainGetFiatRatesForTimestamps(params: BlockchainGetFiatRatesForTimestamps): Response[BlockchainFiatRatesForTimestamps] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetFiatRatesForTimestamps")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainFiatRatesForTimestamps]]
    
    inline def blockchainGetTransactions(params: CommonParams & BlockchainGetTransactions): Response[BlockchainTransactions] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainGetTransactions")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainTransactions]]
    
    inline def blockchainSetCustomBackend(params: CommonParams & BlockchainSetCustomBackend): Response[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSetCustomBackend")(params.asInstanceOf[js.Any]).asInstanceOf[Response[Boolean]]
    
    inline def blockchainSubscribe(params: CommonParams & BlockchainSubscribe): Response[BlockchainSubscribed] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSubscribe")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainSubscribed]]
    
    inline def blockchainSubscribeFiatRates(params: BlockchainSubscribeFiatRates): Response[BlockchainSubscribed] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainSubscribeFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainSubscribed]]
    
    inline def blockchainUnsubscribe(params: CommonParams & BlockchainSubscribe): Response[BlockchainSubscribed] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainUnsubscribe")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainSubscribed]]
    
    inline def blockchainUnsubscribeFiatRates(params: BlockchainSubscribeFiatRates): Response[BlockchainSubscribed] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockchainUnsubscribeFiatRates")(params.asInstanceOf[js.Any]).asInstanceOf[Response[BlockchainSubscribed]]
    
    inline def cancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Unit]
    inline def cancel(params: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def cardanoGetAddress(params: CommonParams & Bundle[CardanoGetAddress]): BundledResponse[CardanoAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[CardanoAddress]]
    // Cardano (ADA)
    inline def cardanoGetAddress(params: CommonParams & CardanoGetAddress): Response[CardanoAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[CardanoAddress]]
    
    inline def cardanoGetNativeScriptHash(params: CommonParams & CardanoGetNativeScriptHash): Response[CardanoNativeScriptHash] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetNativeScriptHash")(params.asInstanceOf[js.Any]).asInstanceOf[Response[CardanoNativeScriptHash]]
    
    inline def cardanoGetPublicKey(params: CommonParams & Bundle[CardanoGetPublicKey]): BundledResponse[CardanoPublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[CardanoPublicKey]]
    inline def cardanoGetPublicKey(params: CommonParams & CardanoGetPublicKey): Response[CardanoPublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[Response[CardanoPublicKey]]
    
    inline def cardanoSignTransaction(params: CommonParams & CardanoSignTransaction): Response[CardanoSignedTxData] = ^.asInstanceOf[js.Dynamic].applyDynamic("cardanoSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[CardanoSignedTxData]]
    
    /**
      * Change pin
      */
    inline def changePin(params: CommonParams & ChangePin): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("changePin")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    /**
      * Asks device to encrypt value using the private key derived by given BIP32
      * path and the given key. IV is always computed automatically.
      */
    inline def cipherKeyValue(params: CommonParams & CipherKeyValue): Response[CipheredValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[Response[CipheredValue]]
    inline def cipherKeyValue(params: CommonParams & Bundle[CipherKeyValue]): BundledResponse[CipheredValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherKeyValue")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[CipheredValue]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Requests a payment from the users wallet to a set of given outputs.
      * Internally a BIP-0044 account discovery is performed and user is presented
      * with a list of accounts. After account selection user is presented with
      * list of fee selection. After selecting a fee transaction is signed and
      * returned in hexadecimal format. Change output is added automatically, if
      * needed.
      */
    inline def composeTransaction(params: CommonParams & ComposeParams): Response[SignedTransaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[SignedTransaction]]
    inline def composeTransaction(params: CommonParams & PrecomposeParams): Response[js.Array[PrecomposedTransaction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[js.Array[PrecomposedTransaction]]]
    
    // // Developer mode
    inline def customMessage(params: CommonParams & CustomMessage): Response[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("customMessage")(params.asInstanceOf[js.Any]).asInstanceOf[Response[Any]]
    
    inline def disableWebUSB(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableWebUSB")().asInstanceOf[Unit]
    
    inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
    
    inline def eosGetPublicKey(params: CommonParams & Bundle[EosGetPublicKey]): BundledResponse[EosPublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[EosPublicKey]]
    // EOS
    inline def eosGetPublicKey(params: CommonParams & EosGetPublicKey): Response[EosPublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[Response[EosPublicKey]]
    
    inline def eosSignTransaction(params: CommonParams & EosSignTransaction): Response[EosSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("eosSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[EosSignedTx]]
    
    inline def ethereumGetAddress(params: CommonParams & Bundle[EthereumGetAddress]): BundledResponse[EthereumAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[EthereumAddress]]
    // Ethereum and Ethereum-like
    inline def ethereumGetAddress(params: CommonParams & EthereumGetAddress): Response[EthereumAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[EthereumAddress]]
    
    inline def ethereumGetPublicKey(params: CommonParams & Bundle[EthereumGetPublicKey]): BundledResponse[HDNodeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[HDNodeResponse]]
    inline def ethereumGetPublicKey(params: CommonParams & EthereumGetPublicKey): Response[HDNodeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[Response[HDNodeResponse]]
    
    inline def ethereumSignMessage(params: CommonParams & EthereumSignMessage): Response[MessageSignature] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignMessage")(params.asInstanceOf[js.Any]).asInstanceOf[Response[MessageSignature]]
    
    inline def ethereumSignTransaction(params: CommonParams & Bundle[EthereumSignTransaction]): BundledResponse[EthereumSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[EthereumSignedTx]]
    inline def ethereumSignTransaction(params: CommonParams & EthereumSignTransaction): Response[EthereumSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[EthereumSignedTx]]
    
    /**
      * @param params Passing:
      * - {@link Ethereum.EthereumSignTypedData} is required for Trezor T
      * - {@link Ethereum.EthereumSignTypedHash} is required for Trezor 1 compatability
      */
    inline def ethereumSignTypedData[T /* <: EthereumSignTypedDataTypes */](params: EthereumSignTypedData[T] & CommonParams): Response[EthereumTypedDataSignature] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTypedData")(params.asInstanceOf[js.Any]).asInstanceOf[Response[EthereumTypedDataSignature]]
    inline def ethereumSignTypedData[T /* <: EthereumSignTypedDataTypes */](params: EthereumSignTypedHashAndData[T] & CommonParams): Response[EthereumTypedDataSignature] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumSignTypedData")(params.asInstanceOf[js.Any]).asInstanceOf[Response[EthereumTypedDataSignature]]
    
    inline def ethereumVerifyMessage(params: CommonParams & EthereumVerifyMessage): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("ethereumVerifyMessage")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    /**
      * Sends FirmwareErase message followed by FirmwareUpdate message
      */
    inline def firmwareUpdate(params: CommonParams & FirmwareUpdate): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("firmwareUpdate")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    inline def firmwareUpdate(params: CommonParams & FirmwareUpdateBinary): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("firmwareUpdate")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    /**
      * Bitcoin, Bitcoin-like, Ethereum-like, Ripple
      * Gets an info of specified account.
      */
    inline def getAccountInfo(params: CommonParams & GetAccountInfo): Response[AccountInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(params.asInstanceOf[js.Any]).asInstanceOf[Response[AccountInfo]]
    inline def getAccountInfo(params: CommonParams & Bundle[GetAccountInfo]): BundledResponse[AccountInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[AccountInfo]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Display requested address derived by given BIP32 path on device and
      * returns it to caller. User is asked to confirm the export on Trezor.
      */
    inline def getAddress(params: CommonParams & GetAddress): Response[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[Address]]
    inline def getAddress(params: CommonParams & Bundle[GetAddress]): BundledResponse[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[Address]]
    
    /**
      * Get static coin info
      */
    inline def getCoinInfo(params: GetCoinInfo): Response[CoinInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoinInfo")(params.asInstanceOf[js.Any]).asInstanceOf[Response[CoinInfo]]
    
    /**
      * Retrieves device state associated with passphrase.
      */
    inline def getDeviceState(): Response[DeviceStateResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceState")().asInstanceOf[Response[DeviceStateResponse]]
    inline def getDeviceState(params: CommonParams): Response[DeviceStateResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceState")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DeviceStateResponse]]
    
    /**
      * Retrieves the set of features associated with the device.
      */
    inline def getFeatures(): Response[Features] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")().asInstanceOf[Response[Features]]
    inline def getFeatures(params: CommonParams): Response[Features] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeatures")(params.asInstanceOf[js.Any]).asInstanceOf[Response[Features]]
    
    inline def getPublicKey(params: CommonParams & Bundle[GetPublicKey]): BundledResponse[HDNodeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[HDNodeResponse]]
    /**
      * Bitcoin and Bitcoin-like
      * Retrieves BIP32 extended public derived by given BIP32 path.
      * User is presented with a description of the requested key and asked to
      * confirm the export.
      */
    inline def getPublicKey(params: CommonParams & GetPublicKey): Response[HDNodeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[Response[HDNodeResponse]]
    
    /**
      * Retrieves the settings that TrezorConnect was initialized with.
      */
    inline def getSettings(): Response[ConnectSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[Response[ConnectSettings]]
    
    /**
      * Initializes TrezorConnect.
      * `manifest` is required
      */
    inline def init(settings: manifestManifestPartialCo): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Set TrezorConnect manifest.
      */
    inline def manifest(params: Manifest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def nemGetAddress(params: CommonParams & Bundle[NEMGetAddress]): BundledResponse[NEMAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[NEMAddress]]
    // NEM
    inline def nemGetAddress(params: CommonParams & NEMGetAddress): Response[NEMAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[NEMAddress]]
    
    inline def nemSignTransaction(params: CommonParams & NEMSignTransaction): Response[NEMSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("nemSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[NEMSignedTx]]
    
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
    inline def pushTransaction(params: CommonParams & PushTransaction): Response[PushedTransaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[PushedTransaction]]
    
    /**
      * Reboots device (currently only T1 with fw >= 1.10.0) in bootloader mode
      */
    inline def rebootToBootloader(): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("rebootToBootloader")().asInstanceOf[Response[DefaultMessage]]
    inline def rebootToBootloader(params: CommonParams): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("rebootToBootloader")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    /**
      * Ask device to initiate recovery procedure
      */
    inline def recoveryDevice(params: CommonParams & RecoveryDevice): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("recoveryDevice")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    inline def removeAllListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Unit]
    
    inline def renderWebUSBButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderWebUSBButton")().asInstanceOf[Unit]
    
    inline def requestLogin(params: LoginChallenge & CommonParams): Response[Login] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogin")(params.asInstanceOf[js.Any]).asInstanceOf[Response[Login]]
    /**
      * Challenge-response authentication via Trezor.
      * To protect against replay attacks you should use a server-side generated
      * and randomized challengeHidden for every attempt. You can also provide a
      * visual challenge that will be shown on the device.
      */
    inline def requestLogin(params: RequestLoginAsync & CommonParams): Response[Login] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLogin")(params.asInstanceOf[js.Any]).asInstanceOf[Response[Login]]
    
    /**
      * Performs device setup and generates a new seed.
      */
    inline def resetDevice(params: CommonParams & ResetDevice): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDevice")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    // Ripple
    inline def rippleGetAddress(params: CommonParams & RippleGetAddress): Response[RippleAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[RippleAddress]]
    inline def rippleGetAddress(params: CommonParams & Bundle[RippleGetAddress]): BundledResponse[RippleAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[RippleAddress]]
    
    inline def rippleSignTransaction(params: CommonParams & RippleSignTransaction): Response[RippleSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("rippleSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[RippleSignedTx]]
    
    /**
      * Set tor proxy for @trezor/blockchain-link connections
      */
    inline def setProxy(params: SetProxy): Response[Success] = ^.asInstanceOf[js.Dynamic].applyDynamic("setProxy")(params.asInstanceOf[js.Any]).asInstanceOf[Response[Success]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to sign a message using the private key derived by given BIP32
      * path.
      */
    inline def signMessage(params: CommonParams & SignMessage): Response[MessageSignature] = ^.asInstanceOf[js.Dynamic].applyDynamic("signMessage")(params.asInstanceOf[js.Any]).asInstanceOf[Response[MessageSignature]]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to sign given inputs and outputs of pre-composed transaction.
      * User is asked to confirm all transaction details on Trezor.
      */
    inline def signTransaction(params: CommonParams & SignTransaction): Response[SignedTransaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("signTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[SignedTransaction]]
    
    // Stellar
    inline def stellarGetAddress(params: CommonParams & StellarGetAddress): Response[StellarAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[StellarAddress]]
    inline def stellarGetAddress(params: CommonParams & Bundle[StellarGetAddress]): BundledResponse[StellarAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[StellarAddress]]
    
    inline def stellarSignTransaction(params: CommonParams & StellarSignTransaction): Response[StellarSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("stellarSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[StellarSignedTx]]
    
    // // Tezos
    inline def tezosGetAddress(params: CommonParams & TezosGetAddress): Response[TezosAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[Response[TezosAddress]]
    inline def tezosGetAddress(params: CommonParams & Bundle[TezosGetAddress]): BundledResponse[TezosAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetAddress")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[TezosAddress]]
    
    inline def tezosGetPublicKey(params: CommonParams & TezosGetPublicKey): Response[TezosPublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[Response[TezosPublicKey]]
    inline def tezosGetPublicKey(params: CommonParams & Bundle[TezosGetPublicKey]): BundledResponse[TezosPublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosGetPublicKey")(params.asInstanceOf[js.Any]).asInstanceOf[BundledResponse[TezosPublicKey]]
    
    inline def tezosSignTransaction(params: CommonParams & TezosSignTransaction): Response[TezosSignedTx] = ^.asInstanceOf[js.Dynamic].applyDynamic("tezosSignTransaction")(params.asInstanceOf[js.Any]).asInstanceOf[Response[TezosSignedTx]]
    
    inline def uiResponse(response: UiResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uiResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Bitcoin and Bitcoin-like
      * Asks device to verify a message using the signer address and signature.
      */
    inline def verifyMessage(params: CommonParams & VerifyMessage): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
    
    /**
      * Resets device to factory defaults and removes all private data.
      */
    inline def wipeDevice(): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")().asInstanceOf[Response[DefaultMessage]]
    inline def wipeDevice(params: CommonParams): Response[DefaultMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("wipeDevice")(params.asInstanceOf[js.Any]).asInstanceOf[Response[DefaultMessage]]
  }
  
  object BLOCKCHAIN {
    
    @JSImport("trezor-connect", "BLOCKCHAIN.BLOCK")
    @js.native
    val BLOCK: /* "blockchain-block" */ String = js.native
    
    @JSImport("trezor-connect", "BLOCKCHAIN.CONNECT")
    @js.native
    val CONNECT: /* "blockchain-connect" */ String = js.native
    
    @JSImport("trezor-connect", "BLOCKCHAIN.ERROR")
    @js.native
    val ERROR: /* "blockchain-error" */ String = js.native
    
    @JSImport("trezor-connect", "BLOCKCHAIN.FIAT_RATES_UPDATE")
    @js.native
    val FIAT_RATES_UPDATE: /* "fiat-rates-update" */ String = js.native
    
    @JSImport("trezor-connect", "BLOCKCHAIN.NOTIFICATION")
    @js.native
    val NOTIFICATION: /* "blockchain-notification" */ String = js.native
  }
  
  @JSImport("trezor-connect", "BLOCKCHAIN_EVENT")
  @js.native
  val BLOCKCHAIN_EVENT: /* "BLOCKCHAIN_EVENT" */ String = js.native
  
  object CARDANO {
    
    @JSImport("trezor-connect", "CARDANO.ADDRESS_TYPE")
    @js.native
    object ADDRESS_TYPE extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.trezorConnect.constantsMod.CARDANO.ADDRESS_TYPE & Double] = js.native
      
      /* 0 */ val Base: typings.trezorConnect.constantsMod.CARDANO.ADDRESS_TYPE.Base & Double = js.native
      
      /* 8 */ val Byron: typings.trezorConnect.constantsMod.CARDANO.ADDRESS_TYPE.Byron & Double = js.native
      
      /* 6 */ val Enterprise: typings.trezorConnect.constantsMod.CARDANO.ADDRESS_TYPE.Enterprise & Double = js.native
      
      /* 4 */ val Pointer: typings.trezorConnect.constantsMod.CARDANO.ADDRESS_TYPE.Pointer & Double = js.native
      
      /* 14 */ val Reward: typings.trezorConnect.constantsMod.CARDANO.ADDRESS_TYPE.Reward & Double = js.native
    }
    
    @JSImport("trezor-connect", "CARDANO.CERTIFICATE_TYPE")
    @js.native
    object CERTIFICATE_TYPE extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.trezorConnect.constantsMod.CARDANO.CERTIFICATE_TYPE & Double] = js.native
      
      /* 2 */ val StakeDelegation: typings.trezorConnect.constantsMod.CARDANO.CERTIFICATE_TYPE.StakeDelegation & Double = js.native
      
      /* 1 */ val StakeDeregistration: typings.trezorConnect.constantsMod.CARDANO.CERTIFICATE_TYPE.StakeDeregistration & Double = js.native
      
      /* 3 */ val StakePoolRegistration: typings.trezorConnect.constantsMod.CARDANO.CERTIFICATE_TYPE.StakePoolRegistration & Double = js.native
      
      /* 0 */ val StakeRegistration: typings.trezorConnect.constantsMod.CARDANO.CERTIFICATE_TYPE.StakeRegistration & Double = js.native
    }
    
    @JSImport("trezor-connect", "CARDANO.NETWORK_IDS")
    @js.native
    object NETWORK_IDS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.trezorConnect.constantsMod.CARDANO.NETWORK_IDS & Double] = js.native
      
      /* 1 */ val mainnet: typings.trezorConnect.constantsMod.CARDANO.NETWORK_IDS.mainnet & Double = js.native
      
      /* 0 */ val testnet: typings.trezorConnect.constantsMod.CARDANO.NETWORK_IDS.testnet & Double = js.native
    }
    
    @JSImport("trezor-connect", "CARDANO.PROTOCOL_MAGICS")
    @js.native
    object PROTOCOL_MAGICS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.trezorConnect.constantsMod.CARDANO.PROTOCOL_MAGICS & Double] = js.native
      
      /* 764824073 */ val mainnet: typings.trezorConnect.constantsMod.CARDANO.PROTOCOL_MAGICS.mainnet & Double = js.native
      
      /* 1097911063 */ val testnet: typings.trezorConnect.constantsMod.CARDANO.PROTOCOL_MAGICS.testnet & Double = js.native
    }
  }
  
  @JSImport("trezor-connect", "CORE_EVENT")
  @js.native
  val CORE_EVENT: /* "CORE_EVENT" */ String = js.native
  
  @JSImport("trezor-connect", "CardanoAddressType")
  @js.native
  object CardanoAddressType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.trezorConnect.protobufMod.CardanoAddressType & Double] = js.native
    
    /* 0 */ val BASE: typings.trezorConnect.protobufMod.CardanoAddressType.BASE & Double = js.native
    
    /* 2 */ val BASE_KEY_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.BASE_KEY_SCRIPT & Double = js.native
    
    /* 1 */ val BASE_SCRIPT_KEY: typings.trezorConnect.protobufMod.CardanoAddressType.BASE_SCRIPT_KEY & Double = js.native
    
    /* 3 */ val BASE_SCRIPT_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.BASE_SCRIPT_SCRIPT & Double = js.native
    
    /* 8 */ val BYRON: typings.trezorConnect.protobufMod.CardanoAddressType.BYRON & Double = js.native
    
    /* 6 */ val ENTERPRISE: typings.trezorConnect.protobufMod.CardanoAddressType.ENTERPRISE & Double = js.native
    
    /* 7 */ val ENTERPRISE_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.ENTERPRISE_SCRIPT & Double = js.native
    
    /* 4 */ val POINTER: typings.trezorConnect.protobufMod.CardanoAddressType.POINTER & Double = js.native
    
    /* 5 */ val POINTER_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.POINTER_SCRIPT & Double = js.native
    
    /* 14 */ val REWARD: typings.trezorConnect.protobufMod.CardanoAddressType.REWARD & Double = js.native
    
    /* 15 */ val REWARD_SCRIPT: typings.trezorConnect.protobufMod.CardanoAddressType.REWARD_SCRIPT & Double = js.native
  }
  
  @JSImport("trezor-connect", "CardanoCertificateType")
  @js.native
  object CardanoCertificateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.trezorConnect.protobufMod.CardanoCertificateType & Double] = js.native
    
    /* 2 */ val STAKE_DELEGATION: typings.trezorConnect.protobufMod.CardanoCertificateType.STAKE_DELEGATION & Double = js.native
    
    /* 1 */ val STAKE_DEREGISTRATION: typings.trezorConnect.protobufMod.CardanoCertificateType.STAKE_DEREGISTRATION & Double = js.native
    
    /* 3 */ val STAKE_POOL_REGISTRATION: typings.trezorConnect.protobufMod.CardanoCertificateType.STAKE_POOL_REGISTRATION & Double = js.native
    
    /* 0 */ val STAKE_REGISTRATION: typings.trezorConnect.protobufMod.CardanoCertificateType.STAKE_REGISTRATION & Double = js.native
  }
  
  @JSImport("trezor-connect", "CardanoNativeScriptHashDisplayFormat")
  @js.native
  object CardanoNativeScriptHashDisplayFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.trezorConnect.protobufMod.CardanoNativeScriptHashDisplayFormat & Double] = js.native
    
    /* 1 */ val BECH32: typings.trezorConnect.protobufMod.CardanoNativeScriptHashDisplayFormat.BECH32 & Double = js.native
    
    /* 0 */ val HIDE: typings.trezorConnect.protobufMod.CardanoNativeScriptHashDisplayFormat.HIDE & Double = js.native
    
    /* 2 */ val POLICY_ID: typings.trezorConnect.protobufMod.CardanoNativeScriptHashDisplayFormat.POLICY_ID & Double = js.native
  }
  
  @JSImport("trezor-connect", "CardanoNativeScriptType")
  @js.native
  object CardanoNativeScriptType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.trezorConnect.protobufMod.CardanoNativeScriptType & Double] = js.native
    
    /* 1 */ val ALL: typings.trezorConnect.protobufMod.CardanoNativeScriptType.ALL & Double = js.native
    
    /* 2 */ val ANY: typings.trezorConnect.protobufMod.CardanoNativeScriptType.ANY & Double = js.native
    
    /* 4 */ val INVALID_BEFORE: typings.trezorConnect.protobufMod.CardanoNativeScriptType.INVALID_BEFORE & Double = js.native
    
    /* 5 */ val INVALID_HEREAFTER: typings.trezorConnect.protobufMod.CardanoNativeScriptType.INVALID_HEREAFTER & Double = js.native
    
    /* 3 */ val N_OF_K: typings.trezorConnect.protobufMod.CardanoNativeScriptType.N_OF_K & Double = js.native
    
    /* 0 */ val PUB_KEY: typings.trezorConnect.protobufMod.CardanoNativeScriptType.PUB_KEY & Double = js.native
  }
  
  @JSImport("trezor-connect", "CardanoPoolRelayType")
  @js.native
  object CardanoPoolRelayType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.trezorConnect.protobufMod.CardanoPoolRelayType & Double] = js.native
    
    /* 2 */ val MULTIPLE_HOST_NAME: typings.trezorConnect.protobufMod.CardanoPoolRelayType.MULTIPLE_HOST_NAME & Double = js.native
    
    /* 0 */ val SINGLE_HOST_IP: typings.trezorConnect.protobufMod.CardanoPoolRelayType.SINGLE_HOST_IP & Double = js.native
    
    /* 1 */ val SINGLE_HOST_NAME: typings.trezorConnect.protobufMod.CardanoPoolRelayType.SINGLE_HOST_NAME & Double = js.native
  }
  
  @JSImport("trezor-connect", "CardanoTxSigningMode")
  @js.native
  object CardanoTxSigningMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.trezorConnect.protobufMod.CardanoTxSigningMode & Double] = js.native
    
    /* 2 */ val MULTISIG_TRANSACTION: typings.trezorConnect.protobufMod.CardanoTxSigningMode.MULTISIG_TRANSACTION & Double = js.native
    
    /* 0 */ val ORDINARY_TRANSACTION: typings.trezorConnect.protobufMod.CardanoTxSigningMode.ORDINARY_TRANSACTION & Double = js.native
    
    /* 3 */ val PLUTUS_TRANSACTION: typings.trezorConnect.protobufMod.CardanoTxSigningMode.PLUTUS_TRANSACTION & Double = js.native
    
    /* 1 */ val POOL_REGISTRATION_AS_OWNER: typings.trezorConnect.protobufMod.CardanoTxSigningMode.POOL_REGISTRATION_AS_OWNER & Double = js.native
  }
  
  @JSImport("trezor-connect", "CardanoTxWitnessType")
  @js.native
  object CardanoTxWitnessType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.trezorConnect.protobufMod.CardanoTxWitnessType & Double] = js.native
    
    /* 0 */ val BYRON_WITNESS: typings.trezorConnect.protobufMod.CardanoTxWitnessType.BYRON_WITNESS & Double = js.native
    
    /* 1 */ val SHELLEY_WITNESS: typings.trezorConnect.protobufMod.CardanoTxWitnessType.SHELLEY_WITNESS & Double = js.native
  }
  
  object DEVICE {
    
    @JSImport("trezor-connect", "DEVICE.ACQUIRE")
    @js.native
    val ACQUIRE: /* "device-acquire" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.ACQUIRED")
    @js.native
    val ACQUIRED: /* "device-acquired" */ String = js.native
    
    // trezor-link events in protobuf format
    @JSImport("trezor-connect", "DEVICE.BUTTON")
    @js.native
    val BUTTON: /* "button" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.CHANGED")
    @js.native
    val CHANGED: /* "device-changed" */ String = js.native
    
    // device list events
    @JSImport("trezor-connect", "DEVICE.CONNECT")
    @js.native
    val CONNECT: /* "device-connect" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.CONNECT_UNACQUIRED")
    @js.native
    val CONNECT_UNACQUIRED: /* "device-connect_unacquired" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.DISCONNECT")
    @js.native
    val DISCONNECT: /* "device-disconnect" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.LOADING")
    @js.native
    val LOADING: /* "device-loading" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.PASSPHRASE")
    @js.native
    val PASSPHRASE: /* "passphrase" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.PASSPHRASE_ON_DEVICE")
    @js.native
    val PASSPHRASE_ON_DEVICE: /* "passphrase_on_device" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.PIN")
    @js.native
    val PIN: /* "pin" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.RELEASE")
    @js.native
    val RELEASE: /* "device-release" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.RELEASED")
    @js.native
    val RELEASED: /* "device-released" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.USED_ELSEWHERE")
    @js.native
    val USED_ELSEWHERE: /* "device-used_elsewhere" */ String = js.native
    
    // custom
    @JSImport("trezor-connect", "DEVICE.WAIT_FOR_SELECTION")
    @js.native
    val WAIT_FOR_SELECTION: /* "device-wait_for_selection" */ String = js.native
    
    @JSImport("trezor-connect", "DEVICE.WORD")
    @js.native
    val WORD: /* "word" */ String = js.native
  }
  
  @JSImport("trezor-connect", "DEVICE_EVENT")
  @js.native
  val DEVICE_EVENT: /* "DEVICE_EVENT" */ String = js.native
  
  object IFRAME {
    
    @JSImport("trezor-connect", "IFRAME.BOOTSTRAP")
    @js.native
    val BOOTSTRAP: /* "iframe-bootstrap" */ String = js.native
    
    @JSImport("trezor-connect", "IFRAME.CALL")
    @js.native
    val CALL: /* "iframe-call" */ String = js.native
    
    @JSImport("trezor-connect", "IFRAME.ERROR")
    @js.native
    val ERROR: /* "iframe-error" */ String = js.native
    
    @JSImport("trezor-connect", "IFRAME.INIT")
    @js.native
    val INIT: /* "iframe-init" */ String = js.native
    
    @JSImport("trezor-connect", "IFRAME.LOADED")
    @js.native
    val LOADED: /* "iframe-loaded" */ String = js.native
  }
  
  object POPUP {
    
    // Message called from popup.html inline script before "window.onload" event. This is first message from popup to window.opener.
    @JSImport("trezor-connect", "POPUP.BOOTSTRAP")
    @js.native
    val BOOTSTRAP: /* "popup-bootstrap" */ String = js.native
    
    // Message called from iframe to popup, it means that popup will not be needed (example: Blockchain methods are not using popup at all)
    // This will close active popup window and/or clear opening process in PopupManager (maybe popup wasn't opened yet)
    @JSImport("trezor-connect", "POPUP.CANCEL_POPUP_REQUEST")
    @js.native
    val CANCEL_POPUP_REQUEST: /* "ui-cancel-popup-request" */ String = js.native
    
    // Event emitted from PopupManager at the end of popup closing process.
    // Sent from popup thru window.opener to an iframe because message channel between popup and iframe is no longer available
    @JSImport("trezor-connect", "POPUP.CLOSED")
    @js.native
    val CLOSED: /* "popup-closed" */ String = js.native
    
    // Message called from inline element in popup.html (window.closeWindow), this is used only with webextensions to properly handle popup close event
    @JSImport("trezor-connect", "POPUP.CLOSE_WINDOW")
    @js.native
    val CLOSE_WINDOW: /* "window.close" */ String = js.native
    
    // Error message from popup to window.opener. Could be thrown during popup initialization process (POPUP.INIT)
    @JSImport("trezor-connect", "POPUP.ERROR")
    @js.native
    val ERROR: /* "popup-error" */ String = js.native
    
    // Message to webextensions, opens "trezor-usb-permission.html" within webextension
    @JSImport("trezor-connect", "POPUP.EXTENSION_USB_PERMISSIONS")
    @js.native
    val EXTENSION_USB_PERMISSIONS: /* "open-usb-permissions" */ String = js.native
    
    // Message called from both [popup > iframe] then [iframe > popup] in this exact order.
    // Firstly popup call iframe to resolve popup promise in Core
    // Then iframe reacts to POPUP.HANDSHAKE message and sends ConnectSettings, transport information and requested method details back to popup
    @JSImport("trezor-connect", "POPUP.HANDSHAKE")
    @js.native
    val HANDSHAKE: /* "popup-handshake" */ String = js.native
    
    // Message from window.opener to popup.js. Send settings to popup. This is first message from window.opener to popup.
    @JSImport("trezor-connect", "POPUP.INIT")
    @js.native
    val INIT: /* "popup-init" */ String = js.native
    
    // Message from popup.js to window.opener, called after "window.onload" event. This is second message from popup to window.opener.
    @JSImport("trezor-connect", "POPUP.LOADED")
    @js.native
    val LOADED: /* "popup-loaded" */ String = js.native
  }
  
  @JSImport("trezor-connect", "RESPONSE_EVENT")
  @js.native
  val RESPONSE_EVENT: /* "RESPONSE_EVENT" */ String = js.native
  
  object TRANSPORT {
    
    @JSImport("trezor-connect", "TRANSPORT.DISABLE_WEBUSB")
    @js.native
    val DISABLE_WEBUSB: /* "transport-disable_webusb" */ String = js.native
    
    @JSImport("trezor-connect", "TRANSPORT.ERROR")
    @js.native
    val ERROR: /* "transport-error" */ String = js.native
    
    @JSImport("trezor-connect", "TRANSPORT.RECONNECT")
    @js.native
    val RECONNECT: /* "transport-reconnect" */ String = js.native
    
    @JSImport("trezor-connect", "TRANSPORT.REQUEST")
    @js.native
    val REQUEST: /* "transport-request_device" */ String = js.native
    
    @JSImport("trezor-connect", "TRANSPORT.START")
    @js.native
    val START: /* "transport-start" */ String = js.native
    
    @JSImport("trezor-connect", "TRANSPORT.START_PENDING")
    @js.native
    val START_PENDING: /* "transport-start_pending" */ String = js.native
    
    @JSImport("trezor-connect", "TRANSPORT.STREAM")
    @js.native
    val STREAM: /* "transport-stream" */ String = js.native
    
    @JSImport("trezor-connect", "TRANSPORT.UPDATE")
    @js.native
    val UPDATE: /* "transport-update" */ String = js.native
  }
  
  @JSImport("trezor-connect", "TRANSPORT_EVENT")
  @js.native
  val TRANSPORT_EVENT: /* "TRANSPORT_EVENT" */ String = js.native
  
  object UI {
    
    @JSImport("trezor-connect", "UI.ADDRESS_VALIDATION")
    @js.native
    val ADDRESS_VALIDATION: /* "ui-address_validation" */ String = js.native
    
    @JSImport("trezor-connect", "UI.BOOTLOADER")
    @js.native
    val BOOTLOADER: /* "ui-device_bootloader_mode" */ String = js.native
    
    @JSImport("trezor-connect", "UI.BUNDLE_PROGRESS")
    @js.native
    val BUNDLE_PROGRESS: /* "ui-bundle_progress" */ String = js.native
    
    @JSImport("trezor-connect", "UI.CHANGE_ACCOUNT")
    @js.native
    val CHANGE_ACCOUNT: /* "ui-change_account" */ String = js.native
    
    @JSImport("trezor-connect", "UI.CHANGE_SETTINGS")
    @js.native
    val CHANGE_SETTINGS: /* "ui-change_settings" */ String = js.native
    
    @JSImport("trezor-connect", "UI.CLOSE_UI_WINDOW")
    @js.native
    val CLOSE_UI_WINDOW: /* "ui-close_window" */ String = js.native
    
    @JSImport("trezor-connect", "UI.CONNECT")
    @js.native
    val CONNECT: /* "ui-connect" */ String = js.native
    
    @JSImport("trezor-connect", "UI.CUSTOM_MESSAGE_REQUEST")
    @js.native
    val CUSTOM_MESSAGE_REQUEST: /* "ui-custom_request" */ String = js.native
    
    @JSImport("trezor-connect", "UI.CUSTOM_MESSAGE_RESPONSE")
    @js.native
    val CUSTOM_MESSAGE_RESPONSE: /* "ui-custom_response" */ String = js.native
    
    @JSImport("trezor-connect", "UI.DEVICE_NEEDS_BACKUP")
    @js.native
    val DEVICE_NEEDS_BACKUP: /* "ui-device_needs_backup" */ String = js.native
    
    @JSImport("trezor-connect", "UI.FIRMWARE_NOT_COMPATIBLE")
    @js.native
    val FIRMWARE_NOT_COMPATIBLE: /* "ui-device_firmware_not_compatible" */ String = js.native
    
    @JSImport("trezor-connect", "UI.FIRMWARE_NOT_INSTALLED")
    @js.native
    val FIRMWARE_NOT_INSTALLED: /* "ui-device_firmware_not_installed" */ String = js.native
    
    @JSImport("trezor-connect", "UI.FIRMWARE_NOT_SUPPORTED")
    @js.native
    val FIRMWARE_NOT_SUPPORTED: /* "ui-device_firmware_unsupported" */ String = js.native
    
    @JSImport("trezor-connect", "UI.FIRMWARE_OLD")
    @js.native
    val FIRMWARE_OLD: /* "ui-device_firmware_old" */ String = js.native
    
    @JSImport("trezor-connect", "UI.FIRMWARE_OUTDATED")
    @js.native
    val FIRMWARE_OUTDATED: /* "ui-device_firmware_outdated" */ String = js.native
    
    @JSImport("trezor-connect", "UI.FIRMWARE_PROGRESS")
    @js.native
    val FIRMWARE_PROGRESS: /* "ui-firmware-progress" */ String = js.native
    
    @JSImport("trezor-connect", "UI.INITIALIZE")
    @js.native
    val INITIALIZE: /* "ui-device_not_initialized" */ String = js.native
    
    @JSImport("trezor-connect", "UI.INSUFFICIENT_FUNDS")
    @js.native
    val INSUFFICIENT_FUNDS: /* "ui-insufficient_funds" */ String = js.native
    
    @JSImport("trezor-connect", "UI.INVALID_PASSPHRASE")
    @js.native
    val INVALID_PASSPHRASE: /* "ui-invalid_passphrase" */ String = js.native
    
    @JSImport("trezor-connect", "UI.INVALID_PASSPHRASE_ACTION")
    @js.native
    val INVALID_PASSPHRASE_ACTION: /* "ui-invalid_passphrase_action" */ String = js.native
    
    @JSImport("trezor-connect", "UI.INVALID_PIN")
    @js.native
    val INVALID_PIN: /* "ui-invalid_pin" */ String = js.native
    
    @JSImport("trezor-connect", "UI.LOADING")
    @js.native
    val LOADING: /* "ui-loading" */ String = js.native
    
    @JSImport("trezor-connect", "UI.LOGIN_CHALLENGE_REQUEST")
    @js.native
    val LOGIN_CHALLENGE_REQUEST: /* "ui-login_challenge_request" */ String = js.native
    
    @JSImport("trezor-connect", "UI.LOGIN_CHALLENGE_RESPONSE")
    @js.native
    val LOGIN_CHALLENGE_RESPONSE: /* "ui-login_challenge_response" */ String = js.native
    
    @JSImport("trezor-connect", "UI.NOT_IN_BOOTLOADER")
    @js.native
    val NOT_IN_BOOTLOADER: /* "ui-device_not_in_bootloader_mode" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_ACCOUNT")
    @js.native
    val RECEIVE_ACCOUNT: /* "ui-receive_account" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_CONFIRMATION")
    @js.native
    val RECEIVE_CONFIRMATION: /* "ui-receive_confirmation" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_DEVICE")
    @js.native
    val RECEIVE_DEVICE: /* "ui-receive_device" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_FEE")
    @js.native
    val RECEIVE_FEE: /* "ui-receive_fee" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_PASSPHRASE")
    @js.native
    val RECEIVE_PASSPHRASE: /* "ui-receive_passphrase" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_PERMISSION")
    @js.native
    val RECEIVE_PERMISSION: /* "ui-receive_permission" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_PIN")
    @js.native
    val RECEIVE_PIN: /* "ui-receive_pin" */ String = js.native
    
    @JSImport("trezor-connect", "UI.RECEIVE_WORD")
    @js.native
    val RECEIVE_WORD: /* "ui-receive_word" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_BUTTON")
    @js.native
    val REQUEST_BUTTON: /* "ui-button" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_CONFIRMATION")
    @js.native
    val REQUEST_CONFIRMATION: /* "ui-request_confirmation" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_PASSPHRASE")
    @js.native
    val REQUEST_PASSPHRASE: /* "ui-request_passphrase" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_PASSPHRASE_ON_DEVICE")
    @js.native
    val REQUEST_PASSPHRASE_ON_DEVICE: /* "ui-request_passphrase_on_device" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_PERMISSION")
    @js.native
    val REQUEST_PERMISSION: /* "ui-request_permission" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_PIN")
    @js.native
    val REQUEST_PIN: /* "ui-request_pin" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_UI_WINDOW")
    @js.native
    val REQUEST_UI_WINDOW: /* "ui-request_window" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUEST_WORD")
    @js.native
    val REQUEST_WORD: /* "ui-request_word" */ String = js.native
    
    @JSImport("trezor-connect", "UI.REQUIRE_MODE")
    @js.native
    val REQUIRE_MODE: /* "ui-device_require_mode" */ String = js.native
    
    @JSImport("trezor-connect", "UI.SEEDLESS")
    @js.native
    val SEEDLESS: /* "ui-device_seedless" */ String = js.native
    
    @JSImport("trezor-connect", "UI.SELECT_ACCOUNT")
    @js.native
    val SELECT_ACCOUNT: /* "ui-select_account" */ String = js.native
    
    @JSImport("trezor-connect", "UI.SELECT_DEVICE")
    @js.native
    val SELECT_DEVICE: /* "ui-select_device" */ String = js.native
    
    @JSImport("trezor-connect", "UI.SELECT_FEE")
    @js.native
    val SELECT_FEE: /* "ui-select_fee" */ String = js.native
    
    @JSImport("trezor-connect", "UI.SET_OPERATION")
    @js.native
    val SET_OPERATION: /* "ui-set_operation" */ String = js.native
    
    // TRANSPORT is also defined as standalone namespace. plugin bug or invalid syntax?
    // eslint-disable-next-line @typescript-eslint/no-shadow
    @JSImport("trezor-connect", "UI.TRANSPORT")
    @js.native
    val TRANSPORT: /* "ui-no_transport" */ String = js.native
    
    @JSImport("trezor-connect", "UI.UPDATE_CUSTOM_FEE")
    @js.native
    val UPDATE_CUSTOM_FEE: /* "ui-update_custom_fee" */ String = js.native
  }
  
  @JSImport("trezor-connect", "UI_EVENT")
  @js.native
  val UI_EVENT: /* "UI_EVENT" */ String = js.native
}
