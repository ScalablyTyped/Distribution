package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The types of timeline markers supported by the MediaPlayer.
  **/
trait MarkerType extends js.Object {
  var advertisement: String
  var chapter: String
  var custom: String
}

object MarkerType {
  @scala.inline
  def apply(advertisement: String, chapter: String, custom: String): MarkerType = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], chapter = chapter.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerType]
  }
}

