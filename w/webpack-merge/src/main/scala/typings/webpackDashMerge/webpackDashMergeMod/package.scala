package typings.webpackDashMerge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackDashMergeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.webpack.webpackMod.Configuration

  type ConfigurationMergeConfigFunction = js.Function1[/* customizeOptions */ CustomizeOptions, ConfigurationMergeFunction]
  type ConfigurationMergeFunction = js.Function1[/* repeated */ Configuration, Configuration]
  type CustomizeArrayFunction = js.Function3[
    /* a */ js.Array[js.Any], 
    /* b */ js.Array[js.Any], 
    /* key */ String, 
    js.UndefOr[js.Array[js.Any] | Null]
  ]
  type CustomizeObjectFunction = js.Function3[/* a */ js.Object, /* b */ js.Object, /* key */ String, js.UndefOr[js.Object | Null]]
  type MergeFunction = ConfigurationMergeFunction | ConfigurationMergeConfigFunction
  type MultipleConfiguration = StringDictionary[Configuration]
  type MultipleConfigurationMergeFunction = js.Function1[/* repeated */ MultipleConfiguration, js.Array[Configuration]]
  type UniqueFunction = js.Function3[
    /* field */ String, 
    /* fields */ js.Array[String], 
    /* keyFn */ js.Function1[/* field */ js.Any, String], 
    CustomizeArrayFunction
  ]
}
