package typings.typpy.mod

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RegExp
import typings.std.RegExpConstructor
import typings.std.StringConstructor
import typings.typpy.typpyBooleans.`false`
import typings.typpy.typpyBooleans.`true`
import typings.typpy.typpyStrings.`null`
import typings.typpy.typpyStrings.`object`
import typings.typpy.typpyStrings.array
import typings.typpy.typpyStrings.boolean
import typings.typpy.typpyStrings.function
import typings.typpy.typpyStrings.nan
import typings.typpy.typpyStrings.number
import typings.typpy.typpyStrings.regexp
import typings.typpy.typpyStrings.string
import typings.typpy.typpyStrings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typpy.typpy.IsFn & typpy.typpy.CompareFn & {  is :typpy.typpy.CompareFn,   get :typpy.typpy.GetFn} */
@js.native
trait TyppyFn extends js.Object {
  
  def apply(): `true` = js.native
  def apply(input: js.UndefOr[scala.Nothing]): undefined = js.native
  def apply(input: js.UndefOr[scala.Nothing], compareTo: undefined): `true` = js.native
  def apply(input: String): string = js.native
  def apply(input: String, compareTo: StringConstructor): `true` = js.native
  def apply(input: String, compareTo: string): `true` = js.native
  def apply(input: js.Any): String = js.native
  def apply(input: js.Any, compareTo: js.Any): Boolean = js.native
  def apply(input: js.Array[_]): array = js.native
  def apply(input: js.Array[_], compareTo: ArrayConstructor): `true` = js.native
  def apply(input: js.Array[_], compareTo: array): `true` = js.native
  def apply(input: js.Function): function = js.native
  def apply(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
  def apply(input: js.Function, compareTo: function): `true` = js.native
  def apply(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
  def apply(input: js.Object, compareTo: `object`): Boolean = js.native
  def apply(input: Boolean): boolean = js.native
  def apply(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
  def apply(input: Boolean, compareTo: boolean): `true` = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double): number | nan = js.native
  def apply(input: Double, compareTo: Double): Boolean = js.native
  def apply(input: Double, compareTo: NumberConstructor): Boolean = js.native
  def apply(input: Double, compareTo: nan): Boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double, compareTo: number): Boolean = js.native
  def apply(input: Null): `null` = js.native
  def apply(input: Null, compareTo: `null`): `true` = js.native
  def apply(input: RegExp): regexp = js.native
  def apply(input: RegExp, compareTo: RegExpConstructor): `true` = js.native
  def apply(input: RegExp, compareTo: regexp): `true` = js.native
  
  def get(): Null = js.native
  def get(input: String): StringConstructor = js.native
   // tslint:disable-line:ban-types
  def get(input: js.Any): ConstructorFn = js.native
  def get(input: js.Array[_]): ArrayConstructor = js.native
  def get(input: js.Function): FunctionConstructor = js.native
  def get(input: Boolean): BooleanConstructor = js.native
  def get(input: Double): NumberConstructor | Double = js.native
  def get(input: RegExp): RegExpConstructor = js.native
  @JSName("get")
  var get_Original: GetFn = js.native
  @JSName("get")
  def get_Unit(): Unit = js.native
  @JSName("get")
  def get_false(input: js.UndefOr[scala.Nothing], asString: `false`): Unit = js.native
  @JSName("get")
  def get_false(input: String, asString: `false`): StringConstructor = js.native
  @JSName("get")
  def get_false(input: js.Any, asString: `false`): ConstructorFn = js.native
  @JSName("get")
  def get_false(input: js.Array[_], asString: `false`): ArrayConstructor = js.native
  @JSName("get")
  def get_false(input: js.Function, asString: `false`): FunctionConstructor = js.native
  @JSName("get")
  def get_false(input: Boolean, asString: `false`): BooleanConstructor = js.native
  @JSName("get")
  def get_false(input: Double, asString: `false`): NumberConstructor | Double = js.native
  @JSName("get")
  def get_false(input: Null, asString: `false`): Null = js.native
  @JSName("get")
  def get_false(input: RegExp, asString: `false`): RegExpConstructor = js.native
  @JSName("get")
  def get_true(input: js.UndefOr[scala.Nothing], asString: `true`): undefined = js.native
  @JSName("get")
  def get_true(input: String, asString: `true`): string = js.native
   // tslint:disable-line:ban-types
  @JSName("get")
  def get_true(input: js.Any, asString: `true`): String = js.native
  @JSName("get")
  def get_true(input: js.Array[_], asString: `true`): array = js.native
  @JSName("get")
  def get_true(input: js.Function, asString: `true`): function = js.native
  @JSName("get")
  def get_true(input: Boolean, asString: `true`): boolean = js.native
  @JSName("get")
  def get_true(input: Double, asString: `true`): number | nan = js.native
  @JSName("get")
  def get_true(input: Null, asString: `true`): `null` = js.native
  @JSName("get")
  def get_true(input: RegExp, asString: `true`): regexp = js.native
  
  def is(): `true` = js.native
  def is(input: String, compareTo: StringConstructor): `true` = js.native
  def is(input: js.Any, compareTo: js.Any): Boolean = js.native
  def is(input: js.Array[_], compareTo: ArrayConstructor): `true` = js.native
  def is(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
  def is(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
  def is(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
  def is(input: Double, compareTo: Double): Boolean = js.native
  def is(input: Double, compareTo: NumberConstructor): Boolean = js.native
  def is(input: RegExp, compareTo: RegExpConstructor): `true` = js.native
  @JSName("is")
  var is_Original: CompareFn = js.native
  @JSName("is")
  def is_array(input: js.Array[_], compareTo: array): `true` = js.native
  @JSName("is")
  def is_boolean(input: Boolean, compareTo: boolean): `true` = js.native
  @JSName("is")
  def is_function(input: js.Function, compareTo: function): `true` = js.native
  @JSName("is")
  def is_nan(input: Double, compareTo: nan): Boolean = js.native
  @JSName("is")
  def is_null(input: Null, compareTo: `null`): `true` = js.native
   // tslint:disable-line:ban-types
  @JSName("is")
  def is_number(input: Double, compareTo: number): Boolean = js.native
  @JSName("is")
  def is_object(input: js.Object, compareTo: `object`): Boolean = js.native
  @JSName("is")
  def is_regexp(input: RegExp, compareTo: regexp): `true` = js.native
  @JSName("is")
  def is_string(input: String, compareTo: string): `true` = js.native
  @JSName("is")
  def is_undefined(input: js.UndefOr[scala.Nothing], compareTo: undefined): `true` = js.native
}
