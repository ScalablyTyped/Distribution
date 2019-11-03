package typings.systemjs.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportFn extends js.Object {
  def apply(exportName: String, value: js.Any): Unit = js.native
  def apply(exports: js.Object): Unit = js.native
}

