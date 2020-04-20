package typings.wonderJs.viewMod

import typings.std.WebGLRenderingContext
import typings.wonderJs.AnonY
import typings.wonderJs.mainDataMod.ContextConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends js.Object {
  var dom: js.Any
  var height: Double
  var offset: AnonY
  var styleHeight: String
  var styleWidth: String
  var width: Double
  var x: Double
  var y: Double
  def getContext(contextConfig: ContextConfigData): WebGLRenderingContext
  def initCanvas(): Unit
}

object IView {
  @scala.inline
  def apply(
    dom: js.Any,
    getContext: ContextConfigData => WebGLRenderingContext,
    height: Double,
    initCanvas: () => Unit,
    offset: AnonY,
    styleHeight: String,
    styleWidth: String,
    width: Double,
    x: Double,
    y: Double
  ): IView = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], initCanvas = js.Any.fromFunction0(initCanvas), offset = offset.asInstanceOf[js.Any], styleHeight = styleHeight.asInstanceOf[js.Any], styleWidth = styleWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
}

