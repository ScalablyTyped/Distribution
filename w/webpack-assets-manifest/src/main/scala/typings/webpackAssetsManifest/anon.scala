package typings.webpackAssetsManifest

import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.webpackAssetsManifest.mod.AnyObject
import typings.webpackAssetsManifest.mod.Entry
import typings.webpackAssetsManifest.mod.Options
import typings.webpackAssetsManifest.mod.WebpackAssetsManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterOptions extends StObject {
    
    var afterOptions: SyncHook[Options, js.Any, js.Any]
    
    @JSName("apply")
    var apply: SyncHook[WebpackAssetsManifest, js.Any, js.Any]
    
    /**
      * The `SyncWaterfallHook` class supports 3 type parameters only but this hook actually has 4 parameters. The type of 4th parameter is `AnyObject`.
      *
      * Refer to https://github.com/webdeveric/webpack-assets-manifest#hooks for details
      */
    var customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest]
    
    var done: SyncHook[WebpackAssetsManifest, AnyObject, js.Any]
    
    var options: SyncWaterfallHook[Options, js.Any, js.Any]
    
    var transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, js.Any]
  }
  object AfterOptions {
    
    inline def apply(
      afterOptions: SyncHook[Options, js.Any, js.Any],
      apply: SyncHook[WebpackAssetsManifest, js.Any, js.Any],
      customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest],
      done: SyncHook[WebpackAssetsManifest, AnyObject, js.Any],
      options: SyncWaterfallHook[Options, js.Any, js.Any],
      transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, js.Any]
    ): AfterOptions = {
      val __obj = js.Dynamic.literal(afterOptions = afterOptions.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], customize = customize.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterOptions]
    }
    
    extension [Self <: AfterOptions](x: Self) {
      
      inline def setAfterOptions(value: SyncHook[Options, js.Any, js.Any]): Self = StObject.set(x, "afterOptions", value.asInstanceOf[js.Any])
      
      inline def setApply(value: SyncHook[WebpackAssetsManifest, js.Any, js.Any]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setCustomize(value: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest]): Self = StObject.set(x, "customize", value.asInstanceOf[js.Any])
      
      inline def setDone(value: SyncHook[WebpackAssetsManifest, AnyObject, js.Any]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: SyncWaterfallHook[Options, js.Any, js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, js.Any]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
}
