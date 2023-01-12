package typings.webpackAssetsManifest

import typings.std.Set
import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.Asset
import typings.webpack.mod.Stats
import typings.webpackAssetsManifest.mod.Entry
import typings.webpackAssetsManifest.mod.Options
import typings.webpackAssetsManifest.mod.WebpackAssetsManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterOptions extends StObject {
    
    var afterOptions: SyncHook[js.Array[Options], Unit, UnsetAdditionalOptions]
    
    @JSName("apply")
    var apply: SyncHook[js.Array[WebpackAssetsManifest], Unit, UnsetAdditionalOptions]
    
    var customize: SyncWaterfallHook[
        js.Tuple4[Entry, Entry, WebpackAssetsManifest, Asset | Null], 
        UnsetAdditionalOptions
      ]
    
    var done: AsyncSeriesHook[js.Tuple2[WebpackAssetsManifest, Stats], UnsetAdditionalOptions]
    
    var options: SyncWaterfallHook[js.Array[Options], UnsetAdditionalOptions]
    
    var transform: SyncWaterfallHook[
        js.Tuple2[typings.webpackAssetsManifest.mod.Assets, WebpackAssetsManifest], 
        UnsetAdditionalOptions
      ]
  }
  object AfterOptions {
    
    inline def apply(
      afterOptions: SyncHook[js.Array[Options], Unit, UnsetAdditionalOptions],
      apply: SyncHook[js.Array[WebpackAssetsManifest], Unit, UnsetAdditionalOptions],
      customize: SyncWaterfallHook[
          js.Tuple4[Entry, Entry, WebpackAssetsManifest, Asset | Null], 
          UnsetAdditionalOptions
        ],
      done: AsyncSeriesHook[js.Tuple2[WebpackAssetsManifest, Stats], UnsetAdditionalOptions],
      options: SyncWaterfallHook[js.Array[Options], UnsetAdditionalOptions],
      transform: SyncWaterfallHook[
          js.Tuple2[typings.webpackAssetsManifest.mod.Assets, WebpackAssetsManifest], 
          UnsetAdditionalOptions
        ]
    ): AfterOptions = {
      val __obj = js.Dynamic.literal(afterOptions = afterOptions.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], customize = customize.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterOptions] (val x: Self) extends AnyVal {
      
      inline def setAfterOptions(value: SyncHook[js.Array[Options], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterOptions", value.asInstanceOf[js.Any])
      
      inline def setApply(value: SyncHook[js.Array[WebpackAssetsManifest], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setCustomize(
        value: SyncWaterfallHook[
              js.Tuple4[Entry, Entry, WebpackAssetsManifest, Asset | Null], 
              UnsetAdditionalOptions
            ]
      ): Self = StObject.set(x, "customize", value.asInstanceOf[js.Any])
      
      inline def setDone(value: AsyncSeriesHook[js.Tuple2[WebpackAssetsManifest, Stats], UnsetAdditionalOptions]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: SyncWaterfallHook[js.Array[Options], UnsetAdditionalOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTransform(
        value: SyncWaterfallHook[
              js.Tuple2[typings.webpackAssetsManifest.mod.Assets, WebpackAssetsManifest], 
              UnsetAdditionalOptions
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assets extends StObject {
    
    var assets: js.Array[Asset]
    
    var hmrFiles: Set[String]
  }
  object Assets {
    
    inline def apply(assets: js.Array[Asset], hmrFiles: Set[String]): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hmrFiles = hmrFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: js.Array[Asset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setHmrFiles(value: Set[String]): Self = StObject.set(x, "hmrFiles", value.asInstanceOf[js.Any])
    }
  }
}
