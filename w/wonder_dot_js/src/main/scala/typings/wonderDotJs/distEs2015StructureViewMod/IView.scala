package typings.wonderDotJs.distEs2015StructureViewMod

import typings.std.WebGLRenderingContext
import typings.wonderDotJs.Anon_XY
import typings.wonderDotJs.distEs2015CoreDataMainDataMod.ContextConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends js.Object {
  var dom: js.Any
  var height: Double
  var offset: Anon_XY
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
    offset: Anon_XY,
    styleHeight: String,
    styleWidth: String,
    width: Double,
    x: Double,
    y: Double
  ): IView = {
    val __obj = js.Dynamic.literal(dom = dom, getContext = js.Any.fromFunction1(getContext), height = height, initCanvas = js.Any.fromFunction0(initCanvas), offset = offset, styleHeight = styleHeight, styleWidth = styleWidth, width = width, x = x, y = y)
  
    __obj.asInstanceOf[IView]
  }
}

