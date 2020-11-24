package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RecognitionJobs. */
@js.native
trait RecognitionJobs extends js.Object {
  
  /** An array of `RecognitionJob` objects that provides the status for each of the user's current jobs. The array is empty if the user has no current jobs. */
  var recognitions: js.Array[RecognitionJob] = js.native
}
object RecognitionJobs {
  
  @scala.inline
  def apply(recognitions: js.Array[RecognitionJob]): RecognitionJobs = {
    val __obj = js.Dynamic.literal(recognitions = recognitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognitionJobs]
  }
  
  @scala.inline
  implicit class RecognitionJobsOps[Self <: RecognitionJobs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecognitionsVarargs(value: RecognitionJob*): Self = this.set("recognitions", js.Array(value :_*))
    
    @scala.inline
    def setRecognitions(value: js.Array[RecognitionJob]): Self = this.set("recognitions", value.asInstanceOf[js.Any])
  }
}
