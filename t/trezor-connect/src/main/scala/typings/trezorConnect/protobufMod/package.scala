package typings.trezorConnect.protobufMod

import typings.std.Exclude
import typings.trezorConnect.trezorConnectStrings.EXTERNAL
import typings.trezorConnect.trezorConnectStrings.PAYTOOPRETURN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BackupDevice = js.Object

type BackupType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_BackupType * / any */ String

type BinanceTxRequest = js.Object

type ButtonAck = js.Object

type ButtonRequestType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_ButtonRequestType * / any */ String

type Cancel = js.Object

type CancelAuthorization = js.Object

type Capability = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_Capability * / any */ String

type CardanoSignTxFinished = js.Object

type CardanoSignedTxChunkAck = js.Object

type CardanoTxHostAck = js.Object

type CardanoTxItemAck = js.Object

type ChangeOutputScriptType = Exclude[OutputScriptType, PAYTOOPRETURN]

type DeprecatedPassphraseStateAck = js.Object

type DoPreauthorized = js.Object

type EndSession = js.Object

type EntropyRequest = js.Object

type GetFeatures = js.Object

type GetNextU2FCounter = js.Object

type GetNonce = js.Object

type InputScriptType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_InputScriptType * / any */ String

type InternalInputScriptType = Exclude[InputScriptType, EXTERNAL]

type LockDevice = js.Object

type OutputScriptType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_OutputScriptType * / any */ String

type PinMatrixRequestType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_PinMatrixRequestType * / any */ String

type PreauthorizedRequest = js.Object

type RebootToBootloader = js.Object

type RequestType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_RequestType * / any */ String

type SafetyCheckLevel = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_SafetyCheckLevel * / any */ String

type StellarTxOpRequest = js.Object

type TxInput = TxInputType

type TxOutput = TxOutputType

type UintType = String | Double

type WipeDevice = js.Object

type WordRequestType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Enum_WordRequestType * / any */ String
