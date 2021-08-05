package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corpora. */
trait Corpora extends StObject {
  
  /** An array of `Corpus` objects that provides information about the corpora for the custom model. The array is empty if the custom model has no corpora. */
  var corpora: js.Array[Corpus]
}
object Corpora {
  
  inline def apply(corpora: js.Array[Corpus]): Corpora = {
    val __obj = js.Dynamic.literal(corpora = corpora.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corpora]
  }
  
  extension [Self <: Corpora](x: Self) {
    
    inline def setCorpora(value: js.Array[Corpus]): Self = StObject.set(x, "corpora", value.asInstanceOf[js.Any])
    
    inline def setCorporaVarargs(value: Corpus*): Self = StObject.set(x, "corpora", js.Array(value :_*))
  }
}
