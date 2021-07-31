package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaProtectionServiceCompletion
  extends StObject
     with IMediaProtectionServiceCompletion
object MediaProtectionServiceCompletion {
  
  @scala.inline
  def apply(complete: Boolean => Unit): MediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[MediaProtectionServiceCompletion]
  }
}
