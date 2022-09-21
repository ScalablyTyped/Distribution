package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.anon.Dtype
import typings.vectorious.typesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vectorious", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vectorious", "NDArray")
  @js.native
  open class NDArray ()
    extends typings.vectorious.coreMod.NDArray {
    def this(data: Any) = this()
    def this(data: Any, options: Dtype) = this()
    def this(data: Unit, options: Dtype) = this()
  }
  
  @JSImport("vectorious", "NDIter")
  @js.native
  open class NDIter protected ()
    extends typings.vectorious.iteratorMod.NDIter {
    def this(x: ArrayLike[Any]) = this()
    def this(x: NDArray) = this()
  }
  
  @JSImport("vectorious", "NDMultiIter")
  @js.native
  open class NDMultiIter protected ()
    extends typings.vectorious.iteratorMod.NDMultiIter {
    def this(args: (NDArray | ArrayLike[Any])*) = this()
  }
  
  @JSImport("vectorious", "V_MAXDIMS")
  @js.native
  val V_MAXDIMS: /* 32 */ Double = js.native
  
  inline def abs(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def abs(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def acos(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def acos(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def acosh(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def acosh(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def add(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def add(x: ArrayLike[Any], y: ArrayLike[Any], alpha: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def add(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def add(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray, alpha: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def add(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def add(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any], alpha: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def add(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def add(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray, alpha: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def angle(x: ArrayLike[Any], y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def array(args: Any*): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def asin(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def asin(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def asinh(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def asinh(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def atan(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def atan(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def atanh(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def atanh(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def augment(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def augment(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def augment(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def augment(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def binOp(
    x: ArrayLike[Any],
    y: ArrayLike[Any],
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def binOp(
    x: ArrayLike[Any],
    y: typings.vectorious.coreMod.NDArray,
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def binOp(
    x: typings.vectorious.coreMod.NDArray,
    y: ArrayLike[Any],
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def binOp(
    x: typings.vectorious.coreMod.NDArray,
    y: typings.vectorious.coreMod.NDArray,
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def cbrt(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def cbrt(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def ceil(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def ceil(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def check(x: ArrayLike[Any], indices: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def check(x: typings.vectorious.coreMod.NDArray, indices: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def combine(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def combine(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def combine(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def combine(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def copy(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def copy(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def cos(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def cos(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def cosh(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def cosh(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def cross(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def cross(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def cross(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def cross(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def det(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("det")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def det(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("det")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def diagonal(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("diagonal")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def diagonal(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("diagonal")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def dot(x: ArrayLike[Any], y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def eig(x: ArrayLike[Any]): js.Tuple2[typings.vectorious.coreMod.NDArray, typings.vectorious.coreMod.NDArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("eig")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typings.vectorious.coreMod.NDArray, typings.vectorious.coreMod.NDArray]]
  inline def eig(x: typings.vectorious.coreMod.NDArray): js.Tuple2[typings.vectorious.coreMod.NDArray, typings.vectorious.coreMod.NDArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("eig")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typings.vectorious.coreMod.NDArray, typings.vectorious.coreMod.NDArray]]
  
  inline def equals_(x: ArrayLike[Any], y: ArrayLike[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: ArrayLike[Any], y: ArrayLike[Any], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equidimensional(x: ArrayLike[Any], y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equidimensional(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equidimensional(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equidimensional(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def equilateral(x: ArrayLike[Any], y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exp(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def exp(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def expm1(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def expm1(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def eye(n: Double): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("eye")(n.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def fill(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def fill(x: ArrayLike[Any], value: js.Function1[/* index */ Double, Double]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def fill(x: ArrayLike[Any], value: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def fill(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def fill(x: typings.vectorious.coreMod.NDArray, value: js.Function1[/* index */ Double, Double]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def fill(x: typings.vectorious.coreMod.NDArray, value: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def floor(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def floor(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def forEach(
    x: typings.vectorious.coreMod.NDArray,
    f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fround(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def fround(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def gauss(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("gauss")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def gauss(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("gauss")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def get(x: ArrayLike[Any], indices: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  inline def get(x: typings.vectorious.coreMod.NDArray, indices: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  
  inline def inv(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def inv(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def log(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def log(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def log10(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def log10(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def log1p(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def log1p(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def log2(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def log2(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def lu(x: ArrayLike[Any]): js.Tuple3[
    typings.vectorious.coreMod.NDArray, 
    typings.vectorious.coreMod.NDArray, 
    js.typedarray.Int32Array
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    typings.vectorious.coreMod.NDArray, 
    typings.vectorious.coreMod.NDArray, 
    js.typedarray.Int32Array
  ]]
  inline def lu(x: typings.vectorious.coreMod.NDArray): js.Tuple3[
    typings.vectorious.coreMod.NDArray, 
    typings.vectorious.coreMod.NDArray, 
    js.typedarray.Int32Array
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    typings.vectorious.coreMod.NDArray, 
    typings.vectorious.coreMod.NDArray, 
    js.typedarray.Int32Array
  ]]
  
  inline def luFactor(x: ArrayLike[Any]): js.Tuple2[typings.vectorious.coreMod.NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu_factor")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typings.vectorious.coreMod.NDArray, js.typedarray.Int32Array]]
  inline def luFactor(x: typings.vectorious.coreMod.NDArray): js.Tuple2[typings.vectorious.coreMod.NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu_factor")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typings.vectorious.coreMod.NDArray, js.typedarray.Int32Array]]
  
  inline def magic(n: Double): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("magic")(n.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def map(
    x: ArrayLike[Any],
    f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def map(
    x: typings.vectorious.coreMod.NDArray,
    f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def matrix(r: Double, c: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("matrix")(r.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def max(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def max(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def mean(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def mean(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def min(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def min(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def multiply(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def multiply(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def multiply(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def multiply(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def norm(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("norm")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def norm(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("norm")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def normalize(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def normalize(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def ones(shape: Double*): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def pow(x: ArrayLike[Any], exponent: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def pow(x: typings.vectorious.coreMod.NDArray, exponent: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def prod(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def prod(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def product(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def product(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def product(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def product(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def project(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def project(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def project(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def project(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def push(x: ArrayLike[Any], value: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def push(x: typings.vectorious.coreMod.NDArray, value: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def random(shape: Double*): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def range(args: Double*): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def rank(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rank(x: ArrayLike[Any], tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def rank(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rank(x: typings.vectorious.coreMod.NDArray, tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reciprocal(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def reciprocal(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def reduce(
    x: typings.vectorious.coreMod.NDArray,
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def reduce(
    x: typings.vectorious.coreMod.NDArray,
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double],
    initialValue: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reshape(x: ArrayLike[Any], shape: Double*): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(List(x.asInstanceOf[js.Any]).`++`(shape.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def reshape(x: typings.vectorious.coreMod.NDArray, shape: Double*): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(List(x.asInstanceOf[js.Any]).`++`(shape.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def round(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def round(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def rowAdd(x: ArrayLike[Any], dest: Double, source: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def rowAdd(x: ArrayLike[Any], dest: Double, source: Double, scalar: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def rowAdd(x: typings.vectorious.coreMod.NDArray, dest: Double, source: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def rowAdd(x: typings.vectorious.coreMod.NDArray, dest: Double, source: Double, scalar: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def scale(x: ArrayLike[Any], scalar: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(x.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def scale(x: typings.vectorious.coreMod.NDArray, scalar: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(x.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def set(x: typings.vectorious.coreMod.NDArray, args: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(List(x.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def sign(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def sign(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def sin(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def sin(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def sinh(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def sinh(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def slice(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Double, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Unit, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Double, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Unit, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray, begin: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray, begin: Double, end: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray, begin: Double, end: Double, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray, begin: Double, end: Unit, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray, begin: Unit, end: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray, begin: Unit, end: Double, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def slice(x: typings.vectorious.coreMod.NDArray, begin: Unit, end: Unit, step: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def solve(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def solve(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def solve(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def solve(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def sqrt(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def sqrt(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def square(x: ArrayLike[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def square(x: typings.vectorious.coreMod.NDArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def subtract(x: ArrayLike[Any], y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def subtract(x: ArrayLike[Any], y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def subtract(x: typings.vectorious.coreMod.NDArray, y: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def subtract(x: typings.vectorious.coreMod.NDArray, y: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def sum(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def sum(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def swap(x: ArrayLike[Any], i: Double, j: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(x.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def swap(x: typings.vectorious.coreMod.NDArray, i: Double, j: Double): typings.vectorious.coreMod.NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(x.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def tan(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def tan(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def tanh(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def tanh(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def toArray(x: ArrayLike[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toArray(x: typings.vectorious.coreMod.NDArray): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toString_(x: ArrayLike[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(x: typings.vectorious.coreMod.NDArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trace(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def trace(x: typings.vectorious.coreMod.NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def transpose(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def transpose(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def trunc(x: ArrayLike[Any]): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  inline def trunc(x: typings.vectorious.coreMod.NDArray): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[typings.vectorious.coreMod.NDArray]
  
  inline def zeros(shape: Double*): typings.vectorious.coreMod.NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.vectorious.coreMod.NDArray]
}
