package typings
package wordDashExtractorLib.wordDashExtractorMod.WordExtractorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def getAnnotations(): java.lang.String
  def getBody(): java.lang.String
  def getEndNotes(): java.lang.String
  def getFootnotes(): java.lang.String
  def getHeaders(): java.lang.String
}

object Document {
  @scala.inline
  def apply(
    getAnnotations: js.Function0[java.lang.String],
    getBody: js.Function0[java.lang.String],
    getEndNotes: js.Function0[java.lang.String],
    getFootnotes: js.Function0[java.lang.String],
    getHeaders: js.Function0[java.lang.String]
  ): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAnnotations")(getAnnotations)
    __obj.updateDynamic("getBody")(getBody)
    __obj.updateDynamic("getEndNotes")(getEndNotes)
    __obj.updateDynamic("getFootnotes")(getFootnotes)
    __obj.updateDynamic("getHeaders")(getHeaders)
    __obj.asInstanceOf[Document]
  }
}

