package typings
package threeLib.srcMathVector2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vector extends js.Object {
  /**
    * NOTE: Vector4 doesn't have the property.
    *
    * distanceTo(v:T):number;
    */
  var distanceTo: js.UndefOr[js.Function1[/* v */ this.type, scala.Double]] = js.native
  /**
    * NOTE: Vector4 doesn't have the property.
    *
    * distanceToSquared(v:T):number;
    */
  var distanceToSquared: js.UndefOr[js.Function1[/* v */ this.type, scala.Double]] = js.native
  /**
    * NOTE: The second argument is deprecated.
    *
    * add(v:T):T;
    */
  def add(v: Vector): this.type = js.native
  def add(v: Vector, w: Vector): this.type = js.native
  /**
    * Adds the scalar value s to this vector's values.
    */
  def addScalar(scalar: scala.Double): this.type = js.native
  def addScaledVector(vector: Vector, scale: scala.Double): this.type = js.native
  /**
    * addVectors(a:T, b:T):T;
    */
  def addVectors(a: Vector, b: Vector): this.type = js.native
  /**
    * copy(v:T):T;
    */
  def copy(v: Vector): this.type = js.native
  /**
    * divideScalar(s:number):T;
    */
  def divideScalar(s: scala.Double): this.type = js.native
  /**
    * dot(v:T):T;
    */
  def dot(v: Vector): scala.Double = js.native
  /**
    * equals(v:T):boolean;
    */
  def equals(v: Vector): scala.Boolean = js.native
  def getComponent(index: scala.Double): scala.Double = js.native
  /**
    * length():number;
    */
  def length(): scala.Double = js.native
  /**
    * lengthSq():number;
    */
  def lengthSq(): scala.Double = js.native
  /**
    * lerp(v:T, alpha:number):T;
    */
  def lerp(v: Vector, alpha: scala.Double): this.type = js.native
  /**
    * multiplyScalar(s:number):T;
    */
  def multiplyScalar(s: scala.Double): this.type = js.native
  /**
    * negate():T;
    */
  def negate(): this.type = js.native
  /**
    * normalize():T;
    */
  def normalize(): this.type = js.native
  def set(args: scala.Double*): this.type = js.native
  def setComponent(index: scala.Double, value: scala.Double): this.type = js.native
  /**
    * setLength(l:number):T;
    */
  def setLength(l: scala.Double): this.type = js.native
  def setScalar(scalar: scala.Double): this.type = js.native
  /**
    * sub(v:T):T;
    */
  def sub(v: Vector): this.type = js.native
  /**
    * subVectors(a:T, b:T):T;
    */
  def subVectors(a: Vector, b: Vector): this.type = js.native
}

