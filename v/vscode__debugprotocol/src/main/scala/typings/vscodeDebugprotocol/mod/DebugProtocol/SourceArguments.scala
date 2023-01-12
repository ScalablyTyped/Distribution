package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `source` request. */
trait SourceArguments extends StObject {
  
  /** Specifies the source content to load. Either source.path or source.sourceReference must be specified. */
  var source: js.UndefOr[Source] = js.undefined
  
  /** The reference to the source. This is the same as source.sourceReference.
  			This is provided for backward compatibility since old clients do not understand the `source` attribute.
  		*/
  var sourceReference: Double
}
object SourceArguments {
  
  inline def apply(sourceReference: Double): SourceArguments = {
    val __obj = js.Dynamic.literal(sourceReference = sourceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceArguments] (val x: Self) extends AnyVal {
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceReference(value: Double): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
