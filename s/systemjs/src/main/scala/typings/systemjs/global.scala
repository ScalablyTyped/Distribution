package typings.systemjs

import typings.std.Iterable
import typings.systemjs.System.DeclareFn
import typings.systemjs.System.ImportFn
import typings.systemjs.System.Module
import typings.systemjs.System.UpdateModuleFn
import typings.systemjs.systemjsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object System {
    
    @JSGlobal("System")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Delete a module from the module registry. Note that the moduleId almost always must be a full url and that
      * you might need to call System.resolve() to obtain the moduleId for modules in an import map.
      * The returned function is intended for use after re-importing the module. Calling the function
      * will re-bind all the exports of the re-imported module to every module that depends on the module.
      */
    inline def delete(moduleId: String): `false` | UpdateModuleFn = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(moduleId.asInstanceOf[js.Any]).asInstanceOf[`false` | UpdateModuleFn]
    
    /**
      * Use for (let entry of System.entries()) to access all of the modules in the SystemJS registry.
      */
    inline def entries(): Iterable[js.Tuple2[String, Module]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[Iterable[js.Tuple2[String, Module]]]
    
    /**
      * Get a module from the SystemJS module registry. Note that the moduleId almost always must be a full url
      * and that you might need to call System.resolve() to obtain the moduleId. If the module does not exist in
      * the registry, null is returned.
      */
    inline def get(moduleId: String): Module | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(moduleId.asInstanceOf[js.Any]).asInstanceOf[Module | Null]
    
    // tslint:disable-next-line no-unnecessary-generics
    inline def get_T[T](moduleId: String): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(moduleId.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    
    /**
      * Indicates whether the SystemJS module registry contains a module. Note that the moduleId almost always
      * must be a full url and that you might need to call System.resolve() to obtain the moduleId.
      */
    inline def has(moduleId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(moduleId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Loads a javascript module from either a url or bare specifier that is in an import map.
      * You may optionally provide a parentUrl that will be used for resolving relative urls.
      */
    @JSGlobal("System.import")
    @js.native
    val `import`: ImportFn = js.native
    /**
      * Loads a javascript module from either a url or bare specifier that is in an import map.
      * You may optionally provide a parentUrl that will be used for resolving relative urls.
      */
    inline def `import`[T /* <: Module */](moduleId: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("import")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    inline def `import`[T /* <: Module */](moduleId: String, parentUrl: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("import")(moduleId.asInstanceOf[js.Any], parentUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    
    /**
      * Inserts a new module into the SystemJS module registry. The System.register format is
      * the underlying implementation that allows for ESM emulation.
      * See https://github.com/systemjs/systemjs/blob/master/docs/system-register.md for more details.
      * Register may be called with a name argument if you are using the named-register extra. (See
      * https://github.com/systemjs/systemjs#extras).
      */
    inline def register(dependencies: js.Array[String], declare: DeclareFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(dependencies.asInstanceOf[js.Any], declare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(name: String, dependencies: js.Array[String], declare: DeclareFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], declare.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Resolve any moduleId to its full URL. For a moduleId that is in the import map, this will resolve
      * the full import map URL. For a moduleId that is a relative url, the returned url will be resolved
      * relative to the parentUrl or the current browser page's base url. For a full url, resolve() is
      * a no-op.
      */
    inline def resolve(moduleId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(moduleId.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def resolve(moduleId: String, parentUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(moduleId.asInstanceOf[js.Any], parentUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * An alternative to System.register(), this allows you to insert a module into the module registry. Note that
      * the moduleId you provide will go straight into the registry without being resolved first.
      */
    inline def set(moduleId: String, module: Module): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(moduleId.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
