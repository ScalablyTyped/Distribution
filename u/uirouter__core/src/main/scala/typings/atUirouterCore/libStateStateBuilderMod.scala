package typings.atUirouterCore

import typings.atUirouterCore.libResolveResolvableMod.Resolvable
import typings.atUirouterCore.libStateStateMatcherMod.StateMatcher
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libUrlUrlMatcherFactoryMod.UrlMatcherFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateBuilder", JSImport.Namespace)
@js.native
object libStateStateBuilderMod extends js.Object {
  @js.native
  class StateBuilder protected () extends js.Object {
    def this(matcher: StateMatcher, urlMatcherFactory: UrlMatcherFactory) = this()
    /** An object that contains all the BuilderFunctions registered, key'd by the name of the State property they build */
    var builders: js.Any = js.native
    var matcher: js.Any = js.native
    /**
      * Builds all of the properties on an essentially blank State object, returning a State object which has all its
      * properties and API built.
      *
      * @param state an uninitialized State object
      * @returns the built State object
      */
    def build(state: StateObject): StateObject = js.native
    /**
      * Registers a [[BuilderFunction]] for a specific [[StateObject]] property (e.g., `parent`, `url`, or `path`).
      * More than one BuilderFunction can be registered for a given property.
      *
      * The BuilderFunction(s) will be used to define the property on any subsequently built [[StateObject]] objects.
      *
      * @param name The name of the State property being registered for.
      * @param fn The BuilderFunction which will be used to build the State property
      * @returns a function which deregisters the BuilderFunction
      */
    def builder(name: String, fn: BuilderFunction): BuilderFunction | js.Array[BuilderFunction] | js.Function = js.native
    def name(state: StateObject): String = js.native
    def parentName(state: StateObject): String = js.native
  }
  
  def resolvablesBuilder(state: StateObject): js.Array[Resolvable] = js.native
  type BuilderFunction = js.Function2[
    /* state */ StateObject, 
    /* parent */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @uirouter/core.@uirouter/core/lib/state/stateBuilder.BuilderFunction */ js.Object
    ], 
    js.Any
  ]
}

