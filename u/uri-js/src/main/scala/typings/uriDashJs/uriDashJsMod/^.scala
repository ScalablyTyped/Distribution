package typings.uriDashJs.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uri-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def equal(uriA: String, uriB: String): Boolean = js.native
  def equal(uriA: String, uriB: String, options: URIOptions): Boolean = js.native
  def equal(uriA: URIComponents, uriB: URIComponents): Boolean = js.native
  def equal(uriA: URIComponents, uriB: URIComponents, options: URIOptions): Boolean = js.native
  def escapeComponent(str: String): String = js.native
  def escapeComponent(str: String, options: URIOptions): String = js.native
  def normalize(uri: String): String = js.native
  def normalize(uri: String, options: URIOptions): String = js.native
  def normalize(uri: URIComponents): URIComponents = js.native
  def normalize(uri: URIComponents, options: URIOptions): URIComponents = js.native
  def parse(uriString: String): URIComponents = js.native
  def parse(uriString: String, options: URIOptions): URIComponents = js.native
  def pctDecChars(str: String): String = js.native
  def pctEncChar(chr: String): String = js.native
  def removeDotSegments(input: String): String = js.native
  def resolve(baseURI: String, relativeURI: String): String = js.native
  def resolve(baseURI: String, relativeURI: String, options: URIOptions): String = js.native
  def resolveComponents(base: URIComponents, relative: URIComponents): URIComponents = js.native
  def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions): URIComponents = js.native
  def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions, skipNormalization: Boolean): URIComponents = js.native
  def serialize(components: URIComponents): String = js.native
  def serialize(components: URIComponents, options: URIOptions): String = js.native
  def unescapeComponent(str: String): String = js.native
  def unescapeComponent(str: String, options: URIOptions): String = js.native
}

