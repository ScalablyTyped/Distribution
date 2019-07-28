package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait env extends js.Object {
  var cssPrefix: String
  var isFF: Boolean
  var isIE: Boolean
  var isSafari: Boolean
  var isWebKit: Boolean
  var jsPrefix: String
  var mouse: js.Any
  var strict: Boolean
  var svg: Boolean
  var transform: Boolean
  var transition: Boolean
  var transitionDuration: String
  var transitionEnd: String
  var translate: String
}

object env {
  @scala.inline
  def apply(
    cssPrefix: String,
    isFF: Boolean,
    isIE: Boolean,
    isSafari: Boolean,
    isWebKit: Boolean,
    jsPrefix: String,
    mouse: js.Any,
    strict: Boolean,
    svg: Boolean,
    transform: Boolean,
    transition: Boolean,
    transitionDuration: String,
    transitionEnd: String,
    translate: String
  ): env = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix, isFF = isFF, isIE = isIE, isSafari = isSafari, isWebKit = isWebKit, jsPrefix = jsPrefix, mouse = mouse, strict = strict, svg = svg, transform = transform, transition = transition, transitionDuration = transitionDuration, transitionEnd = transitionEnd, translate = translate)
  
    __obj.asInstanceOf[env]
  }
}

