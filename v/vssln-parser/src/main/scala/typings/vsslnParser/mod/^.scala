package typings.vsslnParser.mod

import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vssln-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: String, callback: js.Function1[/* solution */ VsSolutionFile, Unit]): Unit = js.native
  def apply(input: ReadStream, callback: js.Function1[/* solution */ VsSolutionFile, Unit]): Unit = js.native
}

