package typings
package urijsLib.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URIStatic
  extends ScalablyTyped.runtime.Instantiable0[URI]
     with ScalablyTyped.runtime.Instantiable1[
      (/* value */ java.lang.String) | (/* value */ URIOptions) | (/* value */ stdLib.HTMLElement), 
      URI
    ] {
  def apply(): URI = js.native
  def apply(value: java.lang.String): URI = js.native
  def apply(value: stdLib.HTMLElement): URI = js.native
  def apply(value: URIOptions): URI = js.native
  def addQuery(data: js.Object, prop: java.lang.String, value: java.lang.String): js.Object = js.native
  def addQuery(data: js.Object, qryObj: js.Object): js.Object = js.native
  def build(parts: urijsLib.Anon_Path): java.lang.String = js.native
  def buildAuthority(parts: urijsLib.Anon_UsernameHostname): java.lang.String = js.native
  def buildHost(parts: urijsLib.Anon_Hostname): java.lang.String = js.native
  def buildQuery(qry: js.Object): java.lang.String = js.native
  def buildQuery(qry: js.Object, duplicates: scala.Boolean): java.lang.String = js.native
  def buildUserinfo(parts: urijsLib.Anon_Username): java.lang.String = js.native
  def commonPath(path1: java.lang.String, path2: java.lang.String): java.lang.String = js.native
  def decode(str: java.lang.String): java.lang.String = js.native
  def decodeQuery(qry: java.lang.String): java.lang.String = js.native
  def encode(str: java.lang.String): java.lang.String = js.native
  def encodeQuery(qry: java.lang.String): java.lang.String = js.native
  def encodeReserved(str: java.lang.String): java.lang.String = js.native
  def expand(template: java.lang.String, vals: js.Object): URI = js.native
  def iso8859(): scala.Unit = js.native
  def joinPaths(paths: (java.lang.String | URI)*): URI = js.native
  def parse(url: java.lang.String): urijsLib.Anon_Path = js.native
  def parseAuthority(url: java.lang.String, parts: urijsLib.Anon_UsernameHostname): java.lang.String = js.native
  def parseHost(url: java.lang.String, parts: urijsLib.Anon_Hostname): java.lang.String = js.native
  def parseQuery(url: java.lang.String): js.Object = js.native
  def parseUserinfo(url: java.lang.String, parts: urijsLib.Anon_Username): java.lang.String = js.native
  def removeQuery(data: js.Object, prop: java.lang.String, value: java.lang.String): js.Object = js.native
  def removeQuery(data: js.Object, props: js.Array[java.lang.String]): js.Object = js.native
  def removeQuery(data: js.Object, props: js.Object): js.Object = js.native
  def unicode(): scala.Unit = js.native
  def withinString(source: java.lang.String, func: js.Function1[/* url */ java.lang.String, java.lang.String]): java.lang.String = js.native
}

