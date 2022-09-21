package typings.webpack.mod

import typings.webpack.anon.ReadonlybeforeResolveAsyn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextModuleFactory
  extends StObject
     with ModuleFactory {
  
  var hooks: ReadonlybeforeResolveAsyn
  
  def resolveDependencies(
    fs: InputFileSystem,
    options: ContextModuleOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[Null | js.Error], 
      /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
      Any
    ]
  ): Unit
  
  var resolverFactory: ResolverFactory
}
object ContextModuleFactory {
  
  inline def apply(
    create: (ModuleFactoryCreateData, js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => Unit,
    hooks: ReadonlybeforeResolveAsyn,
    resolveDependencies: (InputFileSystem, ContextModuleOptions, js.Function2[
      /* err */ js.UndefOr[Null | js.Error], 
      /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
      Any
    ]) => Unit,
    resolverFactory: ResolverFactory
  ): ContextModuleFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), hooks = hooks.asInstanceOf[js.Any], resolveDependencies = js.Any.fromFunction3(resolveDependencies), resolverFactory = resolverFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextModuleFactory]
  }
  
  extension [Self <: ContextModuleFactory](x: Self) {
    
    inline def setHooks(value: ReadonlybeforeResolveAsyn): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setResolveDependencies(
      value: (InputFileSystem, ContextModuleOptions, js.Function2[
          /* err */ js.UndefOr[Null | js.Error], 
          /* dependencies */ js.UndefOr[js.Array[ContextElementDependency]], 
          Any
        ]) => Unit
    ): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3(value))
    
    inline def setResolverFactory(value: ResolverFactory): Self = StObject.set(x, "resolverFactory", value.asInstanceOf[js.Any])
  }
}
