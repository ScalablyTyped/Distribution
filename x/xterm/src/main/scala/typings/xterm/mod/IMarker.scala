package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMarker extends IDisposable {
  
  /**
    * A unique identifier for this marker.
    */
  val id: Double = js.native
  
  /**
    * Whether this marker is disposed.
    */
  val isDisposed: Boolean = js.native
  
  /**
    * The actual line index in the buffer at this point in time. This is set to
    * -1 if the marker has been disposed.
    */
  val line: Double = js.native
}
object IMarker {
  
  @scala.inline
  def apply(dispose: () => Unit, id: Double, isDisposed: Boolean, line: Double): IMarker = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarker]
  }
  
  @scala.inline
  implicit class IMarkerMutableBuilder[Self <: IMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
