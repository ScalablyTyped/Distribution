package typings.typpy.mod

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RegExp
import typings.std.RegExpConstructor
import typings.std.StringConstructor
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

@js.native
trait CompareFn extends js.Object {
  
  def apply(): `true` = js.native
  def apply(input: js.UndefOr[scala.Nothing], compareTo: undefined): `true` = js.native
  def apply(input: String, compareTo: StringConstructor): `true` = js.native
  def apply(input: String, compareTo: string): `true` = js.native
  def apply(input: js.Any, compareTo: js.Any): Boolean = js.native
  def apply(input: js.Array[_], compareTo: ArrayConstructor): `true` = js.native
  def apply(input: js.Array[_], compareTo: array): `true` = js.native
  def apply(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
  def apply(input: js.Function, compareTo: function): `true` = js.native
  def apply(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
  def apply(input: js.Object, compareTo: `object`): Boolean = js.native
  def apply(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
  def apply(input: Boolean, compareTo: boolean): `true` = js.native
  def apply(input: Double, compareTo: Double): Boolean = js.native
  def apply(input: Double, compareTo: NumberConstructor): Boolean = js.native
  def apply(input: Double, compareTo: nan): Boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: Double, compareTo: number): Boolean = js.native
  def apply(input: Null, compareTo: `null`): `true` = js.native
  def apply(input: RegExp, compareTo: RegExpConstructor): `true` = js.native
  def apply(input: RegExp, compareTo: regexp): `true` = js.native
}
