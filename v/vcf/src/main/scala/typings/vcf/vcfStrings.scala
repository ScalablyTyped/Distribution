package typings.vcf

import typings.vcf.vcfMod.CardVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vcfStrings {
  @js.native
  sealed trait `2DOT1` extends CardVersion
  
  @js.native
  sealed trait `3DOT0` extends CardVersion
  
  @js.native
  sealed trait `4DOT0` extends CardVersion
  
  @js.native
  sealed trait BACKSLASHrBACKSLASHn extends js.Object
  
  @js.native
  sealed trait DOTvcf extends js.Object
  
  @js.native
  sealed trait vcard extends js.Object
  
  @scala.inline
  def `2DOT1`: `2DOT1` = "2.1".asInstanceOf[`2DOT1`]
  @scala.inline
  def `3DOT0`: `3DOT0` = "3.0".asInstanceOf[`3DOT0`]
  @scala.inline
  def `4DOT0`: `4DOT0` = "4.0".asInstanceOf[`4DOT0`]
  @scala.inline
  def BACKSLASHrBACKSLASHn: BACKSLASHrBACKSLASHn = "\r\n".asInstanceOf[BACKSLASHrBACKSLASHn]
  @scala.inline
  def DOTvcf: DOTvcf = ".vcf".asInstanceOf[DOTvcf]
  @scala.inline
  def vcard: vcard = "vcard".asInstanceOf[vcard]
}

