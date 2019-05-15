package typings
package yaddaLib.libLocalisationLanguageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language[TLibrary /* <: Library */] extends js.Object {
  var is_language: yaddaLib.yaddaLibNumbers.`true` = js.native
  def library(): TLibrary = js.native
  def library(dictionary: yaddaLib.libDictionaryMod.^): TLibrary = js.native
  def localise(keyword: java.lang.String): java.lang.String = js.native
  def localise_library(library: Library): TLibrary = js.native
}

