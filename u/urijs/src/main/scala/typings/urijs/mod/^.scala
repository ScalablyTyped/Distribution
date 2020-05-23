package typings.urijs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.urijs.anon.Hostname
import typings.urijs.anon.Password
import typings.urijs.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urijs", JSImport.Namespace)
@js.native
object ^ extends TopLevel[
      Instantiable0[URI] with (Instantiable1[/* value */ String, URI]) with (Instantiable1[/* value */ HTMLElement, URI]) with (Instantiable1[/* value */ URIOptions, URI])
    ] {
  var duplicateQueryParameters: Boolean = js.native
  var escapeQuerySpace: Boolean = js.native
  /**
    * @description Wrapper for `URITemplate#expand`. Only present after
    *              importing `urijs/src/URITemplate` explicitly.
    */
  var expand: js.UndefOr[js.Function2[/* template */ String, /* vals */ js.Object, String]] = js.native
  var preventInvalidHostname: Boolean = js.native
  def apply(): URI = js.native
  def apply(value: String): URI = js.native
  def apply(value: HTMLElement): URI = js.native
  def apply(value: URIOptions): URI = js.native
  def addQuery(data: js.Object, prop: String, value: String): js.Object = js.native
  def addQuery(data: js.Object, qryObj: js.Object): js.Object = js.native
  def build(parts: URIOptions): String = js.native
  def buildAuthority(parts: Hostname): String = js.native
  def buildHost(parts: Port): String = js.native
  def buildQuery(qry: js.Object): String = js.native
  def buildQuery(qry: js.Object, duplicates: Boolean): String = js.native
  def buildUserinfo(parts: Password): String = js.native
  def commonPath(path1: String, path2: String): String = js.native
  def decode(str: String): String = js.native
  def decodeQuery(qry: String): String = js.native
  def encode(str: String): String = js.native
  def encodeQuery(qry: String): String = js.native
  def encodeReserved(str: String): String = js.native
  def iso8859(): Unit = js.native
  def joinPaths(paths: (String | URI)*): URI = js.native
  def parse(url: String): Parts = js.native
  def parseAuthority(url: String, parts: Hostname): String = js.native
  def parseHost(url: String, parts: Port): String = js.native
  def parseQuery(url: String): js.Object = js.native
  def parseUserinfo(url: String, parts: Password): String = js.native
  def removeQuery(data: js.Object, prop: String, value: String): js.Object = js.native
  def removeQuery(data: js.Object, props: js.Array[String]): js.Object = js.native
  def removeQuery(data: js.Object, props: js.Object): js.Object = js.native
  def unicode(): Unit = js.native
  def withinString(source: String, func: js.Function1[/* url */ String, String]): String = js.native
}

