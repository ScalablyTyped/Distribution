package typings.wordDashExtractor.wordDashExtractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordExtractor extends js.Object {
  def extract(documentPath: String): js.Promise[Document]
}

object WordExtractor {
  @scala.inline
  def apply(extract: String => js.Promise[Document]): WordExtractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
  
    __obj.asInstanceOf[WordExtractor]
  }
}

