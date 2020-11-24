package typings.urlparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlParser extends js.Object {
  
  def host(): String = js.native
  def host(o: UrlData): String = js.native
  
  def parse(parse: String): UrlData = js.native
  
  def path(): String = js.native
  def path(o: UrlData): String = js.native
  
  def query(): String = js.native
  def query(o: UrlData): String = js.native
  
  def url(): String = js.native
  def url(o: UrlData): String = js.native
}
