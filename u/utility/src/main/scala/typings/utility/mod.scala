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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("utility", "UNSTABLE_METHOD")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * optimize try catch
      * @param {Function} fn
      * @return {Object}
      *   - {Error} error
      *   - {Mix} value
      */
    inline def `try`(fn: js.Function1[/* repeated */ js.Any, js.Any]): ITryStaticReturns = ^.asInstanceOf[js.Dynamic].applyDynamic("try")(fn.asInstanceOf[js.Any]).asInstanceOf[ITryStaticReturns]
  }
  
  /**
    * `moment().format('YYYY-MM-DD')` format date string.
    *
    * @return {String}
    */
  inline def YYYYMMDD(d: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDD")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def YYYYMMDD(d: String, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDD")(d.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def YYYYMMDD(d: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDD")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def YYYYMMDD(d: Date, sep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDD")(d.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def YYYYMMDDHHmmss(d: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDDHHmmss")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def YYYYMMDDHHmmss(d: String, options: IYYYYMMDDHHmmssStaticOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDDHHmmss")(d.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * `moment().format('YYYY-MM-DD HH:mm:ss')` format date string.
    *
    * @return {String}
    */
  inline def YYYYMMDDHHmmss(d: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDDHHmmss")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def YYYYMMDDHHmmss(d: Date, options: IYYYYMMDDHHmmssStaticOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("YYYYMMDDHHmmss")(d.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Access log format date. format: `moment().format('DD/MMM/YYYY:HH:mm:ss ZZ')`
    *
    * @return {String}
    */
  inline def accessLogDate(d: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessLogDate")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * optimize arguments to array
    * @param {Arguments} args
    * @return {Array}
    */
  inline def argumentsToArray(args: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentsToArray")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def assign(target: ObjStatic, objects: js.Array[js.Any]): ObjStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[ObjStatic]
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
  inline def assign(target: ObjStatic, objects: ObjStatic): ObjStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[ObjStatic]
  
  /**
    * Base64 string decode.
    *
    * @param {String} encode, base64 encoding string.
    * @param {Boolean} [urlsafe=false] Decode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @param {encoding} [encoding=utf8] if encoding = buffer, will return Buffer instance
    * @return {String|Buffer} plain text.
    */
  inline def base64decode(encode: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("base64decode")(encode.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  inline def base64decode(encode: String, urlsafe: Boolean): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("base64decode")(encode.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def base64decode_buffer(encode: String, urlsafe: Boolean, encoding: buffer): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("base64decode")(encode.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def base64decode_buffer(encode: String, urlsafe: Unit, encoding: buffer): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("base64decode")(encode.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  inline def base64decode_utf8(encode: String, urlsafe: Boolean, encoding: utf8): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("base64decode")(encode.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  inline def base64decode_utf8(encode: String, urlsafe: Unit, encoding: utf8): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("base64decode")(encode.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  
  /**
    * Base64 encode string.
    *
    * @param {String|Buffer} s
    * @param {Boolean} [urlsafe=false] Encode string s using a URL-safe alphabet,
    *   which substitutes - instead of + and _ instead of / in the standard Base64 alphabet.
    * @return {String} base64 encode format string.
    */
  inline def base64encode(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64encode")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64encode(s: String, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64encode")(s.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def base64encode(s: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64encode")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64encode(s: Buffer, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64encode")(s.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * return datetime struct.
    *
    * @return {Object} date
    *  - {Number} YYYYMMDD, 20130401
    *  - {Number} H, 0, 1, 9, 12, 23
    */
  inline def datestruct(): IDateStructStaticReturns = ^.asInstanceOf[js.Dynamic].applyDynamic("datestruct")().asInstanceOf[IDateStructStaticReturns]
  inline def datestruct(now: Date): IDateStructStaticReturns = ^.asInstanceOf[js.Dynamic].applyDynamic("datestruct")(now.asInstanceOf[js.Any]).asInstanceOf[IDateStructStaticReturns]
  
  /**
    * Safe decodeURIComponent, won't throw any error.
    * If `decodeURIComponent` error happen, just return the original value.
    *
    * @param {String} encodeText
    * @return {String} URL decode original string.
    */
  inline def decodeURIComponent(encodeText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeURIComponent")(encodeText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * avoid if (a && a.b && a.b.c)
    * @param {Object} obj
    * @param {...String} keys
    * @return {Object}
    */
  inline def dig(obj: ObjStatic, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dig")(obj.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Safe encodeURIComponent, won't throw any error.
    * If `encodeURIComponent` error happen, just return the original value.
    *
    * @param {String} text
    * @return {String} URL encode string.
    */
  inline def encodeURIComponent(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  inline def escape(test: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(test.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOwnEnumerables(obj: ObjStatic): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnEnumerables")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getOwnEnumerables(obj: ObjStatic, ignoreNull: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnEnumerables")(obj.asInstanceOf[js.Any], ignoreNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * Get a function parameter's names.
    *
    * @param {Function} func
    * @param {Boolean} [useCache], default is true
    * @return {Array} names
    */
  inline def getParamNames(func: js.Function1[/* repeated */ js.Any, js.Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParamNames")(func.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getParamNames(func: js.Function1[/* repeated */ js.Any, js.Any], cache: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParamNames")(func.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def has(obj: ObjStatic, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hash(method: md5, s: String, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(method: md5, s: String, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(method: md5, s: Buffer, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(method: md5, s: Buffer, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(method: sha1, s: String, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(method: sha1, s: String, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(method: sha1, s: Buffer, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(method: sha1, s: Buffer, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def hash_md5(method: md5, s: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash_md5(method: md5, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hash_sha1(method: sha1, s: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash_sha1(method: sha1, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(method.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def hmac(algorithm: String, key: String, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hmac(algorithm: String, key: String, data: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hmac(algorithm: String, key: String, data: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hmac(algorithm: String, key: String, data: Buffer, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hmac_base64(algorithm: String, key: String, data: String, encoding: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hmac_base64(algorithm: String, key: String, data: Buffer, encoding: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Detect invalid http header characters in a string
    *
    * @param {String} val
    * @return {Boolean}
    */
  inline def includesInvalidHttpHeaderChar(`val`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includesInvalidHttpHeaderChar")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Detect a number string can safe convert to Javascript Number.
    *
    * @param {String} s number format string, like `"123"`, `"-1000123123123123123123"`
    * @return {Boolean}
    */
  inline def isSafeNumberString(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeNumberString")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Normal log format date. format: `moment().format('YYYY-MM-DD HH:mm:ss.SSS')`
    *
    * @return {String}
    */
  inline def logDate(d: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logDate")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def logDate(d: String, msSep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("logDate")(d.asInstanceOf[js.Any], msSep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def logDate(d: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logDate")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def logDate(d: Date, msSep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("logDate")(d.asInstanceOf[js.Any], msSep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * generate a real map object(clean object), no constructor, no __proto__
    * @param {Object} [obj] - init object, optional
    * @return {Object}
    */
  inline def map(): ObjStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[ObjStatic]
  inline def map(obj: ObjStatic): ObjStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any]).asInstanceOf[ObjStatic]
  
  /**
    * md5 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} md5 hash string
    * @public
    */
  inline def md5(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def md5(s: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def md5_base64(s: String, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def md5_base64(s: Buffer, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def md5_hex(s: String, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def md5_hex(s: Buffer, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mkdir(dir: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
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
  inline def noop(): js.Function0[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[js.Function0[js.Any]]
  
  /**
    * Produces a random integer between the inclusive `lower` and `upper` bounds.
    *
    * @param {Number} lower The lower bound.
    * @param {Number} upper The upper bound.
    * @return {Number} Returns the random number.
    */
  inline def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
  inline def random(lower: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(lower.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def random(lower: Double, upper: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def random(lower: Unit, upper: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Array random slice with items count.
    * @param {Array} arr
    * @param {Number} num, number of sub items.
    * @return {Array}
    */
  inline def randomSlice(arr: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomSlice")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def randomSlice(arr: js.Array[js.Any], num: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomSlice")(arr.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def randomString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")().asInstanceOf[String]
  inline def randomString(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def randomString(length: Double, charSet: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any], charSet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomString(length: Double, charSet: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any], charSet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomString(length: Unit, charSet: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any], charSet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomString(length: Unit, charSet: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any], charSet.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readJSON(filepath: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def readJSONSync(filepath: String): ObjStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[ObjStatic]
  
  /**
    * Replace string
    *
    * @param  {String} str
    * @param  {String|RegExp} substr
    * @param  {String|Function} newSubstr
    * @return {String}
    */
  inline def replace(str: String, substr: String, newSubstr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], newSubstr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(str: String, substr: String, newSubstr: js.Function1[/* repeated */ js.Any, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], newSubstr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(str: String, substr: RegExp, newSubstr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], newSubstr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(str: String, substr: RegExp, newSubstr: js.Function1[/* repeated */ js.Any, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], newSubstr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Replace invalid http header characters with replacement
    *
    * @param  {String} val
    * @param  {String|Function} replacement - can be `function(char)`
    * @return {Object}
    */
  inline def replaceInvalidHttpHeaderChar(`val`: String): IReplaceInvalidHttpHeaderCharReturns = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceInvalidHttpHeaderChar")(`val`.asInstanceOf[js.Any]).asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
  inline def replaceInvalidHttpHeaderChar(`val`: String, replacement: String): IReplaceInvalidHttpHeaderCharReturns = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceInvalidHttpHeaderChar")(`val`.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
  inline def replaceInvalidHttpHeaderChar(`val`: String, replacement: js.Function1[/* repeated */ js.Any, js.Any]): IReplaceInvalidHttpHeaderCharReturns = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceInvalidHttpHeaderChar")(`val`.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
  
  /**
    * -------------------0_0---------------------
    * @description Defines For Polyfill Methods
    * @see https://github.com/node-modules/utility#timers
    * -------------------0^0-------------------
    */
  inline def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Immediate]
  
  inline def setImmediate_Unit(fn: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * sha1 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha1 hash string
    * @public
    */
  inline def sha1(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sha1(s: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha1_base64(s: String, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sha1_base64(s: Buffer, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sha1_hex(s: String, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sha1_hex(s: Buffer, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * sha256 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha256 hash string
    * @public
    */
  inline def sha256(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sha256(s: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha256_base64(s: String, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sha256_base64(s: Buffer, format: base64): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sha256_hex(s: String, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sha256_hex(s: Buffer, format: hex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Remove one exists element from an array
    * @param {Array} arr
    * @param  {Number} index - remove element index
    * @return {Array} the array instance
    */
  inline def spliceOne(arr: js.Array[js.Any], index: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spliceOne")(arr.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * split string to array
    * @param  {String} str
    * @param  {String} [sep] default is ','
    * @return {Array}
    */
  inline def split(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def split(str: String, sep: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * always optimized
    */
  inline def splitAlwaysOptimized(args: js.Any*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAlwaysOptimized")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def strictJSONParse(str: String): ObjStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("strictJSONParse")(str.asInstanceOf[js.Any]).asInstanceOf[ObjStatic]
  
  /**
    * Get Unix's timestamp in seconds.
    * @return {Number}
    */
  inline def timestamp(): Double | Date = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[Double | Date]
  inline def timestamp(t: String): Double | Date = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(t.asInstanceOf[js.Any]).asInstanceOf[Double | Date]
  inline def timestamp(t: Double): Double | Date = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(t.asInstanceOf[js.Any]).asInstanceOf[Double | Date]
  
  /**
    * Convert string to Number if string in safe Number scope.
    *
    * @param {String} s number format string.
    * @return {Number|String} success will return Number, otherise return the original string.
    */
  inline def toSafeNumber(s: String): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSafeNumber")(s.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  inline def toSafeNumber(s: Double): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSafeNumber")(s.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  
  /**
    * Unescape the given string from html
    * @param {String} html
    * @param {String} type
    * @return {String}
    * @public
    */
  inline def unescape(html: String): String | ObjStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(html.asInstanceOf[js.Any]).asInstanceOf[String | ObjStatic]
  inline def unescape(html: String, `type`: String): String | ObjStatic = (^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(html.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String | ObjStatic]
  
  inline def writeJSON(filepath: String, str: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def writeJSON(filepath: String, str: String, options: IJSONStaticOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def writeJSON(filepath: String, str: ObjStatic): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def writeJSON(filepath: String, str: ObjStatic, options: IJSONStaticOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def writeJSONSync(filepath: String, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSONSync(filepath: String, str: String, options: IJSONStaticOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSONSync(filepath: String, str: ObjStatic): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSONSync(filepath: String, str: ObjStatic, options: IJSONStaticOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(filepath.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IDateStructStaticReturns extends StObject {
    
    var H: Double
    
    var YYYYMMDD: Double
  }
  object IDateStructStaticReturns {
    
    inline def apply(H: Double, YYYYMMDD: Double): IDateStructStaticReturns = {
      val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], YYYYMMDD = YYYYMMDD.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDateStructStaticReturns]
    }
    
    extension [Self <: IDateStructStaticReturns](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      inline def setYYYYMMDD(value: Double): Self = StObject.set(x, "YYYYMMDD", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ----------------0_0-----------------------
    * @description Defines For JSON methods
    * @see https://github.com/node-modules/utility#json
    * -----------------0^0-----------------------
    */
  trait IJSONStaticOptions extends StObject {
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
    
    var space: js.UndefOr[Double | String] = js.undefined
  }
  object IJSONStaticOptions {
    
    inline def apply(): IJSONStaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJSONStaticOptions]
    }
    
    extension [Self <: IJSONStaticOptions](x: Self) {
      
      inline def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  /**
    * ------------------0_0--------------------
    * @description Defines For String Methods
    * @see https://github.com/node-modules/utility#others
    * -------------------0^0---------------------
    */
  trait IReplaceInvalidHttpHeaderCharReturns extends StObject {
    
    var invalid: Boolean
    
    var `val`: String
  }
  object IReplaceInvalidHttpHeaderCharReturns {
    
    inline def apply(invalid: Boolean, `val`: String): IReplaceInvalidHttpHeaderCharReturns = {
      val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
    }
    
    extension [Self <: IReplaceInvalidHttpHeaderCharReturns](x: Self) {
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * -----------------0_0---------------------------
    * @description Defines For Optimize Methods
    * @see https://github.com/node-modules/utility#argumentstoarray
    * -----------------0^0------------------------
    */
  trait ITryStaticReturns extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var value: js.Any
  }
  object ITryStaticReturns {
    
    inline def apply(value: js.Any): ITryStaticReturns = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITryStaticReturns]
    }
    
    extension [Self <: ITryStaticReturns](x: Self) {
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ----------------0_0-----------------
    * @description Defines For Date
    * @see https://github.com/node-modules/utility#date-utils
    * ---------------0^0------------------
    */
  trait IYYYYMMDDHHmmssStaticOptions extends StObject {
    
    var dateSep: js.UndefOr[String] = js.undefined
    
    var timeSep: js.UndefOr[String] = js.undefined
  }
  object IYYYYMMDDHHmmssStaticOptions {
    
    inline def apply(): IYYYYMMDDHHmmssStaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IYYYYMMDDHHmmssStaticOptions]
    }
    
    extension [Self <: IYYYYMMDDHHmmssStaticOptions](x: Self) {
      
      inline def setDateSep(value: String): Self = StObject.set(x, "dateSep", value.asInstanceOf[js.Any])
      
      inline def setDateSepUndefined: Self = StObject.set(x, "dateSep", js.undefined)
      
      inline def setTimeSep(value: String): Self = StObject.set(x, "timeSep", value.asInstanceOf[js.Any])
      
      inline def setTimeSepUndefined: Self = StObject.set(x, "timeSep", js.undefined)
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
