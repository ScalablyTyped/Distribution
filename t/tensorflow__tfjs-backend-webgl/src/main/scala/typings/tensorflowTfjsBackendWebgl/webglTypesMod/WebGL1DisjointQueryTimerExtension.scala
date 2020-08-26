package typings.tensorflowTfjsBackendWebgl.webglTypesMod

import typings.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGL1DisjointQueryTimerExtension extends js.Object {
  var GPU_DISJOINT_EXT: Double = js.native
  var QUERY_RESULT_AVAILABLE_EXT: Double = js.native
  var QUERY_RESULT_EXT: Double = js.native
  var TIME_ELAPSED_EXT: Double = js.native
  def beginQueryEXT(ext: Double, query: WebGLQuery): Unit = js.native
  def createQueryEXT(): js.Object = js.native
  def deleteQueryEXT(query: WebGLQuery): Unit = js.native
  def endQueryEXT(ext: Double): Unit = js.native
  def getQueryObjectEXT(query: WebGLQuery, queryResultAvailableExt: Double): Double = js.native
  def isQueryEXT(query: WebGLQuery): Boolean = js.native
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
  @scala.inline
  implicit class WebGL1DisjointQueryTimerExtensionOps[Self <: WebGL1DisjointQueryTimerExtension] (val x: Self) extends AnyVal {
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
    def setGPU_DISJOINT_EXT(value: Double): Self = this.set("GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUERY_RESULT_AVAILABLE_EXT(value: Double): Self = this.set("QUERY_RESULT_AVAILABLE_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUERY_RESULT_EXT(value: Double): Self = this.set("QUERY_RESULT_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIME_ELAPSED_EXT(value: Double): Self = this.set("TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginQueryEXT(value: (Double, WebGLQuery) => Unit): Self = this.set("beginQueryEXT", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateQueryEXT(value: () => js.Object): Self = this.set("createQueryEXT", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteQueryEXT(value: WebGLQuery => Unit): Self = this.set("deleteQueryEXT", js.Any.fromFunction1(value))
    @scala.inline
    def setEndQueryEXT(value: Double => Unit): Self = this.set("endQueryEXT", js.Any.fromFunction1(value))
    @scala.inline
    def setGetQueryObjectEXT(value: (WebGLQuery, Double) => Double): Self = this.set("getQueryObjectEXT", js.Any.fromFunction2(value))
    @scala.inline
    def setIsQueryEXT(value: WebGLQuery => Boolean): Self = this.set("isQueryEXT", js.Any.fromFunction1(value))
  }
  
}

