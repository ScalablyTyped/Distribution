package typings
package tesseractDotJsLib.tesseractDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  var confidence: scala.Double
  var text: java.lang.String
}

object Choice {
  @scala.inline
  def apply(confidence: scala.Double, text: java.lang.String): Choice = {
    val __obj = js.Dynamic.literal(confidence = confidence, text = text)
  
    __obj.asInstanceOf[Choice]
  }
}

