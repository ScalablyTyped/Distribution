package typings
package theoLib.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(options: ConvertOptions): js.Promise[java.lang.String] = js.native
  def convertSync(options: ConvertOptions): java.lang.String = js.native
  def registerFormat[T /* <: java.lang.String */](name: T, format: java.lang.String): scala.Unit = js.native
  def registerFormat[T /* <: java.lang.String */](name: T, format: FormatResultFn): scala.Unit = js.native
  def registerFormat[T /* <: java.lang.String */](name: Format, format: java.lang.String): scala.Unit = js.native
  def registerFormat[T /* <: java.lang.String */](name: Format, format: FormatResultFn): scala.Unit = js.native
  def registerTransform[T /* <: java.lang.String */, V /* <: java.lang.String */](name: T, valueTransforms: js.Array[V | ValueTransform]): scala.Unit = js.native
  def registerTransform[T /* <: java.lang.String */, V /* <: java.lang.String */](name: Transform, valueTransforms: js.Array[V | ValueTransform]): scala.Unit = js.native
  def registerValueTransform[T /* <: java.lang.String */](
    name: T,
    predicate: js.Function1[/* prop */ Prop, scala.Boolean],
    transform: js.Function1[/* prop */ Prop, java.lang.String | scala.Double]
  ): scala.Unit = js.native
  def registerValueTransform[T /* <: java.lang.String */](
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, scala.Boolean],
    transform: js.Function1[/* prop */ Prop, java.lang.String | scala.Double]
  ): scala.Unit = js.native
}

