package typings.tstl

import typings.tstl.baseThreadEnumsMod.AccessType
import typings.tstl.baseThreadEnumsMod.LockType
import typings.tstl.baseTreeUnderscoreColorMod._Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tstlNumbers {
  @js.native
  sealed trait `0`
    extends AccessType
       with LockType
       with _Color
  
  @js.native
  sealed trait `1`
    extends AccessType
       with LockType
       with _Color
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
}

