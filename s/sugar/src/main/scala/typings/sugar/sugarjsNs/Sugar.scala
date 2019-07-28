package typings.sugar.sugarjsNs

import typings.std.ArrayLike
import typings.sugar.sugarjsNs.ArrayNs.Chainable
import typings.sugar.sugarjsNs.ArrayNs.Constructor
import typings.sugar.sugarjsNs.DateNs.DateCreateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sugar extends js.Object {
  @JSName("Array")
  var Array_Original: Constructor = js.native
  @JSName("Date")
  var Date_Original: typings.sugar.sugarjsNs.DateNs.Constructor = js.native
  @JSName("Function")
  var Function_Original: typings.sugar.sugarjsNs.FunctionNs.Constructor = js.native
  @JSName("Number")
  var Number_Original: typings.sugar.sugarjsNs.NumberNs.Constructor = js.native
  @JSName("Object")
  var Object_Original: typings.sugar.sugarjsNs.ObjectNs.Constructor = js.native
  @JSName("RegExp")
  var RegExp_Original: typings.sugar.sugarjsNs.RegExpNs.Constructor = js.native
  @JSName("String")
  var String_Original: typings.sugar.sugarjsNs.StringNs.Constructor = js.native
  def apply(): Sugar = js.native
  def apply(opts: ExtendOptions): Sugar = js.native
  def Array[T](): Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: Double): Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: Double, clone: Boolean): Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T]): Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, js.Array[T]] = js.native
  def Date(): typings.sugar.sugarjsNs.DateNs.Chainable[typings.std.Date] = js.native
  def Date(d: String): typings.sugar.sugarjsNs.DateNs.Chainable[typings.std.Date] = js.native
  def Date(d: String, options: DateCreateOptions): typings.sugar.sugarjsNs.DateNs.Chainable[typings.std.Date] = js.native
  def Date(d: Double): typings.sugar.sugarjsNs.DateNs.Chainable[typings.std.Date] = js.native
  def Date(d: Double, options: DateCreateOptions): typings.sugar.sugarjsNs.DateNs.Chainable[typings.std.Date] = js.native
  def Date(d: typings.std.Date): typings.sugar.sugarjsNs.DateNs.Chainable[typings.std.Date] = js.native
  def Date(d: typings.std.Date, options: DateCreateOptions): typings.sugar.sugarjsNs.DateNs.Chainable[typings.std.Date] = js.native
  def Function(): typings.sugar.sugarjsNs.FunctionNs.Chainable[js.Function] = js.native
  def Function(raw: js.Function): typings.sugar.sugarjsNs.FunctionNs.Chainable[js.Function] = js.native
  def Number(): typings.sugar.sugarjsNs.NumberNs.Chainable[Double] = js.native
  def Number(raw: Double): typings.sugar.sugarjsNs.NumberNs.Chainable[Double] = js.native
  def Object(): typings.sugar.sugarjsNs.ObjectNs.Chainable[js.Object] = js.native
  def Object(raw: js.Object): typings.sugar.sugarjsNs.ObjectNs.Chainable[js.Object] = js.native
  def RegExp(): typings.sugar.sugarjsNs.RegExpNs.Chainable[typings.std.RegExp] = js.native
  def RegExp(raw: typings.std.RegExp): typings.sugar.sugarjsNs.RegExpNs.Chainable[typings.std.RegExp] = js.native
  def String(): typings.sugar.sugarjsNs.StringNs.Chainable[java.lang.String] = js.native
  def String(raw: java.lang.String): typings.sugar.sugarjsNs.StringNs.Chainable[java.lang.String] = js.native
  def createNamespace(name: String): SugarNamespace = js.native
  def extend(): Sugar = js.native
  def extend(opts: ExtendOptions): Sugar = js.native
}

