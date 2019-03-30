package typings
package workboxDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object workboxDashWebpackDashPluginLibStrings {
  @js.native
  sealed trait CacheFirst
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait CacheOnly
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait NetworkFirst
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait NetworkOnly
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait StaleWhileRevalidate
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait cdn extends js.Object
  
  @js.native
  sealed trait disabled extends js.Object
  
  @js.native
  sealed trait local extends js.Object
  
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
  def cdn: cdn = "cdn".asInstanceOf[cdn]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
}

