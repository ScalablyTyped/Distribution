package typings.urlParamsParser

import typings.urlParamsParser.urlParserMod.UrlParserResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url-params-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def UrlParser(urlString: String): UrlParserResult = js.native
  def UrlParser(urlString: String, namedUrl: String): UrlParserResult = js.native
}

