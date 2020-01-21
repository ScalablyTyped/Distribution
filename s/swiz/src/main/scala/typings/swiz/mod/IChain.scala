package typings.swiz.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChain extends IValveSchemaMember {
  def contains(arg: js.Any): IChain = js.native
  def custom(name: String): IChain = js.native
  def entityDecode(): IChain = js.native
  def entityEncode(): IChain = js.native
  def enumerated(map: js.Any): IChain = js.native
  def equals(arg: js.Any): IChain = js.native
  def getValidatorAtPos(pos: Double): IValidator = js.native
  def getValidatorPos(name: String): Double = js.native
  def hasValidator(name: String): Double = js.native
  def ifNull(replace: String): IChain = js.native
  def immutable(): IChain = js.native
  def inArray(array: js.Array[_]): IChain = js.native
  def is(pattern: String): IChain = js.native
  def is(pattern: String, modifiers: String): IChain = js.native
  def isAddressPair(): IChain = js.native
  def isAllowedFQDNOrIP(): IChain = js.native
  def isAllowedFQDNOrIP(blacklist: js.Array[String]): IChain = js.native
  def isAlpha(): IChain = js.native
  def isAlphanumeric(): IChain = js.native
  def isArray(chain: IChain): IChain = js.native
  def isBoolean(): IChain = js.native
  def isCIDR(): IChain = js.native
  def isDecimal(): IChain = js.native
  def isEmail(): IChain = js.native
  def isFloat(): IChain = js.native
  def isHash(keyChain: IChain, valueChain: IChain): IChain = js.native
  def isHostname(): IChain = js.native
  def isHostnameOrIp(): IChain = js.native
  def isIP(): IChain = js.native
  def isIPv4(): IChain = js.native
  def isIPv6(): IChain = js.native
  def isInt(): IChain = js.native
  def isLowercase(): IChain = js.native
  def isNull(): IChain = js.native
  def isNumeric(): IChain = js.native
  def isPort(): IChain = js.native
  def isString(): IChain = js.native
  def isUnique(): IChain = js.native
  def isUppercase(): IChain = js.native
  def isUrl(): IChain = js.native
  def isV1UUID(): IChain = js.native
  def len(min: Double): IChain = js.native
  def len(min: Double, max: Double): IChain = js.native
  def ltrim(): IChain = js.native
  def ltrim(chars: String): IChain = js.native
  def not(pattern: String, modifiers: String): IChain = js.native
  def notContains(arg: js.Any): IChain = js.native
  def notEmpty(): IChain = js.native
  def notIPBlacklisted(): IChain = js.native
  def notIn(values: js.Array[_]): IChain = js.native
  def notIn(values: js.Array[_], caseSensitive: Boolean): IChain = js.native
  def notNull(): IChain = js.native
  def notRegex(pattern: String): IChain = js.native
  def notRegex(pattern: String, modifiers: String): IChain = js.native
  def notRegex(pattern: RegExp): IChain = js.native
  def numItems(min: Double, max: Double): IChain = js.native
  def optional(): IChain = js.native
  def range(min: js.Any, max: js.Any): IChain = js.native
  def regex(pattern: String): IChain = js.native
  def regex(pattern: String, modifiers: String): IChain = js.native
  def regex(pattern: RegExp): IChain = js.native
  def rename(target: String): IChain = js.native
  def rtrim(chars: String): IChain = js.native
  def toBoolean(): IChain = js.native
  def toBooleanStrict(): IChain = js.native
  def toFloat(): IChain = js.native
  def toInt(): IChain = js.native
  def toUnique(): IChain = js.native
  def trim(): IChain = js.native
  def trim(chars: String): IChain = js.native
  def updateRequired(): IChain = js.native
  def xss(): IChain = js.native
  def xss(is_image: Boolean): IChain = js.native
}

