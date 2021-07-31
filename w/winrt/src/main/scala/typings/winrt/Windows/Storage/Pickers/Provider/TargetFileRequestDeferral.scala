package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetFileRequestDeferral
  extends StObject
     with ITargetFileRequestDeferral
object TargetFileRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): TargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[TargetFileRequestDeferral]
  }
}
