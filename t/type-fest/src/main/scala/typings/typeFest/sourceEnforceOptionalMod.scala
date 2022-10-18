package typings.typeFest

import typings.typeFest.sourceSimplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceEnforceOptionalMod {
  
  type EnforceOptional[ObjectType] = Simplify[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof ObjectType as type-fest.type-fest/source/enforce-optional.RequiredFilter<ObjectType, Key> ]: ObjectType[Key]} */ js.Any
  ]
  
  // Returns `never` if the key is required otherwise return the key type.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    undefined extends Type[Key] ? Type[Key] extends undefined ? never : Key : never
    }}}
    */
  @js.native
  trait OptionalFilter[Type, Key /* <: /* keyof Type */ String */] extends StObject
  
  // Returns `never` if the key is optional otherwise return the key type.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    undefined extends Type[Key] ? Type[Key] extends undefined ? Key : never : Key
    }}}
    */
  @js.native
  trait RequiredFilter[Type, Key /* <: /* keyof Type */ String */] extends StObject
}
