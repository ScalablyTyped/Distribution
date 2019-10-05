package typings.urijs.uri

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
  def absoluteTo(path: String): typings.urijs.uri.URI = js.native
  def absoluteTo(path: typings.urijs.uri.URI): typings.urijs.uri.URI = js.native
  def addFragment(fragment: String): typings.urijs.uri.URI = js.native
  def addQuery(qry: String): typings.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addQuery(qry: String, value: js.Any): typings.urijs.uri.URI = js.native
  def addQuery(qry: js.Object): typings.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def addSearch(key: String, value: js.Any): typings.urijs.uri.URI = js.native
  def addSearch(qry: String): typings.urijs.uri.URI = js.native
  def addSearch(qry: js.Object): typings.urijs.uri.URI = js.native
  def authority(): String = js.native
  def authority(authority: String): typings.urijs.uri.URI = js.native
  def directory(): String = js.native
  def directory(dir: String): typings.urijs.uri.URI = js.native
  def directory(dir: Boolean): String = js.native
  def domain(): String = js.native
  def domain(domain: String): typings.urijs.uri.URI = js.native
  def domain(domain: Boolean): String = js.native
  def duplicateQueryParameters(`val`: Boolean): typings.urijs.uri.URI = js.native
  def equals(): Boolean = js.native
  def equals(url: String): Boolean = js.native
  def equals(url: typings.urijs.uri.URI): Boolean = js.native
  def filename(): String = js.native
  def filename(file: String): typings.urijs.uri.URI = js.native
  def filename(file: Boolean): String = js.native
  def fragment(): String = js.native
  def fragment(fragment: String): typings.urijs.uri.URI = js.native
  def fragmentPrefix(prefix: String): typings.urijs.uri.URI = js.native
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
  def hash(hash: String): typings.urijs.uri.URI = js.native
  def host(): String = js.native
  def host(host: String): typings.urijs.uri.URI = js.native
  def hostname(): String = js.native
  def hostname(hostname: String): typings.urijs.uri.URI = js.native
  def href(): String = js.native
  def href(url: String): Unit = js.native
  def is(
    qry: relative | absolute | urn | url | domain | name | sld | idn | punycode | ip | ip4 | ipv4 | inet4 | ip6 | ipv6 | inet6
  ): Boolean = js.native
  def iso8859(): typings.urijs.uri.URI = js.native
  def normalize(): typings.urijs.uri.URI = js.native
  def normalizeFragment(): typings.urijs.uri.URI = js.native
  def normalizeHash(): typings.urijs.uri.URI = js.native
  def normalizeHostname(): typings.urijs.uri.URI = js.native
  def normalizePath(): typings.urijs.uri.URI = js.native
  def normalizePathname(): typings.urijs.uri.URI = js.native
  def normalizePort(): typings.urijs.uri.URI = js.native
  def normalizeProtocol(): typings.urijs.uri.URI = js.native
  def normalizeQuery(): typings.urijs.uri.URI = js.native
  def normalizeSearch(): typings.urijs.uri.URI = js.native
  def origin(): String = js.native
  def origin(uri: String): typings.urijs.uri.URI = js.native
  def origin(uri: typings.urijs.uri.URI): typings.urijs.uri.URI = js.native
  def password(): String = js.native
  def password(pw: String): typings.urijs.uri.URI = js.native
  def path(): String = js.native
  def path(path: String): typings.urijs.uri.URI = js.native
  def path(path: Boolean): String = js.native
  def pathname(): String = js.native
  def pathname(path: String): typings.urijs.uri.URI = js.native
  def pathname(path: Boolean): String = js.native
  def port(): String = js.native
  def port(port: String): typings.urijs.uri.URI = js.native
  def protocol(): String = js.native
  def protocol(protocol: String): typings.urijs.uri.URI = js.native
  def query(): String = js.native
  def query(qry: String): typings.urijs.uri.URI = js.native
  def query(qry: js.Object): typings.urijs.uri.URI = js.native
  def query(qry: Boolean): js.Object = js.native
  def readable(): String = js.native
  def relativeTo(path: String): typings.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeQuery(name: String, value: String): typings.urijs.uri.URI = js.native
  def removeQuery(qry: String): typings.urijs.uri.URI = js.native
  def removeQuery(qry: js.Object): typings.urijs.uri.URI = js.native
  // tslint:disable-next-line:unified-signatures
  def removeSearch(name: String, value: String): typings.urijs.uri.URI = js.native
  def removeSearch(qry: String): typings.urijs.uri.URI = js.native
  def removeSearch(qry: js.Object): typings.urijs.uri.URI = js.native
  def resource(): String = js.native
  def resource(resource: String): typings.urijs.uri.URI = js.native
  def scheme(): String = js.native
  def scheme(protocol: String): typings.urijs.uri.URI = js.native
  def search(): String = js.native
  def search(qry: String): typings.urijs.uri.URI = js.native
  def search(qry: js.Object): typings.urijs.uri.URI = js.native
  def search(qry: Boolean): js.Any = js.native
  def segment(): js.Array[String] = js.native
  def segment(position: Double): js.UndefOr[String] = js.native
  def segment(position: Double, level: String): typings.urijs.uri.URI = js.native
  def segment(segments: String): typings.urijs.uri.URI = js.native
  def segment(segments: js.Array[String]): typings.urijs.uri.URI = js.native
  def segmentCoded(): js.Array[String] = js.native
  def segmentCoded(position: Double): String = js.native
  def segmentCoded(position: Double, level: String): typings.urijs.uri.URI = js.native
  def segmentCoded(segments: String): typings.urijs.uri.URI = js.native
  def segmentCoded(segments: js.Array[String]): typings.urijs.uri.URI = js.native
  def setQuery(key: String, value: String): typings.urijs.uri.URI = js.native
  def setQuery(qry: js.Object): typings.urijs.uri.URI = js.native
  def setSearch(key: String, value: String): typings.urijs.uri.URI = js.native
  def setSearch(qry: js.Object): typings.urijs.uri.URI = js.native
  def subdomain(): String = js.native
  def subdomain(subdomain: String): typings.urijs.uri.URI = js.native
  def suffix(): String = js.native
  def suffix(suffix: String): typings.urijs.uri.URI = js.native
  def suffix(suffix: Boolean): String = js.native
  def tld(): String = js.native
  def tld(tld: String): typings.urijs.uri.URI = js.native
  def tld(tld: Boolean): String = js.native
  def unicode(): typings.urijs.uri.URI = js.native
  def userinfo(): String = js.native
  def userinfo(userinfo: String): typings.urijs.uri.URI = js.native
  def username(): String = js.native
  def username(uname: String): typings.urijs.uri.URI = js.native
}

