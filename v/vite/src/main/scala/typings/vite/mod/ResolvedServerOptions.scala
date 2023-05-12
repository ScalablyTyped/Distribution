package typings.vite.mod

import typings.std.Exclude
import typings.vite.anon.RequiredFileSystemServeOp
import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedServerOptions
  extends StObject
     with ServerOptions {
  
  @JSName("fs")
  var fs_ResolvedServerOptions: RequiredFileSystemServeOp
  
  @JSName("middlewareMode")
  var middlewareMode_ResolvedServerOptions: Boolean
  
  @JSName("sourcemapIgnoreList")
  var sourcemapIgnoreList_ResolvedServerOptions: Exclude[
    js.UndefOr[
      `false` | (js.Function2[/* sourcePath */ String, /* sourcemapPath */ String, Boolean])
    ], 
    js.UndefOr[`false`]
  ]
}
object ResolvedServerOptions {
  
  inline def apply(fs: RequiredFileSystemServeOp, middlewareMode: Boolean): ResolvedServerOptions = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], middlewareMode = middlewareMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedServerOptions] (val x: Self) extends AnyVal {
    
    inline def setFs(value: RequiredFileSystemServeOp): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareMode(value: Boolean): Self = StObject.set(x, "middlewareMode", value.asInstanceOf[js.Any])
    
    inline def setSourcemapIgnoreList(
      value: Exclude[
          js.UndefOr[
            `false` | (js.Function2[/* sourcePath */ String, /* sourcemapPath */ String, Boolean])
          ], 
          js.UndefOr[`false`]
        ]
    ): Self = StObject.set(x, "sourcemapIgnoreList", value.asInstanceOf[js.Any])
    
    inline def setSourcemapIgnoreListFunction2(value: (/* sourcePath */ String, /* sourcemapPath */ String) => Boolean): Self = StObject.set(x, "sourcemapIgnoreList", js.Any.fromFunction2(value))
    
    inline def setSourcemapIgnoreListUndefined: Self = StObject.set(x, "sourcemapIgnoreList", js.undefined)
  }
}
