package typings.winrtUwp.Windows.Devices.Printers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D printer. */
trait Print3DDevice extends StObject {
  
  /** Gets the PrintSchema object for obtaining capabilities and print ticket information. */
  var printSchema: PrintSchema
}
object Print3DDevice {
  
  @scala.inline
  def apply(printSchema: PrintSchema): Print3DDevice = {
    val __obj = js.Dynamic.literal(printSchema = printSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DDevice]
  }
  
  @scala.inline
  implicit class Print3DDeviceMutableBuilder[Self <: Print3DDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintSchema(value: PrintSchema): Self = StObject.set(x, "printSchema", value.asInstanceOf[js.Any])
  }
}
