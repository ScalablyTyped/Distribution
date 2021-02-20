package typings.webpackAssetsManifest

import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.webpackAssetsManifest.mod.AnyObject
import typings.webpackAssetsManifest.mod.Entry
import typings.webpackAssetsManifest.mod.Options
import typings.webpackAssetsManifest.mod.WebpackAssetsManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AfterOptions extends StObject {
    
    var afterOptions: SyncHook[Options, _, _] = js.native
    
    @JSName("apply")
    var apply: SyncHook[WebpackAssetsManifest, _, _] = js.native
    
    /**
      * The `SyncWaterfallHook` class supports 3 type parameters only but this hook actually has 4 parameters. The type of 4th parameter is `AnyObject`.
      *
      * Refer to https://github.com/webdeveric/webpack-assets-manifest#hooks for details
      */
    var customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest] = js.native
    
    var done: SyncHook[WebpackAssetsManifest, AnyObject, _] = js.native
    
    var options: SyncWaterfallHook[Options, _, _] = js.native
    
    var transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _] = js.native
  }
  object AfterOptions {
    
    @scala.inline
    def apply(
      afterOptions: SyncHook[Options, _, _],
      apply: SyncHook[WebpackAssetsManifest, _, _],
      customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest],
      done: SyncHook[WebpackAssetsManifest, AnyObject, _],
      options: SyncWaterfallHook[Options, _, _],
      transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]
    ): AfterOptions = {
      val __obj = js.Dynamic.literal(afterOptions = afterOptions.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], customize = customize.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterOptions]
    }
    
    @scala.inline
    implicit class AfterOptionsMutableBuilder[Self <: AfterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterOptions(value: SyncHook[Options, _, _]): Self = StObject.set(x, "afterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApply(value: SyncHook[WebpackAssetsManifest, _, _]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomize(value: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest]): Self = StObject.set(x, "customize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDone(value: SyncHook[WebpackAssetsManifest, AnyObject, _]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: SyncWaterfallHook[Options, _, _]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
}
