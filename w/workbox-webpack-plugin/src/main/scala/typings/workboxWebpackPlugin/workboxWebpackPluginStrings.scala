package typings.workboxWebpackPlugin

import typings.workboxWebpackPlugin.mod.CacheStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object workboxWebpackPluginStrings {
  @js.native
  sealed trait CacheFirst extends CacheStrategy
  
  @js.native
  sealed trait CacheOnly extends CacheStrategy
  
  @js.native
  sealed trait NetworkFirst extends CacheStrategy
  
  @js.native
  sealed trait NetworkOnly extends CacheStrategy
  
  @js.native
  sealed trait StaleWhileRevalidate extends CacheStrategy
  
  @js.native
  sealed trait production extends js.Object
  
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
  @scala.inline
  def production: production = "production".asInstanceOf[production]
}

