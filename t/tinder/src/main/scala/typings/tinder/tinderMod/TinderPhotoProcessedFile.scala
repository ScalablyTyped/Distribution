package typings.tinder.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderPhotoProcessedFile extends js.Object {
  var height: Double
  var url: String
  var width: Double
}

object TinderPhotoProcessedFile {
  @scala.inline
  def apply(height: Double, url: String, width: Double): TinderPhotoProcessedFile = {
    val __obj = js.Dynamic.literal(height = height, url = url, width = width)
  
    __obj.asInstanceOf[TinderPhotoProcessedFile]
  }
}

