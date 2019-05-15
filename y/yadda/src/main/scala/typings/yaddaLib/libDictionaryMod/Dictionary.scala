package typings
package yaddaLib.libDictionaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionary extends js.Object {
  def define(term: java.lang.String, pattern: java.lang.String): this.type = js.native
  def define(term: java.lang.String, pattern: java.lang.String, converters: js.Array[yaddaLib.libMod.Converter]): this.type = js.native
  def define(term: java.lang.String, pattern: java.lang.String, converters: yaddaLib.libMod.Converter): this.type = js.native
  def define(term: java.lang.String, pattern: stdLib.RegExp): this.type = js.native
  def define(term: java.lang.String, pattern: stdLib.RegExp, converters: js.Array[yaddaLib.libMod.Converter]): this.type = js.native
  def define(term: java.lang.String, pattern: stdLib.RegExp, converters: yaddaLib.libMod.Converter): this.type = js.native
  def merge(other: Dictionary): Dictionary = js.native
}

