package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ModulesViewDescriptor is the container for all declarative configuration options of a ModuleView.
		For now it only specifies the columns to be shown in the modules view.
	*/
trait ModulesViewDescriptor extends StObject {
  
  var columns: js.Array[ColumnDescriptor]
}
object ModulesViewDescriptor {
  
  inline def apply(columns: js.Array[ColumnDescriptor]): ModulesViewDescriptor = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulesViewDescriptor]
  }
  
  extension [Self <: ModulesViewDescriptor](x: Self) {
    
    inline def setColumns(value: js.Array[ColumnDescriptor]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ColumnDescriptor*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
