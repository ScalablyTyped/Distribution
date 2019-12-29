package typings.systemjs.System

import typings.std.Iterable
import typings.systemjs.systemjsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("System")
@js.native
object ^ extends js.Object {
  /**
    * Loads a javascript module from either a url or bare specifier that is in an import map.
    * You may optionally provide a parentUrl that will be used for resolving relative urls.
    */
  @JSName("import")
  var import_Original: ImportFn = js.native
  /**
    * Delete a module from the module registry. Note that the moduleId almost always must be a full url and that
    * you might need to call System.resolve() to obtain the moduleId for modules in an import map.
    * The returned function is intended for use after re-importing the module. Calling the function
    * will re-bind all the exports of the re-imported module to every module that depends on the module.
    */
  def delete(moduleId: String): `false` | UpdateModuleFn = js.native
  /**
    * Use for (let entry of System.entries()) to access all of the modules in the SystemJS registry.
    */
  def entries(): Iterable[js.Tuple2[String, Module]] = js.native
  /**
    * Get a module from the SystemJS module registry. Note that the moduleId almost always must be a full url
    * and that you might need to call System.resolve() to obtain the moduleId. If the module does not exist in
    * the registry, null is returned.
    */
  def get(moduleId: String): Module | Null = js.native
  // tslint:disable-next-line no-unnecessary-generics
  @JSName("get")
  def get_T[T](moduleId: String): T | Null = js.native
  /**
    * Indicates whether the SystemJS module registry contains a module. Note that the moduleId almost always
    * must be a full url and that you might need to call System.resolve() to obtain the moduleId.
    */
  def has(moduleId: String): Boolean = js.native
  /**
    * Loads a javascript module from either a url or bare specifier that is in an import map.
    * You may optionally provide a parentUrl that will be used for resolving relative urls.
    */
  def `import`[T /* <: Module */](moduleId: String): js.Promise[T] = js.native
  def `import`[T /* <: Module */](moduleId: String, parentUrl: String): js.Promise[T] = js.native
  /**
    * Inserts a new module into the SystemJS module registry. The System.register format is
    * the underlying implementation that allows for ESM emulation.
    * See https://github.com/systemjs/systemjs/blob/master/docs/system-register.md for more details.
    * Register may be called with a name argument if you are using the named-register extra. (See
    * https://github.com/systemjs/systemjs#extras).
    */
  def register(dependencies: js.Array[String], declare: DeclareFn): Unit = js.native
  def register(name: String, dependencies: js.Array[String], declare: DeclareFn): Unit = js.native
  /**
    * Resolve any moduleId to its full URL. For a moduleId that is in the import map, this will resolve
    * the full import map URL. For a moduleId that is a relative url, the returned url will be resolved
    * relative to the parentUrl or the current browser page's base url. For a full url, resolve() is
    * a no-op.
    */
  def resolve(moduleId: String): String = js.native
  def resolve(moduleId: String, parentUrl: String): String = js.native
  /**
    * An alternative to System.register(), this allows you to insert a module into the module registry. Note that
    * the moduleId you provide will go straight into the registry without being resolved first.
    */
  def set(moduleId: String, module: Module): Unit = js.native
}

