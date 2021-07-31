package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToSourceDeferral extends StObject {
  
  def complete(): Unit
}
object IPlayToSourceDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IPlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPlayToSourceDeferral]
  }
  
  @scala.inline
  implicit class IPlayToSourceDeferralMutableBuilder[Self <: IPlayToSourceDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
