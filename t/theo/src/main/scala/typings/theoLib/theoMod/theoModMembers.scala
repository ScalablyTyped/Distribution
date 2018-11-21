package typings
package theoLib.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theo", JSImport.Namespace)
@js.native
object theoModMembers extends js.Object {
  def convert(options: ConvertOptions): stdLib.Promise[java.lang.String] = js.native
  def convertSync(options: ConvertOptions): java.lang.String = js.native
  def registerFormat(name: Format, format: java.lang.String): scala.Unit = js.native
  def registerFormat(name: Format, format: FormatResultFn): scala.Unit = js.native
  def registerTransform(name: Transform, valueTransforms: js.Array[ValueTransform]): scala.Unit = js.native
  def registerValueTransform(
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, scala.Boolean],
    transform: js.Function1[/* prop */ Prop, java.lang.String | scala.Double]
  ): scala.Unit = js.native
}

