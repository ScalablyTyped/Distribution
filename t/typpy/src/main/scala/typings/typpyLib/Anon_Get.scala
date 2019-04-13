package typings
package typpyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Get extends js.Object {
  @JSName("get")
  var get_Original: typpyLib.typpyMod.GetFn = js.native
  @JSName("is")
  var is_Original: typpyLib.typpyMod.CompareFn = js.native
  def get(): scala.Unit = js.native
  def get(input: java.lang.String): stdLib.StringConstructor = js.native
  def get(input: java.lang.String, asString: typpyLib.typpyLibNumbers.`false`): stdLib.StringConstructor = js.native
  def get(input: java.lang.String, asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.string = js.native
   // tslint:disable-line:ban-types
  def get(input: js.Any): typpyLib.typpyMod.ConstructorFn = js.native
  def get(input: js.Any, asString: typpyLib.typpyLibNumbers.`false`): typpyLib.typpyMod.ConstructorFn = js.native
   // tslint:disable-line:ban-types
  def get(input: js.Any, asString: typpyLib.typpyLibNumbers.`true`): java.lang.String = js.native
  def get(input: js.Array[_]): stdLib.ArrayConstructor = js.native
  def get(input: js.Array[_], asString: typpyLib.typpyLibNumbers.`false`): stdLib.ArrayConstructor = js.native
  def get(input: js.Array[_], asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.array = js.native
  def get(input: js.Function): stdLib.FunctionConstructor = js.native
  def get(input: js.Function, asString: typpyLib.typpyLibNumbers.`false`): stdLib.FunctionConstructor = js.native
  def get(input: js.Function, asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.function = js.native
  def get(input: js.UndefOr[scala.Nothing], asString: typpyLib.typpyLibNumbers.`false`): scala.Unit = js.native
  def get(input: js.UndefOr[scala.Nothing], asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.undefined = js.native
  def get(input: scala.Boolean): stdLib.BooleanConstructor = js.native
  def get(input: scala.Boolean, asString: typpyLib.typpyLibNumbers.`false`): stdLib.BooleanConstructor = js.native
  def get(input: scala.Boolean, asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.boolean = js.native
  def get(input: scala.Double): stdLib.NumberConstructor | scala.Double = js.native
  def get(input: scala.Double, asString: typpyLib.typpyLibNumbers.`false`): stdLib.NumberConstructor | scala.Double = js.native
  def get(input: scala.Double, asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.number | typpyLib.typpyLibStrings.nan = js.native
  def get(input: scala.Null, asString: typpyLib.typpyLibNumbers.`false`): scala.Null = js.native
  def get(input: scala.Null, asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.`null` = js.native
  def get(input: stdLib.RegExp): stdLib.RegExpConstructor = js.native
  def get(input: stdLib.RegExp, asString: typpyLib.typpyLibNumbers.`false`): stdLib.RegExpConstructor = js.native
  def get(input: stdLib.RegExp, asString: typpyLib.typpyLibNumbers.`true`): typpyLib.typpyLibStrings.regexp = js.native
  @JSName("get")
  def get_Null(): scala.Null = js.native
  def is(): typpyLib.typpyLibNumbers.`true` = js.native
  def is(input: java.lang.String, compareTo: stdLib.StringConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def is(input: js.Any, compareTo: js.Any): scala.Boolean = js.native
  def is(input: js.Array[_], compareTo: stdLib.ArrayConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def is(input: js.Function, compareTo: stdLib.FunctionConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def is(input: js.Object, compareTo: stdLib.ObjectConstructor): scala.Boolean = js.native
  def is(input: scala.Boolean, compareTo: stdLib.BooleanConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def is(input: scala.Double, compareTo: scala.Double): scala.Boolean = js.native
  def is(input: scala.Double, compareTo: stdLib.NumberConstructor): scala.Boolean = js.native
  def is(input: stdLib.RegExp, compareTo: stdLib.RegExpConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  @JSName("is")
  def is_array(input: js.Array[_], compareTo: typpyLib.typpyLibStrings.array): typpyLib.typpyLibNumbers.`true` = js.native
  @JSName("is")
  def is_boolean(input: scala.Boolean, compareTo: typpyLib.typpyLibStrings.boolean): typpyLib.typpyLibNumbers.`true` = js.native
  @JSName("is")
  def is_function(input: js.Function, compareTo: typpyLib.typpyLibStrings.function): typpyLib.typpyLibNumbers.`true` = js.native
  @JSName("is")
  def is_nan(input: scala.Double, compareTo: typpyLib.typpyLibStrings.nan): scala.Boolean = js.native
  @JSName("is")
  def is_null(input: scala.Null, compareTo: typpyLib.typpyLibStrings.`null`): typpyLib.typpyLibNumbers.`true` = js.native
   // tslint:disable-line:ban-types
  @JSName("is")
  def is_number(input: scala.Double, compareTo: typpyLib.typpyLibStrings.number): scala.Boolean = js.native
  @JSName("is")
  def is_object(input: js.Object, compareTo: typpyLib.typpyLibStrings.`object`): scala.Boolean = js.native
  @JSName("is")
  def is_regexp(input: stdLib.RegExp, compareTo: typpyLib.typpyLibStrings.regexp): typpyLib.typpyLibNumbers.`true` = js.native
  @JSName("is")
  def is_string(input: java.lang.String, compareTo: typpyLib.typpyLibStrings.string): typpyLib.typpyLibNumbers.`true` = js.native
  @JSName("is")
  def is_undefined(input: js.UndefOr[scala.Nothing], compareTo: typpyLib.typpyLibStrings.undefined): typpyLib.typpyLibNumbers.`true` = js.native
}

