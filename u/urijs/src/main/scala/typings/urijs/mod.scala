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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): URI = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[URI]
  inline def apply(value: String): URI = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[URI]
  inline def apply(value: typings.urijs.mod.HTMLElement): URI = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[URI]
  inline def apply(value: URIOptions): URI = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[URI]
  
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("urijs", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with URI {
    def this(value: String) = this()
    def this(value: typings.urijs.mod.HTMLElement) = this()
    def this(value: URIOptions) = this()
  }
  
  inline def addQuery(data: js.Object, prop: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuery")(data.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def addQuery(data: js.Object, qryObj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuery")(data.asInstanceOf[js.Any], qryObj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def build(parts: URIOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def buildAuthority(parts: Hostname): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAuthority")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def buildHost(parts: Port): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHost")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def buildQuery(qry: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQuery")(qry.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def buildQuery(qry: js.Object, duplicates: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQuery")(qry.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildUserinfo(parts: Password): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUserinfo")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def commonPath(path1: String, path2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commonPath")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeQuery(qry: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeQuery")(qry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("urijs", "duplicateQueryParameters")
  @js.native
  def duplicateQueryParameters: Boolean = js.native
  inline def duplicateQueryParameters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duplicateQueryParameters")(x.asInstanceOf[js.Any])
  
  inline def encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeQuery(qry: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeQuery")(qry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeReserved(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeReserved")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("urijs", "escapeQuerySpace")
  @js.native
  def escapeQuerySpace: Boolean = js.native
  inline def escapeQuerySpace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeQuerySpace")(x.asInstanceOf[js.Any])
  
  /**
    * @description Wrapper for `URITemplate#expand`. Only present after
    *              importing `urijs/src/URITemplate` explicitly.
    */
  @JSImport("urijs", "expand")
  @js.native
  def expand: js.UndefOr[js.Function2[/* template */ String, /* vals */ js.Object, String]] = js.native
  inline def expand_=(x: js.UndefOr[js.Function2[/* template */ String, /* vals */ js.Object, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
  
  inline def iso8859(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8859")().asInstanceOf[Unit]
  
  inline def joinPaths(paths: (String | URI)*): URI = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPaths")(paths.asInstanceOf[js.Any]).asInstanceOf[URI]
  
  inline def parse(url: String): Parts = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[Parts]
  
  inline def parseAuthority(url: String, parts: Hostname): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthority")(url.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseHost(url: String, parts: Port): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(url.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseQuery(url: String): QueryDataMap = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQuery")(url.asInstanceOf[js.Any]).asInstanceOf[QueryDataMap]
  
  inline def parseUserinfo(url: String, parts: Password): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUserinfo")(url.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("urijs", "preventInvalidHostname")
  @js.native
  def preventInvalidHostname: Boolean = js.native
  inline def preventInvalidHostname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventInvalidHostname")(x.asInstanceOf[js.Any])
  
  inline def removeQuery(data: js.Object, prop: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQuery")(data.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def removeQuery(data: js.Object, props: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQuery")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def removeQuery(data: js.Object, props: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQuery")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def unicode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unicode")().asInstanceOf[Unit]
  
  inline def withinString(source: String, func: js.Function1[/* url */ String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withinString")(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[String]
  
  // Compatability with node.js
  // tslint:disable-next-line:no-empty-interface
  trait HTMLElement extends StObject
  
  trait Parts
    extends StObject
       with URIOptions {
    
    var duplicateQueryParameters: Boolean
    
    var escapeQuerySpace: Boolean
    
    var preventInvalidHostname: Boolean
  }
  object Parts {
    
    inline def apply(duplicateQueryParameters: Boolean, escapeQuerySpace: Boolean, preventInvalidHostname: Boolean): Parts = {
      val __obj = js.Dynamic.literal(duplicateQueryParameters = duplicateQueryParameters.asInstanceOf[js.Any], escapeQuerySpace = escapeQuerySpace.asInstanceOf[js.Any], preventInvalidHostname = preventInvalidHostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parts]
    }
    
    extension [Self <: Parts](x: Self) {
      
      inline def setDuplicateQueryParameters(value: Boolean): Self = StObject.set(x, "duplicateQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setEscapeQuerySpace(value: Boolean): Self = StObject.set(x, "escapeQuerySpace", value.asInstanceOf[js.Any])
      
      inline def setPreventInvalidHostname(value: Boolean): Self = StObject.set(x, "preventInvalidHostname", value.asInstanceOf[js.Any])
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
    def hasQuery(name: /*string | */ js.Any, value: String): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: String, withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String]): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String], withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
    def hasQuery(
      name: /*string | */ js.Any,
      value: js.Function1[/* repeated */ js.Any, js.Any],
      withinArray: Boolean
    ): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Boolean, withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Double): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Double, withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: Unit, withinArray: Boolean): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: RegExp): Boolean = js.native
    def hasQuery(name: /*string | */ js.Any, value: RegExp, withinArray: Boolean): Boolean = js.native
    
    def hasSearch(name: /*string | */ js.Any): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: String): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: String, withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String]): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.Array[Boolean | Double | String], withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, js.Any]): Boolean = js.native
    def hasSearch(
      name: /*string | */ js.Any,
      value: js.Function1[/* repeated */ js.Any, js.Any],
      withinArray: Boolean
    ): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Boolean, withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Double): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Double, withinArray: Boolean): Boolean = js.native
    def hasSearch(name: /*string | */ js.Any, value: Unit, withinArray: Boolean): Boolean = js.native
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
  
  trait URIOptions extends StObject {
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var urn: js.UndefOr[Boolean] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object URIOptions {
    
    inline def apply(): URIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URIOptions]
    }
    
    extension [Self <: URIOptions](x: Self) {
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setUrn(value: Boolean): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
      
      inline def setUrnUndefined: Self = StObject.set(x, "urn", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  object global {
    
    trait JQuery extends StObject {
      
      def uri(): URI
    }
    object JQuery {
      
      inline def apply(uri: () => URI): JQuery = {
        val __obj = js.Dynamic.literal(uri = js.Any.fromFunction0(uri))
        __obj.asInstanceOf[JQuery]
      }
      
      extension [Self <: JQuery](x: Self) {
        
        inline def setUri(value: () => URI): Self = StObject.set(x, "uri", js.Any.fromFunction0(value))
      }
    }
  }
}
