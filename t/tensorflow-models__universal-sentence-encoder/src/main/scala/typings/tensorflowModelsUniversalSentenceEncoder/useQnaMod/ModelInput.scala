package typings.tensorflowModelsUniversalSentenceEncoder.useQnaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelInput extends js.Object {
  
  var contexts: js.UndefOr[js.Array[String]] = js.native
  
  var queries: js.Array[String] = js.native
  
  var responses: js.Array[String] = js.native
}
object ModelInput {
  
  @scala.inline
  def apply(queries: js.Array[String], responses: js.Array[String]): ModelInput = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInput]
  }
  
  @scala.inline
  implicit class ModelInputOps[Self <: ModelInput] (val x: Self) extends AnyVal {
    
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
    def setQueriesVarargs(value: String*): Self = this.set("queries", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: js.Array[String]): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesVarargs(value: String*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[String]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
  }
}
