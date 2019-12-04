package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataState extends js.Object {
  def getState(): js.Any
  def setState(state: js.Any): Unit
}

@JSGlobal("webix.DataState")
@js.native
object DataState extends TopLevel[DataState]

