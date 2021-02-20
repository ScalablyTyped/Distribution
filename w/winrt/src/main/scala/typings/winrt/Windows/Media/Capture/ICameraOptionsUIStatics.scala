package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICameraOptionsUIStatics extends StObject {
  
  def show(mediaCapture: MediaCapture): Unit = js.native
}
object ICameraOptionsUIStatics {
  
  @scala.inline
  def apply(show: MediaCapture => Unit): ICameraOptionsUIStatics = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ICameraOptionsUIStatics]
  }
  
  @scala.inline
  implicit class ICameraOptionsUIStaticsMutableBuilder[Self <: ICameraOptionsUIStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: MediaCapture => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
