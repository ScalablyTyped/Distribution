package typings.validator.validatorMod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.validator.validatorStrings.md4
  - typings.validator.validatorStrings.md5
  - typings.validator.validatorStrings.sha1
  - typings.validator.validatorStrings.sha256
  - typings.validator.validatorStrings.sha384
  - typings.validator.validatorStrings.sha512
  - typings.validator.validatorStrings.ripemd128
  - typings.validator.validatorStrings.ripemd160
  - typings.validator.validatorStrings.tiger128
  - typings.validator.validatorStrings.tiger160
  - typings.validator.validatorStrings.tiger192
  - typings.validator.validatorStrings.crc32
  - typings.validator.validatorStrings.crc32b
*/
trait HashAlgorithm extends js.Object

object HashAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crc32: typings.validator.validatorStrings.crc32 = this.cast("crc32")
  @scala.inline
  def crc32b: typings.validator.validatorStrings.crc32b = this.cast("crc32b")
  @scala.inline
  def md4: typings.validator.validatorStrings.md4 = this.cast("md4")
  @scala.inline
  def md5: typings.validator.validatorStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd128: typings.validator.validatorStrings.ripemd128 = this.cast("ripemd128")
  @scala.inline
  def ripemd160: typings.validator.validatorStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def sha1: typings.validator.validatorStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typings.validator.validatorStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typings.validator.validatorStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typings.validator.validatorStrings.sha512 = this.cast("sha512")
  @scala.inline
  def tiger128: typings.validator.validatorStrings.tiger128 = this.cast("tiger128")
  @scala.inline
  def tiger160: typings.validator.validatorStrings.tiger160 = this.cast("tiger160")
  @scala.inline
  def tiger192: typings.validator.validatorStrings.tiger192 = this.cast("tiger192")
}

