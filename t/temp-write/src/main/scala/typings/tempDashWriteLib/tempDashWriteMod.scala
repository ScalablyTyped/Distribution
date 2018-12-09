package typings
package tempDashWriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp-write", JSImport.Namespace)
@js.native
object tempDashWriteMod extends js.Object {
  def apply(input: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream): js.Promise[java.lang.String] = js.native
  def apply(
    input: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream,
    filepath: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def sync(input: java.lang.String): java.lang.String = js.native
  def sync(input: java.lang.String, filepath: java.lang.String): java.lang.String = js.native
  def sync(input: nodeLib.Buffer): java.lang.String = js.native
  def sync(input: nodeLib.Buffer, filepath: java.lang.String): java.lang.String = js.native
}

