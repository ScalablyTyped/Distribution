package typings
package urlDashAssemblerLib.urlDashAssemblerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlAssembler extends js.Object {
  def param(key: java.lang.String, value: java.lang.String): UrlAssembler = js.native
  def param(key: java.lang.String, value: java.lang.String, strict: scala.Boolean): UrlAssembler = js.native
  def param(params: ScalablyTyped.runtime.StringDictionary[js.Any]): UrlAssembler = js.native
  def param(params: ScalablyTyped.runtime.StringDictionary[js.Any], strict: scala.Boolean): UrlAssembler = js.native
  def prefix(subPath: java.lang.String): UrlAssembler = js.native
  def query(key: java.lang.String, value: js.Any): UrlAssembler = js.native
  def query(params: ScalablyTyped.runtime.StringDictionary[js.Any]): UrlAssembler = js.native
  def segment(subPathTemplate: java.lang.String): UrlAssembler = js.native
  def template(template: java.lang.String): UrlAssembler = js.native
  def toJSON(): java.lang.String = js.native
}

