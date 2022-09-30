package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.typeFest.enforceOptionalMod.EnforceOptional
import typings.typeFest.omitIndexSignatureMod.OmitIndexSignature
import typings.typeFest.pickIndexSignatureMod.PickIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  type Merge[Destination, Source] = EnforceOptional[
    (SimpleMerge[PickIndexSignature[Destination], PickIndexSignature[Source]]) & (SimpleMerge[OmitIndexSignature[Destination], OmitIndexSignature[Source]])
  ]
  
  // Merges two objects without worrying about index signatures or optional keys.
  type SimpleMerge[Destination, Source] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Destination | keyof Source ]: Key extends keyof Source? Source[Key] : Key extends keyof Destination? Destination[Key] : never}
    */ typings.typeFest.typeFestStrings.SimpleMerge & TopLevel[Any]
}
