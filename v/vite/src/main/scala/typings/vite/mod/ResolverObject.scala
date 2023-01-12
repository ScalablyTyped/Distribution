package typings.vite.mod

import typings.rollup.mod.ObjectHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverObject extends StObject {
  
  var buildStart: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var resolveId: ResolverFunction
}
object ResolverObject {
  
  inline def apply(resolveId: ResolverFunction): ResolverObject = {
    val __obj = js.Dynamic.literal(resolveId = resolveId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolverObject] (val x: Self) extends AnyVal {
    
    inline def setBuildStart(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
    
    inline def setBuildStartUndefined: Self = StObject.set(x, "buildStart", js.undefined)
    
    inline def setResolveId(value: ResolverFunction): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
  }
}
