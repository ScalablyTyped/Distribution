package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OESVertexArrayObject extends StObject {
  
  def bindVertexArrayOES(): Unit = js.native
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  // TS's lib.dom (as of v3.1.3) does not specify the nulls
  def createVertexArrayOES(): WebGLVertexArrayObjectOES | Null = js.native
  
  def deleteVertexArrayOES(): Unit = js.native
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit = js.native
  
  def isVertexArrayOES(): Boolean = js.native
  def isVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Boolean = js.native
}
