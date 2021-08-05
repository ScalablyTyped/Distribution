package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** Pronunciation. */
trait Pronunciation extends StObject {
  
  /** The pronunciation of the specified text in the requested voice and format. If a custom voice model is specified, the pronunciation also reflects that custom voice. */
  var pronunciation: String
}
object Pronunciation {
  
  inline def apply(pronunciation: String): Pronunciation = {
    val __obj = js.Dynamic.literal(pronunciation = pronunciation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pronunciation]
  }
  
  extension [Self <: Pronunciation](x: Self) {
    
    inline def setPronunciation(value: String): Self = StObject.set(x, "pronunciation", value.asInstanceOf[js.Any])
  }
}
