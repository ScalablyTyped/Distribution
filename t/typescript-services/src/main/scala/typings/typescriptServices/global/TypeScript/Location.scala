package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Location")
@js.native
class Location protected ()
  extends typings.typescriptServices.TypeScript.Location {
  def this(
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double
  ) = this()
  /* CompleteClass */
  override var _fileName: js.Any = js.native
  /* CompleteClass */
  override var _length: js.Any = js.native
  /* CompleteClass */
  override var _lineMap: js.Any = js.native
  /* CompleteClass */
  override var _start: js.Any = js.native
  /* CompleteClass */
  override def character(): Double = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def line(): Double = js.native
  /* CompleteClass */
  override def lineMap(): typings.typescriptServices.TypeScript.LineMap = js.native
  /* CompleteClass */
  override def start(): Double = js.native
}

/* static members */
@JSGlobal("TypeScript.Location")
@js.native
object Location extends js.Object {
  def equals(
    location1: typings.typescriptServices.TypeScript.Location,
    location2: typings.typescriptServices.TypeScript.Location
  ): Boolean = js.native
}

