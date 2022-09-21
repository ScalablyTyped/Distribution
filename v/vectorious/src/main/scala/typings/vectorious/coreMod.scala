package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.anon.Dtype
import typings.vectorious.typesMod.DType
import typings.vectorious.typesMod.INDArray
import typings.vectorious.typesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("vectorious/dist/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vectorious/dist/core", "NDArray")
  @js.native
  open class NDArray ()
    extends StObject
       with INDArray {
    def this(data: Any) = this()
    def this(data: Any, options: Dtype) = this()
    def this(data: Unit, options: Dtype) = this()
    
    /**
      * @name T
      * @memberof NDArray.prototype
      * @description Short for `this.copy().transpose()`
      * @type NDArray
      */
    def T: NDArray = js.native
    
    def abs(): this.type = js.native
    @JSName("abs")
    var abs_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def acos(): this.type = js.native
    @JSName("acos")
    var acos_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def acosh(): this.type = js.native
    @JSName("acosh")
    var acosh_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def add(x: this.type): this.type = js.native
    def add(x: this.type, alpha: Double): this.type = js.native
    def add(x: ArrayLike[Any]): this.type = js.native
    def add(x: ArrayLike[Any], alpha: Double): this.type = js.native
    @JSName("add")
    var add_Original: js.ThisFunction2[
        /* this */ this.type, 
        /* x */ this.type | ArrayLike[Any], 
        /* alpha */ js.UndefOr[Double], 
        this.type
      ] = js.native
    
    def angle(x: this.type): Double = js.native
    def angle(x: ArrayLike[Any]): Double = js.native
    @JSName("angle")
    var angle_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type | ArrayLike[Any], Double] = js.native
    
    def asin(): this.type = js.native
    @JSName("asin")
    var asin_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def asinh(): this.type = js.native
    @JSName("asinh")
    var asinh_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def atan(): this.type = js.native
    @JSName("atan")
    var atan_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def atanh(): this.type = js.native
    @JSName("atanh")
    var atanh_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def augment(x: this.type): this.type = js.native
    def augment(x: ArrayLike[Any]): this.type = js.native
    @JSName("augment")
    var augment_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type | ArrayLike[Any], this.type] = js.native
    
    def binOp(x: this.type, f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]): this.type = js.native
    def binOp(x: ArrayLike[Any], f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]): this.type = js.native
    @JSName("binOp")
    var binOp_Original: js.ThisFunction2[
        /* this */ this.type, 
        /* x */ this.type | ArrayLike[Any], 
        /* f */ js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double], 
        this.type
      ] = js.native
    
    def cbrt(): this.type = js.native
    @JSName("cbrt")
    var cbrt_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def ceil(): this.type = js.native
    @JSName("ceil")
    var ceil_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def check(indices: Double*): Unit = js.native
    @JSName("check")
    var check_Original: js.ThisFunction1[/* this */ this.type, /* repeated */ Double, Unit] = js.native
    
    def combine(x: this.type): this.type = js.native
    @JSName("combine")
    var combine_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, this.type] = js.native
    
    def copy(): this.type = js.native
    @JSName("copy")
    var copy_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def cos(): this.type = js.native
    @JSName("cos")
    var cos_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def cosh(): this.type = js.native
    @JSName("cosh")
    var cosh_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def cross(x: this.type): this.type = js.native
    @JSName("cross")
    var cross_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, this.type] = js.native
    
    /* CompleteClass */
    var data: TypedArray = js.native
    
    def det(): Double = js.native
    @JSName("det")
    var det_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def diagonal(): this.type = js.native
    @JSName("diagonal")
    var diagonal_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def dot(x: this.type): Double = js.native
    @JSName("dot")
    var dot_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, Double] = js.native
    
    /* CompleteClass */
    var dtype: DType = js.native
    
    def eig(): js.Tuple2[this.type, this.type] = js.native
    @JSName("eig")
    var eig_Original: js.ThisFunction0[/* this */ this.type, js.Tuple2[this.type, this.type]] = js.native
    
    def equals(x: this.type): Boolean = js.native
    def equals(x: this.type, tolerance: Double): Boolean = js.native
    @JSName("equals")
    var equals_Original: js.ThisFunction2[/* this */ this.type, /* x */ this.type, /* tolerance */ js.UndefOr[Double], Boolean] = js.native
    
    def equidimensional(x: this.type): Unit = js.native
    @JSName("equidimensional")
    var equidimensional_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, Unit] = js.native
    
    def equilateral(x: this.type): Unit = js.native
    @JSName("equilateral")
    var equilateral_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, Unit] = js.native
    
    def exp(): this.type = js.native
    @JSName("exp")
    var exp_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def expm1(): this.type = js.native
    @JSName("expm1")
    var expm1_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def fill(): this.type = js.native
    def fill(value: js.Function1[/* index */ Double, Double]): this.type = js.native
    def fill(value: Double): this.type = js.native
    @JSName("fill")
    var fill_Original: js.ThisFunction1[
        /* this */ this.type, 
        /* value */ js.UndefOr[Double | (js.Function1[/* index */ Double, Double])], 
        this.type
      ] = js.native
    
    def floor(): this.type = js.native
    @JSName("floor")
    var floor_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def forEach(f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Unit]): Unit = js.native
    @JSName("forEach")
    var forEach_Original: js.ThisFunction1[
        /* this */ this.type, 
        /* f */ js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Unit], 
        Unit
      ] = js.native
    
    def fround(): this.type = js.native
    @JSName("fround")
    var fround_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def gauss(): this.type = js.native
    @JSName("gauss")
    var gauss_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def get(indices: Double*): Double = js.native
    @JSName("get")
    var get_Original: js.ThisFunction1[/* this */ this.type, /* repeated */ Double, Double] = js.native
    
    def inv(): this.type = js.native
    @JSName("inv")
    var inv_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    def log(): this.type = js.native
    
    def log10(): this.type = js.native
    @JSName("log10")
    var log10_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def log1p(): this.type = js.native
    @JSName("log1p")
    var log1p_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def log2(): this.type = js.native
    @JSName("log2")
    var log2_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    @JSName("log")
    var log_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def lu(): js.Tuple3[this.type, this.type, js.typedarray.Int32Array] = js.native
    @JSName("lu")
    var lu_Original: js.ThisFunction0[/* this */ this.type, js.Tuple3[this.type, this.type, js.typedarray.Int32Array]] = js.native
    
    def lu_factor(): js.Tuple2[this.type, js.typedarray.Int32Array] = js.native
    @JSName("lu_factor")
    var lu_factor_Original: js.ThisFunction0[/* this */ this.type, js.Tuple2[this.type, js.typedarray.Int32Array]] = js.native
    
    def map(f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]): this.type = js.native
    @JSName("map")
    var map_Original: js.ThisFunction1[
        /* this */ this.type, 
        /* f */ js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double], 
        this.type
      ] = js.native
    
    def max(): Double = js.native
    @JSName("max")
    var max_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def mean(): Double = js.native
    @JSName("mean")
    var mean_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def min(): Double = js.native
    @JSName("min")
    var min_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def multiply(x: this.type): this.type = js.native
    @JSName("multiply")
    var multiply_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, this.type] = js.native
    
    def norm(): Double = js.native
    @JSName("norm")
    var norm_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def normalize(): this.type = js.native
    @JSName("normalize")
    var normalize_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def pow(exponent: Double): this.type = js.native
    @JSName("pow")
    var pow_Original: js.ThisFunction1[/* this */ this.type, /* exponent */ Double, this.type] = js.native
    
    def prod(): Double = js.native
    @JSName("prod")
    var prod_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def product(x: this.type): this.type = js.native
    @JSName("product")
    var product_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, this.type] = js.native
    
    def project(x: this.type): this.type = js.native
    @JSName("project")
    var project_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, this.type] = js.native
    
    def push(value: Double): this.type = js.native
    @JSName("push")
    var push_Original: js.ThisFunction1[/* this */ this.type, /* value */ Double, this.type] = js.native
    
    def rank(): Double = js.native
    def rank(tolerance: Double): Double = js.native
    @JSName("rank")
    var rank_Original: js.ThisFunction1[/* this */ this.type, /* tolerance */ js.UndefOr[Double], Double] = js.native
    
    def reciprocal(): this.type = js.native
    @JSName("reciprocal")
    var reciprocal_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def reduce(
      f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
    ): Double = js.native
    def reduce(
      f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double],
      initialValue: Double
    ): Double = js.native
    @JSName("reduce")
    var reduce_Original: js.ThisFunction2[
        /* this */ this.type, 
        /* f */ js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double], 
        /* initialValue */ js.UndefOr[Double], 
        Double
      ] = js.native
    
    def reshape(shape: Double*): this.type = js.native
    @JSName("reshape")
    var reshape_Original: js.ThisFunction1[/* this */ this.type, /* repeated */ Double, this.type] = js.native
    
    def round(): this.type = js.native
    @JSName("round")
    var round_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def row_add(dest: Double, source: Double): this.type = js.native
    def row_add(dest: Double, source: Double, scalar: Double): this.type = js.native
    @JSName("row_add")
    var row_add_Original: js.ThisFunction3[
        /* this */ this.type, 
        /* dest */ Double, 
        /* source */ Double, 
        /* scalar */ js.UndefOr[Double], 
        this.type
      ] = js.native
    
    def scale(scalar: Double): this.type = js.native
    @JSName("scale")
    var scale_Original: js.ThisFunction1[/* this */ this.type, /* scalar */ Double, this.type] = js.native
    
    def set(args: Double*): Unit = js.native
    @JSName("set")
    var set_Original: js.ThisFunction1[/* this */ this.type, /* repeated */ Double, Unit] = js.native
    
    /* CompleteClass */
    var shape: js.Array[Double] = js.native
    
    def sign(): this.type = js.native
    @JSName("sign")
    var sign_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def sin(): this.type = js.native
    @JSName("sin")
    var sin_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def sinh(): this.type = js.native
    @JSName("sinh")
    var sinh_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def slice(): this.type = js.native
    def slice(begin: Double): this.type = js.native
    def slice(begin: Double, end: Double): this.type = js.native
    def slice(begin: Double, end: Double, step: Double): this.type = js.native
    def slice(begin: Double, end: Unit, step: Double): this.type = js.native
    def slice(begin: Unit, end: Double): this.type = js.native
    def slice(begin: Unit, end: Double, step: Double): this.type = js.native
    def slice(begin: Unit, end: Unit, step: Double): this.type = js.native
    @JSName("slice")
    var slice_Original: js.ThisFunction3[
        /* this */ this.type, 
        /* begin */ js.UndefOr[Double], 
        /* end */ js.UndefOr[Double], 
        /* step */ js.UndefOr[Double], 
        this.type
      ] = js.native
    
    def solve(x: this.type): this.type = js.native
    @JSName("solve")
    var solve_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, this.type] = js.native
    
    def sqrt(): this.type = js.native
    @JSName("sqrt")
    var sqrt_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def square(): Unit = js.native
    @JSName("square")
    var square_Original: js.ThisFunction0[/* this */ this.type, Unit] = js.native
    
    /* CompleteClass */
    var strides: js.Array[Double] = js.native
    
    def subtract(x: this.type): this.type = js.native
    @JSName("subtract")
    var subtract_Original: js.ThisFunction1[/* this */ this.type, /* x */ this.type, this.type] = js.native
    
    def sum(): Double = js.native
    @JSName("sum")
    var sum_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def swap(i: Double, j: Double): this.type = js.native
    @JSName("swap")
    var swap_Original: js.ThisFunction2[/* this */ this.type, /* i */ Double, /* j */ Double, this.type] = js.native
    
    def tan(): this.type = js.native
    @JSName("tan")
    var tan_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def tanh(): this.type = js.native
    @JSName("tanh")
    var tanh_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def toArray(): Any = js.native
    def toArray(index: Double): Any = js.native
    def toArray(index: Double, dim: Double): Any = js.native
    def toArray(index: Unit, dim: Double): Any = js.native
    @JSName("toArray")
    var toArray_Original: js.ThisFunction2[
        /* this */ this.type, 
        /* index */ js.UndefOr[Double], 
        /* dim */ js.UndefOr[Double], 
        Any
      ] = js.native
    
    @JSName("toString")
    var toString_Original: js.ThisFunction0[/* this */ this.type, String] = js.native
    
    def trace(): Double = js.native
    @JSName("trace")
    var trace_Original: js.ThisFunction0[/* this */ this.type, Double] = js.native
    
    def transpose(): this.type = js.native
    @JSName("transpose")
    var transpose_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    def trunc(): this.type = js.native
    @JSName("trunc")
    var trunc_Original: js.ThisFunction0[/* this */ this.type, this.type] = js.native
    
    /**
      * @name w
      * @memberof NDArray.prototype
      * @description Gets or sets the value at index 3
      * @type Number
      */
    def w: Double = js.native
    def w_=(value: Double): Unit = js.native
    
    /**
      * @name x
      * @memberof NDArray.prototype
      * @description Gets or sets the value at index 0
      * @type Number
      */
    def x: Double = js.native
    def x_=(value: Double): Unit = js.native
    
    /**
      * @name y
      * @memberof NDArray.prototype
      * @description Gets or sets the value at index 1
      * @type Number
      */
    def y: Double = js.native
    def y_=(value: Double): Unit = js.native
    
    /**
      * @name z
      * @memberof NDArray.prototype
      * @description Gets or sets the value at index 2
      * @type Number
      */
    def z: Double = js.native
    def z_=(value: Double): Unit = js.native
  }
  
  inline def abs(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def abs(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def acos(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def acos(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def acosh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def acosh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def add(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: ArrayLike[Any], y: ArrayLike[Any], alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: ArrayLike[Any], y: NDArray, alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: ArrayLike[Any], alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def add(x: NDArray, y: NDArray, alpha: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def angle(x: ArrayLike[Any], y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: ArrayLike[Any], y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: NDArray, y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def angle(x: NDArray, y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def array(args: Any*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
  
  inline def asin(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def asin(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def asinh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def asinh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def atan(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def atan(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def atanh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def atanh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def augment(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def augment(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def augment(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def augment(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("augment")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def binOp(
    x: ArrayLike[Any],
    y: ArrayLike[Any],
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def binOp(
    x: ArrayLike[Any],
    y: NDArray,
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def binOp(
    x: NDArray,
    y: ArrayLike[Any],
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def binOp(
    x: NDArray,
    y: NDArray,
    f: js.Function3[/* a */ Double, /* b */ Double, /* index */ Double, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("binOp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def cbrt(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def cbrt(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def ceil(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def ceil(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def check(x: ArrayLike[Any], indices: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def check(x: NDArray, indices: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def combine(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def combine(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def combine(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def combine(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def copy(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def copy(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def cos(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def cos(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def cosh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def cosh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def cross(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def cross(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def cross(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def cross(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def det(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("det")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def det(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("det")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def diagonal(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("diagonal")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def diagonal(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("diagonal")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def dot(x: ArrayLike[Any], y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: ArrayLike[Any], y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: NDArray, y: ArrayLike[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dot(x: NDArray, y: NDArray): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def eig(x: ArrayLike[Any]): js.Tuple2[NDArray, NDArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("eig")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, NDArray]]
  inline def eig(x: NDArray): js.Tuple2[NDArray, NDArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("eig")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, NDArray]]
  
  inline def equals_(x: ArrayLike[Any], y: ArrayLike[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: ArrayLike[Any], y: ArrayLike[Any], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: ArrayLike[Any], y: NDArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: ArrayLike[Any], y: NDArray, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: NDArray, y: ArrayLike[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: NDArray, y: ArrayLike[Any], tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: NDArray, y: NDArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(x: NDArray, y: NDArray, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equidimensional(x: ArrayLike[Any], y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equidimensional(x: ArrayLike[Any], y: NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equidimensional(x: NDArray, y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equidimensional(x: NDArray, y: NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equidimensional")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def equilateral(x: ArrayLike[Any], y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: ArrayLike[Any], y: NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: NDArray, y: ArrayLike[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equilateral(x: NDArray, y: NDArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equilateral")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exp(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def exp(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def expm1(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def expm1(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def eye(n: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("eye")(n.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def fill(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def fill(x: ArrayLike[Any], value: js.Function1[/* index */ Double, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def fill(x: ArrayLike[Any], value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def fill(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def fill(x: NDArray, value: js.Function1[/* index */ Double, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def fill(x: NDArray, value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def floor(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def floor(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def forEach(x: NDArray, f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fround(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def fround(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def gauss(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("gauss")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def gauss(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("gauss")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def get(x: ArrayLike[Any], indices: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  inline def get(x: NDArray, indices: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  
  inline def inv(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def inv(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def log(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def log(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def log10(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def log10(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def log1p(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def log1p(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def log2(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def log2(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def lu(x: ArrayLike[Any]): js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array]]
  inline def lu(x: NDArray): js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array]]
  
  inline def luFactor(x: ArrayLike[Any]): js.Tuple2[NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu_factor")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, js.typedarray.Int32Array]]
  inline def luFactor(x: NDArray): js.Tuple2[NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu_factor")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, js.typedarray.Int32Array]]
  
  inline def magic(n: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("magic")(n.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def map(
    x: ArrayLike[Any],
    f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def map(x: NDArray, f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def matrix(r: Double, c: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("matrix")(r.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def max(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def max(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def mean(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def mean(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def min(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def min(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def multiply(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def multiply(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def multiply(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def multiply(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def norm(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("norm")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def norm(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("norm")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def normalize(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def normalize(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def ones(shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
  
  inline def pow(x: ArrayLike[Any], exponent: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def pow(x: NDArray, exponent: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def prod(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def prod(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def product(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def product(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def product(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def product(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("product")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def project(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def project(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def project(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def project(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def push(x: ArrayLike[Any], value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def push(x: NDArray, value: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(x.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def random(shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
  
  inline def range(args: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
  
  inline def rank(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rank(x: ArrayLike[Any], tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def rank(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rank(x: NDArray, tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(x.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reciprocal(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def reciprocal(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def reduce(
    x: NDArray,
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def reduce(
    x: NDArray,
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double],
    initialValue: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reshape(x: ArrayLike[Any], shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(List(x.asInstanceOf[js.Any]).`++`(shape.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NDArray]
  inline def reshape(x: NDArray, shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(List(x.asInstanceOf[js.Any]).`++`(shape.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NDArray]
  
  inline def round(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def round(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def rowAdd(x: ArrayLike[Any], dest: Double, source: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def rowAdd(x: ArrayLike[Any], dest: Double, source: Double, scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def rowAdd(x: NDArray, dest: Double, source: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def rowAdd(x: NDArray, dest: Double, source: Double, scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("row_add")(x.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def scale(x: ArrayLike[Any], scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(x.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def scale(x: NDArray, scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(x.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def set(x: NDArray, args: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(List(x.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def sign(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def sign(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def sin(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def sin(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def sinh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def sinh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def slice(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Double, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: ArrayLike[Any], begin: Unit, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Double, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Unit, end: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Unit, end: Double, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def slice(x: NDArray, begin: Unit, end: Unit, step: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def solve(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def solve(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def solve(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def solve(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def sqrt(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def sqrt(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def square(x: ArrayLike[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def square(x: NDArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def subtract(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def subtract(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def subtract(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def subtract(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def sum(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def sum(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def swap(x: ArrayLike[Any], i: Double, j: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(x.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def swap(x: NDArray, i: Double, j: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(x.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  
  inline def tan(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def tan(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def tanh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def tanh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def toArray(x: ArrayLike[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toArray(x: NDArray): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toString_(x: ArrayLike[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(x: NDArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trace(x: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def trace(x: NDArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def transpose(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def transpose(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def trunc(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def trunc(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def zeros(shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
}
