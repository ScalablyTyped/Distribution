package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait env extends js.Object {
  var cssPrefix: java.lang.String
  var isFF: scala.Boolean
  var isIE: scala.Boolean
  var isSafari: scala.Boolean
  var isWebKit: scala.Boolean
  var jsPrefix: java.lang.String
  var mouse: js.Any
  var strict: scala.Boolean
  var svg: scala.Boolean
  var transform: scala.Boolean
  var transition: scala.Boolean
  var transitionDuration: java.lang.String
  var transitionEnd: java.lang.String
  var translate: java.lang.String
}

object env {
  @scala.inline
  def apply(
    cssPrefix: java.lang.String,
    isFF: scala.Boolean,
    isIE: scala.Boolean,
    isSafari: scala.Boolean,
    isWebKit: scala.Boolean,
    jsPrefix: java.lang.String,
    mouse: js.Any,
    strict: scala.Boolean,
    svg: scala.Boolean,
    transform: scala.Boolean,
    transition: scala.Boolean,
    transitionDuration: java.lang.String,
    transitionEnd: java.lang.String,
    translate: java.lang.String
  ): env = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cssPrefix")(cssPrefix)
    __obj.updateDynamic("isFF")(isFF)
    __obj.updateDynamic("isIE")(isIE)
    __obj.updateDynamic("isSafari")(isSafari)
    __obj.updateDynamic("isWebKit")(isWebKit)
    __obj.updateDynamic("jsPrefix")(jsPrefix)
    __obj.updateDynamic("mouse")(mouse)
    __obj.updateDynamic("strict")(strict)
    __obj.updateDynamic("svg")(svg)
    __obj.updateDynamic("transform")(transform)
    __obj.updateDynamic("transition")(transition)
    __obj.updateDynamic("transitionDuration")(transitionDuration)
    __obj.updateDynamic("transitionEnd")(transitionEnd)
    __obj.updateDynamic("translate")(translate)
    __obj.asInstanceOf[env]
  }
}

