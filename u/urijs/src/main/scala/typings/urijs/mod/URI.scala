package typings.urijs.mod

import typings.std.RegExp
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URI extends js.Object {
  def absoluteTo(path: String): URI = js.native
  def absoluteTo(path: URI): URI = js.native
  def addFragment(fragment: String): URI = js.native
  def addQuery(qry: String): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addQuery(qry: String, value: js.Any): URI = js.native
  def addQuery(qry: js.Object): URI = js.native
  // tslint:disable-next-line:unified-signatures
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
  def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: js.Function1[/* repeated */ js.Any, _], withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Boolean, withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Double): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: Double, withinArray: Boolean): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: RegExp): Boolean = js.native
  def hasQuery(name: /*string | */ js.Any, value: RegExp, withinArray: Boolean): Boolean = js.native
  def hasSearch(name: /*string | */ js.Any): Boolean = js.native
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
  def is(
    qry: relative | absolute | urn | url | domain | name | sld | idn | punycode | ip | ip4 | ipv4 | inet4 | ip6 | ipv6 | inet6
  ): Boolean = js.native
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
  def query(qry: String): URI = js.native
  def query(qry: js.Function1[/* qryObject */ QueryDataMap, QueryDataMap]): URI = js.native
  def query(qry: Boolean): js.Object = js.native
  def query(qry: QueryDataMap): URI = js.native
  def readable(): String = js.native
  def relativeTo(path: String): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeQuery(name: String, value: String): URI = js.native
  def removeQuery(qry: String): URI = js.native
  def removeQuery(qry: js.Object): URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeSearch(name: String, value: String): URI = js.native
  def removeSearch(qry: String): URI = js.native
  def removeSearch(qry: js.Object): URI = js.native
  def resource(): String = js.native
  def resource(resource: String): URI = js.native
  def scheme(): String = js.native
  def scheme(protocol: String): URI = js.native
  def search(): String = js.native
  def search(qry: String): URI = js.native
  def search(qry: js.Function1[/* qryObject */ QueryDataMap, QueryDataMap]): URI = js.native
  def search(qry: Boolean): js.Any = js.native
  def search(qry: QueryDataMap): URI = js.native
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

