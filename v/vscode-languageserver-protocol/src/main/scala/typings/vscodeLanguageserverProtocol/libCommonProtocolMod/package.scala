package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`1`
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DocumentSelector = js.Array[String | DocumentFilter]

type InitializeErrorCodes = `1`

type PositionEncodingKind = String

type PrepareSupportDefaultBehavior = `1`

type WatchKind = uinteger

type ApplyWorkspaceEditResponse = ApplyWorkspaceEditResult

type DefinitionOptions = WorkDoneProgressOptions

type DocumentFormattingOptions = WorkDoneProgressOptions

type DocumentHighlightOptions = WorkDoneProgressOptions

type DocumentRangeFormattingOptions = WorkDoneProgressOptions

type ExecuteCommandRegistrationOptions = ExecuteCommandOptions

type GlobPattern = Pattern | RelativePattern

type HoverOptions = WorkDoneProgressOptions

type Pattern = String

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverTypes.mod.Range
  - typings.vscodeLanguageserverProtocol.anon.Placeholder
  - typings.vscodeLanguageserverProtocol.anon.DefaultBehavior
*/
type PrepareRenameResult = _PrepareRenameResult | Range

type ReferenceOptions = WorkDoneProgressOptions

type WorkspaceSymbolRegistrationOptions = WorkspaceSymbolOptions
