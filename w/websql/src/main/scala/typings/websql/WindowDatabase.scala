package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//[Supplemental, NoInterfaceObject]
@js.native
trait WindowDatabase extends js.Object {
  def openDatabase(name: DOMString, version: DOMString, displayName: DOMString, estimatedSize: Double): Database = js.native
  def openDatabase(
    name: DOMString,
    version: DOMString,
    displayName: DOMString,
    estimatedSize: Double,
    creationCallback: DatabaseCallback
  ): Database = js.native
}

