package typings.urlAssembler.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlAssembler extends js.Object {
  def param(key: String, value: String): UrlAssembler = js.native
  def param(key: String, value: String, strict: Boolean): UrlAssembler = js.native
  def param(params: StringDictionary[js.Any]): UrlAssembler = js.native
  def param(params: StringDictionary[js.Any], strict: Boolean): UrlAssembler = js.native
  def prefix(subPath: String): UrlAssembler = js.native
  def query(key: String, value: js.Any): UrlAssembler = js.native
  def query(params: StringDictionary[js.Any]): UrlAssembler = js.native
  def segment(subPathTemplate: String): UrlAssembler = js.native
  def template(template: String): UrlAssembler = js.native
  def toJSON(): String = js.native
}

