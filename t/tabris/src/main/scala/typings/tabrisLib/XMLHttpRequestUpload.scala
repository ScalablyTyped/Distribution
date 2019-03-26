package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestUpload
  extends EventTarget
     with XMLHttpRequestEventTarget {
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListener, useCapture: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("XMLHttpRequestUpload")
@js.native
class XMLHttpRequestUploadCls () extends XMLHttpRequestUpload

@JSGlobal("XMLHttpRequestUpload")
@js.native
object XMLHttpRequestUpload
  extends org.scalablytyped.runtime.Instantiable0[XMLHttpRequestUpload]

