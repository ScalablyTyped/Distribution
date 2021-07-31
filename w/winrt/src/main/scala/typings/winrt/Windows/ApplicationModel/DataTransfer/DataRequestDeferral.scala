package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequestDeferral
  extends StObject
     with IDataRequestDeferral
object DataRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): DataRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataRequestDeferral]
  }
}
