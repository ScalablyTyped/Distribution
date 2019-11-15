package typings.stylefire.libSvgTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformState extends /* key */ StringDictionary[String] {
  var rotate: String
  var scale: String
  var skewX: String
  var skewY: String
  var translate: String
}

object TransformState {
  @scala.inline
  def apply(
    rotate: String,
    scale: String,
    skewX: String,
    skewY: String,
    translate: String,
    StringDictionary: /* key */ StringDictionary[String] = null
  ): TransformState = {
    val __obj = js.Dynamic.literal(rotate = rotate, scale = scale, skewX = skewX, skewY = skewY, translate = translate)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TransformState]
  }
}

