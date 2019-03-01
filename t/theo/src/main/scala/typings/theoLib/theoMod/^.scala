package typings
package theoLib.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(options: theoLib.theoMod.ConvertOptions): js.Promise[java.lang.String] = js.native
  def convertSync(options: theoLib.theoMod.ConvertOptions): java.lang.String = js.native
  def registerFormat[T /* <: java.lang.String */](name: T, format: java.lang.String): scala.Unit = js.native
  def registerFormat[T /* <: java.lang.String */](name: T, format: theoLib.theoMod.FormatResultFn): scala.Unit = js.native
  def registerFormat[T /* <: java.lang.String */](name: theoLib.theoMod.Format, format: java.lang.String): scala.Unit = js.native
  def registerFormat[T /* <: java.lang.String */](name: theoLib.theoMod.Format, format: theoLib.theoMod.FormatResultFn): scala.Unit = js.native
  def registerTransform[T /* <: java.lang.String */, V /* <: java.lang.String */](name: T, valueTransforms: js.Array[V | theoLib.theoMod.ValueTransform]): scala.Unit = js.native
  def registerTransform[T /* <: java.lang.String */, V /* <: java.lang.String */](name: theoLib.theoMod.Transform, valueTransforms: js.Array[V | theoLib.theoMod.ValueTransform]): scala.Unit = js.native
  def registerValueTransform[T /* <: java.lang.String */](
    name: T,
    predicate: js.Function1[/* prop */ theoLib.theoMod.Prop, scala.Boolean],
    transform: js.Function1[/* prop */ theoLib.theoMod.Prop, java.lang.String | scala.Double]
  ): scala.Unit = js.native
  def registerValueTransform[T /* <: java.lang.String */](
    name: theoLib.theoMod.ValueTransform,
    predicate: js.Function1[/* prop */ theoLib.theoMod.Prop, scala.Boolean],
    transform: js.Function1[/* prop */ theoLib.theoMod.Prop, java.lang.String | scala.Double]
  ): scala.Unit = js.native
}

