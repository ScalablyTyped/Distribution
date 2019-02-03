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
  
  @scala.inline
  def eager: eager = "eager".asInstanceOf[eager]
  @scala.inline
  def `lazy`: `lazy` = "lazy".asInstanceOf[`lazy`]
  @scala.inline
  def `lazy-once`: `lazy-once` = "lazy-once".asInstanceOf[`lazy-once`]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  @scala.inline
  def weak: weak = "weak".asInstanceOf[weak]
}

