package typings.xmldsigjs.typesPkijsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "SingleResponse")
@js.native
class SingleResponse () extends js.Object {
  def this(params: js.Any) = this()
  var certID: CertID = js.native
  var certStatus: js.Any = js.native
  var nextUpdate: js.UndefOr[Date] = js.native
  var singleExtensions: js.Array[Extension] = js.native
  var thisUpdate: Date = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "SingleResponse")
@js.native
object SingleResponse extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

