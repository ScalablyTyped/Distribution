package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RecognitionJobs. */
trait RecognitionJobs extends StObject {
  
  /** An array of `RecognitionJob` objects that provides the status for each of the user's current jobs. The array is empty if the user has no current jobs. */
  var recognitions: js.Array[RecognitionJob]
}
object RecognitionJobs {
  
  inline def apply(recognitions: js.Array[RecognitionJob]): RecognitionJobs = {
    val __obj = js.Dynamic.literal(recognitions = recognitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognitionJobs]
  }
  
  extension [Self <: RecognitionJobs](x: Self) {
    
    inline def setRecognitions(value: js.Array[RecognitionJob]): Self = StObject.set(x, "recognitions", value.asInstanceOf[js.Any])
    
    inline def setRecognitionsVarargs(value: RecognitionJob*): Self = StObject.set(x, "recognitions", js.Array(value*))
  }
}
