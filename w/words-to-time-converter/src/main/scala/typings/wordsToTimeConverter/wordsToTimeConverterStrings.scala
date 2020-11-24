package typings.wordsToTimeConverter

import typings.wordsToTimeConverter.mod.SpeedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordsToTimeConverterStrings {
  
  @scala.inline
  def average: average = "average".asInstanceOf[average]
  
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
  
  @js.native
  sealed trait average extends SpeedType
  
  @js.native
  sealed trait fast extends SpeedType
  
  @js.native
  sealed trait slow extends SpeedType
}
