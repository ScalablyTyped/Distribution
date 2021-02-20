package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ToneInput. */
@js.native
trait ToneInput extends StObject {
  
  /** The input content that the service is to analyze. */
  var text: String = js.native
}
object ToneInput {
  
  @scala.inline
  def apply(text: String): ToneInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneInput]
  }
  
  @scala.inline
  implicit class ToneInputMutableBuilder[Self <: ToneInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
