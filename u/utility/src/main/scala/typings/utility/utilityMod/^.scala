package typings.utility.utilityMod

import typings.node.Buffer
import typings.node.NodeJSNs.Immediate
import typings.std.Date
import typings.std.RegExp
import typings.utility.utilityStrings.base64
import typings.utility.utilityStrings.buffer
import typings.utility.utilityStrings.hex
import typings.utility.utilityStrings.md5
import typings.utility.utilityStrings.sha1
import typings.utility.utilityStrings.utf8
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
  val MAX_SAFE_INTEGER: Double = js.native
  val MAX_SAFE_INTEGER_STR: String = js.native
  val MAX_SAFE_INTEGER_STR_LENGTH: Double = js.native
  val MIN_SAFE_INTEGER: Double = js.native
  /**
    * `moment().format('YYYY-MM-DD')` format date string.
    *
    * @return {String}
    */
  def YYYYMMDD(d: String): String = js.native
  def YYYYMMDD(d: String, sep: String): String = js.native
  def YYYYMMDD(d: Date): String = js.native
  def YYYYMMDD(d: Date, sep: String): String = js.native
  def YYYYMMDDHHmmss(d: String): String = js.native
  def YYYYMMDDHHmmss(d: String, options: IYYYYMMDDHHmmssStaticOptions): String = js.native
  /**
    * `moment().format('YYYY-MM-DD HH:mm:ss')` format date string.
    *
    * @return {String}
    */
  def YYYYMMDDHHmmss(d: Date): String = js.native
  def YYYYMMDDHHmmss(d: Date, options: IYYYYMMDDHHmmssStaticOptions): String = js.native
  /**
    * Access log format date. format: `moment().format('DD/MMM/YYYY:HH:mm:ss ZZ')`
    *
    * @return {String}
    */
  def accessLogDate(d: Date): String = js.native
  /**
    * optimize arguments to array
    * @param {Arguments} args
    * @return {Array}
    */
  def argumentsToArray(args: js.Any*): js.Array[_] = js.native
  def assign(target: ObjStatic, objects: js.Array[_]): ObjStatic = js.native
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
  def assign(target: ObjStatic, objects: ObjStatic): ObjStatic = js.native
  /**
    * Base64 string decode.
    *
    * @param {String} encode, base64 encoding string.
    * @param {Boolean} [urlsafe=false] Decode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @param {encoding} [encoding=utf8] if encoding = buffer, will return Buffer instance
    * @return {String|Buffer} plain text.
    */
  def base64decode(encode: String): String | Buffer = js.native
  def base64decode(encode: String, urlsafe: Boolean): String | Buffer = js.native
  @JSName("base64decode")
  def base64decode_buffer(encode: String, urlsafe: Boolean, encoding: buffer): String | Buffer = js.native
  @JSName("base64decode")
  def base64decode_utf8(encode: String, urlsafe: Boolean, encoding: utf8): String | Buffer = js.native
  /**
    * Base64 encode string.
    *
    * @param {String|Buffer} s
    * @param {Boolean} [urlsafe=false] Encode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @return {String} base64 encode format string.
    */
  def base64encode(s: String): String = js.native
  def base64encode(s: String, urlsafe: Boolean): String = js.native
  def base64encode(s: Buffer): String = js.native
  def base64encode(s: Buffer, urlsafe: Boolean): String = js.native
  /**
    * return datetime struct.
    *
    * @return {Object} date
    *  - {Number} YYYYMMDD, 20130401
    *  - {Number} H, 0, 1, 9, 12, 23
    */
  def datestruct(): IDateStructStaticReturns = js.native
  def datestruct(now: Date): IDateStructStaticReturns = js.native
  /**
    * Safe decodeURIComponent, won't throw any error.
    * If `decodeURIComponent` error happen, just return the original value.
    *
    * @param {String} encodeText
    * @return {String} URL decode original string.
    */
  def decodeURIComponent(encodeText: String): String = js.native
  /**
    * avoid if (a && a.b && a.b.c)
    * @param {Object} obj
    * @param {...String} keys
    * @return {Object}
    */
  def dig(obj: ObjStatic, args: js.Any*): js.Any = js.native
  /**
    * Safe encodeURIComponent, won't throw any error.
    * If `encodeURIComponent` error happen, just return the original value.
    *
    * @param {String} text
    * @return {String} URL encode string.
    */
  def encodeURIComponent(text: String): String = js.native
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
  def escape(test: String): String = js.native
  def getOwnEnumerables(obj: ObjStatic): js.Array[String] = js.native
  def getOwnEnumerables(obj: ObjStatic, ignoreNull: Boolean): js.Array[String] = js.native
  /**
    * Get a function parameter's names.
    *
    * @param {Function} func
    * @param {Boolean} [useCache], default is true
    * @return {Array} names
    */
  def getParamNames(func: js.Function1[/* repeated */ js.Any, _]): js.Array[String] = js.native
  def getParamNames(func: js.Function1[/* repeated */ js.Any, _], cache: Boolean): js.Array[String] = js.native
  def has(obj: ObjStatic, prop: String): Boolean = js.native
  def hash(method: md5, s: String, format: base64): String = js.native
  def hash(method: md5, s: String, format: hex): String = js.native
  def hash(method: md5, s: Buffer, format: base64): String = js.native
  def hash(method: md5, s: Buffer, format: hex): String = js.native
  def hash(method: sha1, s: String, format: base64): String = js.native
  def hash(method: sha1, s: String, format: hex): String = js.native
  def hash(method: sha1, s: Buffer, format: base64): String = js.native
  def hash(method: sha1, s: Buffer, format: hex): String = js.native
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
  def hash_md5(method: md5, s: String): String = js.native
  @JSName("hash")
  def hash_md5(method: md5, s: Buffer): String = js.native
  @JSName("hash")
  def hash_sha1(method: sha1, s: String): String = js.native
  @JSName("hash")
  def hash_sha1(method: sha1, s: Buffer): String = js.native
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
  def hmac(algorithm: String, key: String, data: String): String = js.native
  def hmac(algorithm: String, key: String, data: String, encoding: String): String = js.native
  def hmac(algorithm: String, key: String, data: Buffer): String = js.native
  def hmac(algorithm: String, key: String, data: Buffer, encoding: String): String = js.native
  @JSName("hmac")
  def hmac_base64(algorithm: String, key: String, data: String, encoding: base64): String = js.native
  @JSName("hmac")
  def hmac_base64(algorithm: String, key: String, data: Buffer, encoding: base64): String = js.native
  /**
    * Detect invalid http header characters in a string
    *
    * @param {String} val
    * @return {Boolean}
    */
  def includesInvalidHttpHeaderChar(`val`: String): Boolean = js.native
  /**
    * Detect a number string can safe convert to Javascript Number.
    *
    * @param {String} s number format string, like `"123"`, `"-1000123123123123123123"`
    * @return {Boolean}
    */
  def isSafeNumberString(s: String): Boolean = js.native
  /**
    * Normal log format date. format: `moment().format('YYYY-MM-DD HH:mm:ss.SSS')`
    *
    * @return {String}
    */
  def logDate(d: String): String = js.native
  def logDate(d: String, msSep: String): String = js.native
  def logDate(d: Date): String = js.native
  def logDate(d: Date, msSep: String): String = js.native
  /**
    * generate a real map object(clean object), no constructor, no __proto__
    * @param {Object} [obj] - init object, optional
    * @return {Object}
    */
  def map(): ObjStatic = js.native
  def map(obj: ObjStatic): ObjStatic = js.native
  /**
    * md5 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} md5 hash string
    * @public
    */
  def md5(s: String): String = js.native
  def md5(s: Buffer): String = js.native
  @JSName("md5")
  def md5_base64(s: String, format: base64): String = js.native
  @JSName("md5")
  def md5_base64(s: Buffer, format: base64): String = js.native
  @JSName("md5")
  def md5_hex(s: String, format: hex): String = js.native
  @JSName("md5")
  def md5_hex(s: Buffer, format: hex): String = js.native
  def mkdir(dir: String): js.Promise[_] = js.native
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
  def random(): Double = js.native
  def random(lower: Double): Double = js.native
  def random(lower: Double, upper: Double): Double = js.native
  /**
    * Array random slice with items count.
    * @param {Array} arr
    * @param {Number} num, number of sub items.
    * @return {Array}
    */
  def randomSlice(arr: js.Array[_]): js.Array[_] = js.native
  def randomSlice(arr: js.Array[_], num: Double): js.Array[_] = js.native
  def randomString(): String = js.native
  def randomString(length: Double): String = js.native
  def randomString(length: Double, charSet: String): String = js.native
  def randomString(length: Double, charSet: js.Array[String]): String = js.native
  def readJSON(filepath: String): js.Promise[_] = js.native
  def readJSONSync(filepath: String): ObjStatic = js.native
  /**
    * Replace string
    *
    * @param  {String} str
    * @param  {String|RegExp} substr
    * @param  {String|Function} newSubstr
    * @return {String}
    */
  def replace(str: String, substr: String, newSubstr: String): String = js.native
  def replace(str: String, substr: String, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
  def replace(str: String, substr: RegExp, newSubstr: String): String = js.native
  def replace(str: String, substr: RegExp, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
  /**
    * Replace invalid http header characters with replacement
    *
    * @param  {String} val
    * @param  {String|Function} replacement - can be `function(char)`
    * @return {Object}
    */
  def replaceInvalidHttpHeaderChar(`val`: String): IReplaceInvalidHttpHeaderCharReturns = js.native
  def replaceInvalidHttpHeaderChar(`val`: String, replacement: String): IReplaceInvalidHttpHeaderCharReturns = js.native
  def replaceInvalidHttpHeaderChar(`val`: String, replacement: js.Function1[/* repeated */ js.Any, _]): IReplaceInvalidHttpHeaderCharReturns = js.native
  /**
    * -------------------0_0---------------------
    * @description Defines For Polyfill Methods
    * @see https://github.com/node-modules/utility#timers
    * -------------------0^0-------------------
    */
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  @JSName("setImmediate")
  def setImmediate_Unit(fn: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Unit = js.native
  /**
    * sha1 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha1 hash string
    * @public
    */
  def sha1(s: String): String = js.native
  def sha1(s: Buffer): String = js.native
  @JSName("sha1")
  def sha1_base64(s: String, format: base64): String = js.native
  @JSName("sha1")
  def sha1_base64(s: Buffer, format: base64): String = js.native
  @JSName("sha1")
  def sha1_hex(s: String, format: hex): String = js.native
  @JSName("sha1")
  def sha1_hex(s: Buffer, format: hex): String = js.native
  /**
    * sha256 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha256 hash string
    * @public
    */
  def sha256(s: String): String = js.native
  def sha256(s: Buffer): String = js.native
  @JSName("sha256")
  def sha256_base64(s: String, format: base64): String = js.native
  @JSName("sha256")
  def sha256_base64(s: Buffer, format: base64): String = js.native
  @JSName("sha256")
  def sha256_hex(s: String, format: hex): String = js.native
  @JSName("sha256")
  def sha256_hex(s: Buffer, format: hex): String = js.native
  /**
    * Remove one exists element from an array
    * @param {Array} arr
    * @param  {Number} index - remove element index
    * @return {Array} the array instance
    */
  def spliceOne(arr: js.Array[_], index: Double): js.Array[_] = js.native
  /**
    * split string to array
    * @param  {String} str
    * @param  {String} [sep] default is ','
    * @return {Array}
    */
  def split(str: String): js.Array[String] = js.native
  def split(str: String, sep: String): js.Array[String] = js.native
  /**
    * always optimized
    */
  def splitAlwaysOptimized(args: js.Any*): js.Array[String] = js.native
  def strictJSONParse(str: String): ObjStatic = js.native
  /**
    * Get Unix's timestamp in seconds.
    * @return {Number}
    */
  def timestamp(): Double | Date = js.native
  def timestamp(t: String): Double | Date = js.native
  def timestamp(t: Double): Double | Date = js.native
  /**
    * Convert string to Number if string in safe Number scope.
    *
    * @param {String} s number format string.
    * @return {Number|String} success will return Number, otherise return the original string.
    */
  def toSafeNumber(s: String): Double | String = js.native
  def toSafeNumber(s: Double): Double | String = js.native
  /**
    * Unescape the given string from html
    * @param {String} html
    * @param {String} type
    * @return {String}
    * @public
    */
  def unescape(html: String): String | ObjStatic = js.native
  def unescape(html: String, `type`: String): String | ObjStatic = js.native
  def writeJSON(filepath: String, str: String): js.Promise[_] = js.native
  def writeJSON(filepath: String, str: String, options: IJSONStaticOptions): js.Promise[_] = js.native
  def writeJSON(filepath: String, str: ObjStatic): js.Promise[_] = js.native
  def writeJSON(filepath: String, str: ObjStatic, options: IJSONStaticOptions): js.Promise[_] = js.native
  def writeJSONSync(filepath: String, str: String): Unit = js.native
  def writeJSONSync(filepath: String, str: String, options: IJSONStaticOptions): Unit = js.native
  def writeJSONSync(filepath: String, str: ObjStatic): Unit = js.native
  def writeJSONSync(filepath: String, str: ObjStatic, options: IJSONStaticOptions): Unit = js.native
}

