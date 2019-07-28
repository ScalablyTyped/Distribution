package typings.theo.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(options: ConvertOptions): js.Promise[String] = js.native
  def convertSync(options: ConvertOptions): String = js.native
  def registerFormat[T /* <: String */](name: T, format: String): Unit = js.native
  def registerFormat[T /* <: String */](name: T, format: FormatResultFn): Unit = js.native
  def registerFormat[T /* <: String */](name: Format, format: String): Unit = js.native
  def registerFormat[T /* <: String */](name: Format, format: FormatResultFn): Unit = js.native
  def registerTransform[T /* <: String */, V /* <: String */](name: T, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
  def registerTransform[T /* <: String */, V /* <: String */](name: Transform, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
  def registerValueTransform[T /* <: String */](
    name: T,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
  def registerValueTransform[T /* <: String */](
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
}

