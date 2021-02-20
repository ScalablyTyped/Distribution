package typings.tensorflowModelsUniversalSentenceEncoder

import typings.tensorflowTfjsConverter.mod.GraphModel
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useQnaMod {
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/use_qna", "UniversalSentenceEncoderQnA")
  @js.native
  class UniversalSentenceEncoderQnA () extends StObject {
    
    /**
      *
      * Returns a map of queryEmbedding and responseEmbedding
      *
      * @param input the ModelInput that contains queries and answers.
      */
    def embed(input: ModelInput): ModelOutput = js.native
    
    def load(): js.Promise[Unit] = js.native
    
    def loadModel(): js.Promise[GraphModel] = js.native
    
    var model: js.Any = js.native
    
    var shiftTokens: js.Any = js.native
    
    var tokenizeStrings: js.Any = js.native
    
    var tokenizer: js.Any = js.native
  }
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/use_qna", "loadQnA")
  @js.native
  def loadQnA(): js.Promise[UniversalSentenceEncoderQnA] = js.native
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/use_qna", "version")
  @js.native
  val version: /* "1.3.2" */ String = js.native
  
  @js.native
  trait ModelInput extends StObject {
    
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
    implicit class ModelInputMutableBuilder[Self <: ModelInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
      
      @scala.inline
      def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value :_*))
      
      @scala.inline
      def setResponses(value: js.Array[String]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsesVarargs(value: String*): Self = StObject.set(x, "responses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ModelOutput extends StObject {
    
    var queryEmbedding: Tensor[Rank] = js.native
    
    var responseEmbedding: Tensor[Rank] = js.native
  }
  object ModelOutput {
    
    @scala.inline
    def apply(queryEmbedding: Tensor[Rank], responseEmbedding: Tensor[Rank]): ModelOutput = {
      val __obj = js.Dynamic.literal(queryEmbedding = queryEmbedding.asInstanceOf[js.Any], responseEmbedding = responseEmbedding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelOutput]
    }
    
    @scala.inline
    implicit class ModelOutputMutableBuilder[Self <: ModelOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryEmbedding(value: Tensor[Rank]): Self = StObject.set(x, "queryEmbedding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseEmbedding(value: Tensor[Rank]): Self = StObject.set(x, "responseEmbedding", value.asInstanceOf[js.Any])
    }
  }
}
