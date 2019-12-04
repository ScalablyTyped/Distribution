package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distIoTypesMod.WeightGroup
import typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod.PadType
import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.NumericDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atTensorflowTfjsDashCoreStrings {
  @js.native
  sealed trait `1DOT3DOT2` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  // OpenGL ES does not support round functionDOTBACKSLASHn  // The algorithm is based on banker_quotes roundingDOTBACKSLASHn  float base = floor(x);BACKSLASHn  if ((x - base) < 0DOT5) {BACKSLASHn    return floor(x);BACKSLASHn  } else if ((x - base) > 0DOT5) {BACKSLASHn    return ceil(x);BACKSLASHn  } else {BACKSLASHn    if (mod(base, 2DOT0) == 0DOT0) {BACKSLASHn      return base;BACKSLASHn    } else {BACKSLASHn      return base + 1DOT0;BACKSLASHn    }BACKSLASHn  }BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  // vec4 one = vec4(equal(a, b));BACKSLASHn  // return one + (vec4(1DOT0) - one) * a / b;BACKSLASHn  vec4 result = a / b;BACKSLASHn  if(aDOTx == bDOTx) {BACKSLASHn    resultDOTx = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTy == bDOTy) {BACKSLASHn    resultDOTy = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTz == bDOTz) {BACKSLASHn    resultDOTz = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTw == bDOTw) {BACKSLASHn    resultDOTw = 1DOT;BACKSLASHn  }BACKSLASHnBACKSLASHn  return result;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  const float FLOAT_MAX = 1DOT70141184e38;BACKSLASHn  const float FLOAT_MIN = 1DOT17549435e-38;BACKSLASHnBACKSLASHn  lowp vec4 encode_float(highp float v) {BACKSLASHn    if (isnan(v)) {BACKSLASHn      return vec4(255, 255, 255, 255);BACKSLASHn    }BACKSLASHnBACKSLASHn    highp float av = abs(v);BACKSLASHnBACKSLASHn    if(av < FLOAT_MIN) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 0DOT0, 0DOT0);BACKSLASHn    } else if(v > FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 128DOT0, 127DOT0) / 255DOT0;BACKSLASHn    } else if(v < -FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0,  128DOT0, 255DOT0) / 255DOT0;BACKSLASHn    }BACKSLASHnBACKSLASHn    highp vec4 c = vec4(0,0,0,0);BACKSLASHnBACKSLASHn    highp float e = floor(log2(av));BACKSLASHn    highp float m = exp2(fract(log2(av))) - 1DOT0;BACKSLASHnBACKSLASHn    c[2] = floor(128DOT0 * m);BACKSLASHn    m -= c[2] / 128DOT0;BACKSLASHn    c[1] = floor(32768DOT0 * m);BACKSLASHn    m -= c[1] / 32768DOT0;BACKSLASHn    c[0] = floor(8388608DOT0 * m);BACKSLASHnBACKSLASHn    highp float ebias = e + 127DOT0;BACKSLASHn    c[3] = floor(ebias / 2DOT0);BACKSLASHn    ebias -= c[3] * 2DOT0;BACKSLASHn    c[2] += floor(ebias) * 128DOT0;BACKSLASHnBACKSLASHn    c[3] += 128DOT0 * step(0DOT0, -v);BACKSLASHnBACKSLASHn    return c / 255DOT0;BACKSLASHn  }BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  float e2x = exp(-2DOT0 * abs(x));BACKSLASHn  return sign(x) * (1DOT0 - e2x) / (1DOT0 + e2x);BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  float e2x = exp(-x);BACKSLASHn  return (e2x + 1DOT0 / e2x) / 2DOT0;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  float e2x = exp(x);BACKSLASHn  return (e2x - 1DOT0 / e2x) / 2DOT0;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  float epsilon = 1DOT1920928955078125e-7;BACKSLASHn  float threshold = log(epsilon) + 2DOT0;BACKSLASHnBACKSLASHn  bool too_large = x > -threshold;BACKSLASHn  bool too_small = x < threshold;BACKSLASHnBACKSLASHn  float result;BACKSLASHn  float exp_x = exp(x);BACKSLASHnBACKSLASHn  if (too_large){BACKSLASHn    result = x;BACKSLASHn  }BACKSLASHn  else if (too_small){BACKSLASHn    result = exp_x;BACKSLASHn  }BACKSLASHn  else{BACKSLASHn    result = log(exp_x + 1DOT0);BACKSLASHn  }BACKSLASHn  return result;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  float s = sign(a) * sign(b);BACKSLASHn  int ia = round(a);BACKSLASHn  int ib = round(b);BACKSLASHn  if (ib != 0) {BACKSLASHn    // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn    return float(idiv(ia, ib, s));BACKSLASHn  } else {BACKSLASHn    return NAN;BACKSLASHn  }BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  if (isnan(x)) { return 0DOT0; }BACKSLASHn  return sign(x);BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  ivec4 ia = round(a);BACKSLASHn  ivec4 ib = round(b);BACKSLASHn  bvec4 cond = notEqual(ib, ivec4(0));BACKSLASHn  ivec4 result = ivec4(0);BACKSLASHn  vec4 s = sign(a) * sign(b);BACKSLASHnBACKSLASHn  // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn  if (cond[0]) {BACKSLASHn    result[0] = idiv(ia[0], ib[0], s[0]);BACKSLASHn  }BACKSLASHn  if (cond[1]) {BACKSLASHn    result[1] = idiv(ia[1], ib[1], s[1]);BACKSLASHn  }BACKSLASHn  if (cond[2]) {BACKSLASHn    result[2] = idiv(ia[2], ib[2], s[2]);BACKSLASHn  }BACKSLASHn  if (cond[3]) {BACKSLASHn    result[3] = idiv(ia[3], ib[3], s[3]);BACKSLASHn  }BACKSLASHn  return vec4(result);BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return min(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) +BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))),BACKSLASHn    vec4(1DOT0));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return vec4(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) *BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return vec4(equal(a, b));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return vec4(greaterThan(a, b));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return vec4(greaterThanEqual(a, b));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return vec4(lessThan(a, b));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return vec4(lessThanEqual(a, b));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  return vec4(notEqual(a, b));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  vec4 aLessThanZero = vec4(lessThan(a, vec4(0DOT)));BACKSLASHn  return (aLessThanZero * (b * a)) + ((vec4(1DOT0) - aLessThanZero) * a);BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0DOT)));BACKSLASHn  return (bGTEZero * a) + ((vec4(1DOT0) - bGTEZero) * (a * (b + vec4(1DOT0))));BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  vec4 result = log(x);BACKSLASHn  vec4 isNaN = vec4(lessThan(x, vec4(0DOT0)));BACKSLASHn  resultDOTr = isNaNDOTr == 1DOT0 ? NAN : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg == 1DOT0 ? NAN : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb == 1DOT0 ? NAN : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa == 1DOT0 ? NAN : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  vec4 result = min(x, vec4(6DOT)) * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  vec4 result = x * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHn  vec4 result;BACKSLASHnBACKSLASHn  resultDOTr = (xDOTr >= 0DOT0) ? xDOTr : (exp(xDOTr) - 1DOT0);BACKSLASHn  resultDOTg = (xDOTg >= 0DOT0) ? xDOTg : (exp(xDOTg) - 1DOT0);BACKSLASHn  resultDOTb = (xDOTb >= 0DOT0) ? xDOTb : (exp(xDOTb) - 1DOT0);BACKSLASHn  resultDOTa = (xDOTa >= 0DOT0) ? xDOTa : (exp(xDOTa) - 1DOT0);BACKSLASHnBACKSLASHn  return result;BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHnif (a == b) {BACKSLASHn  return 1DOT0;BACKSLASHn};BACKSLASHnreturn a / b;` extends js.Object
  
  @js.native
  sealed trait `BACKSLASHnif(a < 0DOT0 && floor(b) < b){BACKSLASHn  return NAN;BACKSLASHn}BACKSLASHnif (b == 0DOT0) {BACKSLASHn  return 1DOT0;BACKSLASHn}BACKSLASHnreturn (round(mod(b, 2DOT0)) != 1) ?BACKSLASHn    pow(abs(a), b) : sign(a) * pow(abs(a), b);BACKSLASHn` extends js.Object
  
  @js.native
  sealed trait Engine extends js.Object
  
  @js.native
  sealed trait GraphDef extends js.Object
  
  @js.native
  sealed trait JSON extends js.Object
  
  @js.native
  sealed trait NCDHW extends js.Object
  
  @js.native
  sealed trait NCHW extends js.Object
  
  @js.native
  sealed trait NCW extends js.Object
  
  @js.native
  sealed trait NDHWC extends js.Object
  
  @js.native
  sealed trait NHWC extends js.Object
  
  @js.native
  sealed trait NUMBER extends PadType
  
  @js.native
  sealed trait NWC extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait SAME extends PadType
  
  @js.native
  sealed trait VALID extends PadType
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait avg extends js.Object
  
  @js.native
  sealed trait bilinear extends js.Object
  
  @js.native
  sealed trait bool
    extends DataType
       with NumericDataType
  
  @js.native
  sealed trait ceil extends js.Object
  
  @js.native
  sealed trait channelsFirst extends js.Object
  
  @js.native
  sealed trait channelsLast extends js.Object
  
  @js.native
  sealed trait complex64
    extends DataType
       with NumericDataType
  
  @js.native
  sealed trait `downloads://` extends js.Object
  
  @js.native
  sealed trait elu extends Activation
  
  @js.native
  sealed trait euclidean extends js.Object
  
  @js.native
  sealed trait float32
    extends DataType
       with NumericDataType
  
  @js.native
  sealed trait floor extends js.Object
  
  @js.native
  sealed trait fro extends js.Object
  
  @js.native
  sealed trait `if (b == 0DOT0) return NAN;BACKSLASHn  return mod(a, b);` extends js.Object
  
  @js.native
  sealed trait `if (x < 0DOT0) return NAN;BACKSLASHn  return log(x);` extends js.Object
  
  @js.native
  sealed trait `indexeddb://` extends js.Object
  
  @js.native
  sealed trait int32
    extends DataType
       with NumericDataType
  
  @js.native
  sealed trait linear extends Activation
  
  @js.native
  sealed trait `localstorage://` extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait min extends js.Object
  
  @js.native
  sealed trait model extends WeightGroup
  
  @js.native
  sealed trait nearest extends js.Object
  
  @js.native
  sealed trait numeric extends js.Object
  
  @js.native
  sealed trait optimizer extends WeightGroup
  
  @js.native
  sealed trait prelu extends Activation
  
  @js.native
  sealed trait prod extends js.Object
  
  @js.native
  sealed trait relu extends Activation
  
  @js.native
  sealed trait relu6 extends Activation
  
  @js.native
  sealed trait `return (a - b) * (a - b);` extends js.Object
  
  @js.native
  sealed trait `return (a < 0DOT) ? b * a : a;` extends js.Object
  
  @js.native
  sealed trait `return (b >= 1DOT0) ? a : a * (b + 1DOT0);` extends js.Object
  
  @js.native
  sealed trait `return (x >= 0DOT0) ? x : (exp(x) - 1DOT0);` extends js.Object
  
  @js.native
  sealed trait `return -x;` extends js.Object
  
  @js.native
  sealed trait `return 1DOT0 / (1DOT0 + exp(-1DOT0 * x));` extends js.Object
  
  @js.native
  sealed trait `return 1DOT0 / x;` extends js.Object
  
  @js.native
  sealed trait `return a * b;` extends js.Object
  
  @js.native
  sealed trait `return a + b;` extends js.Object
  
  @js.native
  sealed trait `return a - b;` extends js.Object
  
  @js.native
  sealed trait `return abs(x);` extends js.Object
  
  @js.native
  sealed trait `return ceil(x);` extends js.Object
  
  @js.native
  sealed trait `return exp(x) - 1DOT0;` extends js.Object
  
  @js.native
  sealed trait `return exp(x);` extends js.Object
  
  @js.native
  sealed trait `return float(!(x >= 1DOT0));` extends js.Object
  
  @js.native
  sealed trait `return float(!isnan(x) && !isinf(x));` extends js.Object
  
  @js.native
  sealed trait `return float(a != b);` extends js.Object
  
  @js.native
  sealed trait `return float(a < b);` extends js.Object
  
  @js.native
  sealed trait `return float(a <= b);` extends js.Object
  
  @js.native
  sealed trait `return float(a == b);` extends js.Object
  
  @js.native
  sealed trait `return float(a > b);` extends js.Object
  
  @js.native
  sealed trait `return float(a >= 1DOT0 && b >= 1DOT0);` extends js.Object
  
  @js.native
  sealed trait `return float(a >= 1DOT0 || b >= 1DOT0);` extends js.Object
  
  @js.native
  sealed trait `return float(a >= b);` extends js.Object
  
  @js.native
  sealed trait `return float(int(x));` extends js.Object
  
  @js.native
  sealed trait `return float(isinf(x));` extends js.Object
  
  @js.native
  sealed trait `return float(isnan(x));` extends js.Object
  
  @js.native
  sealed trait `return floor(x);` extends js.Object
  
  @js.native
  sealed trait `return inversesqrt(x);` extends js.Object
  
  @js.native
  sealed trait `return log(1DOT0 + x);` extends js.Object
  
  @js.native
  sealed trait `return sqrt(x);` extends js.Object
  
  @js.native
  sealed trait `return tan(x);` extends js.Object
  
  @js.native
  sealed trait `return x * x;` extends js.Object
  
  @js.native
  sealed trait `return x;` extends js.Object
  
  @js.native
  sealed trait round extends js.Object
  
  @js.native
  sealed trait same_ extends js.Object
  
  @js.native
  sealed trait string extends DataType
  
  @js.native
  sealed trait sum extends js.Object
  
  @js.native
  sealed trait uint16 extends js.Object
  
  @js.native
  sealed trait uint8 extends js.Object
  
  @js.native
  sealed trait unsortedSegmentSum extends js.Object
  
  @js.native
  sealed trait valid_ extends js.Object
  
  @scala.inline
  def `1DOT3DOT2`: `1DOT3DOT2` = "1.3.2".asInstanceOf[`1DOT3DOT2`]
  @scala.inline
  def `BACKSLASHn  // OpenGL ES does not support round functionDOTBACKSLASHn  // The algorithm is based on banker_quotes roundingDOTBACKSLASHn  float base = floor(x);BACKSLASHn  if ((x - base) < 0DOT5) {BACKSLASHn    return floor(x);BACKSLASHn  } else if ((x - base) > 0DOT5) {BACKSLASHn    return ceil(x);BACKSLASHn  } else {BACKSLASHn    if (mod(base, 2DOT0) == 0DOT0) {BACKSLASHn      return base;BACKSLASHn    } else {BACKSLASHn      return base + 1DOT0;BACKSLASHn    }BACKSLASHn  }BACKSLASHn`: `BACKSLASHn  // OpenGL ES does not support round functionDOTBACKSLASHn  // The algorithm is based on banker_quotes roundingDOTBACKSLASHn  float base = floor(x);BACKSLASHn  if ((x - base) < 0DOT5) {BACKSLASHn    return floor(x);BACKSLASHn  } else if ((x - base) > 0DOT5) {BACKSLASHn    return ceil(x);BACKSLASHn  } else {BACKSLASHn    if (mod(base, 2DOT0) == 0DOT0) {BACKSLASHn      return base;BACKSLASHn    } else {BACKSLASHn      return base + 1DOT0;BACKSLASHn    }BACKSLASHn  }BACKSLASHn` = "\n  // OpenGL ES does not support round function.\n  // The algorithm is based on banker's rounding.\n  float base = floor(x);\n  if ((x - base) < 0.5) {\n    return floor(x);\n  } else if ((x - base) > 0.5) {\n    return ceil(x);\n  } else {\n    if (mod(base, 2.0) == 0.0) {\n      return base;\n    } else {\n      return base + 1.0;\n    }\n  }\n".asInstanceOf[`BACKSLASHn  // OpenGL ES does not support round functionDOTBACKSLASHn  // The algorithm is based on banker_quotes roundingDOTBACKSLASHn  float base = floor(x);BACKSLASHn  if ((x - base) < 0DOT5) {BACKSLASHn    return floor(x);BACKSLASHn  } else if ((x - base) > 0DOT5) {BACKSLASHn    return ceil(x);BACKSLASHn  } else {BACKSLASHn    if (mod(base, 2DOT0) == 0DOT0) {BACKSLASHn      return base;BACKSLASHn    } else {BACKSLASHn      return base + 1DOT0;BACKSLASHn    }BACKSLASHn  }BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  // vec4 one = vec4(equal(a, b));BACKSLASHn  // return one + (vec4(1DOT0) - one) * a / b;BACKSLASHn  vec4 result = a / b;BACKSLASHn  if(aDOTx == bDOTx) {BACKSLASHn    resultDOTx = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTy == bDOTy) {BACKSLASHn    resultDOTy = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTz == bDOTz) {BACKSLASHn    resultDOTz = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTw == bDOTw) {BACKSLASHn    resultDOTw = 1DOT;BACKSLASHn  }BACKSLASHnBACKSLASHn  return result;BACKSLASHn`: `BACKSLASHn  // vec4 one = vec4(equal(a, b));BACKSLASHn  // return one + (vec4(1DOT0) - one) * a / b;BACKSLASHn  vec4 result = a / b;BACKSLASHn  if(aDOTx == bDOTx) {BACKSLASHn    resultDOTx = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTy == bDOTy) {BACKSLASHn    resultDOTy = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTz == bDOTz) {BACKSLASHn    resultDOTz = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTw == bDOTw) {BACKSLASHn    resultDOTw = 1DOT;BACKSLASHn  }BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = "\n  // vec4 one = vec4(equal(a, b));\n  // return one + (vec4(1.0) - one) * a / b;\n  vec4 result = a / b;\n  if(a.x == b.x) {\n    result.x = 1.;\n  }\n  if(a.y == b.y) {\n    result.y = 1.;\n  }\n  if(a.z == b.z) {\n    result.z = 1.;\n  }\n  if(a.w == b.w) {\n    result.w = 1.;\n  }\n\n  return result;\n".asInstanceOf[`BACKSLASHn  // vec4 one = vec4(equal(a, b));BACKSLASHn  // return one + (vec4(1DOT0) - one) * a / b;BACKSLASHn  vec4 result = a / b;BACKSLASHn  if(aDOTx == bDOTx) {BACKSLASHn    resultDOTx = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTy == bDOTy) {BACKSLASHn    resultDOTy = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTz == bDOTz) {BACKSLASHn    resultDOTz = 1DOT;BACKSLASHn  }BACKSLASHn  if(aDOTw == bDOTw) {BACKSLASHn    resultDOTw = 1DOT;BACKSLASHn  }BACKSLASHnBACKSLASHn  return result;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  const float FLOAT_MAX = 1DOT70141184e38;BACKSLASHn  const float FLOAT_MIN = 1DOT17549435e-38;BACKSLASHnBACKSLASHn  lowp vec4 encode_float(highp float v) {BACKSLASHn    if (isnan(v)) {BACKSLASHn      return vec4(255, 255, 255, 255);BACKSLASHn    }BACKSLASHnBACKSLASHn    highp float av = abs(v);BACKSLASHnBACKSLASHn    if(av < FLOAT_MIN) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 0DOT0, 0DOT0);BACKSLASHn    } else if(v > FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 128DOT0, 127DOT0) / 255DOT0;BACKSLASHn    } else if(v < -FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0,  128DOT0, 255DOT0) / 255DOT0;BACKSLASHn    }BACKSLASHnBACKSLASHn    highp vec4 c = vec4(0,0,0,0);BACKSLASHnBACKSLASHn    highp float e = floor(log2(av));BACKSLASHn    highp float m = exp2(fract(log2(av))) - 1DOT0;BACKSLASHnBACKSLASHn    c[2] = floor(128DOT0 * m);BACKSLASHn    m -= c[2] / 128DOT0;BACKSLASHn    c[1] = floor(32768DOT0 * m);BACKSLASHn    m -= c[1] / 32768DOT0;BACKSLASHn    c[0] = floor(8388608DOT0 * m);BACKSLASHnBACKSLASHn    highp float ebias = e + 127DOT0;BACKSLASHn    c[3] = floor(ebias / 2DOT0);BACKSLASHn    ebias -= c[3] * 2DOT0;BACKSLASHn    c[2] += floor(ebias) * 128DOT0;BACKSLASHnBACKSLASHn    c[3] += 128DOT0 * step(0DOT0, -v);BACKSLASHnBACKSLASHn    return c / 255DOT0;BACKSLASHn  }BACKSLASHn`: `BACKSLASHn  const float FLOAT_MAX = 1DOT70141184e38;BACKSLASHn  const float FLOAT_MIN = 1DOT17549435e-38;BACKSLASHnBACKSLASHn  lowp vec4 encode_float(highp float v) {BACKSLASHn    if (isnan(v)) {BACKSLASHn      return vec4(255, 255, 255, 255);BACKSLASHn    }BACKSLASHnBACKSLASHn    highp float av = abs(v);BACKSLASHnBACKSLASHn    if(av < FLOAT_MIN) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 0DOT0, 0DOT0);BACKSLASHn    } else if(v > FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 128DOT0, 127DOT0) / 255DOT0;BACKSLASHn    } else if(v < -FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0,  128DOT0, 255DOT0) / 255DOT0;BACKSLASHn    }BACKSLASHnBACKSLASHn    highp vec4 c = vec4(0,0,0,0);BACKSLASHnBACKSLASHn    highp float e = floor(log2(av));BACKSLASHn    highp float m = exp2(fract(log2(av))) - 1DOT0;BACKSLASHnBACKSLASHn    c[2] = floor(128DOT0 * m);BACKSLASHn    m -= c[2] / 128DOT0;BACKSLASHn    c[1] = floor(32768DOT0 * m);BACKSLASHn    m -= c[1] / 32768DOT0;BACKSLASHn    c[0] = floor(8388608DOT0 * m);BACKSLASHnBACKSLASHn    highp float ebias = e + 127DOT0;BACKSLASHn    c[3] = floor(ebias / 2DOT0);BACKSLASHn    ebias -= c[3] * 2DOT0;BACKSLASHn    c[2] += floor(ebias) * 128DOT0;BACKSLASHnBACKSLASHn    c[3] += 128DOT0 * step(0DOT0, -v);BACKSLASHnBACKSLASHn    return c / 255DOT0;BACKSLASHn  }BACKSLASHn` = "\n  const float FLOAT_MAX = 1.70141184e38;\n  const float FLOAT_MIN = 1.17549435e-38;\n\n  lowp vec4 encode_float(highp float v) {\n    if (isnan(v)) {\n      return vec4(255, 255, 255, 255);\n    }\n\n    highp float av = abs(v);\n\n    if(av < FLOAT_MIN) {\n      return vec4(0.0, 0.0, 0.0, 0.0);\n    } else if(v > FLOAT_MAX) {\n      return vec4(0.0, 0.0, 128.0, 127.0) / 255.0;\n    } else if(v < -FLOAT_MAX) {\n      return vec4(0.0, 0.0,  128.0, 255.0) / 255.0;\n    }\n\n    highp vec4 c = vec4(0,0,0,0);\n\n    highp float e = floor(log2(av));\n    highp float m = exp2(fract(log2(av))) - 1.0;\n\n    c[2] = floor(128.0 * m);\n    m -= c[2] / 128.0;\n    c[1] = floor(32768.0 * m);\n    m -= c[1] / 32768.0;\n    c[0] = floor(8388608.0 * m);\n\n    highp float ebias = e + 127.0;\n    c[3] = floor(ebias / 2.0);\n    ebias -= c[3] * 2.0;\n    c[2] += floor(ebias) * 128.0;\n\n    c[3] += 128.0 * step(0.0, -v);\n\n    return c / 255.0;\n  }\n".asInstanceOf[`BACKSLASHn  const float FLOAT_MAX = 1DOT70141184e38;BACKSLASHn  const float FLOAT_MIN = 1DOT17549435e-38;BACKSLASHnBACKSLASHn  lowp vec4 encode_float(highp float v) {BACKSLASHn    if (isnan(v)) {BACKSLASHn      return vec4(255, 255, 255, 255);BACKSLASHn    }BACKSLASHnBACKSLASHn    highp float av = abs(v);BACKSLASHnBACKSLASHn    if(av < FLOAT_MIN) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 0DOT0, 0DOT0);BACKSLASHn    } else if(v > FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0, 128DOT0, 127DOT0) / 255DOT0;BACKSLASHn    } else if(v < -FLOAT_MAX) {BACKSLASHn      return vec4(0DOT0, 0DOT0,  128DOT0, 255DOT0) / 255DOT0;BACKSLASHn    }BACKSLASHnBACKSLASHn    highp vec4 c = vec4(0,0,0,0);BACKSLASHnBACKSLASHn    highp float e = floor(log2(av));BACKSLASHn    highp float m = exp2(fract(log2(av))) - 1DOT0;BACKSLASHnBACKSLASHn    c[2] = floor(128DOT0 * m);BACKSLASHn    m -= c[2] / 128DOT0;BACKSLASHn    c[1] = floor(32768DOT0 * m);BACKSLASHn    m -= c[1] / 32768DOT0;BACKSLASHn    c[0] = floor(8388608DOT0 * m);BACKSLASHnBACKSLASHn    highp float ebias = e + 127DOT0;BACKSLASHn    c[3] = floor(ebias / 2DOT0);BACKSLASHn    ebias -= c[3] * 2DOT0;BACKSLASHn    c[2] += floor(ebias) * 128DOT0;BACKSLASHnBACKSLASHn    c[3] += 128DOT0 * step(0DOT0, -v);BACKSLASHnBACKSLASHn    return c / 255DOT0;BACKSLASHn  }BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  float e2x = exp(-2DOT0 * abs(x));BACKSLASHn  return sign(x) * (1DOT0 - e2x) / (1DOT0 + e2x);BACKSLASHn`: `BACKSLASHn  float e2x = exp(-2DOT0 * abs(x));BACKSLASHn  return sign(x) * (1DOT0 - e2x) / (1DOT0 + e2x);BACKSLASHn` = "\n  float e2x = exp(-2.0 * abs(x));\n  return sign(x) * (1.0 - e2x) / (1.0 + e2x);\n".asInstanceOf[`BACKSLASHn  float e2x = exp(-2DOT0 * abs(x));BACKSLASHn  return sign(x) * (1DOT0 - e2x) / (1DOT0 + e2x);BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  float e2x = exp(-x);BACKSLASHn  return (e2x + 1DOT0 / e2x) / 2DOT0;BACKSLASHn`: `BACKSLASHn  float e2x = exp(-x);BACKSLASHn  return (e2x + 1DOT0 / e2x) / 2DOT0;BACKSLASHn` = "\n  float e2x = exp(-x);\n  return (e2x + 1.0 / e2x) / 2.0;\n".asInstanceOf[`BACKSLASHn  float e2x = exp(-x);BACKSLASHn  return (e2x + 1DOT0 / e2x) / 2DOT0;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  float e2x = exp(x);BACKSLASHn  return (e2x - 1DOT0 / e2x) / 2DOT0;BACKSLASHn`: `BACKSLASHn  float e2x = exp(x);BACKSLASHn  return (e2x - 1DOT0 / e2x) / 2DOT0;BACKSLASHn` = "\n  float e2x = exp(x);\n  return (e2x - 1.0 / e2x) / 2.0;\n".asInstanceOf[`BACKSLASHn  float e2x = exp(x);BACKSLASHn  return (e2x - 1DOT0 / e2x) / 2DOT0;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  float epsilon = 1DOT1920928955078125e-7;BACKSLASHn  float threshold = log(epsilon) + 2DOT0;BACKSLASHnBACKSLASHn  bool too_large = x > -threshold;BACKSLASHn  bool too_small = x < threshold;BACKSLASHnBACKSLASHn  float result;BACKSLASHn  float exp_x = exp(x);BACKSLASHnBACKSLASHn  if (too_large){BACKSLASHn    result = x;BACKSLASHn  }BACKSLASHn  else if (too_small){BACKSLASHn    result = exp_x;BACKSLASHn  }BACKSLASHn  else{BACKSLASHn    result = log(exp_x + 1DOT0);BACKSLASHn  }BACKSLASHn  return result;BACKSLASHn`: `BACKSLASHn  float epsilon = 1DOT1920928955078125e-7;BACKSLASHn  float threshold = log(epsilon) + 2DOT0;BACKSLASHnBACKSLASHn  bool too_large = x > -threshold;BACKSLASHn  bool too_small = x < threshold;BACKSLASHnBACKSLASHn  float result;BACKSLASHn  float exp_x = exp(x);BACKSLASHnBACKSLASHn  if (too_large){BACKSLASHn    result = x;BACKSLASHn  }BACKSLASHn  else if (too_small){BACKSLASHn    result = exp_x;BACKSLASHn  }BACKSLASHn  else{BACKSLASHn    result = log(exp_x + 1DOT0);BACKSLASHn  }BACKSLASHn  return result;BACKSLASHn` = "\n  float epsilon = 1.1920928955078125e-7;\n  float threshold = log(epsilon) + 2.0;\n\n  bool too_large = x > -threshold;\n  bool too_small = x < threshold;\n\n  float result;\n  float exp_x = exp(x);\n\n  if (too_large){\n    result = x;\n  }\n  else if (too_small){\n    result = exp_x;\n  }\n  else{\n    result = log(exp_x + 1.0);\n  }\n  return result;\n".asInstanceOf[`BACKSLASHn  float epsilon = 1DOT1920928955078125e-7;BACKSLASHn  float threshold = log(epsilon) + 2DOT0;BACKSLASHnBACKSLASHn  bool too_large = x > -threshold;BACKSLASHn  bool too_small = x < threshold;BACKSLASHnBACKSLASHn  float result;BACKSLASHn  float exp_x = exp(x);BACKSLASHnBACKSLASHn  if (too_large){BACKSLASHn    result = x;BACKSLASHn  }BACKSLASHn  else if (too_small){BACKSLASHn    result = exp_x;BACKSLASHn  }BACKSLASHn  else{BACKSLASHn    result = log(exp_x + 1DOT0);BACKSLASHn  }BACKSLASHn  return result;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  float s = sign(a) * sign(b);BACKSLASHn  int ia = round(a);BACKSLASHn  int ib = round(b);BACKSLASHn  if (ib != 0) {BACKSLASHn    // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn    return float(idiv(ia, ib, s));BACKSLASHn  } else {BACKSLASHn    return NAN;BACKSLASHn  }BACKSLASHn`: `BACKSLASHn  float s = sign(a) * sign(b);BACKSLASHn  int ia = round(a);BACKSLASHn  int ib = round(b);BACKSLASHn  if (ib != 0) {BACKSLASHn    // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn    return float(idiv(ia, ib, s));BACKSLASHn  } else {BACKSLASHn    return NAN;BACKSLASHn  }BACKSLASHn` = "\n  float s = sign(a) * sign(b);\n  int ia = round(a);\n  int ib = round(b);\n  if (ib != 0) {\n    // Windows (D3D) wants guaranteed non-zero int division at compile-time.\n    return float(idiv(ia, ib, s));\n  } else {\n    return NAN;\n  }\n".asInstanceOf[`BACKSLASHn  float s = sign(a) * sign(b);BACKSLASHn  int ia = round(a);BACKSLASHn  int ib = round(b);BACKSLASHn  if (ib != 0) {BACKSLASHn    // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn    return float(idiv(ia, ib, s));BACKSLASHn  } else {BACKSLASHn    return NAN;BACKSLASHn  }BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  if (isnan(x)) { return 0DOT0; }BACKSLASHn  return sign(x);BACKSLASHn`: `BACKSLASHn  if (isnan(x)) { return 0DOT0; }BACKSLASHn  return sign(x);BACKSLASHn` = "\n  if (isnan(x)) { return 0.0; }\n  return sign(x);\n".asInstanceOf[`BACKSLASHn  if (isnan(x)) { return 0DOT0; }BACKSLASHn  return sign(x);BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  ivec4 ia = round(a);BACKSLASHn  ivec4 ib = round(b);BACKSLASHn  bvec4 cond = notEqual(ib, ivec4(0));BACKSLASHn  ivec4 result = ivec4(0);BACKSLASHn  vec4 s = sign(a) * sign(b);BACKSLASHnBACKSLASHn  // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn  if (cond[0]) {BACKSLASHn    result[0] = idiv(ia[0], ib[0], s[0]);BACKSLASHn  }BACKSLASHn  if (cond[1]) {BACKSLASHn    result[1] = idiv(ia[1], ib[1], s[1]);BACKSLASHn  }BACKSLASHn  if (cond[2]) {BACKSLASHn    result[2] = idiv(ia[2], ib[2], s[2]);BACKSLASHn  }BACKSLASHn  if (cond[3]) {BACKSLASHn    result[3] = idiv(ia[3], ib[3], s[3]);BACKSLASHn  }BACKSLASHn  return vec4(result);BACKSLASHn`: `BACKSLASHn  ivec4 ia = round(a);BACKSLASHn  ivec4 ib = round(b);BACKSLASHn  bvec4 cond = notEqual(ib, ivec4(0));BACKSLASHn  ivec4 result = ivec4(0);BACKSLASHn  vec4 s = sign(a) * sign(b);BACKSLASHnBACKSLASHn  // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn  if (cond[0]) {BACKSLASHn    result[0] = idiv(ia[0], ib[0], s[0]);BACKSLASHn  }BACKSLASHn  if (cond[1]) {BACKSLASHn    result[1] = idiv(ia[1], ib[1], s[1]);BACKSLASHn  }BACKSLASHn  if (cond[2]) {BACKSLASHn    result[2] = idiv(ia[2], ib[2], s[2]);BACKSLASHn  }BACKSLASHn  if (cond[3]) {BACKSLASHn    result[3] = idiv(ia[3], ib[3], s[3]);BACKSLASHn  }BACKSLASHn  return vec4(result);BACKSLASHn` = "\n  ivec4 ia = round(a);\n  ivec4 ib = round(b);\n  bvec4 cond = notEqual(ib, ivec4(0));\n  ivec4 result = ivec4(0);\n  vec4 s = sign(a) * sign(b);\n\n  // Windows (D3D) wants guaranteed non-zero int division at compile-time.\n  if (cond[0]) {\n    result[0] = idiv(ia[0], ib[0], s[0]);\n  }\n  if (cond[1]) {\n    result[1] = idiv(ia[1], ib[1], s[1]);\n  }\n  if (cond[2]) {\n    result[2] = idiv(ia[2], ib[2], s[2]);\n  }\n  if (cond[3]) {\n    result[3] = idiv(ia[3], ib[3], s[3]);\n  }\n  return vec4(result);\n".asInstanceOf[`BACKSLASHn  ivec4 ia = round(a);BACKSLASHn  ivec4 ib = round(b);BACKSLASHn  bvec4 cond = notEqual(ib, ivec4(0));BACKSLASHn  ivec4 result = ivec4(0);BACKSLASHn  vec4 s = sign(a) * sign(b);BACKSLASHnBACKSLASHn  // Windows (D3D) wants guaranteed non-zero int division at compile-timeDOTBACKSLASHn  if (cond[0]) {BACKSLASHn    result[0] = idiv(ia[0], ib[0], s[0]);BACKSLASHn  }BACKSLASHn  if (cond[1]) {BACKSLASHn    result[1] = idiv(ia[1], ib[1], s[1]);BACKSLASHn  }BACKSLASHn  if (cond[2]) {BACKSLASHn    result[2] = idiv(ia[2], ib[2], s[2]);BACKSLASHn  }BACKSLASHn  if (cond[3]) {BACKSLASHn    result[3] = idiv(ia[3], ib[3], s[3]);BACKSLASHn  }BACKSLASHn  return vec4(result);BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return min(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) +BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))),BACKSLASHn    vec4(1DOT0));BACKSLASHn`: `BACKSLASHn  return min(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) +BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))),BACKSLASHn    vec4(1DOT0));BACKSLASHn` = "\n  return min(\n    vec4(greaterThanEqual(a, vec4(1.0))) +\n    vec4(greaterThanEqual(b, vec4(1.0))),\n    vec4(1.0));\n".asInstanceOf[`BACKSLASHn  return min(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) +BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))),BACKSLASHn    vec4(1DOT0));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return vec4(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) *BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))));BACKSLASHn`: `BACKSLASHn  return vec4(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) *BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))));BACKSLASHn` = "\n  return vec4(\n    vec4(greaterThanEqual(a, vec4(1.0))) *\n    vec4(greaterThanEqual(b, vec4(1.0))));\n".asInstanceOf[`BACKSLASHn  return vec4(BACKSLASHn    vec4(greaterThanEqual(a, vec4(1DOT0))) *BACKSLASHn    vec4(greaterThanEqual(b, vec4(1DOT0))));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return vec4(equal(a, b));BACKSLASHn`: `BACKSLASHn  return vec4(equal(a, b));BACKSLASHn` = "\n  return vec4(equal(a, b));\n".asInstanceOf[`BACKSLASHn  return vec4(equal(a, b));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return vec4(greaterThan(a, b));BACKSLASHn`: `BACKSLASHn  return vec4(greaterThan(a, b));BACKSLASHn` = "\n  return vec4(greaterThan(a, b));\n".asInstanceOf[`BACKSLASHn  return vec4(greaterThan(a, b));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return vec4(greaterThanEqual(a, b));BACKSLASHn`: `BACKSLASHn  return vec4(greaterThanEqual(a, b));BACKSLASHn` = "\n  return vec4(greaterThanEqual(a, b));\n".asInstanceOf[`BACKSLASHn  return vec4(greaterThanEqual(a, b));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return vec4(lessThan(a, b));BACKSLASHn`: `BACKSLASHn  return vec4(lessThan(a, b));BACKSLASHn` = "\n  return vec4(lessThan(a, b));\n".asInstanceOf[`BACKSLASHn  return vec4(lessThan(a, b));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return vec4(lessThanEqual(a, b));BACKSLASHn`: `BACKSLASHn  return vec4(lessThanEqual(a, b));BACKSLASHn` = "\n  return vec4(lessThanEqual(a, b));\n".asInstanceOf[`BACKSLASHn  return vec4(lessThanEqual(a, b));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  return vec4(notEqual(a, b));BACKSLASHn`: `BACKSLASHn  return vec4(notEqual(a, b));BACKSLASHn` = "\n  return vec4(notEqual(a, b));\n".asInstanceOf[`BACKSLASHn  return vec4(notEqual(a, b));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  vec4 aLessThanZero = vec4(lessThan(a, vec4(0DOT)));BACKSLASHn  return (aLessThanZero * (b * a)) + ((vec4(1DOT0) - aLessThanZero) * a);BACKSLASHn`: `BACKSLASHn  vec4 aLessThanZero = vec4(lessThan(a, vec4(0DOT)));BACKSLASHn  return (aLessThanZero * (b * a)) + ((vec4(1DOT0) - aLessThanZero) * a);BACKSLASHn` = "\n  vec4 aLessThanZero = vec4(lessThan(a, vec4(0.)));\n  return (aLessThanZero * (b * a)) + ((vec4(1.0) - aLessThanZero) * a);\n".asInstanceOf[`BACKSLASHn  vec4 aLessThanZero = vec4(lessThan(a, vec4(0DOT)));BACKSLASHn  return (aLessThanZero * (b * a)) + ((vec4(1DOT0) - aLessThanZero) * a);BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0DOT)));BACKSLASHn  return (bGTEZero * a) + ((vec4(1DOT0) - bGTEZero) * (a * (b + vec4(1DOT0))));BACKSLASHn`: `BACKSLASHn  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0DOT)));BACKSLASHn  return (bGTEZero * a) + ((vec4(1DOT0) - bGTEZero) * (a * (b + vec4(1DOT0))));BACKSLASHn` = "\n  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0.)));\n  return (bGTEZero * a) + ((vec4(1.0) - bGTEZero) * (a * (b + vec4(1.0))));\n".asInstanceOf[`BACKSLASHn  vec4 bGTEZero = vec4(greaterThanEqual(b, vec4(0DOT)));BACKSLASHn  return (bGTEZero * a) + ((vec4(1DOT0) - bGTEZero) * (a * (b + vec4(1DOT0))));BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  vec4 result = log(x);BACKSLASHn  vec4 isNaN = vec4(lessThan(x, vec4(0DOT0)));BACKSLASHn  resultDOTr = isNaNDOTr == 1DOT0 ? NAN : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg == 1DOT0 ? NAN : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb == 1DOT0 ? NAN : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa == 1DOT0 ? NAN : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`: `BACKSLASHn  vec4 result = log(x);BACKSLASHn  vec4 isNaN = vec4(lessThan(x, vec4(0DOT0)));BACKSLASHn  resultDOTr = isNaNDOTr == 1DOT0 ? NAN : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg == 1DOT0 ? NAN : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb == 1DOT0 ? NAN : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa == 1DOT0 ? NAN : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = "\n  vec4 result = log(x);\n  vec4 isNaN = vec4(lessThan(x, vec4(0.0)));\n  result.r = isNaN.r == 1.0 ? NAN : result.r;\n  result.g = isNaN.g == 1.0 ? NAN : result.g;\n  result.b = isNaN.b == 1.0 ? NAN : result.b;\n  result.a = isNaN.a == 1.0 ? NAN : result.a;\n\n  return result;\n".asInstanceOf[`BACKSLASHn  vec4 result = log(x);BACKSLASHn  vec4 isNaN = vec4(lessThan(x, vec4(0DOT0)));BACKSLASHn  resultDOTr = isNaNDOTr == 1DOT0 ? NAN : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg == 1DOT0 ? NAN : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb == 1DOT0 ? NAN : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa == 1DOT0 ? NAN : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  vec4 result = min(x, vec4(6DOT)) * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`: `BACKSLASHn  vec4 result = min(x, vec4(6DOT)) * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = "\n  vec4 result = min(x, vec4(6.)) * vec4(greaterThanEqual(x, vec4(0.0)));\n  bvec4 isNaN = isnan(x);\n\n  result.r = isNaN.r ? x.r : result.r;\n  result.g = isNaN.g ? x.g : result.g;\n  result.b = isNaN.b ? x.b : result.b;\n  result.a = isNaN.a ? x.a : result.a;\n\n  return result;\n".asInstanceOf[`BACKSLASHn  vec4 result = min(x, vec4(6DOT)) * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  vec4 result = x * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`: `BACKSLASHn  vec4 result = x * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = "\n  vec4 result = x * vec4(greaterThanEqual(x, vec4(0.0)));\n  bvec4 isNaN = isnan(x);\n\n  result.r = isNaN.r ? x.r : result.r;\n  result.g = isNaN.g ? x.g : result.g;\n  result.b = isNaN.b ? x.b : result.b;\n  result.a = isNaN.a ? x.a : result.a;\n\n  return result;\n".asInstanceOf[`BACKSLASHn  vec4 result = x * vec4(greaterThanEqual(x, vec4(0DOT0)));BACKSLASHn  bvec4 isNaN = isnan(x);BACKSLASHnBACKSLASHn  resultDOTr = isNaNDOTr ? xDOTr : resultDOTr;BACKSLASHn  resultDOTg = isNaNDOTg ? xDOTg : resultDOTg;BACKSLASHn  resultDOTb = isNaNDOTb ? xDOTb : resultDOTb;BACKSLASHn  resultDOTa = isNaNDOTa ? xDOTa : resultDOTa;BACKSLASHnBACKSLASHn  return result;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHn  vec4 result;BACKSLASHnBACKSLASHn  resultDOTr = (xDOTr >= 0DOT0) ? xDOTr : (exp(xDOTr) - 1DOT0);BACKSLASHn  resultDOTg = (xDOTg >= 0DOT0) ? xDOTg : (exp(xDOTg) - 1DOT0);BACKSLASHn  resultDOTb = (xDOTb >= 0DOT0) ? xDOTb : (exp(xDOTb) - 1DOT0);BACKSLASHn  resultDOTa = (xDOTa >= 0DOT0) ? xDOTa : (exp(xDOTa) - 1DOT0);BACKSLASHnBACKSLASHn  return result;BACKSLASHn`: `BACKSLASHn  vec4 result;BACKSLASHnBACKSLASHn  resultDOTr = (xDOTr >= 0DOT0) ? xDOTr : (exp(xDOTr) - 1DOT0);BACKSLASHn  resultDOTg = (xDOTg >= 0DOT0) ? xDOTg : (exp(xDOTg) - 1DOT0);BACKSLASHn  resultDOTb = (xDOTb >= 0DOT0) ? xDOTb : (exp(xDOTb) - 1DOT0);BACKSLASHn  resultDOTa = (xDOTa >= 0DOT0) ? xDOTa : (exp(xDOTa) - 1DOT0);BACKSLASHnBACKSLASHn  return result;BACKSLASHn` = "\n  vec4 result;\n\n  result.r = (x.r >= 0.0) ? x.r : (exp(x.r) - 1.0);\n  result.g = (x.g >= 0.0) ? x.g : (exp(x.g) - 1.0);\n  result.b = (x.b >= 0.0) ? x.b : (exp(x.b) - 1.0);\n  result.a = (x.a >= 0.0) ? x.a : (exp(x.a) - 1.0);\n\n  return result;\n".asInstanceOf[`BACKSLASHn  vec4 result;BACKSLASHnBACKSLASHn  resultDOTr = (xDOTr >= 0DOT0) ? xDOTr : (exp(xDOTr) - 1DOT0);BACKSLASHn  resultDOTg = (xDOTg >= 0DOT0) ? xDOTg : (exp(xDOTg) - 1DOT0);BACKSLASHn  resultDOTb = (xDOTb >= 0DOT0) ? xDOTb : (exp(xDOTb) - 1DOT0);BACKSLASHn  resultDOTa = (xDOTa >= 0DOT0) ? xDOTa : (exp(xDOTa) - 1DOT0);BACKSLASHnBACKSLASHn  return result;BACKSLASHn`]
  @scala.inline
  def `BACKSLASHnif (a == b) {BACKSLASHn  return 1DOT0;BACKSLASHn};BACKSLASHnreturn a / b;`: `BACKSLASHnif (a == b) {BACKSLASHn  return 1DOT0;BACKSLASHn};BACKSLASHnreturn a / b;` = "\nif (a == b) {\n  return 1.0;\n};\nreturn a / b;".asInstanceOf[`BACKSLASHnif (a == b) {BACKSLASHn  return 1DOT0;BACKSLASHn};BACKSLASHnreturn a / b;`]
  @scala.inline
  def `BACKSLASHnif(a < 0DOT0 && floor(b) < b){BACKSLASHn  return NAN;BACKSLASHn}BACKSLASHnif (b == 0DOT0) {BACKSLASHn  return 1DOT0;BACKSLASHn}BACKSLASHnreturn (round(mod(b, 2DOT0)) != 1) ?BACKSLASHn    pow(abs(a), b) : sign(a) * pow(abs(a), b);BACKSLASHn`: `BACKSLASHnif(a < 0DOT0 && floor(b) < b){BACKSLASHn  return NAN;BACKSLASHn}BACKSLASHnif (b == 0DOT0) {BACKSLASHn  return 1DOT0;BACKSLASHn}BACKSLASHnreturn (round(mod(b, 2DOT0)) != 1) ?BACKSLASHn    pow(abs(a), b) : sign(a) * pow(abs(a), b);BACKSLASHn` = "\nif(a < 0.0 && floor(b) < b){\n  return NAN;\n}\nif (b == 0.0) {\n  return 1.0;\n}\nreturn (round(mod(b, 2.0)) != 1) ?\n    pow(abs(a), b) : sign(a) * pow(abs(a), b);\n".asInstanceOf[`BACKSLASHnif(a < 0DOT0 && floor(b) < b){BACKSLASHn  return NAN;BACKSLASHn}BACKSLASHnif (b == 0DOT0) {BACKSLASHn  return 1DOT0;BACKSLASHn}BACKSLASHnreturn (round(mod(b, 2DOT0)) != 1) ?BACKSLASHn    pow(abs(a), b) : sign(a) * pow(abs(a), b);BACKSLASHn`]
  @scala.inline
  def Engine: Engine = "Engine".asInstanceOf[Engine]
  @scala.inline
  def GraphDef: GraphDef = "GraphDef".asInstanceOf[GraphDef]
  @scala.inline
  def JSON: JSON = "JSON".asInstanceOf[JSON]
  @scala.inline
  def NCDHW: NCDHW = "NCDHW".asInstanceOf[NCDHW]
  @scala.inline
  def NCHW: NCHW = "NCHW".asInstanceOf[NCHW]
  @scala.inline
  def NCW: NCW = "NCW".asInstanceOf[NCW]
  @scala.inline
  def NDHWC: NDHWC = "NDHWC".asInstanceOf[NDHWC]
  @scala.inline
  def NHWC: NHWC = "NHWC".asInstanceOf[NHWC]
  @scala.inline
  def NUMBER: NUMBER = "NUMBER".asInstanceOf[NUMBER]
  @scala.inline
  def NWC: NWC = "NWC".asInstanceOf[NWC]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def SAME: SAME = "SAME".asInstanceOf[SAME]
  @scala.inline
  def VALID: VALID = "VALID".asInstanceOf[VALID]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def avg: avg = "avg".asInstanceOf[avg]
  @scala.inline
  def bilinear: bilinear = "bilinear".asInstanceOf[bilinear]
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  @scala.inline
  def ceil: ceil = "ceil".asInstanceOf[ceil]
  @scala.inline
  def channelsFirst: channelsFirst = "channelsFirst".asInstanceOf[channelsFirst]
  @scala.inline
  def channelsLast: channelsLast = "channelsLast".asInstanceOf[channelsLast]
  @scala.inline
  def complex64: complex64 = "complex64".asInstanceOf[complex64]
  @scala.inline
  def `downloads://`: `downloads://` = "downloads://".asInstanceOf[`downloads://`]
  @scala.inline
  def elu: elu = "elu".asInstanceOf[elu]
  @scala.inline
  def euclidean: euclidean = "euclidean".asInstanceOf[euclidean]
  @scala.inline
  def float32: float32 = "float32".asInstanceOf[float32]
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  @scala.inline
  def fro: fro = "fro".asInstanceOf[fro]
  @scala.inline
  def `if (b == 0DOT0) return NAN;BACKSLASHn  return mod(a, b);`: `if (b == 0DOT0) return NAN;BACKSLASHn  return mod(a, b);` = "if (b == 0.0) return NAN;\n  return mod(a, b);".asInstanceOf[`if (b == 0DOT0) return NAN;BACKSLASHn  return mod(a, b);`]
  @scala.inline
  def `if (x < 0DOT0) return NAN;BACKSLASHn  return log(x);`: `if (x < 0DOT0) return NAN;BACKSLASHn  return log(x);` = "if (x < 0.0) return NAN;\n  return log(x);".asInstanceOf[`if (x < 0DOT0) return NAN;BACKSLASHn  return log(x);`]
  @scala.inline
  def `indexeddb://`: `indexeddb://` = "indexeddb://".asInstanceOf[`indexeddb://`]
  @scala.inline
  def int32: int32 = "int32".asInstanceOf[int32]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def `localstorage://`: `localstorage://` = "localstorage://".asInstanceOf[`localstorage://`]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def model: model = "model".asInstanceOf[model]
  @scala.inline
  def nearest: nearest = "nearest".asInstanceOf[nearest]
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  @scala.inline
  def optimizer: optimizer = "optimizer".asInstanceOf[optimizer]
  @scala.inline
  def prelu: prelu = "prelu".asInstanceOf[prelu]
  @scala.inline
  def prod: prod = "prod".asInstanceOf[prod]
  @scala.inline
  def relu: relu = "relu".asInstanceOf[relu]
  @scala.inline
  def relu6: relu6 = "relu6".asInstanceOf[relu6]
  @scala.inline
  def `return (a - b) * (a - b);`: `return (a - b) * (a - b);` = "return (a - b) * (a - b);".asInstanceOf[`return (a - b) * (a - b);`]
  @scala.inline
  def `return (a < 0DOT) ? b * a : a;`: `return (a < 0DOT) ? b * a : a;` = "return (a < 0.) ? b * a : a;".asInstanceOf[`return (a < 0DOT) ? b * a : a;`]
  @scala.inline
  def `return (b >= 1DOT0) ? a : a * (b + 1DOT0);`: `return (b >= 1DOT0) ? a : a * (b + 1DOT0);` = "return (b >= 1.0) ? a : a * (b + 1.0);".asInstanceOf[`return (b >= 1DOT0) ? a : a * (b + 1DOT0);`]
  @scala.inline
  def `return (x >= 0DOT0) ? x : (exp(x) - 1DOT0);`: `return (x >= 0DOT0) ? x : (exp(x) - 1DOT0);` = "return (x >= 0.0) ? x : (exp(x) - 1.0);".asInstanceOf[`return (x >= 0DOT0) ? x : (exp(x) - 1DOT0);`]
  @scala.inline
  def `return -x;`: `return -x;` = "return -x;".asInstanceOf[`return -x;`]
  @scala.inline
  def `return 1DOT0 / (1DOT0 + exp(-1DOT0 * x));`: `return 1DOT0 / (1DOT0 + exp(-1DOT0 * x));` = "return 1.0 / (1.0 + exp(-1.0 * x));".asInstanceOf[`return 1DOT0 / (1DOT0 + exp(-1DOT0 * x));`]
  @scala.inline
  def `return 1DOT0 / x;`: `return 1DOT0 / x;` = "return 1.0 / x;".asInstanceOf[`return 1DOT0 / x;`]
  @scala.inline
  def `return a * b;`: `return a * b;` = "return a * b;".asInstanceOf[`return a * b;`]
  @scala.inline
  def `return a + b;`: `return a + b;` = "return a + b;".asInstanceOf[`return a + b;`]
  @scala.inline
  def `return a - b;`: `return a - b;` = "return a - b;".asInstanceOf[`return a - b;`]
  @scala.inline
  def `return abs(x);`: `return abs(x);` = "return abs(x);".asInstanceOf[`return abs(x);`]
  @scala.inline
  def `return ceil(x);`: `return ceil(x);` = "return ceil(x);".asInstanceOf[`return ceil(x);`]
  @scala.inline
  def `return exp(x) - 1DOT0;`: `return exp(x) - 1DOT0;` = "return exp(x) - 1.0;".asInstanceOf[`return exp(x) - 1DOT0;`]
  @scala.inline
  def `return exp(x);`: `return exp(x);` = "return exp(x);".asInstanceOf[`return exp(x);`]
  @scala.inline
  def `return float(!(x >= 1DOT0));`: `return float(!(x >= 1DOT0));` = "return float(!(x >= 1.0));".asInstanceOf[`return float(!(x >= 1DOT0));`]
  @scala.inline
  def `return float(!isnan(x) && !isinf(x));`: `return float(!isnan(x) && !isinf(x));` = "return float(!isnan(x) && !isinf(x));".asInstanceOf[`return float(!isnan(x) && !isinf(x));`]
  @scala.inline
  def `return float(a != b);`: `return float(a != b);` = "return float(a != b);".asInstanceOf[`return float(a != b);`]
  @scala.inline
  def `return float(a < b);`: `return float(a < b);` = "return float(a < b);".asInstanceOf[`return float(a < b);`]
  @scala.inline
  def `return float(a <= b);`: `return float(a <= b);` = "return float(a <= b);".asInstanceOf[`return float(a <= b);`]
  @scala.inline
  def `return float(a == b);`: `return float(a == b);` = "return float(a == b);".asInstanceOf[`return float(a == b);`]
  @scala.inline
  def `return float(a > b);`: `return float(a > b);` = "return float(a > b);".asInstanceOf[`return float(a > b);`]
  @scala.inline
  def `return float(a >= 1DOT0 && b >= 1DOT0);`: `return float(a >= 1DOT0 && b >= 1DOT0);` = "return float(a >= 1.0 && b >= 1.0);".asInstanceOf[`return float(a >= 1DOT0 && b >= 1DOT0);`]
  @scala.inline
  def `return float(a >= 1DOT0 || b >= 1DOT0);`: `return float(a >= 1DOT0 || b >= 1DOT0);` = "return float(a >= 1.0 || b >= 1.0);".asInstanceOf[`return float(a >= 1DOT0 || b >= 1DOT0);`]
  @scala.inline
  def `return float(a >= b);`: `return float(a >= b);` = "return float(a >= b);".asInstanceOf[`return float(a >= b);`]
  @scala.inline
  def `return float(int(x));`: `return float(int(x));` = "return float(int(x));".asInstanceOf[`return float(int(x));`]
  @scala.inline
  def `return float(isinf(x));`: `return float(isinf(x));` = "return float(isinf(x));".asInstanceOf[`return float(isinf(x));`]
  @scala.inline
  def `return float(isnan(x));`: `return float(isnan(x));` = "return float(isnan(x));".asInstanceOf[`return float(isnan(x));`]
  @scala.inline
  def `return floor(x);`: `return floor(x);` = "return floor(x);".asInstanceOf[`return floor(x);`]
  @scala.inline
  def `return inversesqrt(x);`: `return inversesqrt(x);` = "return inversesqrt(x);".asInstanceOf[`return inversesqrt(x);`]
  @scala.inline
  def `return log(1DOT0 + x);`: `return log(1DOT0 + x);` = "return log(1.0 + x);".asInstanceOf[`return log(1DOT0 + x);`]
  @scala.inline
  def `return sqrt(x);`: `return sqrt(x);` = "return sqrt(x);".asInstanceOf[`return sqrt(x);`]
  @scala.inline
  def `return tan(x);`: `return tan(x);` = "return tan(x);".asInstanceOf[`return tan(x);`]
  @scala.inline
  def `return x * x;`: `return x * x;` = "return x * x;".asInstanceOf[`return x * x;`]
  @scala.inline
  def `return x;`: `return x;` = "return x;".asInstanceOf[`return x;`]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  @scala.inline
  def same_ : same_ = "same".asInstanceOf[same_]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def uint16: uint16 = "uint16".asInstanceOf[uint16]
  @scala.inline
  def uint8: uint8 = "uint8".asInstanceOf[uint8]
  @scala.inline
  def unsortedSegmentSum: unsortedSegmentSum = "unsortedSegmentSum".asInstanceOf[unsortedSegmentSum]
  @scala.inline
  def valid_ : valid_ = "valid".asInstanceOf[valid_]
}

