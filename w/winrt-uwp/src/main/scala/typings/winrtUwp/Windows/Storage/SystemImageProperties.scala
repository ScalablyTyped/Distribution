package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for Windows image file properties. */
trait SystemImageProperties extends StObject {
  
  /** Gets the name of the System.Image.HorizontalSize property (one of the Windows image file properties). */
  var horizontalSize: String
  
  /** Gets the name of the System.Image.VerticalSize property (one of the Windows image file properties). */
  var verticalSize: String
}
object SystemImageProperties {
  
  @scala.inline
  def apply(horizontalSize: String, verticalSize: String): SystemImageProperties = {
    val __obj = js.Dynamic.literal(horizontalSize = horizontalSize.asInstanceOf[js.Any], verticalSize = verticalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemImageProperties]
  }
  
  @scala.inline
  implicit class SystemImagePropertiesMutableBuilder[Self <: SystemImageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalSize(value: String): Self = StObject.set(x, "horizontalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSize(value: String): Self = StObject.set(x, "verticalSize", value.asInstanceOf[js.Any])
  }
}
