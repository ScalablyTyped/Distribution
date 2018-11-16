package typings
package webglDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OES_vertex_array_object extends js.Object {
  def bindVertexArrayOES(): scala.Unit = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): scala.Unit = js.native
  // TS's lib.dom (as of v3.1.3) does not specify the nulls
  def createVertexArrayOES(): WebGLVertexArrayObjectOES | scala.Null = js.native
  def deleteVertexArrayOES(): scala.Unit = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): scala.Unit = js.native
  def isVertexArrayOES(): scala.Boolean = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): scala.Boolean = js.native
}

