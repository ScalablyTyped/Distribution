package typings.wordExtractor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordExtractor extends js.Object {
  
  def extract(documentPath: String): js.Promise[Document] = js.native
}
object WordExtractor {
  
  @scala.inline
  def apply(extract: String => js.Promise[Document]): WordExtractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
    __obj.asInstanceOf[WordExtractor]
  }
  
  @scala.inline
  implicit class WordExtractorOps[Self <: WordExtractor] (val x: Self) extends AnyVal {
    
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
    def setExtract(value: String => js.Promise[Document]): Self = this.set("extract", js.Any.fromFunction1(value))
  }
}
