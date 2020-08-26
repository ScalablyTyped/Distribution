package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait env extends js.Object {
  var cssPrefix: String = js.native
  var isFF: Boolean = js.native
  var isIE: Boolean = js.native
  var isSafari: Boolean = js.native
  var isWebKit: Boolean = js.native
  var jsPrefix: String = js.native
  var mouse: js.Any = js.native
  var strict: Boolean = js.native
  var svg: Boolean = js.native
  var transform: Boolean = js.native
  var transition: Boolean = js.native
  var transitionDuration: String = js.native
  var transitionEnd: String = js.native
  var translate: String = js.native
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
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix.asInstanceOf[js.Any], isFF = isFF.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isWebKit = isWebKit.asInstanceOf[js.Any], jsPrefix = jsPrefix.asInstanceOf[js.Any], mouse = mouse.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[env]
  }
  @scala.inline
  implicit class envOps[Self <: env] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCssPrefix(value: String): Self = this.set("cssPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFF(value: Boolean): Self = this.set("isFF", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIE(value: Boolean): Self = this.set("isIE", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSafari(value: Boolean): Self = this.set("isSafari", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWebKit(value: Boolean): Self = this.set("isWebKit", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsPrefix(value: String): Self = this.set("jsPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouse(value: js.Any): Self = this.set("mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvg(value: Boolean): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: Boolean): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionDuration(value: String): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionEnd(value: String): Self = this.set("transitionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslate(value: String): Self = this.set("translate", value.asInstanceOf[js.Any])
  }
  
}

