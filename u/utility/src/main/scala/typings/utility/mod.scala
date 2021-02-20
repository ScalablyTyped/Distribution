package typings.utility

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.Immediate
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import typings.utility.utilityStrings.base64
import typings.utility.utilityStrings.buffer
import typings.utility.utilityStrings.hex
import typings.utility.utilityStrings.md5
import typings.utility.utilityStrings.sha1
import typings.utility.utilityStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * ------------------0_0------------------------
    * @description Defines For Number Methods
    * @see https://github.com/node-modules/utility#number-utils
    * --------------------0^0----------------------
    */
  /**
    * CONSTANTS STATIC
    */
  @JSImport("utility", "MAX_SAFE_INTEGER")
  @js.native
  val MAX_SAFE_INTEGER: Double = js.native
  
  @JSImport("utility", "MAX_SAFE_INTEGER_STR")
  @js.native
  val MAX_SAFE_INTEGER_STR: String = js.native
  
  @JSImport("utility", "MAX_SAFE_INTEGER_STR_LENGTH")
  @js.native
  val MAX_SAFE_INTEGER_STR_LENGTH: Double = js.native
  
  @JSImport("utility", "MIN_SAFE_INTEGER")
  @js.native
  val MIN_SAFE_INTEGER: Double = js.native
  
  object UNSTABLE_METHOD {
    
    /**
      * optimize try catch
      * @param {Function} fn
      * @return {Object}
      *   - {Error} error
      *   - {Mix} value
      */
    @JSImport("utility", "UNSTABLE_METHOD.try")
    @js.native
    def `try`(fn: js.Function1[/* repeated */ js.Any, _]): ITryStaticReturns = js.native
  }
  
  /**
    * `moment().format('YYYY-MM-DD')` format date string.
    *
    * @return {String}
    */
  @JSImport("utility", "YYYYMMDD")
  @js.native
  def YYYYMMDD(d: String): String = js.native
  @JSImport("utility", "YYYYMMDD")
  @js.native
  def YYYYMMDD(d: String, sep: String): String = js.native
  @JSImport("utility", "YYYYMMDD")
  @js.native
  def YYYYMMDD(d: Date): String = js.native
  @JSImport("utility", "YYYYMMDD")
  @js.native
  def YYYYMMDD(d: Date, sep: String): String = js.native
  
  @JSImport("utility", "YYYYMMDDHHmmss")
  @js.native
  def YYYYMMDDHHmmss(d: String): String = js.native
  @JSImport("utility", "YYYYMMDDHHmmss")
  @js.native
  def YYYYMMDDHHmmss(d: String, options: IYYYYMMDDHHmmssStaticOptions): String = js.native
  /**
    * `moment().format('YYYY-MM-DD HH:mm:ss')` format date string.
    *
    * @return {String}
    */
  @JSImport("utility", "YYYYMMDDHHmmss")
  @js.native
  def YYYYMMDDHHmmss(d: Date): String = js.native
  @JSImport("utility", "YYYYMMDDHHmmss")
  @js.native
  def YYYYMMDDHHmmss(d: Date, options: IYYYYMMDDHHmmssStaticOptions): String = js.native
  
  /**
    * Access log format date. format: `moment().format('DD/MMM/YYYY:HH:mm:ss ZZ')`
    *
    * @return {String}
    */
  @JSImport("utility", "accessLogDate")
  @js.native
  def accessLogDate(d: Date): String = js.native
  
  /**
    * optimize arguments to array
    * @param {Arguments} args
    * @return {Array}
    */
  @JSImport("utility", "argumentsToArray")
  @js.native
  def argumentsToArray(args: js.Any*): js.Array[_] = js.native
  
  @JSImport("utility", "assign")
  @js.native
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
  @JSImport("utility", "assign")
  @js.native
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
  @JSImport("utility", "base64decode")
  @js.native
  def base64decode(encode: String): String | Buffer = js.native
  @JSImport("utility", "base64decode")
  @js.native
  def base64decode(encode: String, urlsafe: Boolean): String | Buffer = js.native
  @JSImport("utility", "base64decode")
  @js.native
  def base64decode_buffer(encode: String, urlsafe: js.UndefOr[scala.Nothing], encoding: buffer): String | Buffer = js.native
  @JSImport("utility", "base64decode")
  @js.native
  def base64decode_buffer(encode: String, urlsafe: Boolean, encoding: buffer): String | Buffer = js.native
  @JSImport("utility", "base64decode")
  @js.native
  def base64decode_utf8(encode: String, urlsafe: js.UndefOr[scala.Nothing], encoding: utf8): String | Buffer = js.native
  @JSImport("utility", "base64decode")
  @js.native
  def base64decode_utf8(encode: String, urlsafe: Boolean, encoding: utf8): String | Buffer = js.native
  
  /**
    * Base64 encode string.
    *
    * @param {String|Buffer} s
    * @param {Boolean} [urlsafe=false] Encode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @return {String} base64 encode format string.
    */
  @JSImport("utility", "base64encode")
  @js.native
  def base64encode(s: String): String = js.native
  @JSImport("utility", "base64encode")
  @js.native
  def base64encode(s: String, urlsafe: Boolean): String = js.native
  @JSImport("utility", "base64encode")
  @js.native
  def base64encode(s: Buffer): String = js.native
  @JSImport("utility", "base64encode")
  @js.native
  def base64encode(s: Buffer, urlsafe: Boolean): String = js.native
  
  /**
    * return datetime struct.
    *
    * @return {Object} date
    *  - {Number} YYYYMMDD, 20130401
    *  - {Number} H, 0, 1, 9, 12, 23
    */
  @JSImport("utility", "datestruct")
  @js.native
  def datestruct(): IDateStructStaticReturns = js.native
  @JSImport("utility", "datestruct")
  @js.native
  def datestruct(now: Date): IDateStructStaticReturns = js.native
  
  /**
    * Safe decodeURIComponent, won't throw any error.
    * If `decodeURIComponent` error happen, just return the original value.
    *
    * @param {String} encodeText
    * @return {String} URL decode original string.
    */
  @JSImport("utility", "decodeURIComponent")
  @js.native
  def decodeURIComponent(encodeText: String): String = js.native
  
  /**
    * avoid if (a && a.b && a.b.c)
    * @param {Object} obj
    * @param {...String} keys
    * @return {Object}
    */
  @JSImport("utility", "dig")
  @js.native
  def dig(obj: ObjStatic, args: js.Any*): js.Any = js.native
  
  /**
    * Safe encodeURIComponent, won't throw any error.
    * If `encodeURIComponent` error happen, just return the original value.
    *
    * @param {String} text
    * @return {String} URL encode string.
    */
  @JSImport("utility", "encodeURIComponent")
  @js.native
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
  @JSImport("utility", "escape")
  @js.native
  def escape(test: String): String = js.native
  
  @JSImport("utility", "getOwnEnumerables")
  @js.native
  def getOwnEnumerables(obj: ObjStatic): js.Array[String] = js.native
  @JSImport("utility", "getOwnEnumerables")
  @js.native
  def getOwnEnumerables(obj: ObjStatic, ignoreNull: Boolean): js.Array[String] = js.native
  
  /**
    * Get a function parameter's names.
    *
    * @param {Function} func
    * @param {Boolean} [useCache], default is true
    * @return {Array} names
    */
  @JSImport("utility", "getParamNames")
  @js.native
  def getParamNames(func: js.Function1[/* repeated */ js.Any, _]): js.Array[String] = js.native
  @JSImport("utility", "getParamNames")
  @js.native
  def getParamNames(func: js.Function1[/* repeated */ js.Any, _], cache: Boolean): js.Array[String] = js.native
  
  @JSImport("utility", "has")
  @js.native
  def has(obj: ObjStatic, prop: String): Boolean = js.native
  
  @JSImport("utility", "hash")
  @js.native
  def hash(method: md5, s: String, format: base64): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash(method: md5, s: String, format: hex): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash(method: md5, s: Buffer, format: base64): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash(method: md5, s: Buffer, format: hex): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash(method: sha1, s: String, format: base64): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash(method: sha1, s: String, format: hex): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash(method: sha1, s: Buffer, format: base64): String = js.native
  @JSImport("utility", "hash")
  @js.native
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
  @JSImport("utility", "hash")
  @js.native
  def hash_md5(method: md5, s: String): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash_md5(method: md5, s: Buffer): String = js.native
  @JSImport("utility", "hash")
  @js.native
  def hash_sha1(method: sha1, s: String): String = js.native
  @JSImport("utility", "hash")
  @js.native
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
  @JSImport("utility", "hmac")
  @js.native
  def hmac(algorithm: String, key: String, data: String): String = js.native
  @JSImport("utility", "hmac")
  @js.native
  def hmac(algorithm: String, key: String, data: String, encoding: String): String = js.native
  @JSImport("utility", "hmac")
  @js.native
  def hmac(algorithm: String, key: String, data: Buffer): String = js.native
  @JSImport("utility", "hmac")
  @js.native
  def hmac(algorithm: String, key: String, data: Buffer, encoding: String): String = js.native
  @JSImport("utility", "hmac")
  @js.native
  def hmac_base64(algorithm: String, key: String, data: String, encoding: base64): String = js.native
  @JSImport("utility", "hmac")
  @js.native
  def hmac_base64(algorithm: String, key: String, data: Buffer, encoding: base64): String = js.native
  
  /**
    * Detect invalid http header characters in a string
    *
    * @param {String} val
    * @return {Boolean}
    */
  @JSImport("utility", "includesInvalidHttpHeaderChar")
  @js.native
  def includesInvalidHttpHeaderChar(`val`: String): Boolean = js.native
  
  /**
    * Detect a number string can safe convert to Javascript Number.
    *
    * @param {String} s number format string, like `"123"`, `"-1000123123123123123123"`
    * @return {Boolean}
    */
  @JSImport("utility", "isSafeNumberString")
  @js.native
  def isSafeNumberString(s: String): Boolean = js.native
  
  /**
    * Normal log format date. format: `moment().format('YYYY-MM-DD HH:mm:ss.SSS')`
    *
    * @return {String}
    */
  @JSImport("utility", "logDate")
  @js.native
  def logDate(d: String): String = js.native
  @JSImport("utility", "logDate")
  @js.native
  def logDate(d: String, msSep: String): String = js.native
  @JSImport("utility", "logDate")
  @js.native
  def logDate(d: Date): String = js.native
  @JSImport("utility", "logDate")
  @js.native
  def logDate(d: Date, msSep: String): String = js.native
  
  /**
    * generate a real map object(clean object), no constructor, no __proto__
    * @param {Object} [obj] - init object, optional
    * @return {Object}
    */
  @JSImport("utility", "map")
  @js.native
  def map(): ObjStatic = js.native
  @JSImport("utility", "map")
  @js.native
  def map(obj: ObjStatic): ObjStatic = js.native
  
  /**
    * md5 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} md5 hash string
    * @public
    */
  @JSImport("utility", "md5")
  @js.native
  def md5(s: String): String = js.native
  @JSImport("utility", "md5")
  @js.native
  def md5(s: Buffer): String = js.native
  @JSImport("utility", "md5")
  @js.native
  def md5_base64(s: String, format: base64): String = js.native
  @JSImport("utility", "md5")
  @js.native
  def md5_base64(s: Buffer, format: base64): String = js.native
  @JSImport("utility", "md5")
  @js.native
  def md5_hex(s: String, format: hex): String = js.native
  @JSImport("utility", "md5")
  @js.native
  def md5_hex(s: Buffer, format: hex): String = js.native
  
  @JSImport("utility", "mkdir")
  @js.native
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
  @JSImport("utility", "noop")
  @js.native
  def noop(): js.Function0[_] = js.native
  
  /**
    * Produces a random integer between the inclusive `lower` and `upper` bounds.
    *
    * @param {Number} lower The lower bound.
    * @param {Number} upper The upper bound.
    * @return {Number} Returns the random number.
    */
  @JSImport("utility", "random")
  @js.native
  def random(): Double = js.native
  @JSImport("utility", "random")
  @js.native
  def random(lower: js.UndefOr[scala.Nothing], upper: Double): Double = js.native
  @JSImport("utility", "random")
  @js.native
  def random(lower: Double): Double = js.native
  @JSImport("utility", "random")
  @js.native
  def random(lower: Double, upper: Double): Double = js.native
  
  /**
    * Array random slice with items count.
    * @param {Array} arr
    * @param {Number} num, number of sub items.
    * @return {Array}
    */
  @JSImport("utility", "randomSlice")
  @js.native
  def randomSlice(arr: js.Array[_]): js.Array[_] = js.native
  @JSImport("utility", "randomSlice")
  @js.native
  def randomSlice(arr: js.Array[_], num: Double): js.Array[_] = js.native
  
  @JSImport("utility", "randomString")
  @js.native
  def randomString(): String = js.native
  @JSImport("utility", "randomString")
  @js.native
  def randomString(length: js.UndefOr[scala.Nothing], charSet: String): String = js.native
  @JSImport("utility", "randomString")
  @js.native
  def randomString(length: js.UndefOr[scala.Nothing], charSet: js.Array[String]): String = js.native
  @JSImport("utility", "randomString")
  @js.native
  def randomString(length: Double): String = js.native
  @JSImport("utility", "randomString")
  @js.native
  def randomString(length: Double, charSet: String): String = js.native
  @JSImport("utility", "randomString")
  @js.native
  def randomString(length: Double, charSet: js.Array[String]): String = js.native
  
  @JSImport("utility", "readJSON")
  @js.native
  def readJSON(filepath: String): js.Promise[_] = js.native
  
  @JSImport("utility", "readJSONSync")
  @js.native
  def readJSONSync(filepath: String): ObjStatic = js.native
  
  /**
    * Replace string
    *
    * @param  {String} str
    * @param  {String|RegExp} substr
    * @param  {String|Function} newSubstr
    * @return {String}
    */
  @JSImport("utility", "replace")
  @js.native
  def replace(str: String, substr: String, newSubstr: String): String = js.native
  @JSImport("utility", "replace")
  @js.native
  def replace(str: String, substr: String, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
  @JSImport("utility", "replace")
  @js.native
  def replace(str: String, substr: RegExp, newSubstr: String): String = js.native
  @JSImport("utility", "replace")
  @js.native
  def replace(str: String, substr: RegExp, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
  
  /**
    * Replace invalid http header characters with replacement
    *
    * @param  {String} val
    * @param  {String|Function} replacement - can be `function(char)`
    * @return {Object}
    */
  @JSImport("utility", "replaceInvalidHttpHeaderChar")
  @js.native
  def replaceInvalidHttpHeaderChar(`val`: String): IReplaceInvalidHttpHeaderCharReturns = js.native
  @JSImport("utility", "replaceInvalidHttpHeaderChar")
  @js.native
  def replaceInvalidHttpHeaderChar(`val`: String, replacement: String): IReplaceInvalidHttpHeaderCharReturns = js.native
  @JSImport("utility", "replaceInvalidHttpHeaderChar")
  @js.native
  def replaceInvalidHttpHeaderChar(`val`: String, replacement: js.Function1[/* repeated */ js.Any, _]): IReplaceInvalidHttpHeaderCharReturns = js.native
  
  /**
    * -------------------0_0---------------------
    * @description Defines For Polyfill Methods
    * @see https://github.com/node-modules/utility#timers
    * -------------------0^0-------------------
    */
  @JSImport("utility", "setImmediate")
  @js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  @JSImport("utility", "setImmediate")
  @js.native
  def setImmediate_Unit(fn: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Unit = js.native
  
  /**
    * sha1 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha1 hash string
    * @public
    */
  @JSImport("utility", "sha1")
  @js.native
  def sha1(s: String): String = js.native
  @JSImport("utility", "sha1")
  @js.native
  def sha1(s: Buffer): String = js.native
  @JSImport("utility", "sha1")
  @js.native
  def sha1_base64(s: String, format: base64): String = js.native
  @JSImport("utility", "sha1")
  @js.native
  def sha1_base64(s: Buffer, format: base64): String = js.native
  @JSImport("utility", "sha1")
  @js.native
  def sha1_hex(s: String, format: hex): String = js.native
  @JSImport("utility", "sha1")
  @js.native
  def sha1_hex(s: Buffer, format: hex): String = js.native
  
  /**
    * sha256 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha256 hash string
    * @public
    */
  @JSImport("utility", "sha256")
  @js.native
  def sha256(s: String): String = js.native
  @JSImport("utility", "sha256")
  @js.native
  def sha256(s: Buffer): String = js.native
  @JSImport("utility", "sha256")
  @js.native
  def sha256_base64(s: String, format: base64): String = js.native
  @JSImport("utility", "sha256")
  @js.native
  def sha256_base64(s: Buffer, format: base64): String = js.native
  @JSImport("utility", "sha256")
  @js.native
  def sha256_hex(s: String, format: hex): String = js.native
  @JSImport("utility", "sha256")
  @js.native
  def sha256_hex(s: Buffer, format: hex): String = js.native
  
  /**
    * Remove one exists element from an array
    * @param {Array} arr
    * @param  {Number} index - remove element index
    * @return {Array} the array instance
    */
  @JSImport("utility", "spliceOne")
  @js.native
  def spliceOne(arr: js.Array[_], index: Double): js.Array[_] = js.native
  
  /**
    * split string to array
    * @param  {String} str
    * @param  {String} [sep] default is ','
    * @return {Array}
    */
  @JSImport("utility", "split")
  @js.native
  def split(str: String): js.Array[String] = js.native
  @JSImport("utility", "split")
  @js.native
  def split(str: String, sep: String): js.Array[String] = js.native
  
  /**
    * always optimized
    */
  @JSImport("utility", "splitAlwaysOptimized")
  @js.native
  def splitAlwaysOptimized(args: js.Any*): js.Array[String] = js.native
  
  @JSImport("utility", "strictJSONParse")
  @js.native
  def strictJSONParse(str: String): ObjStatic = js.native
  
  /**
    * Get Unix's timestamp in seconds.
    * @return {Number}
    */
  @JSImport("utility", "timestamp")
  @js.native
  def timestamp(): Double | Date = js.native
  @JSImport("utility", "timestamp")
  @js.native
  def timestamp(t: String): Double | Date = js.native
  @JSImport("utility", "timestamp")
  @js.native
  def timestamp(t: Double): Double | Date = js.native
  
  /**
    * Convert string to Number if string in safe Number scope.
    *
    * @param {String} s number format string.
    * @return {Number|String} success will return Number, otherise return the original string.
    */
  @JSImport("utility", "toSafeNumber")
  @js.native
  def toSafeNumber(s: String): Double | String = js.native
  @JSImport("utility", "toSafeNumber")
  @js.native
  def toSafeNumber(s: Double): Double | String = js.native
  
  /**
    * Unescape the given string from html
    * @param {String} html
    * @param {String} type
    * @return {String}
    * @public
    */
  @JSImport("utility", "unescape")
  @js.native
  def unescape(html: String): String | ObjStatic = js.native
  @JSImport("utility", "unescape")
  @js.native
  def unescape(html: String, `type`: String): String | ObjStatic = js.native
  
  @JSImport("utility", "writeJSON")
  @js.native
  def writeJSON(filepath: String, str: String): js.Promise[_] = js.native
  @JSImport("utility", "writeJSON")
  @js.native
  def writeJSON(filepath: String, str: String, options: IJSONStaticOptions): js.Promise[_] = js.native
  @JSImport("utility", "writeJSON")
  @js.native
  def writeJSON(filepath: String, str: ObjStatic): js.Promise[_] = js.native
  @JSImport("utility", "writeJSON")
  @js.native
  def writeJSON(filepath: String, str: ObjStatic, options: IJSONStaticOptions): js.Promise[_] = js.native
  
  @JSImport("utility", "writeJSONSync")
  @js.native
  def writeJSONSync(filepath: String, str: String): Unit = js.native
  @JSImport("utility", "writeJSONSync")
  @js.native
  def writeJSONSync(filepath: String, str: String, options: IJSONStaticOptions): Unit = js.native
  @JSImport("utility", "writeJSONSync")
  @js.native
  def writeJSONSync(filepath: String, str: ObjStatic): Unit = js.native
  @JSImport("utility", "writeJSONSync")
  @js.native
  def writeJSONSync(filepath: String, str: ObjStatic, options: IJSONStaticOptions): Unit = js.native
  
  @js.native
  trait IDateStructStaticReturns extends StObject {
    
    var H: Double = js.native
    
    var YYYYMMDD: Double = js.native
  }
  object IDateStructStaticReturns {
    
    @scala.inline
    def apply(H: Double, YYYYMMDD: Double): IDateStructStaticReturns = {
      val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], YYYYMMDD = YYYYMMDD.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateStructStaticReturns]
    }
    
    @scala.inline
    implicit class IDateStructStaticReturnsMutableBuilder[Self <: IDateStructStaticReturns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYYYYMMDD(value: Double): Self = StObject.set(x, "YYYYMMDD", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ----------------0_0-----------------------
    * @description Defines For JSON methods
    * @see https://github.com/node-modules/utility#json
    * -----------------0^0-----------------------
    */
  @js.native
  trait IJSONStaticOptions extends StObject {
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
    
    var space: js.UndefOr[Double | String] = js.native
  }
  object IJSONStaticOptions {
    
    @scala.inline
    def apply(): IJSONStaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJSONStaticOptions]
    }
    
    @scala.inline
    implicit class IJSONStaticOptionsMutableBuilder[Self <: IJSONStaticOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  /**
    * ------------------0_0--------------------
    * @description Defines For String Methods
    * @see https://github.com/node-modules/utility#others
    * -------------------0^0---------------------
    */
  @js.native
  trait IReplaceInvalidHttpHeaderCharReturns extends StObject {
    
    var invalid: Boolean = js.native
    
    var `val`: String = js.native
  }
  object IReplaceInvalidHttpHeaderCharReturns {
    
    @scala.inline
    def apply(invalid: Boolean, `val`: String): IReplaceInvalidHttpHeaderCharReturns = {
      val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
    }
    
    @scala.inline
    implicit class IReplaceInvalidHttpHeaderCharReturnsMutableBuilder[Self <: IReplaceInvalidHttpHeaderCharReturns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * -----------------0_0---------------------------
    * @description Defines For Optimize Methods
    * @see https://github.com/node-modules/utility#argumentstoarray
    * -----------------0^0------------------------
    */
  @js.native
  trait ITryStaticReturns extends StObject {
    
    var error: js.UndefOr[Error] = js.native
    
    var value: js.Any = js.native
  }
  object ITryStaticReturns {
    
    @scala.inline
    def apply(value: js.Any): ITryStaticReturns = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITryStaticReturns]
    }
    
    @scala.inline
    implicit class ITryStaticReturnsMutableBuilder[Self <: ITryStaticReturns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ----------------0_0-----------------
    * @description Defines For Date
    * @see https://github.com/node-modules/utility#date-utils
    * ---------------0^0------------------
    */
  @js.native
  trait IYYYYMMDDHHmmssStaticOptions extends StObject {
    
    var dateSep: js.UndefOr[String] = js.native
    
    var timeSep: js.UndefOr[String] = js.native
  }
  object IYYYYMMDDHHmmssStaticOptions {
    
    @scala.inline
    def apply(): IYYYYMMDDHHmmssStaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IYYYYMMDDHHmmssStaticOptions]
    }
    
    @scala.inline
    implicit class IYYYYMMDDHHmmssStaticOptionsMutableBuilder[Self <: IYYYYMMDDHHmmssStaticOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateSep(value: String): Self = StObject.set(x, "dateSep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateSepUndefined: Self = StObject.set(x, "dateSep", js.undefined)
      
      @scala.inline
      def setTimeSep(value: String): Self = StObject.set(x, "timeSep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeSepUndefined: Self = StObject.set(x, "timeSep", js.undefined)
    }
  }
  
  /**
    * ---------------0_0----------------
    * @description Defines For Array
    * @see https://github.com/node-modules/utility
    * ---------------0^0----------------
    */
  /**
    * Static object define
    */
  type ObjStatic = StringDictionary[js.Any]
}
