package typings.sugar.sugarjs

import typings.std.ArrayLike
import typings.sugar.sugarjs.Array.Chainable
import typings.sugar.sugarjs.Array.Constructor
import typings.sugar.sugarjs.Date.DateCreateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sugar extends js.Object {
  @JSName("Array")
  var Array_Original: Constructor = js.native
  @JSName("Date")
  var Date_Original: typings.sugar.sugarjs.Date.Constructor = js.native
  @JSName("Function")
  var Function_Original: typings.sugar.sugarjs.Function.Constructor = js.native
  @JSName("Number")
  var Number_Original: typings.sugar.sugarjs.Number.Constructor = js.native
  @JSName("Object")
  var Object_Original: typings.sugar.sugarjs.Object.Constructor = js.native
  @JSName("RegExp")
  var RegExp_Original: typings.sugar.sugarjs.RegExp.Constructor = js.native
  @JSName("String")
  var String_Original: typings.sugar.sugarjs.String.Constructor = js.native
  def apply(): Sugar = js.native
  def apply(opts: ExtendOptions): Sugar = js.native
  def Array[T](): Chainable[T, typings.sugar.Array[T]] = js.native
  def Array[T](obj: js.UndefOr[scala.Nothing], clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
  def Array[T](obj: Double): Chainable[T, typings.sugar.Array[T]] = js.native
  def Array[T](obj: Double, clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T]): Chainable[T, typings.sugar.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
  def Date(): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Date(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Date(d: java.lang.String): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Date(d: java.lang.String, options: DateCreateOptions): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Date(d: Double): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Date(d: Double, options: DateCreateOptions): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Date(d: typings.sugar.Date): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Date(d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] = js.native
  def Function(): typings.sugar.sugarjs.Function.Chainable[typings.sugar.Function] = js.native
  def Function(raw: typings.sugar.Function): typings.sugar.sugarjs.Function.Chainable[typings.sugar.Function] = js.native
  def Number(): typings.sugar.sugarjs.Number.Chainable[Double] = js.native
  def Number(raw: Double): typings.sugar.sugarjs.Number.Chainable[Double] = js.native
  def Object(): typings.sugar.sugarjs.Object.Chainable[js.Object] = js.native
  def Object(raw: js.Object): typings.sugar.sugarjs.Object.Chainable[js.Object] = js.native
  def RegExp(): typings.sugar.sugarjs.RegExp.Chainable[typings.sugar.RegExp] = js.native
  def RegExp(raw: typings.sugar.RegExp): typings.sugar.sugarjs.RegExp.Chainable[typings.sugar.RegExp] = js.native
  def String(): typings.sugar.sugarjs.String.Chainable[java.lang.String] = js.native
  def String(raw: java.lang.String): typings.sugar.sugarjs.String.Chainable[java.lang.String] = js.native
  def createNamespace(name: java.lang.String): SugarNamespace = js.native
  def extend(): Sugar = js.native
  def extend(opts: ExtendOptions): Sugar = js.native
}

