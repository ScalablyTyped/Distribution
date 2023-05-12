package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.BuildType
import typings.workboxBuild.buildTypesMod.StrategyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxBuildStrings {
  
  @js.native
  sealed trait CacheFirst
    extends StObject
       with StrategyName
  inline def CacheFirst: CacheFirst = "CacheFirst".asInstanceOf[CacheFirst]
  
  @js.native
  sealed trait CacheOnly
    extends StObject
       with StrategyName
  inline def CacheOnly: CacheOnly = "CacheOnly".asInstanceOf[CacheOnly]
  
  @js.native
  sealed trait NetworkFirst
    extends StObject
       with StrategyName
  inline def NetworkFirst: NetworkFirst = "NetworkFirst".asInstanceOf[NetworkFirst]
  
  @js.native
  sealed trait NetworkOnly
    extends StObject
       with StrategyName
  inline def NetworkOnly: NetworkOnly = "NetworkOnly".asInstanceOf[NetworkOnly]
  
  @js.native
  sealed trait StaleWhileRevalidate
    extends StObject
       with StrategyName
  inline def StaleWhileRevalidate: StaleWhileRevalidate = "StaleWhileRevalidate".asInstanceOf[StaleWhileRevalidate]
  
  @js.native
  sealed trait dev
    extends StObject
       with BuildType
  inline def dev: dev = "dev".asInstanceOf[dev]
  
  @js.native
  sealed trait prod
    extends StObject
       with BuildType
  inline def prod: prod = "prod".asInstanceOf[prod]
}
