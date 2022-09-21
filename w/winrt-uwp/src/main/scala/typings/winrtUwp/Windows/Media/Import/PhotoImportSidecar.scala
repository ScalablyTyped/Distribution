package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sidecar file or a sibling file to a PhotoImportItem . */
trait PhotoImportSidecar extends StObject {
  
  /** Gets the date of the sidecar or sibling file. */
  var date: js.Date
  
  /** Gets the name of the sidecar or sibling file. */
  var name: String
  
  /** Gets the size of the sidecar or sibling file, in bytes. */
  var sizeInBytes: Double
}
object PhotoImportSidecar {
  
  inline def apply(date: js.Date, name: String, sizeInBytes: Double): PhotoImportSidecar = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSidecar]
  }
  
  extension [Self <: PhotoImportSidecar](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
  }
}
