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
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix, isFF = isFF, isIE = isIE, isSafari = isSafari, isWebKit = isWebKit, jsPrefix = jsPrefix, mouse = mouse, strict = strict, svg = svg, transform = transform, transition = transition, transitionDuration = transitionDuration, transitionEnd = transitionEnd, translate = translate)
  
    __obj.asInstanceOf[env]
  }
}

