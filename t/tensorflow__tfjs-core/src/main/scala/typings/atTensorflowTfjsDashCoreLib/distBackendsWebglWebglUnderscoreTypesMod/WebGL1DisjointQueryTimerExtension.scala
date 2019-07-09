package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglWebglUnderscoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGL1DisjointQueryTimerExtension extends js.Object {
  var GPU_DISJOINT_EXT: scala.Double
  var QUERY_RESULT_AVAILABLE_EXT: scala.Double
  var QUERY_RESULT_EXT: scala.Double
  var TIME_ELAPSED_EXT: scala.Double
  def beginQueryEXT(ext: scala.Double, query: webgl2Lib.WebGLQuery): scala.Unit
  def createQueryEXT(): js.Object
  def deleteQueryEXT(query: webgl2Lib.WebGLQuery): scala.Unit
  def endQueryEXT(ext: scala.Double): scala.Unit
  def getQueryObjectEXT(query: webgl2Lib.WebGLQuery, queryResultAvailableExt: scala.Double): scala.Double
  def isQueryEXT(query: webgl2Lib.WebGLQuery): scala.Boolean
}

object WebGL1DisjointQueryTimerExtension {
  @scala.inline
  def apply(
    GPU_DISJOINT_EXT: scala.Double,
    QUERY_RESULT_AVAILABLE_EXT: scala.Double,
    QUERY_RESULT_EXT: scala.Double,
    TIME_ELAPSED_EXT: scala.Double,
    beginQueryEXT: (scala.Double, webgl2Lib.WebGLQuery) => scala.Unit,
    createQueryEXT: () => js.Object,
    deleteQueryEXT: webgl2Lib.WebGLQuery => scala.Unit,
    endQueryEXT: scala.Double => scala.Unit,
    getQueryObjectEXT: (webgl2Lib.WebGLQuery, scala.Double) => scala.Double,
    isQueryEXT: webgl2Lib.WebGLQuery => scala.Boolean
  ): WebGL1DisjointQueryTimerExtension = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT, QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT, QUERY_RESULT_EXT = QUERY_RESULT_EXT, TIME_ELAPSED_EXT = TIME_ELAPSED_EXT, beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), isQueryEXT = js.Any.fromFunction1(isQueryEXT))
  
    __obj.asInstanceOf[WebGL1DisjointQueryTimerExtension]
  }
}

