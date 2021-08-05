package typings.workboxWebpackPlugin

import typings.workboxWebpackPlugin.mod.CacheStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxWebpackPluginStrings {
  
  @js.native
  sealed trait CacheFirst
    extends StObject
       with CacheStrategy
  inline def CacheFirst: CacheFirst = "CacheFirst".asInstanceOf[CacheFirst]
  
  @js.native
  sealed trait CacheOnly
    extends StObject
       with CacheStrategy
  inline def CacheOnly: CacheOnly = "CacheOnly".asInstanceOf[CacheOnly]
  
  @js.native
  sealed trait NetworkFirst
    extends StObject
       with CacheStrategy
  inline def NetworkFirst: NetworkFirst = "NetworkFirst".asInstanceOf[NetworkFirst]
  
  @js.native
  sealed trait NetworkOnly
    extends StObject
       with CacheStrategy
  inline def NetworkOnly: NetworkOnly = "NetworkOnly".asInstanceOf[NetworkOnly]
  
  @js.native
  sealed trait StaleWhileRevalidate
    extends StObject
       with CacheStrategy
  inline def StaleWhileRevalidate: StaleWhileRevalidate = "StaleWhileRevalidate".asInstanceOf[StaleWhileRevalidate]
  
  @js.native
  sealed trait production extends StObject
  inline def production: production = "production".asInstanceOf[production]
}
