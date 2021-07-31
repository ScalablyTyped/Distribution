package typings.winrtUwp.Windows.UI.Input.Inking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages all aspects of handwriting recognition. */
trait InkRecognizer extends StObject {
  
  /** Gets the name of the InkRecognizer . */
  var name: String
}
object InkRecognizer {
  
  @scala.inline
  def apply(name: String): InkRecognizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkRecognizer]
  }
  
  @scala.inline
  implicit class InkRecognizerMutableBuilder[Self <: InkRecognizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
