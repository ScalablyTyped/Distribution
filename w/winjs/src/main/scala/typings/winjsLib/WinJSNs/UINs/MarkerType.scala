package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The types of timeline markers supported by the MediaPlayer.
  **/
trait MarkerType extends js.Object {
  var advertisement: java.lang.String
  var chapter: java.lang.String
  var custom: java.lang.String
}

object MarkerType {
  @scala.inline
  def apply(advertisement: java.lang.String, chapter: java.lang.String, custom: java.lang.String): MarkerType = {
    val __obj = js.Dynamic.literal(advertisement = advertisement, chapter = chapter, custom = custom)
  
    __obj.asInstanceOf[MarkerType]
  }
}

