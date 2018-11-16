package typings
package sugarLib.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sugar extends js.Object {
  @JSName("Array")
  var Array_Original: sugarLib.sugarjsNs.ArrayNs.Constructor = js.native
  @JSName("Date")
  var Date_Original: sugarLib.sugarjsNs.DateNs.Constructor = js.native
  @JSName("Function")
  var Function_Original: sugarLib.sugarjsNs.FunctionNs.Constructor = js.native
  @JSName("Number")
  var Number_Original: sugarLib.sugarjsNs.NumberNs.Constructor = js.native
  @JSName("Object")
  var Object_Original: sugarLib.sugarjsNs.ObjectNs.Constructor = js.native
  @JSName("RegExp")
  var RegExp_Original: sugarLib.sugarjsNs.RegExpNs.Constructor = js.native
  @JSName("String")
  var String_Original: sugarLib.sugarjsNs.StringNs.Constructor = js.native
  def apply(): Sugar = js.native
  def apply(opts: ExtendOptions): Sugar = js.native
  def Array[T](): sugarLib.sugarjsNs.ArrayNs.Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: scala.Double): sugarLib.sugarjsNs.ArrayNs.Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: scala.Double, clone: scala.Boolean): sugarLib.sugarjsNs.ArrayNs.Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: stdLib.ArrayLike[T]): sugarLib.sugarjsNs.ArrayNs.Chainable[T, js.Array[T]] = js.native
  def Array[T](obj: stdLib.ArrayLike[T], clone: scala.Boolean): sugarLib.sugarjsNs.ArrayNs.Chainable[T, js.Array[T]] = js.native
  def Date(): sugarLib.sugarjsNs.DateNs.Chainable[stdLib.Date] = js.native
  def Date(d: java.lang.String): sugarLib.sugarjsNs.DateNs.Chainable[stdLib.Date] = js.native
  def Date(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.DateNs.Chainable[stdLib.Date] = js.native
  def Date(d: scala.Double): sugarLib.sugarjsNs.DateNs.Chainable[stdLib.Date] = js.native
  def Date(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.DateNs.Chainable[stdLib.Date] = js.native
  def Date(d: stdLib.Date): sugarLib.sugarjsNs.DateNs.Chainable[stdLib.Date] = js.native
  def Date(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.DateNs.Chainable[stdLib.Date] = js.native
  def Function(): sugarLib.sugarjsNs.FunctionNs.Chainable[js.Function] = js.native
  def Function(raw: js.Function): sugarLib.sugarjsNs.FunctionNs.Chainable[js.Function] = js.native
  def Number(): sugarLib.sugarjsNs.NumberNs.Chainable[scala.Double] = js.native
  def Number(raw: scala.Double): sugarLib.sugarjsNs.NumberNs.Chainable[scala.Double] = js.native
  def Object(): sugarLib.sugarjsNs.ObjectNs.Chainable[js.Object] = js.native
  def Object(raw: js.Object): sugarLib.sugarjsNs.ObjectNs.Chainable[js.Object] = js.native
  def RegExp(): sugarLib.sugarjsNs.RegExpNs.Chainable[stdLib.RegExp] = js.native
  def RegExp(raw: stdLib.RegExp): sugarLib.sugarjsNs.RegExpNs.Chainable[stdLib.RegExp] = js.native
  def String(): sugarLib.sugarjsNs.StringNs.Chainable[java.lang.String] = js.native
  def String(raw: java.lang.String): sugarLib.sugarjsNs.StringNs.Chainable[java.lang.String] = js.native
  def createNamespace(name: java.lang.String): SugarNamespace = js.native
  def extend(): Sugar = js.native
  def extend(opts: ExtendOptions): Sugar = js.native
}

