package typings.wordExtractor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("word-extractor", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with WordExtractor {
    
    /* CompleteClass */
    override def extract(documentPath: String): js.Promise[Document] = js.native
  }
  
  @JSImport("word-extractor", "Document")
  @js.native
  class Document () extends StObject {
    
    def getAnnotations(): String = js.native
    
    def getBody(): String = js.native
    
    def getEndNotes(): String = js.native
    
    def getFootnotes(): String = js.native
    
    def getHeaders(): String = js.native
  }
  
  trait WordExtractor extends StObject {
    
    def extract(documentPath: String): js.Promise[Document]
  }
  object WordExtractor {
    
    @scala.inline
    def apply(extract: String => js.Promise[Document]): WordExtractor = {
      val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
      __obj.asInstanceOf[WordExtractor]
    }
    
    @scala.inline
    implicit class WordExtractorMutableBuilder[Self <: WordExtractor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtract(value: String => js.Promise[Document]): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    }
  }
}
