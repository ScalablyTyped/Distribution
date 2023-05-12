package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `gotoTargets` request. */
trait GotoTargetsArguments extends StObject {
  
  /** The position within `line` for which the goto targets are determined. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The line location for which the goto targets are determined. */
  var line: Double
  
  /** The source location for which the goto targets are determined. */
  var source: Source
}
object GotoTargetsArguments {
  
  inline def apply(line: Double, source: Source): GotoTargetsArguments = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoTargetsArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GotoTargetsArguments] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
