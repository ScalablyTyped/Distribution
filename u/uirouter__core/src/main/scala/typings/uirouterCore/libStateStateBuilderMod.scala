package typings.uirouterCore

import typings.uirouterCore.libResolveResolvableMod.Resolvable
import typings.uirouterCore.libStateStateMatcherMod.StateMatcher
import typings.uirouterCore.libStateStateObjectMod.StateObject
import typings.uirouterCore.libUrlUrlMatcherFactoryMod.UrlMatcherFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateStateBuilderMod {
  
  @JSImport("@uirouter/core/lib/state/stateBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/state/stateBuilder", "StateBuilder")
  @js.native
  open class StateBuilder protected () extends StObject {
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
    /* private */ var builders: Any = js.native
    
    /* private */ var matcher: Any = js.native
    
    def name(state: StateObject): String = js.native
    
    def parentName(state: StateObject): String = js.native
  }
  
  inline def resolvablesBuilder(state: StateObject): js.Array[Resolvable] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvablesBuilder")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[Resolvable]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type BuilderFunction = (state : @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject, parent : @uirouter/core.@uirouter/core/lib/state/stateBuilder.BuilderFunction | undefined): any
  }}}
  to avoid circular code involving: 
  - @uirouter/core.@uirouter/core/lib/state/stateBuilder.BuilderFunction
  */
  @js.native
  trait BuilderFunction extends StObject {
    
    def apply(state: StateObject): Any = js.native
    def apply(state: StateObject, parent: BuilderFunction): Any = js.native
  }
}
