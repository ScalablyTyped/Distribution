package typings.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Request payload to classify. */
trait ClassifyInput extends StObject {
  
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: String
}
object ClassifyInput {
  
  @scala.inline
  def apply(text: String): ClassifyInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyInput]
  }
  
  @scala.inline
  implicit class ClassifyInputMutableBuilder[Self <: ClassifyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
