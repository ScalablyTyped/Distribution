package typings.wordExtractor

import typings.wordExtractor.anon.IncludeBody
import typings.wordExtractor.anon.IncludeFooters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("word-extractor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with WordExtractor
  
  @JSImport("word-extractor", "Document")
  @js.native
  open class Document () extends StObject {
    
    def getAnnotations(): String = js.native
    
    def getBody(): String = js.native
    
    def getEndnotes(): String = js.native
    
    def getFooters(): String = js.native
    
    def getFootnotes(): String = js.native
    
    def getHeaders(): String = js.native
    def getHeaders(options: IncludeFooters): String = js.native
    
    def getTextboxes(): String = js.native
    def getTextboxes(options: IncludeBody): String = js.native
  }
  
  @js.native
  trait WordExtractor extends StObject {
    
    def extract(documentPath: String): js.Promise[Document] = js.native
    def extract(documentPath: js.typedarray.Uint8Array): js.Promise[Document] = js.native
  }
}
