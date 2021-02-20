package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the Print3DTaskSourceRequestedHandler delegate. */
@js.native
trait Print3DTaskSourceRequestedArgs extends StObject {
  
  /**
    * Specifies the 3D Manufacturing Format (3MF) package to use in the print job.
    * @param source The 3D Manufacturing Format (3MF) package to use in the print job.
    */
  def setSource(source: Printing3D3MFPackage): Unit = js.native
}
object Print3DTaskSourceRequestedArgs {
  
  @scala.inline
  def apply(setSource: Printing3D3MFPackage => Unit): Print3DTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[Print3DTaskSourceRequestedArgs]
  }
  
  @scala.inline
  implicit class Print3DTaskSourceRequestedArgsMutableBuilder[Self <: Print3DTaskSourceRequestedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetSource(value: Printing3D3MFPackage => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
