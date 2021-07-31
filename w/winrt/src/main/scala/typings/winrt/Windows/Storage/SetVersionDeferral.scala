package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVersionDeferral
  extends StObject
     with ISetVersionDeferral
object SetVersionDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): SetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SetVersionDeferral]
  }
}
