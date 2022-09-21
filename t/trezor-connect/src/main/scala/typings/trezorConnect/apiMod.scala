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

object apiMod {
  
  object TrezorConnect {
    
    @JSImport("trezor-connect/lib/typescript/api", "TrezorConnect")
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
}
