package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred operation when you're supplying a source media element for Play To. */
@js.native
trait PlayToSourceDeferral extends StObject {
  
  /** Ends the deferral. */
  def complete(): Unit = js.native
}
object PlayToSourceDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): PlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PlayToSourceDeferral]
  }
  
  @scala.inline
  implicit class PlayToSourceDeferralMutableBuilder[Self <: PlayToSourceDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
