package typings
package workboxDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object workboxDashWebpackDashPluginLibStrings {
  @js.native
  sealed trait cacheFirst
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait cacheOnly
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait cdn extends js.Object
  
  @js.native
  sealed trait disabled extends js.Object
  
  @js.native
  sealed trait local extends js.Object
  
  @js.native
  sealed trait networkFirst
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait networkOnly
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @js.native
  sealed trait staleWhileRevalidate
    extends workboxDashWebpackDashPluginLib.workboxDashWebpackDashPluginMod.ChacheStrategy
  
  @scala.inline
  def cacheFirst: cacheFirst = "cacheFirst".asInstanceOf[cacheFirst]
  @scala.inline
  def cacheOnly: cacheOnly = "cacheOnly".asInstanceOf[cacheOnly]
  @scala.inline
  def cdn: cdn = "cdn".asInstanceOf[cdn]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def networkFirst: networkFirst = "networkFirst".asInstanceOf[networkFirst]
  @scala.inline
  def networkOnly: networkOnly = "networkOnly".asInstanceOf[networkOnly]
  @scala.inline
  def staleWhileRevalidate: staleWhileRevalidate = "staleWhileRevalidate".asInstanceOf[staleWhileRevalidate]
}

