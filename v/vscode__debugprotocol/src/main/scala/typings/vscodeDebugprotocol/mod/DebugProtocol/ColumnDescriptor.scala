package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.boolean
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.number
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.string
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.unixTimestampUTC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A `ColumnDescriptor` specifies what module attribute to show in a column of the modules view, how to format it,
		and what the column's label should be.
		It is only used if the underlying UI actually supports this level of customization.
	*/
trait ColumnDescriptor extends StObject {
  
  /** Name of the attribute rendered in this column. */
  var attributeName: String
  
  /** Format to use for the rendered values in this column. TBD how the format strings looks like. */
  var format: js.UndefOr[String] = js.undefined
  
  /** Header UI label of column. */
  var label: String
  
  /** Datatype of values in this column. Defaults to `string` if not specified. */
  var `type`: js.UndefOr[string | number | boolean | unixTimestampUTC] = js.undefined
  
  /** Width of this column in characters (hint only). */
  var width: js.UndefOr[Double] = js.undefined
}
object ColumnDescriptor {
  
  inline def apply(attributeName: String, label: String): ColumnDescriptor = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnDescriptor] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: string | number | boolean | unixTimestampUTC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
