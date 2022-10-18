package typings.typeFest

import typings.typeFest.sourceEnforceOptionalMod.EnforceOptional
import typings.typeFest.sourceOmitIndexSignatureMod.OmitIndexSignature
import typings.typeFest.sourcePickIndexSignatureMod.PickIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMergeMod {
  
  type Merge[Destination, Source] = EnforceOptional[
    (SimpleMerge[PickIndexSignature[Destination], PickIndexSignature[Source]]) & (SimpleMerge[OmitIndexSignature[Destination], OmitIndexSignature[Source]])
  ]
  
  // Merges two objects without worrying about index signatures or optional keys.
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof Destination | keyof Source ]: Key extends keyof Source? Source[Key] : Key extends keyof Destination? Destination[Key] : never}
    }}}
    */
  @js.native
  trait SimpleMerge[Destination, Source] extends StObject
}
