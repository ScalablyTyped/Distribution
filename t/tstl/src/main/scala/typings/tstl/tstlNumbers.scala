package typings.tstl

import typings.tstl.accessTypeMod.AccessType
import typings.tstl.colorMod.Color
import typings.tstl.lockTypeMod.LockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tstlNumbers {
  @js.native
  sealed trait `0`
    extends AccessType
       with Color
       with LockType
  
  @js.native
  sealed trait `1`
    extends AccessType
       with Color
       with LockType
  
  @js.native
  sealed trait `1.5` extends js.Object
  
  @js.native
  sealed trait `36` extends js.Object
  
  @js.native
  sealed trait `8` extends js.Object
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `1.5`: `1.5` = 1.5.asInstanceOf[`1.5`]
  @scala.inline
  def `36`: `36` = 36.asInstanceOf[`36`]
  @scala.inline
  def `8`: `8` = 8.asInstanceOf[`8`]
}

