package typings.uifabricMergeStyles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDeepPartialMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array<@uifabric/merge-styles.@uifabric/merge-styles/lib/DeepPartial.DeepPartial<U>> : T[P] extends object? @uifabric/merge-styles.@uifabric/merge-styles/lib/DeepPartial.DeepPartial<T[P]> : T[P]}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
}
