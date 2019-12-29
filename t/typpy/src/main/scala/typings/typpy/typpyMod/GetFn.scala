package typings.typpy.typpyMod

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.RegExp
import typings.std.RegExpConstructor
import typings.std.StringConstructor
import typings.typpy.typpyBooleans.`false`
import typings.typpy.typpyBooleans.`true`
import typings.typpy.typpyStrings.`null`
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
import scala.scalajs.js.annotation._

@js.native
trait GetFn extends js.Object {
  def apply(): Null = js.native
  def apply(input: js.UndefOr[scala.Nothing], asString: `false`): Unit = js.native
  def apply(input: js.UndefOr[scala.Nothing], asString: `true`): undefined = js.native
  def apply(input: String): StringConstructor = js.native
  def apply(input: String, asString: `false`): StringConstructor = js.native
  def apply(input: String, asString: `true`): string = js.native
   // tslint:disable-line:ban-types
  def apply(input: js.Any): ConstructorFn = js.native
  def apply(input: js.Any, asString: `false`): ConstructorFn = js.native
   // tslint:disable-line:ban-types
  def apply(input: js.Any, asString: `true`): String = js.native
  def apply(input: js.Array[_]): ArrayConstructor = js.native
  def apply(input: js.Array[_], asString: `false`): ArrayConstructor = js.native
  def apply(input: js.Array[_], asString: `true`): array = js.native
  def apply(input: js.Function): FunctionConstructor = js.native
  def apply(input: js.Function, asString: `false`): FunctionConstructor = js.native
  def apply(input: js.Function, asString: `true`): function = js.native
  def apply(input: Boolean): BooleanConstructor = js.native
  def apply(input: Boolean, asString: `false`): BooleanConstructor = js.native
  def apply(input: Boolean, asString: `true`): boolean = js.native
  def apply(input: Double): NumberConstructor | Double = js.native
  def apply(input: Double, asString: `false`): NumberConstructor | Double = js.native
  def apply(input: Double, asString: `true`): number | nan = js.native
  def apply(input: Null, asString: `false`): Null = js.native
  def apply(input: Null, asString: `true`): `null` = js.native
  def apply(input: RegExp): RegExpConstructor = js.native
  def apply(input: RegExp, asString: `false`): RegExpConstructor = js.native
  def apply(input: RegExp, asString: `true`): regexp = js.native
}

