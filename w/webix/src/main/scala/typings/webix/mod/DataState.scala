package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataState extends js.Object {
  def getState(): js.Any = js.native
  def setState(state: js.Any): Unit = js.native
}

@JSImport("webix", "DataState")
@js.native
object DataState extends TopLevel[DataState]

