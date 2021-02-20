package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SourceChanged event. */
@js.native
trait Print3DTaskSourceChangedEventArgs extends StObject {
  
  /** Gets the updated 3D print package from the workflow. */
  var source: Printing3D3MFPackage = js.native
}
object Print3DTaskSourceChangedEventArgs {
  
  @scala.inline
  def apply(source: Printing3D3MFPackage): Print3DTaskSourceChangedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskSourceChangedEventArgs]
  }
  
  @scala.inline
  implicit class Print3DTaskSourceChangedEventArgsMutableBuilder[Self <: Print3DTaskSourceChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Printing3D3MFPackage): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
