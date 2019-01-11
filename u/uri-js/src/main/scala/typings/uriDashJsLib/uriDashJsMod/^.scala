package typings
package uriDashJsLib.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uri-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def equal(uriA: java.lang.String, uriB: java.lang.String): scala.Boolean = js.native
  def equal(uriA: java.lang.String, uriB: java.lang.String, options: uriDashJsLib.uriDashJsMod.URIOptions): scala.Boolean = js.native
  def equal(uriA: uriDashJsLib.uriDashJsMod.URIComponents, uriB: uriDashJsLib.uriDashJsMod.URIComponents): scala.Boolean = js.native
  def equal(
    uriA: uriDashJsLib.uriDashJsMod.URIComponents,
    uriB: uriDashJsLib.uriDashJsMod.URIComponents,
    options: uriDashJsLib.uriDashJsMod.URIOptions
  ): scala.Boolean = js.native
  def escapeComponent(str: java.lang.String): java.lang.String = js.native
  def escapeComponent(str: java.lang.String, options: uriDashJsLib.uriDashJsMod.URIOptions): java.lang.String = js.native
  def normalize(uri: java.lang.String): java.lang.String = js.native
  def normalize(uri: java.lang.String, options: uriDashJsLib.uriDashJsMod.URIOptions): java.lang.String = js.native
  def normalize(uri: uriDashJsLib.uriDashJsMod.URIComponents): uriDashJsLib.uriDashJsMod.URIComponents = js.native
  def normalize(uri: uriDashJsLib.uriDashJsMod.URIComponents, options: uriDashJsLib.uriDashJsMod.URIOptions): uriDashJsLib.uriDashJsMod.URIComponents = js.native
  def parse(uriString: java.lang.String): uriDashJsLib.uriDashJsMod.URIComponents = js.native
  def parse(uriString: java.lang.String, options: uriDashJsLib.uriDashJsMod.URIOptions): uriDashJsLib.uriDashJsMod.URIComponents = js.native
  def pctDecChars(str: java.lang.String): java.lang.String = js.native
  def pctEncChar(chr: java.lang.String): java.lang.String = js.native
  def removeDotSegments(input: java.lang.String): java.lang.String = js.native
  def resolve(baseURI: java.lang.String, relativeURI: java.lang.String): java.lang.String = js.native
  def resolve(
    baseURI: java.lang.String,
    relativeURI: java.lang.String,
    options: uriDashJsLib.uriDashJsMod.URIOptions
  ): java.lang.String = js.native
  def resolveComponents(base: uriDashJsLib.uriDashJsMod.URIComponents, relative: uriDashJsLib.uriDashJsMod.URIComponents): uriDashJsLib.uriDashJsMod.URIComponents = js.native
  def resolveComponents(
    base: uriDashJsLib.uriDashJsMod.URIComponents,
    relative: uriDashJsLib.uriDashJsMod.URIComponents,
    options: uriDashJsLib.uriDashJsMod.URIOptions
  ): uriDashJsLib.uriDashJsMod.URIComponents = js.native
  def resolveComponents(
    base: uriDashJsLib.uriDashJsMod.URIComponents,
    relative: uriDashJsLib.uriDashJsMod.URIComponents,
    options: uriDashJsLib.uriDashJsMod.URIOptions,
    skipNormalization: scala.Boolean
  ): uriDashJsLib.uriDashJsMod.URIComponents = js.native
  def serialize(components: uriDashJsLib.uriDashJsMod.URIComponents): java.lang.String = js.native
  def serialize(components: uriDashJsLib.uriDashJsMod.URIComponents, options: uriDashJsLib.uriDashJsMod.URIOptions): java.lang.String = js.native
  def unescapeComponent(str: java.lang.String): java.lang.String = js.native
  def unescapeComponent(str: java.lang.String, options: uriDashJsLib.uriDashJsMod.URIOptions): java.lang.String = js.native
}

