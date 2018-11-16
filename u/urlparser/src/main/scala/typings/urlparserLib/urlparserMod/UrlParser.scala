package typings
package urlparserLib.urlparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlParser extends js.Object {
  def host(): java.lang.String = js.native
  def host(o: UrlData): java.lang.String = js.native
  def parse(parse: java.lang.String): UrlData = js.native
  def path(): java.lang.String = js.native
  def path(o: UrlData): java.lang.String = js.native
  def query(): java.lang.String = js.native
  def query(o: UrlData): java.lang.String = js.native
  def url(): java.lang.String = js.native
  def url(o: UrlData): java.lang.String = js.native
}

