package typings.workboxWebpackPlugin

import typings.workboxWebpackPlugin.mod.ChacheStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object workboxWebpackPluginStrings {
  @js.native
  sealed trait CacheFirst extends ChacheStrategy
  
  @js.native
  sealed trait CacheOnly extends ChacheStrategy
  
  @js.native
  sealed trait NetworkFirst extends ChacheStrategy
  
  @js.native
  sealed trait NetworkOnly extends ChacheStrategy
  
  @js.native
  sealed trait StaleWhileRevalidate extends ChacheStrategy
  
  @scala.inline
  def CacheFirst: CacheFirst = "CacheFirst".asInstanceOf[CacheFirst]
  @scala.inline
  def CacheOnly: CacheOnly = "CacheOnly".asInstanceOf[CacheOnly]
  @scala.inline
  def NetworkFirst: NetworkFirst = "NetworkFirst".asInstanceOf[NetworkFirst]
  @scala.inline
  def NetworkOnly: NetworkOnly = "NetworkOnly".asInstanceOf[NetworkOnly]
  @scala.inline
  def StaleWhileRevalidate: StaleWhileRevalidate = "StaleWhileRevalidate".asInstanceOf[StaleWhileRevalidate]
}

