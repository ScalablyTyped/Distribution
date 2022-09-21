package typings.webpack

import typings.webpack.mod.CacheOptionsNormalized
import typings.webpack.mod.NodeWebpackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with CacheOptionsNormalized
       with NodeWebpackOptions
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true` extends StObject
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
