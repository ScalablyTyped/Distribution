package typings.watsonDeveloperCloud.languageTranslatorV3Mod

import typings.ibmCloudSdkCore.esLibHelperMod.FileObject
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createModel` operation. */
trait CreateModelParams extends StObject {
  
  /** The model ID of the model to use as the base for customization. To see available models, use the `List models` method. Usually all IBM provided models are customizable. In addition, all your models that have been created via parallel corpus customization, can be further customized with a forced glossary. */
  var base_model_id: String
  
  /** A TMX file with your customizations. The customizations in the file completely overwrite the domain translaton data, including high frequency or high confidence phrase translations. You can upload only one glossary with a file size less than 10 MB per call. A forced glossary should contain single words or short phrases. */
  var forced_glossary: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** An optional model name that you can use to identify the model. Valid characters are letters, numbers, dashes, underscores, spaces and apostrophes. The maximum length is 32 characters. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A TMX file with parallel sentences for source and target language. You can upload multiple parallel_corpus files in one request. All uploaded parallel_corpus files combined, your parallel corpus must contain at least 5,000 parallel sentences to train successfully. */
  var parallel_corpus: js.UndefOr[ReadableStream | FileObject | Buffer] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object CreateModelParams {
  
  inline def apply(base_model_id: String): CreateModelParams = {
    val __obj = js.Dynamic.literal(base_model_id = base_model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelParams] (val x: Self) extends AnyVal {
    
    inline def setBase_model_id(value: String): Self = StObject.set(x, "base_model_id", value.asInstanceOf[js.Any])
    
    inline def setForced_glossary(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "forced_glossary", value.asInstanceOf[js.Any])
    
    inline def setForced_glossaryUndefined: Self = StObject.set(x, "forced_glossary", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParallel_corpus(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "parallel_corpus", value.asInstanceOf[js.Any])
    
    inline def setParallel_corpusUndefined: Self = StObject.set(x, "parallel_corpus", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
