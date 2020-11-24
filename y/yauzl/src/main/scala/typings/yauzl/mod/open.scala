package typings.yauzl.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yauzl", "open")
@js.native
object open extends js.Object {
  
  def apply(path: String): Unit = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
  def apply(path: String, options: Options): Unit = js.native
  def apply(
    path: String,
    options: Options,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* zipfile */ js.UndefOr[ZipFile], Unit]
  ): Unit = js.native
}
