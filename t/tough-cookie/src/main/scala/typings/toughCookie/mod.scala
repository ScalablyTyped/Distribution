package typings.toughCookie

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.toughCookie.mod.Cookie.ParseOptions
import typings.toughCookie.mod.Cookie.Properties
import typings.toughCookie.mod.CookieJar.GetCookiesOptions
import typings.toughCookie.mod.CookieJar.Options
import typings.toughCookie.mod.CookieJar.Serialized
import typings.toughCookie.mod.CookieJar.SetCookieOptions
import typings.toughCookie.toughCookieStrings.Infinity
import typings.toughCookie.toughCookieStrings.`-Infinity`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tough-cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tough-cookie", "Cookie")
  @js.native
  class Cookie () extends StObject {
    def this(properties: Properties) = this()
    
    def TTL(): Double = js.native
    def TTL(now: Date): Double = js.native
    
    def canonicalizedDomain(): String | Null = js.native
    
    def cdomain(): String | Null = js.native
    
    def cookieString(): String = js.native
    
    var creation: Date | Null = js.native
    
    var creationIndex: Double = js.native
    
    var domain: String | Null = js.native
    
    var expires: Date | Infinity = js.native
    
    def expiryDate(): Date = js.native
    def expiryDate(now: Double): Date = js.native
    
    def expiryTime(): Double = js.native
    def expiryTime(now: Double): Double = js.native
    
    var extensions: js.Array[String] | Null = js.native
    
    var hostOnly: Boolean | Null = js.native
    
    var httpOnly: Boolean = js.native
    
    def inspect(): String = js.native
    
    def isPersistent(): Boolean = js.native
    
    var key: String = js.native
    
    var lastAccessed: Date | Null = js.native
    
    var maxAge: Double | Infinity | `-Infinity` = js.native
    
    var path: String | Null = js.native
    
    var pathIsDefault: Boolean | Null = js.native
    
    var sameSite: String = js.native
    
    var secure: Boolean = js.native
    
    def setExpires(exp: String): Unit = js.native
    def setExpires(exp: Date): Unit = js.native
    
    def setMaxAge(number: Double): Unit = js.native
    
    def toJSON(): StringDictionary[js.Any] = js.native
    
    def validate(): Boolean | String = js.native
    
    var value: String = js.native
  }
  /* static members */
  object Cookie {
    
    @JSImport("tough-cookie", "Cookie")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromJSON(strOrObj: String): Cookie | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(strOrObj.asInstanceOf[js.Any]).asInstanceOf[Cookie | Null]
    @scala.inline
    def fromJSON(strOrObj: js.Object): Cookie | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(strOrObj.asInstanceOf[js.Any]).asInstanceOf[Cookie | Null]
    
    @scala.inline
    def parse(cookieString: String): js.UndefOr[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cookieString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Cookie]]
    @scala.inline
    def parse(cookieString: String, options: ParseOptions): js.UndefOr[Cookie] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cookieString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Cookie]]
    
    trait ParseOptions extends StObject {
      
      var loose: js.UndefOr[Boolean] = js.undefined
    }
    object ParseOptions {
      
      @scala.inline
      def apply(): ParseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParseOptions]
      }
      
      @scala.inline
      implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      }
    }
    
    trait Properties extends StObject {
      
      var creation: js.UndefOr[Date] = js.undefined
      
      var creationIndex: js.UndefOr[Double] = js.undefined
      
      var domain: js.UndefOr[String] = js.undefined
      
      var expires: js.UndefOr[Date] = js.undefined
      
      var extensions: js.UndefOr[js.Array[String]] = js.undefined
      
      var hostOnly: js.UndefOr[Boolean] = js.undefined
      
      var httpOnly: js.UndefOr[Boolean] = js.undefined
      
      var key: js.UndefOr[String] = js.undefined
      
      var lastAccessed: js.UndefOr[Date] = js.undefined
      
      var maxAge: js.UndefOr[Double | Infinity | `-Infinity`] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var pathIsDefault: js.UndefOr[Boolean] = js.undefined
      
      var sameSite: js.UndefOr[String] = js.undefined
      
      var secure: js.UndefOr[Boolean] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Properties {
      
      @scala.inline
      def apply(): Properties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Properties]
      }
      
      @scala.inline
      implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreation(value: Date): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationIndex(value: Double): Self = StObject.set(x, "creationIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationIndexUndefined: Self = StObject.set(x, "creationIndex", js.undefined)
        
        @scala.inline
        def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        @scala.inline
        def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        @scala.inline
        def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
        
        @scala.inline
        def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostOnlyUndefined: Self = StObject.set(x, "hostOnly", js.undefined)
        
        @scala.inline
        def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setLastAccessed(value: Date): Self = StObject.set(x, "lastAccessed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastAccessedUndefined: Self = StObject.set(x, "lastAccessed", js.undefined)
        
        @scala.inline
        def setMaxAge(value: Double | Infinity | `-Infinity`): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathIsDefault(value: Boolean): Self = StObject.set(x, "pathIsDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathIsDefaultUndefined: Self = StObject.set(x, "pathIsDefault", js.undefined)
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSameSite(value: String): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
        
        @scala.inline
        def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    type Serialized = StringDictionary[js.Any]
  }
  
  @JSImport("tough-cookie", "CookieJar")
  @js.native
  class CookieJar () extends StObject {
    def this(store: Store) = this()
    def this(store: Unit, options: Options) = this()
    def this(store: Store, options: Options) = this()
    
    def clone(cb: js.Function2[/* err */ Error | Null, /* newJar */ this.type, Unit]): Unit = js.native
    def clone(store: Store): js.Promise[CookieJar] = js.native
    def clone(store: Store, cb: js.Function2[/* err */ Error | Null, /* newJar */ this.type, Unit]): Unit = js.native
    
    def cloneSync(): CookieJar = js.native
    def cloneSync(store: Store): CookieJar = js.native
    
    def getCookieString(currentUrl: String): js.Promise[String] = js.native
    def getCookieString(currentUrl: String, cb: js.Function2[/* err */ Error | Null, /* cookies */ String, Unit]): Unit = js.native
    def getCookieString(currentUrl: String, options: GetCookiesOptions): js.Promise[String] = js.native
    def getCookieString(
      currentUrl: String,
      options: GetCookiesOptions,
      cb: js.Function2[/* err */ Error | Null, /* cookies */ String, Unit]
    ): Unit = js.native
    
    def getCookieStringSync(currentUrl: String): String = js.native
    def getCookieStringSync(currentUrl: String, options: GetCookiesOptions): String = js.native
    
    def getCookies(currentUrl: String): js.Promise[js.Array[Cookie]] = js.native
    def getCookies(currentUrl: String, cb: js.Function2[/* err */ Error | Null, /* cookies */ js.Array[Cookie], Unit]): Unit = js.native
    def getCookies(currentUrl: String, options: GetCookiesOptions): js.Promise[js.Array[Cookie]] = js.native
    def getCookies(
      currentUrl: String,
      options: GetCookiesOptions,
      cb: js.Function2[/* err */ Error | Null, /* cookies */ js.Array[Cookie], Unit]
    ): Unit = js.native
    
    def getCookiesSync(currentUrl: String): js.Array[Cookie] = js.native
    def getCookiesSync(currentUrl: String, options: GetCookiesOptions): js.Array[Cookie] = js.native
    
    def getSetCookieStrings(currentUrl: String): js.Promise[js.Array[String]] = js.native
    def getSetCookieStrings(currentUrl: String, cb: js.Function2[/* err */ Error | Null, /* cookies */ js.Array[String], Unit]): Unit = js.native
    def getSetCookieStrings(currentUrl: String, options: GetCookiesOptions): js.Promise[js.Array[String]] = js.native
    def getSetCookieStrings(
      currentUrl: String,
      options: GetCookiesOptions,
      cb: js.Function2[/* err */ Error | Null, /* cookies */ js.Array[String], Unit]
    ): Unit = js.native
    
    def getSetCookieStringsSync(currentUrl: String): js.Array[String] = js.native
    def getSetCookieStringsSync(currentUrl: String, options: GetCookiesOptions): js.Array[String] = js.native
    
    def removeAllCookies(): js.Promise[Unit] = js.native
    def removeAllCookies(cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    def removeAllCookiesSync(): Unit = js.native
    
    def serialize(): js.Promise[Serialized] = js.native
    def serialize(cb: js.Function2[/* err */ Error | Null, /* serializedObject */ Serialized, Unit]): Unit = js.native
    
    def serializeSync(): Serialized = js.native
    
    def setCookie(cookieOrString: String, currentUrl: String): js.Promise[Cookie] = js.native
    def setCookie(
      cookieOrString: String,
      currentUrl: String,
      cb: js.Function2[/* err */ Error | Null, /* cookie */ Cookie, Unit]
    ): Unit = js.native
    def setCookie(cookieOrString: String, currentUrl: String, options: SetCookieOptions): js.Promise[Cookie] = js.native
    def setCookie(
      cookieOrString: String,
      currentUrl: String,
      options: SetCookieOptions,
      cb: js.Function2[/* err */ Error | Null, /* cookie */ Cookie, Unit]
    ): Unit = js.native
    def setCookie(cookieOrString: Cookie, currentUrl: String): js.Promise[Cookie] = js.native
    def setCookie(
      cookieOrString: Cookie,
      currentUrl: String,
      cb: js.Function2[/* err */ Error | Null, /* cookie */ Cookie, Unit]
    ): Unit = js.native
    def setCookie(cookieOrString: Cookie, currentUrl: String, options: SetCookieOptions): js.Promise[Cookie] = js.native
    def setCookie(
      cookieOrString: Cookie,
      currentUrl: String,
      options: SetCookieOptions,
      cb: js.Function2[/* err */ Error | Null, /* cookie */ Cookie, Unit]
    ): Unit = js.native
    
    def setCookieSync(cookieOrString: String, currentUrl: String): Cookie = js.native
    def setCookieSync(cookieOrString: String, currentUrl: String, options: SetCookieOptions): Cookie = js.native
    def setCookieSync(cookieOrString: Cookie, currentUrl: String): Cookie = js.native
    def setCookieSync(cookieOrString: Cookie, currentUrl: String, options: SetCookieOptions): Cookie = js.native
    
    def toJSON(): Serialized = js.native
  }
  /* static members */
  object CookieJar {
    
    @JSImport("tough-cookie", "CookieJar")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deserialize(serialized: String): js.Promise[CookieJar] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CookieJar]]
    @scala.inline
    def deserialize(serialized: String, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deserialize(serialized: String, store: Store): js.Promise[CookieJar] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CookieJar]]
    @scala.inline
    def deserialize(
      serialized: String,
      store: Store,
      cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any], store.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deserialize(serialized: Serialized): js.Promise[CookieJar] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CookieJar]]
    @scala.inline
    def deserialize(serialized: Serialized, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deserialize(serialized: Serialized, store: Store): js.Promise[CookieJar] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CookieJar]]
    @scala.inline
    def deserialize(
      serialized: Serialized,
      store: Store,
      cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any], store.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def deserializeSync(serialized: String): CookieJar = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSync")(serialized.asInstanceOf[js.Any]).asInstanceOf[CookieJar]
    @scala.inline
    def deserializeSync(serialized: String, store: Store): CookieJar = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSync")(serialized.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[CookieJar]
    @scala.inline
    def deserializeSync(serialized: Serialized): CookieJar = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSync")(serialized.asInstanceOf[js.Any]).asInstanceOf[CookieJar]
    @scala.inline
    def deserializeSync(serialized: Serialized, store: Store): CookieJar = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSync")(serialized.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[CookieJar]
    
    @scala.inline
    def fromJSON(string: String): CookieJar = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(string.asInstanceOf[js.Any]).asInstanceOf[CookieJar]
    
    trait GetCookiesOptions extends StObject {
      
      var allPaths: js.UndefOr[Boolean] = js.undefined
      
      var expire: js.UndefOr[Boolean] = js.undefined
      
      var http: js.UndefOr[Boolean] = js.undefined
      
      var now: js.UndefOr[Date] = js.undefined
      
      var secure: js.UndefOr[Boolean] = js.undefined
    }
    object GetCookiesOptions {
      
      @scala.inline
      def apply(): GetCookiesOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetCookiesOptions]
      }
      
      @scala.inline
      implicit class GetCookiesOptionsMutableBuilder[Self <: GetCookiesOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllPaths(value: Boolean): Self = StObject.set(x, "allPaths", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllPathsUndefined: Self = StObject.set(x, "allPaths", js.undefined)
        
        @scala.inline
        def setExpire(value: Boolean): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
        
        @scala.inline
        def setHttp(value: Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        @scala.inline
        def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
        
        @scala.inline
        def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      var allowSpecialUseDomain: js.UndefOr[Boolean] = js.undefined
      
      var looseMode: js.UndefOr[Boolean] = js.undefined
      
      var prefixSecurity: js.UndefOr[String] = js.undefined
      
      var rejectPublicSuffixes: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowSpecialUseDomain(value: Boolean): Self = StObject.set(x, "allowSpecialUseDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowSpecialUseDomainUndefined: Self = StObject.set(x, "allowSpecialUseDomain", js.undefined)
        
        @scala.inline
        def setLooseMode(value: Boolean): Self = StObject.set(x, "looseMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLooseModeUndefined: Self = StObject.set(x, "looseMode", js.undefined)
        
        @scala.inline
        def setPrefixSecurity(value: String): Self = StObject.set(x, "prefixSecurity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixSecurityUndefined: Self = StObject.set(x, "prefixSecurity", js.undefined)
        
        @scala.inline
        def setRejectPublicSuffixes(value: Boolean): Self = StObject.set(x, "rejectPublicSuffixes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRejectPublicSuffixesUndefined: Self = StObject.set(x, "rejectPublicSuffixes", js.undefined)
      }
    }
    
    trait Serialized extends StObject {
      
      var cookies: js.Array[typings.toughCookie.mod.Cookie.Serialized]
      
      var rejectPublicSuffixes: Boolean
      
      var storeType: String
      
      var version: String
    }
    object Serialized {
      
      @scala.inline
      def apply(
        cookies: js.Array[typings.toughCookie.mod.Cookie.Serialized],
        rejectPublicSuffixes: Boolean,
        storeType: String,
        version: String
      ): Serialized = {
        val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], rejectPublicSuffixes = rejectPublicSuffixes.asInstanceOf[js.Any], storeType = storeType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Serialized]
      }
      
      @scala.inline
      implicit class SerializedMutableBuilder[Self <: Serialized] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCookies(value: js.Array[typings.toughCookie.mod.Cookie.Serialized]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookiesVarargs(value: typings.toughCookie.mod.Cookie.Serialized*): Self = StObject.set(x, "cookies", js.Array(value :_*))
        
        @scala.inline
        def setRejectPublicSuffixes(value: Boolean): Self = StObject.set(x, "rejectPublicSuffixes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStoreType(value: String): Self = StObject.set(x, "storeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait SetCookieOptions extends StObject {
      
      var http: js.UndefOr[Boolean] = js.undefined
      
      var ignoreError: js.UndefOr[Boolean] = js.undefined
      
      var now: js.UndefOr[Date] = js.undefined
      
      var secure: js.UndefOr[Boolean] = js.undefined
    }
    object SetCookieOptions {
      
      @scala.inline
      def apply(): SetCookieOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetCookieOptions]
      }
      
      @scala.inline
      implicit class SetCookieOptionsMutableBuilder[Self <: SetCookieOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHttp(value: Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        @scala.inline
        def setIgnoreError(value: Boolean): Self = StObject.set(x, "ignoreError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreErrorUndefined: Self = StObject.set(x, "ignoreError", js.undefined)
        
        @scala.inline
        def setNow(value: Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
        
        @scala.inline
        def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      }
    }
  }
  
  @JSImport("tough-cookie", "MemoryCookieStore")
  @js.native
  class MemoryCookieStore () extends Store
  
  /* Inlined std.Readonly<{  DISABLED :string,   SILENT :string,   STRICT :string}> */
  object PrefixSecurityEnum {
    
    @JSImport("tough-cookie", "PrefixSecurityEnum.DISABLED")
    @js.native
    val DISABLED: String = js.native
    
    @JSImport("tough-cookie", "PrefixSecurityEnum.SILENT")
    @js.native
    val SILENT: String = js.native
    
    @JSImport("tough-cookie", "PrefixSecurityEnum.STRICT")
    @js.native
    val STRICT: String = js.native
  }
  
  @JSImport("tough-cookie", "Store")
  @js.native
  abstract class Store () extends StObject {
    
    def findCookie(
      domain: String,
      path: String,
      key: String,
      cb: js.Function2[/* err */ Error | Null, /* cookie */ Cookie | Null, Unit]
    ): Unit = js.native
    
    def findCookies(
      domain: String,
      path: String,
      allowSpecialUseDomain: Boolean,
      cb: js.Function2[/* err */ Error | Null, /* cookie */ js.Array[Cookie], Unit]
    ): Unit = js.native
    
    def getAllCookies(cb: js.Function2[/* err */ Error | Null, /* cookie */ js.Array[Cookie], Unit]): Unit = js.native
    
    def putCookie(cookie: Cookie, cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    def removeCookies(domain: String, path: String, cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    var synchronous: Boolean = js.native
    
    def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  }
  
  @scala.inline
  def canonicalDomain(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalDomain")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def cookieCompare(a: Cookie, b: Cookie): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cookieCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def defaultPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def domainMatch(str: String, domStr: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("domainMatch")(str.asInstanceOf[js.Any], domStr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def domainMatch(str: String, domStr: String, canonicalize: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("domainMatch")(str.asInstanceOf[js.Any], domStr.asInstanceOf[js.Any], canonicalize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def formatDate(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def fromJSON(string: String): Cookie = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(string.asInstanceOf[js.Any]).asInstanceOf[Cookie]
  
  @scala.inline
  def getPublicSuffix(hostname: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicSuffix")(hostname.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def parse(cookieString: String): js.UndefOr[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cookieString.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Cookie]]
  @scala.inline
  def parse(cookieString: String, options: ParseOptions): js.UndefOr[Cookie] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cookieString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Cookie]]
  
  @scala.inline
  def parseDate(string: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(string.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def pathMatch(reqPath: String, cookiePath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathMatch")(reqPath.asInstanceOf[js.Any], cookiePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def permuteDomain(domain: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("permuteDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def permuteDomain(domain: String, allowSpecialUseDomain: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("permuteDomain")(domain.asInstanceOf[js.Any], allowSpecialUseDomain.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def permutePath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("permutePath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("tough-cookie", "version")
  @js.native
  val version: String = js.native
}
