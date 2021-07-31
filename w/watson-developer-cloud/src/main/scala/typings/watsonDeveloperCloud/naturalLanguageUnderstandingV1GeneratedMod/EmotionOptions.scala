package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Detects anger, disgust, fear, joy, or sadness that is conveyed in the content or by the context around target phrases specified in the targets parameter. You can analyze emotion for detected entities with `entities.emotion` and for keywords with `keywords.emotion`. Supported languages: English. */
trait EmotionOptions extends StObject {
  
  /** Set this to `false` to hide document-level emotion results. */
  var document: js.UndefOr[Boolean] = js.undefined
  
  /** Emotion results will be returned for each target string that is found in the document. */
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}
object EmotionOptions {
  
  @scala.inline
  def apply(): EmotionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionOptions]
  }
  
  @scala.inline
  implicit class EmotionOptionsMutableBuilder[Self <: EmotionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Boolean): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
