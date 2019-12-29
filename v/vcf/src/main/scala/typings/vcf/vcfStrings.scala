package typings.vcf

import typings.vcf.vcfMod.CardVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vcfStrings {
  @js.native
  sealed trait `2Dot1` extends CardVersion
  
  @js.native
  sealed trait `3Dot0` extends CardVersion
  
  @js.native
  sealed trait `4Dot0` extends CardVersion
  
  @js.native
  sealed trait CarriagereturnLinefeed extends js.Object
  
  @js.native
  sealed trait Dotvcf extends js.Object
  
  @js.native
  sealed trait vcard extends js.Object
  
  @scala.inline
  def `2Dot1`: `2Dot1` = "2.1".asInstanceOf[`2Dot1`]
  @scala.inline
  def `3Dot0`: `3Dot0` = "3.0".asInstanceOf[`3Dot0`]
  @scala.inline
  def `4Dot0`: `4Dot0` = "4.0".asInstanceOf[`4Dot0`]
  @scala.inline
  def CarriagereturnLinefeed: CarriagereturnLinefeed = "\r\n".asInstanceOf[CarriagereturnLinefeed]
  @scala.inline
  def Dotvcf: Dotvcf = ".vcf".asInstanceOf[Dotvcf]
  @scala.inline
  def vcard: vcard = "vcard".asInstanceOf[vcard]
}

