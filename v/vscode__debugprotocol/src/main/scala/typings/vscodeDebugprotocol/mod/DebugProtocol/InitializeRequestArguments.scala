package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.path
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `initialize` request. */
trait InitializeRequestArguments extends StObject {
  
  /** The ID of the debug adapter. */
  var adapterID: String
  
  /** The ID of the client using this adapter. */
  var clientID: js.UndefOr[String] = js.undefined
  
  /** The human-readable name of the client using this adapter. */
  var clientName: js.UndefOr[String] = js.undefined
  
  /** If true all column numbers are 1-based (default). */
  var columnsStartAt1: js.UndefOr[Boolean] = js.undefined
  
  /** If true all line numbers are 1-based (default). */
  var linesStartAt1: js.UndefOr[Boolean] = js.undefined
  
  /** The ISO-639 locale of the client using this adapter, e.g. en-US or de-CH. */
  var locale: js.UndefOr[String] = js.undefined
  
  /** Determines in what format paths are specified. The default is `path`, which is the native format.
  			Values: 'path', 'uri', etc.
  		*/
  var pathFormat: js.UndefOr[path | uri | String] = js.undefined
  
  /** Client supports the `argsCanBeInterpretedByShell` attribute on the `runInTerminal` request. */
  var supportsArgsCanBeInterpretedByShell: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports the `invalidated` event. */
  var supportsInvalidatedEvent: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports the `memory` event. */
  var supportsMemoryEvent: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports memory references. */
  var supportsMemoryReferences: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports progress reporting. */
  var supportsProgressReporting: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports the `runInTerminal` request. */
  var supportsRunInTerminalRequest: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports the `startDebugging` request. */
  var supportsStartDebuggingRequest: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports the paging of variables. */
  var supportsVariablePaging: js.UndefOr[Boolean] = js.undefined
  
  /** Client supports the `type` attribute for variables. */
  var supportsVariableType: js.UndefOr[Boolean] = js.undefined
}
object InitializeRequestArguments {
  
  inline def apply(adapterID: String): InitializeRequestArguments = {
    val __obj = js.Dynamic.literal(adapterID = adapterID.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeRequestArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitializeRequestArguments] (val x: Self) extends AnyVal {
    
    inline def setAdapterID(value: String): Self = StObject.set(x, "adapterID", value.asInstanceOf[js.Any])
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    inline def setColumnsStartAt1(value: Boolean): Self = StObject.set(x, "columnsStartAt1", value.asInstanceOf[js.Any])
    
    inline def setColumnsStartAt1Undefined: Self = StObject.set(x, "columnsStartAt1", js.undefined)
    
    inline def setLinesStartAt1(value: Boolean): Self = StObject.set(x, "linesStartAt1", value.asInstanceOf[js.Any])
    
    inline def setLinesStartAt1Undefined: Self = StObject.set(x, "linesStartAt1", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPathFormat(value: path | uri | String): Self = StObject.set(x, "pathFormat", value.asInstanceOf[js.Any])
    
    inline def setPathFormatUndefined: Self = StObject.set(x, "pathFormat", js.undefined)
    
    inline def setSupportsArgsCanBeInterpretedByShell(value: Boolean): Self = StObject.set(x, "supportsArgsCanBeInterpretedByShell", value.asInstanceOf[js.Any])
    
    inline def setSupportsArgsCanBeInterpretedByShellUndefined: Self = StObject.set(x, "supportsArgsCanBeInterpretedByShell", js.undefined)
    
    inline def setSupportsInvalidatedEvent(value: Boolean): Self = StObject.set(x, "supportsInvalidatedEvent", value.asInstanceOf[js.Any])
    
    inline def setSupportsInvalidatedEventUndefined: Self = StObject.set(x, "supportsInvalidatedEvent", js.undefined)
    
    inline def setSupportsMemoryEvent(value: Boolean): Self = StObject.set(x, "supportsMemoryEvent", value.asInstanceOf[js.Any])
    
    inline def setSupportsMemoryEventUndefined: Self = StObject.set(x, "supportsMemoryEvent", js.undefined)
    
    inline def setSupportsMemoryReferences(value: Boolean): Self = StObject.set(x, "supportsMemoryReferences", value.asInstanceOf[js.Any])
    
    inline def setSupportsMemoryReferencesUndefined: Self = StObject.set(x, "supportsMemoryReferences", js.undefined)
    
    inline def setSupportsProgressReporting(value: Boolean): Self = StObject.set(x, "supportsProgressReporting", value.asInstanceOf[js.Any])
    
    inline def setSupportsProgressReportingUndefined: Self = StObject.set(x, "supportsProgressReporting", js.undefined)
    
    inline def setSupportsRunInTerminalRequest(value: Boolean): Self = StObject.set(x, "supportsRunInTerminalRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsRunInTerminalRequestUndefined: Self = StObject.set(x, "supportsRunInTerminalRequest", js.undefined)
    
    inline def setSupportsStartDebuggingRequest(value: Boolean): Self = StObject.set(x, "supportsStartDebuggingRequest", value.asInstanceOf[js.Any])
    
    inline def setSupportsStartDebuggingRequestUndefined: Self = StObject.set(x, "supportsStartDebuggingRequest", js.undefined)
    
    inline def setSupportsVariablePaging(value: Boolean): Self = StObject.set(x, "supportsVariablePaging", value.asInstanceOf[js.Any])
    
    inline def setSupportsVariablePagingUndefined: Self = StObject.set(x, "supportsVariablePaging", js.undefined)
    
    inline def setSupportsVariableType(value: Boolean): Self = StObject.set(x, "supportsVariableType", value.asInstanceOf[js.Any])
    
    inline def setSupportsVariableTypeUndefined: Self = StObject.set(x, "supportsVariableType", js.undefined)
  }
}
