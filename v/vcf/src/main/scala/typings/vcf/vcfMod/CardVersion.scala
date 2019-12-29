package typings.vcf.vcfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vcf.vcfStrings.`2Dot1`
  - typings.vcf.vcfStrings.`3Dot0`
  - typings.vcf.vcfStrings.`4Dot0`
*/
trait CardVersion extends js.Object

object CardVersion {
  @scala.inline
  def `2Dot1`: typings.vcf.vcfStrings.`2Dot1` = this.cast("2.1")
  @scala.inline
  def `3Dot0`: typings.vcf.vcfStrings.`3Dot0` = this.cast("3.0")
  @scala.inline
  def `4Dot0`: typings.vcf.vcfStrings.`4Dot0` = this.cast("4.0")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

