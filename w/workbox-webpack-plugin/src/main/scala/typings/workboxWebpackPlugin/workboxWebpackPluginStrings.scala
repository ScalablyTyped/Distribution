package typings.workboxWebpackPlugin

import typings.workboxWebpackPlugin.mod.CacheStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxWebpackPluginStrings {
  
  @js.native
  sealed trait CacheFirst extends CacheStrategy
  @scala.inline
  def CacheFirst: CacheFirst = "CacheFirst".asInstanceOf[CacheFirst]
  
  @js.native
  sealed trait CacheOnly extends CacheStrategy
  @scala.inline
  def CacheOnly: CacheOnly = "CacheOnly".asInstanceOf[CacheOnly]
  
  @js.native
  sealed trait NetworkFirst extends CacheStrategy
  @scala.inline
  def NetworkFirst: NetworkFirst = "NetworkFirst".asInstanceOf[NetworkFirst]
  
  @js.native
  sealed trait NetworkOnly extends CacheStrategy
  @scala.inline
  def NetworkOnly: NetworkOnly = "NetworkOnly".asInstanceOf[NetworkOnly]
  
  @js.native
  sealed trait StaleWhileRevalidate extends CacheStrategy
  @scala.inline
  def StaleWhileRevalidate: StaleWhileRevalidate = "StaleWhileRevalidate".asInstanceOf[StaleWhileRevalidate]
  
  @js.native
  sealed trait production extends StObject
  @scala.inline
  def production: production = "production".asInstanceOf[production]
}
