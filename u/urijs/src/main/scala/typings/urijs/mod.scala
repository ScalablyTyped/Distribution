package typings.urijs

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.urijs.anon.Hostname
import typings.urijs.anon.Password
import typings.urijs.anon.Port
import typings.urijs.urijsStrings.absolute
import typings.urijs.urijsStrings.domain
import typings.urijs.urijsStrings.idn
import typings.urijs.urijsStrings.inet4
import typings.urijs.urijsStrings.inet6
import typings.urijs.urijsStrings.ip
import typings.urijs.urijsStrings.ip4
import typings.urijs.urijsStrings.ip6
import typings.urijs.urijsStrings.ipv4
import typings.urijs.urijsStrings.ipv6
import typings.urijs.urijsStrings.name
import typings.urijs.urijsStrings.punycode
import typings.urijs.urijsStrings.relative
import typings.urijs.urijsStrings.sld
import typings.urijs.urijsStrings.url
import typings.urijs.urijsStrings.urn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  def apply(): URI = js.native
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  def apply(value: String): URI = js.native
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  def apply(value: typings.urijs.mod.HTMLElement): URI = js.native
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  def apply(value: URIOptions): URI = js.native
  
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  class Class () extends URI {
    def this(value: String) = this()
    def this(value: typings.urijs.mod.HTMLElement) = this()
    def this(value: URIOptions) = this()
  }
  
  @JSImport("urijs", "addQuery")
  @js.native
  def addQuery(data: js.Object, prop: String, value: String): js.Object = js.native
  @JSImport("urijs", "addQuery")
  @js.native
  def addQuery(data: js.Object, qryObj: js.Object): js.Object = js.native
  
  @JSImport("urijs", "build")
  @js.native
  def build(parts: URIOptions): String = js.native
  
  @JSImport("urijs", "buildAuthority")
  @js.native
  def buildAuthority(parts: Hostname): String = js.native
  
  @JSImport("urijs", "buildHost")
  @js.native
  def buildHost(parts: Port): String = js.native
  
  @JSImport("urijs", "buildQuery")
  @js.native
  def buildQuery(qry: js.Object): String = js.native
  @JSImport("urijs", "buildQuery")
  @js.native
  def buildQuery(qry: js.Object, duplicates: Boolean): String = js.native
  
  @JSImport("urijs", "buildUserinfo")
  @js.native
  def buildUserinfo(parts: Password): String = js.native
  
  @JSImport("urijs", "commonPath")
  @js.native
  def commonPath(path1: String, path2: String): String = js.native
  
  @JSImport("urijs", "decode")
  @js.native
  def decode(str: String): String = js.native
  
  @JSImport("urijs", "decodeQuery")
  @js.native
  def decodeQuery(qry: String): String = js.native
  
  @JSImport("urijs", "duplicateQueryParameters")
  @js.native
  def duplicateQueryParameters: Boolean = js.native
  @scala.inline
  def duplicateQueryParameters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duplicateQueryParameters")(x.asInstanceOf[js.Any])
  
  @JSImport("urijs", "encode")
  @js.native
  def encode(str: String): String = js.native
  
  @JSImport("urijs", "encodeQuery")
  @js.native
  def encodeQuery(qry: String): String = js.native
  
  @JSImport("urijs", "encodeReserved")
  @js.native
  def encodeReserved(str: String): String = js.native
  
  @JSImport("urijs", "escapeQuerySpace")
  @js.native
  def escapeQuerySpace: Boolean = js.native
  @scala.inline
  def escapeQuerySpace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeQuerySpace")(x.asInstanceOf[js.Any])
  
  /**
    * @description Wrapper for `URITemplate#expand`. Only present after
    *              importing `urijs/src/URITemplate` explicitly.
    */
  @JSImport("urijs", "expand")
  @js.native
  def expand: js.UndefOr[js.Function2[/* template */ String, /* vals */ js.Object, String]] = js.native
  @scala.inline
  def expand_=(x: js.UndefOr[js.Function2[/* template */ String, /* vals */ js.Object, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
  
  @JSImport("urijs", "iso8859")
  @js.native
  def iso8859(): Unit = js.native
  
  @JSImport("urijs", "joinPaths")
  @js.native
  def joinPaths(paths: (String | URI)*): URI = js.native
  
  @JSImport("urijs", "parse")
  @js.native
  def parse(url: String): Parts = js.native
  
  @JSImport("urijs", "parseAuthority")
  @js.native
  def parseAuthority(url: String, parts: Hostname): String = js.native
  
  @JSImport("urijs", "parseHost")
  @js.native
  def parseHost(url: String, parts: Port): String = js.native
  
  @JSImport("urijs", "parseQuery")
  @js.native
  def parseQuery(url: String): QueryDataMap = js.native
  
  @JSImport("urijs", "parseUserinfo")
  @js.native
  def parseUserinfo(url: String, parts: Password): String = js.native
  
  @JSImport("urijs", "preventInvalidHostname")
  @js.native
  def preventInvalidHostname: Boolean = js.native
  @scala.inline
  def preventInvalidHostname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventInvalidHostname")(x.asInstanceOf[js.Any])
  
  @JSImport("urijs", "removeQuery")
  @js.native
  def removeQuery(data: js.Object, prop: String, value: String): js.Object = js.native
  @JSImport("urijs", "removeQuery")
  @js.native
  def removeQuery(data: js.Object, props: js.Array[String]): js.Object = js.native
  @JSImport("urijs", "removeQuery")
  @js.native
  def removeQuery(data: js.Object, props: js.Object): js.Object = js.native
  
  @JSImport("urijs", "unicode")
  @js.native
  def unicode(): Unit = js.native
  
  @JSImport("urijs", "withinString")
  @js.native
  def withinString(source: String, func: js.Function1[/* url */ String, String]): String = js.native
  
  // Compatability with node.js
  // tslint:disable-next-line:no-empty-interface
  @js.native
  trait HTMLElement extends StObject
  
  @js.native
  trait Parts extends URIOptions {
    
    var duplicateQueryParameters: Boolean = js.native
    
    var escapeQuerySpace: Boolean = js.native
    
    var preventInvalidHostname: Boolean = js.native
  }
  object Parts {
    
    @scala.inline
    def apply(duplicateQueryParameters: Boolean, escapeQuerySpace: Boolean, preventInvalidHostname: Boolean): Parts = {
      val __obj = js.Dynamic.literal(duplicateQueryParameters = duplicateQueryParameters.asInstanceOf[js.Any], escapeQuerySpace = escapeQuerySpace.asInstanceOf[js.Any], preventInvalidHostname = preventInvalidHostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parts]
    }
    
    @scala.inline
    implicit class PartsMutableBuilder[Self <: Parts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuplicateQueryParameters(value: Boolean): Self = StObject.set(x, "duplicateQueryParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeQuerySpace(value: Boolean): Self = StObject.set(x, "escapeQuerySpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventInvalidHostname(value: Boolean): Self = StObject.set(x, "preventInvalidHostname", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryDataMap = StringDictionary[String | Null | (js.Array[String | Null])]
  
  @js.native
  trait URI extends StObject {
    
    def absoluteTo(path: String): URI = js.native
    def absoluteTo(path: URI): URI = js.native
    
    def addFragment(fragment: String): URI = js.native
    
    def addQuery(qry: String): URI = js.native
    def addQuery(qry: String, value: js.Any): URI = js.native
    def addQuery(qry: js.Object): URI = js.native
    
    def addSearch(key: String, value: js.Any): URI = js.native
    def addSearch(qry: String): URI = js.native
    def addSearch(qry: js.Object): URI = js.native
    
    def authority(): String = js.native
    def authority(authority: String): URI = js.native
    
    def directory(): String = js.native
    def directory(dir: String): URI = js.native
    def directory(dir: Boolean): String = js.native
    
    def domain(): String = js.native
    def domain(domain: String): URI = js.native
    def domain(domain: Boolean): String = js.native
    
    def duplicateQueryParameters(`val`: Boolean): URI = js.native
    
    def equals(): Boolean = js.native
    def equals(url: String): Boolean = js.native
    def equals(url: URI): Boolean = js.native
    
    def escapeQuerySpace(`val`: Boolean): URI = js.native
    
    def filename(): String = js.native
    def filename(file: String): URI = js.native
    def filename(file: Boolean): String = js.native
    
    def fragment(): String = js.native
    def fragment(fragment: String): URI = js.native
    
    def fragmentPrefix(prefix: String): URI = js.native
    
    def hasQuery(name: /*string | */ js.Any): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.UndefOr[scala.Nothing], withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: String): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: String, withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String]): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String], withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _], withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Boolean, withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Double): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Double, withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: RegExp): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: RegExp, withinArray: Boolean): Boolean = js.native
    
    def hasSearch(name: /*string | */ js.Any): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.UndefOr[scala.Nothing], withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: String): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: String, withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String]): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String], withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _], withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Boolean, withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Double): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Double, withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: RegExp): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: RegExp, withinArray: Boolean): Boolean = js.native
    
    def hash(): String = js.native
    def hash(hash: String): URI = js.native
    
    def host(): String = js.native
    def host(host: String): URI = js.native
    
    def hostname(): String = js.native
    def hostname(hostname: String): URI = js.native
    
    def href(): String = js.native
    def href(url: String): Unit = js.native
    
    @JSName("is")
    def is_absolute(qry: absolute): Boolean = js.native
    @JSName("is")
    def is_domain(qry: domain): Boolean = js.native
    @JSName("is")
    def is_idn(qry: idn): Boolean = js.native
    @JSName("is")
    def is_inet4(qry: inet4): Boolean = js.native
    @JSName("is")
    def is_inet6(qry: inet6): Boolean = js.native
    @JSName("is")
    def is_ip(qry: ip): Boolean = js.native
    @JSName("is")
    def is_ip4(qry: ip4): Boolean = js.native
    @JSName("is")
    def is_ip6(qry: ip6): Boolean = js.native
    @JSName("is")
    def is_ipv4(qry: ipv4): Boolean = js.native
    @JSName("is")
    def is_ipv6(qry: ipv6): Boolean = js.native
    @JSName("is")
    def is_name(qry: name): Boolean = js.native
    @JSName("is")
    def is_punycode(qry: punycode): Boolean = js.native
    @JSName("is")
    def is_relative(qry: relative): Boolean = js.native
    @JSName("is")
    def is_sld(qry: sld): Boolean = js.native
    @JSName("is")
    def is_url(qry: url): Boolean = js.native
    @JSName("is")
    def is_urn(qry: urn): Boolean = js.native
    
    def iso8859(): URI = js.native
    
    def normalize(): URI = js.native
    
    def normalizeFragment(): URI = js.native
    
    def normalizeHash(): URI = js.native
    
    def normalizeHostname(): URI = js.native
    
    def normalizePath(): URI = js.native
    
    def normalizePathname(): URI = js.native
    
    def normalizePort(): URI = js.native
    
    def normalizeProtocol(): URI = js.native
    
    def normalizeQuery(): URI = js.native
    
    def normalizeSearch(): URI = js.native
    
    def origin(): String = js.native
    def origin(uri: String): URI = js.native
    def origin(uri: URI): URI = js.native
    
    def password(): String = js.native
    def password(pw: String): URI = js.native
    
    def path(): String = js.native
    def path(path: String): URI = js.native
    def path(path: Boolean): String = js.native
    
    def pathname(): String = js.native
    def pathname(path: String): URI = js.native
    def pathname(path: Boolean): String = js.native
    
    def port(): String = js.native
    def port(port: String): URI = js.native
    
    def preventInvalidHostname(`val`: Boolean): URI = js.native
    
    def protocol(): String = js.native
    def protocol(protocol: String): URI = js.native
    
    def query(): String = js.native
    // tslint:disable-next-line void-return
    def query(qry: String): URI = js.native
    def query(qry: js.Function1[/* qryObject */ QueryDataMap, QueryDataMap | Unit]): URI = js.native
    def query(qry: QueryDataMap): URI = js.native
    def query(v: Boolean): QueryDataMap = js.native
    
    def readable(): String = js.native
    
    def relativeTo(path: String): URI = js.native
    
    def removeQuery(name: String, value: String): URI = js.native
    def removeQuery(qry: String): URI = js.native
    def removeQuery(qry: js.Object): URI = js.native
    
    def removeSearch(name: String, value: String): URI = js.native
    def removeSearch(qry: String): URI = js.native
    def removeSearch(qry: js.Object): URI = js.native
    
    def resource(): String = js.native
    def resource(resource: String): URI = js.native
    
    def scheme(): String = js.native
    def scheme(protocol: String): URI = js.native
    
    def search(): String = js.native
    // tslint:disable-next-line void-return
    def search(qry: String): URI = js.native
    def search(qry: js.Function1[/* qryObject */ QueryDataMap, QueryDataMap | Unit]): URI = js.native
    def search(qry: QueryDataMap): URI = js.native
    def search(v: Boolean): QueryDataMap = js.native
    
    def segment(): js.Array[String] = js.native
    def segment(position: Double): js.UndefOr[String] = js.native
    def segment(position: Double, level: String): URI = js.native
    def segment(segments: String): URI = js.native
    def segment(segments: js.Array[String]): URI = js.native
    
    def segmentCoded(): js.Array[String] = js.native
    def segmentCoded(position: Double): String = js.native
    def segmentCoded(position: Double, level: String): URI = js.native
    def segmentCoded(segments: String): URI = js.native
    def segmentCoded(segments: js.Array[String]): URI = js.native
    
    def setQuery(key: String, value: String): URI = js.native
    def setQuery(qry: js.Object): URI = js.native
    
    def setSearch(key: String, value: String): URI = js.native
    def setSearch(qry: js.Object): URI = js.native
    
    def subdomain(): String = js.native
    def subdomain(subdomain: String): URI = js.native
    
    def suffix(): String = js.native
    def suffix(suffix: String): URI = js.native
    def suffix(suffix: Boolean): String = js.native
    
    def tld(): String = js.native
    def tld(tld: String): URI = js.native
    def tld(tld: Boolean): String = js.native
    
    def unicode(): URI = js.native
    
    def userinfo(): String = js.native
    def userinfo(userinfo: String): URI = js.native
    
    def username(): String = js.native
    def username(uname: String): URI = js.native
  }
  
  @js.native
  trait URIOptions extends StObject {
    
    var fragment: js.UndefOr[String] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var query: js.UndefOr[String] = js.native
    
    var urn: js.UndefOr[Boolean] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object URIOptions {
    
    @scala.inline
    def apply(): URIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URIOptions]
    }
    
    @scala.inline
    implicit class URIOptionsMutableBuilder[Self <: URIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setUrn(value: Boolean): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrnUndefined: Self = StObject.set(x, "urn", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def uri(): URI = js.native
    }
    object JQuery {
      
      @scala.inline
      def apply(uri: () => URI): JQuery = {
        val __obj = js.Dynamic.literal(uri = js.Any.fromFunction0(uri))
        __obj.asInstanceOf[JQuery]
      }
      
      @scala.inline
      implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUri(value: () => URI): Self = StObject.set(x, "uri", js.Any.fromFunction0(value))
      }
    }
  }
}
