package typings
package uriDashJsLib.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uri-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def equal(uriA: java.lang.String, uriB: java.lang.String): scala.Boolean = js.native
  def equal(uriA: java.lang.String, uriB: java.lang.String, options: URIOptions): scala.Boolean = js.native
  def equal(uriA: URIComponents, uriB: URIComponents): scala.Boolean = js.native
  def equal(uriA: URIComponents, uriB: URIComponents, options: URIOptions): scala.Boolean = js.native
  def escapeComponent(str: java.lang.String): java.lang.String = js.native
  def escapeComponent(str: java.lang.String, options: URIOptions): java.lang.String = js.native
  def normalize(uri: java.lang.String): java.lang.String = js.native
  def normalize(uri: java.lang.String, options: URIOptions): java.lang.String = js.native
  def normalize(uri: URIComponents): URIComponents = js.native
  def normalize(uri: URIComponents, options: URIOptions): URIComponents = js.native
  def parse(uriString: java.lang.String): URIComponents = js.native
  def parse(uriString: java.lang.String, options: URIOptions): URIComponents = js.native
  def pctDecChars(str: java.lang.String): java.lang.String = js.native
  def pctEncChar(chr: java.lang.String): java.lang.String = js.native
  def removeDotSegments(input: java.lang.String): java.lang.String = js.native
  def resolve(baseURI: java.lang.String, relativeURI: java.lang.String): java.lang.String = js.native
  def resolve(baseURI: java.lang.String, relativeURI: java.lang.String, options: URIOptions): java.lang.String = js.native
  def resolveComponents(base: URIComponents, relative: URIComponents): URIComponents = js.native
  def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions): URIComponents = js.native
  def resolveComponents(
    base: URIComponents,
    relative: URIComponents,
    options: URIOptions,
    skipNormalization: scala.Boolean
  ): URIComponents = js.native
  def serialize(components: URIComponents): java.lang.String = js.native
  def serialize(components: URIComponents, options: URIOptions): java.lang.String = js.native
  def unescapeComponent(str: java.lang.String): java.lang.String = js.native
  def unescapeComponent(str: java.lang.String, options: URIOptions): java.lang.String = js.native
}

