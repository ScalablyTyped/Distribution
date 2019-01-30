package typings
package webpackDashEnvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webpackDashEnvLibStrings {
  @js.native
  sealed trait eager extends js.Object
  
  @js.native
  sealed trait `lazy` extends js.Object
  
  @js.native
  sealed trait `lazy-once` extends js.Object
  
  @js.native
  sealed trait sync extends js.Object
  
  @js.native
  sealed trait weak extends js.Object
  
  def eager: eager = "eager".asInstanceOf[eager]
  def `lazy`: `lazy` = "lazy".asInstanceOf[`lazy`]
  def `lazy-once`: `lazy-once` = "lazy-once".asInstanceOf[`lazy-once`]
  def sync: sync = "sync".asInstanceOf[sync]
  def weak: weak = "weak".asInstanceOf[weak]
}

