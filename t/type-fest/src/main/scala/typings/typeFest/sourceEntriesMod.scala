package typings.typeFest

import typings.std.Set
import typings.typeFest.sourceEntryMod.ArrayEntry
import typings.typeFest.sourceEntryMod.MapEntry
import typings.typeFest.sourceEntryMod.ObjectEntry
import typings.typeFest.sourceEntryMod.SetEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceEntriesMod {
  
  type ArrayEntries[BaseType /* <: js.Array[Any] */] = js.Array[ArrayEntry[BaseType]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    BaseType extends std.Map<unknown, unknown> ? type-fest.type-fest/source/entries.MapEntries<BaseType> : BaseType extends std.Set<unknown> ? type-fest.type-fest/source/entries.SetEntries<BaseType> : BaseType extends std.Array<unknown> ? type-fest.type-fest/source/entries.ArrayEntries<BaseType> : BaseType extends object ? type-fest.type-fest/source/entries.ObjectEntries<BaseType> : never
    }}}
    */
  @js.native
  trait Entries[BaseType] extends StObject
  
  type MapEntries[BaseType] = js.Array[MapEntry[BaseType]]
  
  type ObjectEntries[BaseType] = js.Array[ObjectEntry[BaseType]]
  
  type SetEntries[BaseType /* <: Set[Any] */] = js.Array[SetEntry[BaseType]]
}
