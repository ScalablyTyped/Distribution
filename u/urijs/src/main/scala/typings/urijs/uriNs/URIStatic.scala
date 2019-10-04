package typings.urijs.uriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.urijs.Anon_Hostname
import typings.urijs.Anon_HostnamePort
import typings.urijs.Anon_Password
import typings.urijs.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URIStatic
  extends Instantiable0[typings.urijs.uriNs.URI]
     with Instantiable1[
      (/* value */ HTMLElement) | (/* value */ String) | (/* value */ URIOptions), 
      typings.urijs.uriNs.URI
    ] {
  /**
    * @description Wrapper for `URITemplate#expand`. Only present after
    *              importing `urijs/src/URITemplate` explicitly.
    */
  var expand: js.UndefOr[
    js.Function2[/* template */ String, /* vals */ js.Object, typings.urijs.uriNs.URI]
  ] = js.native
  def apply(): typings.urijs.uriNs.URI = js.native
  def apply(value: String): typings.urijs.uriNs.URI = js.native
  def apply(value: HTMLElement): typings.urijs.uriNs.URI = js.native
  def apply(value: URIOptions): typings.urijs.uriNs.URI = js.native
  def addQuery(data: js.Object, prop: String, value: String): js.Object = js.native
  def addQuery(data: js.Object, qryObj: js.Object): js.Object = js.native
  def build(parts: URIOptions): String = js.native
  def buildAuthority(parts: Anon_Hostname): String = js.native
  def buildHost(parts: Anon_HostnamePort): String = js.native
  def buildQuery(qry: js.Object): String = js.native
  def buildQuery(qry: js.Object, duplicates: Boolean): String = js.native
  def buildUserinfo(parts: Anon_Password): String = js.native
  def commonPath(path1: String, path2: String): String = js.native
  def decode(str: String): String = js.native
  def decodeQuery(qry: String): String = js.native
  def encode(str: String): String = js.native
  def encodeQuery(qry: String): String = js.native
  def encodeReserved(str: String): String = js.native
  def iso8859(): Unit = js.native
  def joinPaths(paths: (String | typings.urijs.uriNs.URI)*): typings.urijs.uriNs.URI = js.native
  def parse(url: String): Parts = js.native
  def parseAuthority(url: String, parts: Anon_Hostname): String = js.native
  def parseHost(url: String, parts: Anon_HostnamePort): String = js.native
  def parseQuery(url: String): js.Object = js.native
  def parseUserinfo(url: String, parts: Anon_Password): String = js.native
  def removeQuery(data: js.Object, prop: String, value: String): js.Object = js.native
  def removeQuery(data: js.Object, props: js.Array[String]): js.Object = js.native
  def removeQuery(data: js.Object, props: js.Object): js.Object = js.native
  def unicode(): Unit = js.native
  def withinString(source: String, func: js.Function1[/* url */ String, String]): String = js.native
}

