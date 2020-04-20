package typings.tensorflowTfjsCore.webglTypesMod

import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGL1DisjointQueryTimerExtension extends js.Object {
  var GPU_DISJOINT_EXT: Double
  var QUERY_RESULT_AVAILABLE_EXT: Double
  var QUERY_RESULT_EXT: Double
  var TIME_ELAPSED_EXT: Double
  def beginQueryEXT(ext: Double, query: WebGLQuery): Unit
  def createQueryEXT(): js.Object
  def deleteQueryEXT(query: WebGLQuery): Unit
  def endQueryEXT(ext: Double): Unit
  def getQueryObjectEXT(query: WebGLQuery, queryResultAvailableExt: Double): Double
  def isQueryEXT(query: WebGLQuery): Boolean
}

object WebGL1DisjointQueryTimerExtension {
  @scala.inline
  def apply(
    GPU_DISJOINT_EXT: Double,
    QUERY_RESULT_AVAILABLE_EXT: Double,
    QUERY_RESULT_EXT: Double,
    TIME_ELAPSED_EXT: Double,
    beginQueryEXT: (Double, WebGLQuery) => Unit,
    createQueryEXT: () => js.Object,
    deleteQueryEXT: WebGLQuery => Unit,
    endQueryEXT: Double => Unit,
    getQueryObjectEXT: (WebGLQuery, Double) => Double,
    isQueryEXT: WebGLQuery => Boolean
  ): WebGL1DisjointQueryTimerExtension = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT.asInstanceOf[js.Any], QUERY_RESULT_EXT = QUERY_RESULT_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any], beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), isQueryEXT = js.Any.fromFunction1(isQueryEXT))
    __obj.asInstanceOf[WebGL1DisjointQueryTimerExtension]
  }
}

