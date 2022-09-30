package typings.typeFest

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionalKeysOfMod {
  
  type OptionalKeysOf[BaseType /* <: js.Object */] = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof BaseType ]: BaseType extends std.Record<Key, BaseType[Key]>? never : Key}[keyof BaseType] */ js.Any, 
    Unit
  ]
}
