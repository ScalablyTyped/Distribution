package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.console
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.end
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.important
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.start
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.startCollapsed
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.stderr
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.stdout
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.telemetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  /** The output category. If not specified or if the category is not understood by the client, `console` is assumed.
  				Values: 
  				'console': Show the output in the client's default message UI, e.g. a 'debug console'. This category should only be used for informational output from the debugger (as opposed to the debuggee).
  				'important': A hint for the client to show the output in the client's UI for important and highly visible information, e.g. as a popup notification. This category should only be used for important messages from the debugger (as opposed to the debuggee). Since this category value is a hint, clients might ignore the hint and assume the `console` category.
  				'stdout': Show the output as normal program output from the debuggee.
  				'stderr': Show the output as error program output from the debuggee.
  				'telemetry': Send the output to telemetry instead of showing it to the user.
  				etc.
  			*/
  var category: js.UndefOr[console | important | stdout | stderr | telemetry | String] = js.undefined
  
  /** The source location's column where the output was produced. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** Additional data to report. For the `telemetry` category the data is sent to telemetry, for the other categories the data is shown in JSON format. */
  var data: js.UndefOr[Any] = js.undefined
  
  /** Support for keeping an output log organized by grouping related messages.
  				'start': Start a new group in expanded mode. Subsequent output events are members of the group and should be shown indented.
  				The `output` attribute becomes the name of the group and is not indented.
  				'startCollapsed': Start a new group in collapsed mode. Subsequent output events are members of the group and should be shown indented (as soon as the group is expanded).
  				The `output` attribute becomes the name of the group and is not indented.
  				'end': End the current group and decrease the indentation of subsequent output events.
  				A nonempty `output` attribute is shown as the unindented end of the group.
  			*/
  var group: js.UndefOr[start | startCollapsed | end] = js.undefined
  
  /** The source location's line where the output was produced. */
  var line: js.UndefOr[Double] = js.undefined
  
  /** The output to report. */
  var output: String
  
  /** The source location where the output was produced. */
  var source: js.UndefOr[typings.vscodeDebugprotocol.mod.DebugProtocol.Source] = js.undefined
  
  /** If an attribute `variablesReference` exists and its value is > 0, the output contains objects which can be retrieved by passing `variablesReference` to the `variables` request. The value should be less than or equal to 2147483647 (2^31-1). */
  var variablesReference: js.UndefOr[Double] = js.undefined
}
object Category {
  
  inline def apply(output: String): Category = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategory(value: console | important | stdout | stderr | telemetry | String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGroup(value: start | startCollapsed | end): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setSource(value: typings.vscodeDebugprotocol.mod.DebugProtocol.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
    
    inline def setVariablesReferenceUndefined: Self = StObject.set(x, "variablesReference", js.undefined)
  }
}
