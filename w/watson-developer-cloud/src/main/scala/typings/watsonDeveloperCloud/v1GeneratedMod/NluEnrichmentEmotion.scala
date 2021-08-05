package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifying the emotion detection enrichment and related parameters. */
trait NluEnrichmentEmotion extends StObject {
  
  /** When `true`, emotion detection is performed on the entire field. */
  var document: js.UndefOr[Boolean] = js.undefined
  
  /** A comma-separated list of target strings that will have any associated emotions detected. */
  var targets: js.UndefOr[js.Array[String]] = js.undefined
}
object NluEnrichmentEmotion {
  
  inline def apply(): NluEnrichmentEmotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentEmotion]
  }
  
  extension [Self <: NluEnrichmentEmotion](x: Self) {
    
    inline def setDocument(value: Boolean): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
