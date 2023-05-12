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
  
  // Merges two objects without worrying about index signatures.
  type SimpleMerge[Destination, Source] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof Destination as Key extends keyof Source? never : Key ]: Destination[Key]} */ js.Any) & Source
}
