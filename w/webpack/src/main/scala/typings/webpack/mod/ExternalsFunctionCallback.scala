package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalsFunctionCallback extends js.Object {
  /**
    * Invoke with no arguments to not externalize
    */
  def apply(): Unit = js.native
  /**
    * Callback with an Error
    */
  def apply(error: js.Object): Unit = js.native
   /* tslint:disable-line */ /**
    * Externalize the dependency
    */
  def apply(error: Null, result: String): Unit = js.native
  def apply(error: Null, result: String, `type`: String): Unit = js.native
  def apply(error: Null, result: js.Array[String]): Unit = js.native
  def apply(error: Null, result: js.Array[String], `type`: String): Unit = js.native
  def apply(error: Null, result: ExternalsObjectElement): Unit = js.native
  def apply(error: Null, result: ExternalsObjectElement, `type`: String): Unit = js.native
}

