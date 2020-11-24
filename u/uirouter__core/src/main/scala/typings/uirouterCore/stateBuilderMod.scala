package typings.uirouterCore

import typings.uirouterCore.resolvableMod.Resolvable
import typings.uirouterCore.stateMatcherMod.StateMatcher
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/state/stateBuilder", JSImport.Namespace)
@js.native
object stateBuilderMod extends js.Object {
  
  def resolvablesBuilder(state: StateObject): js.Array[Resolvable] = js.native
  
  @js.native
  class StateBuilder protected () extends js.Object {
    def this(matcher: StateMatcher, urlMatcherFactory: UrlMatcherFactory) = this()
    
    /**
      * Builds all of the properties on an essentially blank State object, returning a State object which has all its
      * properties and API built.
      *
      * @param state an uninitialized State object
      * @returns the built State object
      */
    def build(state: StateObject): StateObject = js.native
    
    /**
      * Gets the registered builder functions for a given property of [[StateObject]].
      *
      * @param property The name of the State property being registered for.
      * @returns the registered builder(s).
      *          note: for backwards compatibility, this may be a single builder or an array of builders
      */
    def builder(property: String): BuilderFunction | js.Array[BuilderFunction] = js.native
    /**
      * Registers a [[BuilderFunction]] for a specific [[StateObject]] property (e.g., `parent`, `url`, or `path`).
      * More than one BuilderFunction can be registered for a given property.
      *
      * The BuilderFunction(s) will be used to define the property on any subsequently built [[StateObject]] objects.
      *
      * @param property The name of the State property being registered for.
      * @param fn The BuilderFunction which will be used to build the State property
      * @returns a function which deregisters the BuilderFunction
      */
    def builder(property: String, fn: BuilderFunction): js.Function = js.native
    
    /** An object that contains all the BuilderFunctions registered, key'd by the name of the State property they build */
    var builders: js.Any = js.native
    
    var matcher: js.Any = js.native
    
    def name(state: StateObject): String = js.native
    
    def parentName(state: StateObject): String = js.native
  }
  
  type BuilderFunction = js.Function2[
    /* state */ StateObject, 
    /* parent */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @uirouter/core.@uirouter/core/lib/state/stateBuilder.BuilderFunction */ js.Object
    ], 
    js.Any
  ]
}
