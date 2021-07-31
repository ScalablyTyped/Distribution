package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the LogFileGenerated event. */
trait LogFileGeneratedEventArgs extends StObject {
  
  /** Gets the log file. */
  var file: StorageFile
}
object LogFileGeneratedEventArgs {
  
  @scala.inline
  def apply(file: StorageFile): LogFileGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogFileGeneratedEventArgs]
  }
  
  @scala.inline
  implicit class LogFileGeneratedEventArgsMutableBuilder[Self <: LogFileGeneratedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
