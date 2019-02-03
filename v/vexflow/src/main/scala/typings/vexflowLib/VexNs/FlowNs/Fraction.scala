package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Fraction")
@js.native
class Fraction protected () extends js.Object {
  def this(numerator: scala.Double, denominator: scala.Double) = this()
  def abs(): Fraction = js.native
  def add(param1: scala.Double, param2: scala.Double): Fraction = js.native
  def add(param1: Fraction, param2: Fraction): Fraction = js.native
  def copy(copy: Fraction): Fraction = js.native
  def divide(param1: scala.Double, param2: scala.Double): Fraction = js.native
  def divide(param1: Fraction, param2: Fraction): Fraction = js.native
  def equals(compare: Fraction): scala.Boolean = js.native
  def fraction(): scala.Double = js.native
  def greaterThan(compare: Fraction): scala.Boolean = js.native
  def greaterThanEquals(compare: Fraction): scala.Boolean = js.native
  def lessThan(compare: Fraction): scala.Boolean = js.native
  def lessThanEquals(compare: Fraction): scala.Boolean = js.native
  def multiply(param1: scala.Double, param2: scala.Double): Fraction = js.native
  def multiply(param1: Fraction, param2: Fraction): Fraction = js.native
  def parse(str: java.lang.String): Fraction = js.native
  def quotient(): scala.Double = js.native
  def set(numerator: scala.Double, denominator: scala.Double): Fraction = js.native
  def simplify(): Fraction = js.native
  def subtract(param1: scala.Double, param2: scala.Double): Fraction = js.native
  def subtract(param1: Fraction, param2: Fraction): Fraction = js.native
  def toMixedString(): java.lang.String = js.native
  def toSimplifiedString(): java.lang.String = js.native
  def value(): scala.Double = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Fraction")
@js.native
object Fraction extends js.Object {
  def GCD(a: scala.Double, b: scala.Double): scala.Double = js.native
  def LCM(a: scala.Double, b: scala.Double): scala.Double = js.native
  def LCMM(a: scala.Double, b: scala.Double): scala.Double = js.native
}

