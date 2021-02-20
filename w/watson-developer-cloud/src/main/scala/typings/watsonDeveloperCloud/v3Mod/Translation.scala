package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Translation. */
@js.native
trait Translation extends StObject {
  
  /** Translation output in UTF-8. */
  var translation_output: String = js.native
}
object Translation {
  
  @scala.inline
  def apply(translation_output: String): Translation = {
    val __obj = js.Dynamic.literal(translation_output = translation_output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
  
  @scala.inline
  implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslation_output(value: String): Self = StObject.set(x, "translation_output", value.asInstanceOf[js.Any])
  }
}
