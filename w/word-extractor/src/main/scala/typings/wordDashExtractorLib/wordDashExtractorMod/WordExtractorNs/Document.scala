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
    getAnnotations: () => java.lang.String,
    getBody: () => java.lang.String,
    getEndNotes: () => java.lang.String,
    getFootnotes: () => java.lang.String,
    getHeaders: () => java.lang.String
  ): Document = {
    val __obj = js.Dynamic.literal(getAnnotations = js.Any.fromFunction0(getAnnotations), getBody = js.Any.fromFunction0(getBody), getEndNotes = js.Any.fromFunction0(getEndNotes), getFootnotes = js.Any.fromFunction0(getFootnotes), getHeaders = js.Any.fromFunction0(getHeaders))
  
    __obj.asInstanceOf[Document]
  }
}

