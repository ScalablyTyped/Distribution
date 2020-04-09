package typings.validator

import typings.validator.mod.validator.IPVersion
import typings.validator.mod.validator.ISBNVersion
import typings.validator.mod.validator.UUIDVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object validatorNumbers {
  @js.native
  sealed trait `10` extends ISBNVersion
  
  @js.native
  sealed trait `13` extends ISBNVersion
  
  @js.native
  sealed trait `3` extends UUIDVersion
  
  @js.native
  sealed trait `4`
    extends IPVersion
       with UUIDVersion
  
  @js.native
  sealed trait `5` extends UUIDVersion
  
  @js.native
  sealed trait `6` extends IPVersion
  
  @scala.inline
  def `10`: `10` = 10.asInstanceOf[`10`]
  @scala.inline
  def `13`: `13` = 13.asInstanceOf[`13`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
}

