package typings
package utilityLib.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * ------------------0_0------------------------
    * @description Defines For Number Methods
    * @see https://github.com/node-modules/utility#number-utils
    * --------------------0^0----------------------
    */
  /**
    * CONSTANTS STATIC
    */
  val MAX_SAFE_INTEGER: scala.Double = js.native
  val MAX_SAFE_INTEGER_STR: java.lang.String = js.native
  val MAX_SAFE_INTEGER_STR_LENGTH: scala.Double = js.native
  val MIN_SAFE_INTEGER: scala.Double = js.native
  val UNSTABLE_METHOD: utilityLib.Anon_Args = js.native
  /**
    * `moment().format('YYYY-MM-DD')` format date string.
    *
    * @return {String}
    */
  def YYYYMMDD(d: java.lang.String): java.lang.String = js.native
  def YYYYMMDD(d: java.lang.String, sep: java.lang.String): java.lang.String = js.native
  def YYYYMMDD(d: stdLib.Date): java.lang.String = js.native
  def YYYYMMDD(d: stdLib.Date, sep: java.lang.String): java.lang.String = js.native
  def YYYYMMDDHHmmss(d: java.lang.String): java.lang.String = js.native
  def YYYYMMDDHHmmss(d: java.lang.String, options: utilityLib.utilityMod.utilityNs.IYYYYMMDDHHmmssStaticOptions): java.lang.String = js.native
  /**
    * `moment().format('YYYY-MM-DD HH:mm:ss')` format date string.
    *
    * @return {String}
    */
  def YYYYMMDDHHmmss(d: stdLib.Date): java.lang.String = js.native
  def YYYYMMDDHHmmss(d: stdLib.Date, options: utilityLib.utilityMod.utilityNs.IYYYYMMDDHHmmssStaticOptions): java.lang.String = js.native
  /**
    * Access log format date. format: `moment().format('DD/MMM/YYYY:HH:mm:ss ZZ')`
    *
    * @return {String}
    */
  def accessLogDate(d: stdLib.Date): java.lang.String = js.native
  /**
    * optimize arguments to array
    * @param {Arguments} args
    * @return {Array}
    */
  def argumentsToArray(args: js.Any*): js.Array[_] = js.native
  def assign(target: utilityLib.utilityMod.utilityNs.ObjStatic, objects: js.Array[_]): utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  /**
    * ------------------0_0--------------------------
    * @description Defines For Object Methods
    * @see https://github.com/node-modules/utility#objectassign
    * -------------------0^0------------------------
    */
  /**
    * High performance assign before node6
    * @param {Object} target - target object
    * @param {Object | Array} objects - object assign from
    * @return {Object} - return target object
    */
  def assign(
    target: utilityLib.utilityMod.utilityNs.ObjStatic,
    objects: utilityLib.utilityMod.utilityNs.ObjStatic
  ): utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  /**
    * Base64 string decode.
    *
    * @param {String} encode, base64 encoding string.
    * @param {Boolean} [urlsafe=false] Decode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @param {encoding} [encoding=utf8] if encoding = buffer, will return Buffer instance
    * @return {String|Buffer} plain text.
    */
  def base64decode(encode: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def base64decode(encode: java.lang.String, urlsafe: scala.Boolean): java.lang.String | nodeLib.Buffer = js.native
  @JSName("base64decode")
  def base64decode_buffer(encode: java.lang.String, urlsafe: scala.Boolean, encoding: utilityLib.utilityLibStrings.buffer): java.lang.String | nodeLib.Buffer = js.native
  @JSName("base64decode")
  def base64decode_utf8(encode: java.lang.String, urlsafe: scala.Boolean, encoding: utilityLib.utilityLibStrings.utf8): java.lang.String | nodeLib.Buffer = js.native
  /**
    * Base64 encode string.
    *
    * @param {String|Buffer} s
    * @param {Boolean} [urlsafe=false] Encode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @return {String} base64 encode format string.
    */
  def base64encode(s: java.lang.String): java.lang.String = js.native
  def base64encode(s: java.lang.String, urlsafe: scala.Boolean): java.lang.String = js.native
  def base64encode(s: nodeLib.Buffer): java.lang.String = js.native
  def base64encode(s: nodeLib.Buffer, urlsafe: scala.Boolean): java.lang.String = js.native
  /**
    * return datetime struct.
    *
    * @return {Object} date
    *  - {Number} YYYYMMDD, 20130401
    *  - {Number} H, 0, 1, 9, 12, 23
    */
  def datestruct(): utilityLib.utilityMod.utilityNs.IDateStructStaticReturns = js.native
  def datestruct(now: stdLib.Date): utilityLib.utilityMod.utilityNs.IDateStructStaticReturns = js.native
  /**
    * Safe decodeURIComponent, won't throw any error.
    * If `decodeURIComponent` error happen, just return the original value.
    *
    * @param {String} encodeText
    * @return {String} URL decode original string.
    */
  def decodeURIComponent(encodeText: java.lang.String): java.lang.String = js.native
  /**
    * avoid if (a && a.b && a.b.c)
    * @param {Object} obj
    * @param {...String} keys
    * @return {Object}
    */
  def dig(obj: utilityLib.utilityMod.utilityNs.ObjStatic, args: js.Any*): js.Any = js.native
  /**
    * Safe encodeURIComponent, won't throw any error.
    * If `encodeURIComponent` error happen, just return the original value.
    *
    * @param {String} text
    * @return {String} URL encode string.
    */
  def encodeURIComponent(text: java.lang.String): java.lang.String = js.native
  /**
    * ------------------0_0----------------------
    * @description Defines For Web Methods
    * @see https://github.com/node-modules/utility#decode-and-encode
    * ------------------0^0------------------------
    */
  /**
    * Escape the given string of `html`.
    *
    * @param {String} html
    * @return {String}
    * @public
    */
  def escape(test: java.lang.String): java.lang.String = js.native
  /**
    * Get a function parameter's names.
    *
    * @param {Function} func
    * @param {Boolean} [useCache], default is true
    * @return {Array} names
    */
  def getParamNames(func: js.Function1[/* repeated */ js.Any, _]): js.Array[java.lang.String] = js.native
  def getParamNames(func: js.Function1[/* repeated */ js.Any, _], cache: scala.Boolean): js.Array[java.lang.String] = js.native
  /**
    * Module dependencies.
    */
  def has(obj: utilityLib.utilityMod.utilityNs.ObjStatic, prop: java.lang.String): scala.Boolean = js.native
  def hash(
    method: utilityLib.utilityLibStrings.md5,
    s: java.lang.String,
    format: utilityLib.utilityLibStrings.base64
  ): java.lang.String = js.native
  def hash(
    method: utilityLib.utilityLibStrings.md5,
    s: java.lang.String,
    format: utilityLib.utilityLibStrings.hex
  ): java.lang.String = js.native
  def hash(
    method: utilityLib.utilityLibStrings.md5,
    s: nodeLib.Buffer,
    format: utilityLib.utilityLibStrings.base64
  ): java.lang.String = js.native
  def hash(
    method: utilityLib.utilityLibStrings.md5,
    s: nodeLib.Buffer,
    format: utilityLib.utilityLibStrings.hex
  ): java.lang.String = js.native
  def hash(
    method: utilityLib.utilityLibStrings.sha1,
    s: java.lang.String,
    format: utilityLib.utilityLibStrings.base64
  ): java.lang.String = js.native
  def hash(
    method: utilityLib.utilityLibStrings.sha1,
    s: java.lang.String,
    format: utilityLib.utilityLibStrings.hex
  ): java.lang.String = js.native
  def hash(
    method: utilityLib.utilityLibStrings.sha1,
    s: nodeLib.Buffer,
    format: utilityLib.utilityLibStrings.base64
  ): java.lang.String = js.native
  def hash(
    method: utilityLib.utilityLibStrings.sha1,
    s: nodeLib.Buffer,
    format: utilityLib.utilityLibStrings.hex
  ): java.lang.String = js.native
  /**
    * --------------------0_0----------------
    * @description Defines For Crypto
    * @see https://github.com/node-modules/utility#md5
    * --------------0^0------------------
    */
  /**
    * hash
    *
    * @param {String} method hash method, e.g.: 'md5', 'sha1'
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} md5 hash string
    * @public
    */
  @JSName("hash")
  def hash_md5(method: utilityLib.utilityLibStrings.md5, s: java.lang.String): java.lang.String = js.native
  @JSName("hash")
  def hash_md5(method: utilityLib.utilityLibStrings.md5, s: nodeLib.Buffer): java.lang.String = js.native
  @JSName("hash")
  def hash_sha1(method: utilityLib.utilityLibStrings.sha1, s: java.lang.String): java.lang.String = js.native
  @JSName("hash")
  def hash_sha1(method: utilityLib.utilityLibStrings.sha1, s: nodeLib.Buffer): java.lang.String = js.native
  /**
    * HMAC algorithm.
    *
    * Equal bash:
    *
    * ```bash
    * $ echo -n "$data" | openssl dgst -binary -$algorithm -hmac "$key" | openssl $encoding
    * ```
    *
    * @param {String} algorithm, dependent on the available algorithms supported by the version of OpenSSL on the platform.
    *   Examples are 'sha1', 'md5', 'sha256', 'sha512', etc.
    *   On recent releases, `openssl list-message-digest-algorithms` will display the available digest algorithms.
    * @param {String} key, the hmac key to be used.
    * @param {String|Buffer} data, content string.
    * @param {String} [encoding='base64']
    * @return {String} digest string.
    */
  def hmac(algorithm: java.lang.String, key: java.lang.String, data: java.lang.String): java.lang.String = js.native
  def hmac(
    algorithm: java.lang.String,
    key: java.lang.String,
    data: java.lang.String,
    encoding: java.lang.String
  ): java.lang.String = js.native
  def hmac(algorithm: java.lang.String, key: java.lang.String, data: nodeLib.Buffer): java.lang.String = js.native
  def hmac(
    algorithm: java.lang.String,
    key: java.lang.String,
    data: nodeLib.Buffer,
    encoding: java.lang.String
  ): java.lang.String = js.native
  @JSName("hmac")
  def hmac_base64(
    algorithm: java.lang.String,
    key: java.lang.String,
    data: java.lang.String,
    encoding: utilityLib.utilityLibStrings.base64
  ): java.lang.String = js.native
  @JSName("hmac")
  def hmac_base64(
    algorithm: java.lang.String,
    key: java.lang.String,
    data: nodeLib.Buffer,
    encoding: utilityLib.utilityLibStrings.base64
  ): java.lang.String = js.native
  /**
    * Detect invalid http header characters in a string
    *
    * @param {String} val
    * @return {Boolean}
    */
  def includesInvalidHttpHeaderChar(`val`: java.lang.String): scala.Boolean = js.native
  /**
    * Detect a number string can safe convert to Javascript Number.
    *
    * @param {String} s number format string, like `"123"`, `"-1000123123123123123123"`
    * @return {Boolean}
    */
  def isSafeNumberString(s: java.lang.String): scala.Boolean = js.native
  /**
    * Normal log format date. format: `moment().format('YYYY-MM-DD HH:mm:ss.SSS')`
    *
    * @return {String}
    */
  def logDate(d: java.lang.String): java.lang.String = js.native
  def logDate(d: java.lang.String, msSep: java.lang.String): java.lang.String = js.native
  def logDate(d: stdLib.Date): java.lang.String = js.native
  def logDate(d: stdLib.Date, msSep: java.lang.String): java.lang.String = js.native
  /**
    * generate a real map object(clean object), no constructor, no __proto__
    * @param {Object} [obj] - init object, optional
    * @return {Object}
    */
  def map(): utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  def map(obj: utilityLib.utilityMod.utilityNs.ObjStatic): utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  /**
    * md5 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} md5 hash string
    * @public
    */
  def md5(s: java.lang.String): java.lang.String = js.native
  def md5(s: nodeLib.Buffer): java.lang.String = js.native
  @JSName("md5")
  def md5_base64(s: java.lang.String, format: utilityLib.utilityLibStrings.base64): java.lang.String = js.native
  @JSName("md5")
  def md5_base64(s: nodeLib.Buffer, format: utilityLib.utilityLibStrings.base64): java.lang.String = js.native
  @JSName("md5")
  def md5_hex(s: java.lang.String, format: utilityLib.utilityLibStrings.hex): java.lang.String = js.native
  @JSName("md5")
  def md5_hex(s: nodeLib.Buffer, format: utilityLib.utilityLibStrings.hex): java.lang.String = js.native
  def mkdir(dir: java.lang.String): js.Promise[_] = js.native
  /**
    * ---------------0_0-------------------
    * @description Defines For Function Method
    * @see https://github.com/node-modules/utility#others
    * ---------------0^0--------------------
    */
  /**
    * A empty function.
    *
    * @return {Function}
    * @public
    */
  def noop(): js.Function0[_] = js.native
  /**
    * Produces a random integer between the inclusive `lower` and `upper` bounds.
    *
    * @param {Number} lower The lower bound.
    * @param {Number} upper The upper bound.
    * @return {Number} Returns the random number.
    */
  def random(): scala.Double = js.native
  def random(lower: scala.Double): scala.Double = js.native
  def random(lower: scala.Double, upper: scala.Double): scala.Double = js.native
  /**
    * Array random slice with items count.
    * @param {Array} arr
    * @param {Number} num, number of sub items.
    * @return {Array}
    */
  def randomSlice(arr: js.Array[_]): js.Array[_] = js.native
  def randomSlice(arr: js.Array[_], num: scala.Double): js.Array[_] = js.native
  def randomString(): java.lang.String = js.native
  def randomString(length: scala.Double): java.lang.String = js.native
  def randomString(length: scala.Double, charSet: java.lang.String): java.lang.String = js.native
  def randomString(length: scala.Double, charSet: js.Array[java.lang.String]): java.lang.String = js.native
  def readJSON(filepath: java.lang.String): js.Promise[_] = js.native
  def readJSONSync(filepath: java.lang.String): utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  /**
    * Replace string
    *
    * @param  {String} str
    * @param  {String|RegExp} substr
    * @param  {String|Function} newSubstr
    * @return {String}
    */
  def replace(str: java.lang.String, substr: java.lang.String, newSubstr: java.lang.String): java.lang.String = js.native
  def replace(str: java.lang.String, substr: java.lang.String, newSubstr: js.Function1[/* repeated */ js.Any, _]): java.lang.String = js.native
  def replace(str: java.lang.String, substr: stdLib.RegExp, newSubstr: java.lang.String): java.lang.String = js.native
  def replace(str: java.lang.String, substr: stdLib.RegExp, newSubstr: js.Function1[/* repeated */ js.Any, _]): java.lang.String = js.native
  /**
    * Replace invalid http header characters with replacement
    *
    * @param  {String} val
    * @param  {String|Function} replacement - can be `function(char)`
    * @return {Object}
    */
  def replaceInvalidHttpHeaderChar(`val`: java.lang.String): utilityLib.utilityMod.utilityNs.IReplaceInvalidHttpHeaderCharReturns = js.native
  def replaceInvalidHttpHeaderChar(`val`: java.lang.String, replacement: java.lang.String): utilityLib.utilityMod.utilityNs.IReplaceInvalidHttpHeaderCharReturns = js.native
  def replaceInvalidHttpHeaderChar(`val`: java.lang.String, replacement: js.Function1[/* repeated */ js.Any, _]): utilityLib.utilityMod.utilityNs.IReplaceInvalidHttpHeaderCharReturns = js.native
  /**
    * -------------------0_0---------------------
    * @description Defines For Polyfill Methods
    * @see https://github.com/node-modules/utility#timers
    * -------------------0^0-------------------
    */
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): nodeLib.NodeJSNs.Immediate = js.native
  @JSName("setImmediate")
  def setImmediate_Unit(fn: js.Function1[/* repeated */ js.Any, _], args: js.Any*): scala.Unit = js.native
  /**
    * sha1 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha1 hash string
    * @public
    */
  def sha1(s: java.lang.String): java.lang.String = js.native
  def sha1(s: nodeLib.Buffer): java.lang.String = js.native
  @JSName("sha1")
  def sha1_base64(s: java.lang.String, format: utilityLib.utilityLibStrings.base64): java.lang.String = js.native
  @JSName("sha1")
  def sha1_base64(s: nodeLib.Buffer, format: utilityLib.utilityLibStrings.base64): java.lang.String = js.native
  @JSName("sha1")
  def sha1_hex(s: java.lang.String, format: utilityLib.utilityLibStrings.hex): java.lang.String = js.native
  @JSName("sha1")
  def sha1_hex(s: nodeLib.Buffer, format: utilityLib.utilityLibStrings.hex): java.lang.String = js.native
  /**
    * sha256 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha256 hash string
    * @public
    */
  def sha256(s: java.lang.String): java.lang.String = js.native
  def sha256(s: nodeLib.Buffer): java.lang.String = js.native
  @JSName("sha256")
  def sha256_base64(s: java.lang.String, format: utilityLib.utilityLibStrings.base64): java.lang.String = js.native
  @JSName("sha256")
  def sha256_base64(s: nodeLib.Buffer, format: utilityLib.utilityLibStrings.base64): java.lang.String = js.native
  @JSName("sha256")
  def sha256_hex(s: java.lang.String, format: utilityLib.utilityLibStrings.hex): java.lang.String = js.native
  @JSName("sha256")
  def sha256_hex(s: nodeLib.Buffer, format: utilityLib.utilityLibStrings.hex): java.lang.String = js.native
  /**
    * Remove one exists element from an array
    * @param {Array} arr
    * @param  {Number} index - remove element index
    * @return {Array} the array instance
    */
  def spliceOne(arr: js.Array[_], index: scala.Double): js.Array[_] = js.native
  /**
    * split string to array
    * @param  {String} str
    * @param  {String} [sep] default is ','
    * @return {Array}
    */
  def split(str: java.lang.String): js.Array[java.lang.String] = js.native
  def split(str: java.lang.String, sep: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * always optimized
    */
  def splitAlwaysOptimized(args: js.Any*): js.Array[java.lang.String] = js.native
  def strictJSONParse(str: java.lang.String): utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  /**
    * Get Unix's timestamp in seconds.
    * @return {Number}
    */
  def timestamp(): scala.Double | stdLib.Date = js.native
  def timestamp(t: java.lang.String): scala.Double | stdLib.Date = js.native
  def timestamp(t: scala.Double): scala.Double | stdLib.Date = js.native
  /**
    * Convert string to Number if string in safe Number scope.
    *
    * @param {String} s number format string.
    * @return {Number|String} success will return Number, otherise return the original string.
    */
  def toSafeNumber(s: java.lang.String): scala.Double | java.lang.String = js.native
  def toSafeNumber(s: scala.Double): scala.Double | java.lang.String = js.native
  /**
    * Unescape the given string from html
    * @param {String} html
    * @param {String} type
    * @return {String}
    * @public
    */
  def unescape(html: java.lang.String): java.lang.String | utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  def unescape(html: java.lang.String, `type`: java.lang.String): java.lang.String | utilityLib.utilityMod.utilityNs.ObjStatic = js.native
  def writeJSON(filepath: java.lang.String, str: java.lang.String): js.Promise[_] = js.native
  def writeJSON(
    filepath: java.lang.String,
    str: java.lang.String,
    options: utilityLib.utilityMod.utilityNs.IJSONStaticOptions
  ): js.Promise[_] = js.native
  def writeJSON(filepath: java.lang.String, str: utilityLib.utilityMod.utilityNs.ObjStatic): js.Promise[_] = js.native
  def writeJSON(
    filepath: java.lang.String,
    str: utilityLib.utilityMod.utilityNs.ObjStatic,
    options: utilityLib.utilityMod.utilityNs.IJSONStaticOptions
  ): js.Promise[_] = js.native
  def writeJSONSync(filepath: java.lang.String, str: java.lang.String): scala.Unit = js.native
  def writeJSONSync(
    filepath: java.lang.String,
    str: java.lang.String,
    options: utilityLib.utilityMod.utilityNs.IJSONStaticOptions
  ): scala.Unit = js.native
  def writeJSONSync(filepath: java.lang.String, str: utilityLib.utilityMod.utilityNs.ObjStatic): scala.Unit = js.native
  def writeJSONSync(
    filepath: java.lang.String,
    str: utilityLib.utilityMod.utilityNs.ObjStatic,
    options: utilityLib.utilityMod.utilityNs.IJSONStaticOptions
  ): scala.Unit = js.native
}

