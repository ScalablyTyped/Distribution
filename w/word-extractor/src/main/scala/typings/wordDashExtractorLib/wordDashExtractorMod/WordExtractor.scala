package typings
package wordDashExtractorLib.wordDashExtractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordExtractor extends js.Object {
  def extract(documentPath: java.lang.String): js.Promise[wordDashExtractorLib.wordDashExtractorMod.WordExtractorNs.Document]
}

object WordExtractor {
  @scala.inline
  def apply(
    extract: java.lang.String => js.Promise[wordDashExtractorLib.wordDashExtractorMod.WordExtractorNs.Document]
  ): WordExtractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
  
    __obj.asInstanceOf[WordExtractor]
  }
}

