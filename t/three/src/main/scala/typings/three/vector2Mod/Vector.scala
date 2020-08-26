package typings.three.vector2Mod

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
  var distanceTo: js.UndefOr[js.Function1[/* v */ this.type, Double]] = js.native
  /**
  	 * NOTE: Vector4 doesn't have the property.
  	 *
  	 * distanceToSquared(v:T):number;
  	 */
  var distanceToSquared: js.UndefOr[js.Function1[/* v */ this.type, Double]] = js.native
  /**
  	 * NOTE: The second argument is deprecated.
  	 *
  	 * add(v:T):T;
  	 */
  def add(v: Vector): this.type = js.native
  /**
  	 * Adds the scalar value s to this vector's values.
  	 */
  def addScalar(scalar: Double): this.type = js.native
  def addScaledVector(vector: Vector, scale: Double): this.type = js.native
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
  def divideScalar(s: Double): this.type = js.native
  /**
  	 * dot(v:T):T;
  	 */
  def dot(v: Vector): Double = js.native
  /**
  	 * equals(v:T):boolean;
  	 */
  def equals(v: Vector): Boolean = js.native
  def getComponent(index: Double): Double = js.native
  /**
  	 * length():number;
  	 */
  def length(): Double = js.native
  /**
  	 * lengthSq():number;
  	 */
  def lengthSq(): Double = js.native
  /**
  	 * lerp(v:T, alpha:number):T;
  	 */
  def lerp(v: Vector, alpha: Double): this.type = js.native
  /**
  	 * multiplyScalar(s:number):T;
  	 */
  def multiplyScalar(s: Double): this.type = js.native
  /**
  	 * negate():T;
  	 */
  def negate(): this.type = js.native
  /**
  	 * normalize():T;
  	 */
  def normalize(): this.type = js.native
  def set(args: Double*): this.type = js.native
  def setComponent(index: Double, value: Double): this.type = js.native
  /**
  	 * setLength(l:number):T;
  	 */
  def setLength(l: Double): this.type = js.native
  def setScalar(scalar: Double): this.type = js.native
  /**
  	 * sub(v:T):T;
  	 */
  def sub(v: Vector): this.type = js.native
  /**
  	 * subVectors(a:T, b:T):T;
  	 */
  def subVectors(a: Vector, b: Vector): this.type = js.native
}

object Vector {
  @scala.inline
  def apply(
    add: Vector => Vector,
    addScalar: Double => Vector,
    addScaledVector: (Vector, Double) => Vector,
    addVectors: (Vector, Vector) => Vector,
    copy: Vector => Vector,
    divideScalar: Double => Vector,
    dot: Vector => Double,
    equals: Vector => Boolean,
    getComponent: Double => Double,
    length: () => Double,
    lengthSq: () => Double,
    lerp: (Vector, Double) => Vector,
    multiplyScalar: Double => Vector,
    negate: () => Vector,
    normalize: () => Vector,
    set: /* repeated */ Double => Vector,
    setComponent: (Double, Double) => Vector,
    setLength: Double => Vector,
    setScalar: Double => Vector,
    sub: Vector => Vector,
    subVectors: (Vector, Vector) => Vector
  ): Vector = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addScalar = js.Any.fromFunction1(addScalar), addScaledVector = js.Any.fromFunction2(addScaledVector), addVectors = js.Any.fromFunction2(addVectors), copy = js.Any.fromFunction1(copy), divideScalar = js.Any.fromFunction1(divideScalar), dot = js.Any.fromFunction1(dot), equals = js.Any.fromFunction1(equals), getComponent = js.Any.fromFunction1(getComponent), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), lerp = js.Any.fromFunction2(lerp), multiplyScalar = js.Any.fromFunction1(multiplyScalar), negate = js.Any.fromFunction0(negate), normalize = js.Any.fromFunction0(normalize), set = js.Any.fromFunction1(set), setComponent = js.Any.fromFunction2(setComponent), setLength = js.Any.fromFunction1(setLength), setScalar = js.Any.fromFunction1(setScalar), sub = js.Any.fromFunction1(sub), subVectors = js.Any.fromFunction2(subVectors))
    __obj.asInstanceOf[Vector]
  }
  @scala.inline
  implicit class VectorOps[Self <: Vector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: Vector => Vector): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAddScalar(value: Double => Vector): Self = this.set("addScalar", js.Any.fromFunction1(value))
    @scala.inline
    def setAddScaledVector(value: (Vector, Double) => Vector): Self = this.set("addScaledVector", js.Any.fromFunction2(value))
    @scala.inline
    def setAddVectors(value: (Vector, Vector) => Vector): Self = this.set("addVectors", js.Any.fromFunction2(value))
    @scala.inline
    def setCopy(value: Vector => Vector): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def setDivideScalar(value: Double => Vector): Self = this.set("divideScalar", js.Any.fromFunction1(value))
    @scala.inline
    def setDot(value: Vector => Double): Self = this.set("dot", js.Any.fromFunction1(value))
    @scala.inline
    def setEquals(value: Vector => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetComponent(value: Double => Double): Self = this.set("getComponent", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setLengthSq(value: () => Double): Self = this.set("lengthSq", js.Any.fromFunction0(value))
    @scala.inline
    def setLerp(value: (Vector, Double) => Vector): Self = this.set("lerp", js.Any.fromFunction2(value))
    @scala.inline
    def setMultiplyScalar(value: Double => Vector): Self = this.set("multiplyScalar", js.Any.fromFunction1(value))
    @scala.inline
    def setNegate(value: () => Vector): Self = this.set("negate", js.Any.fromFunction0(value))
    @scala.inline
    def setNormalize(value: () => Vector): Self = this.set("normalize", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: /* repeated */ Double => Vector): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setSetComponent(value: (Double, Double) => Vector): Self = this.set("setComponent", js.Any.fromFunction2(value))
    @scala.inline
    def setSetLength(value: Double => Vector): Self = this.set("setLength", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScalar(value: Double => Vector): Self = this.set("setScalar", js.Any.fromFunction1(value))
    @scala.inline
    def setSub(value: Vector => Vector): Self = this.set("sub", js.Any.fromFunction1(value))
    @scala.inline
    def setSubVectors(value: (Vector, Vector) => Vector): Self = this.set("subVectors", js.Any.fromFunction2(value))
    @scala.inline
    def setDistanceTo(value: Vector => Double): Self = this.set("distanceTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDistanceTo: Self = this.set("distanceTo", js.undefined)
    @scala.inline
    def setDistanceToSquared(value: Vector => Double): Self = this.set("distanceToSquared", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDistanceToSquared: Self = this.set("distanceToSquared", js.undefined)
  }
  
}

