package typings.webpackStatsPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object statsWriterPluginMod {
  
  /**
    * transform function
    */
  type TransformFunc = js.Function2[
    /* data */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* options */ js.UndefOr[typings.webpackStatsPlugin.statsWriterPluginMod.TransformOptions], 
    java.lang.String | js.Promise[java.lang.String]
  ]
}
