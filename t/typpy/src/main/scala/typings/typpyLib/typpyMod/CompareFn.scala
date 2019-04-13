package typings
package typpyLib.typpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareFn extends js.Object {
  def apply(): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: java.lang.String, compareTo: stdLib.StringConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: java.lang.String, compareTo: typpyLib.typpyLibStrings.string): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: js.Any, compareTo: js.Any): scala.Boolean = js.native
  def apply(input: js.Array[_], compareTo: stdLib.ArrayConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: js.Array[_], compareTo: typpyLib.typpyLibStrings.array): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: js.Function, compareTo: stdLib.FunctionConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: js.Function, compareTo: typpyLib.typpyLibStrings.function): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: js.Object, compareTo: stdLib.ObjectConstructor): scala.Boolean = js.native
  def apply(input: js.Object, compareTo: typpyLib.typpyLibStrings.`object`): scala.Boolean = js.native
  def apply(input: js.UndefOr[scala.Nothing], compareTo: typpyLib.typpyLibStrings.undefined): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: scala.Boolean, compareTo: stdLib.BooleanConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: scala.Boolean, compareTo: typpyLib.typpyLibStrings.boolean): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: scala.Double, compareTo: scala.Double): scala.Boolean = js.native
  def apply(input: scala.Double, compareTo: stdLib.NumberConstructor): scala.Boolean = js.native
  def apply(input: scala.Double, compareTo: typpyLib.typpyLibStrings.nan): scala.Boolean = js.native
   // tslint:disable-line:ban-types
  def apply(input: scala.Double, compareTo: typpyLib.typpyLibStrings.number): scala.Boolean = js.native
  def apply(input: scala.Null, compareTo: typpyLib.typpyLibStrings.`null`): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: stdLib.RegExp, compareTo: stdLib.RegExpConstructor): typpyLib.typpyLibNumbers.`true` = js.native
  def apply(input: stdLib.RegExp, compareTo: typpyLib.typpyLibStrings.regexp): typpyLib.typpyLibNumbers.`true` = js.native
}

