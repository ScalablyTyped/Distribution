package typings.typeFest

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConditionalKeysMod {
  
  type ConditionalKeys[Base, Condition] = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: // Wrap in `NonNullable` to strip away the `undefined` type from the produced union.
  {[ Key in keyof Base ]: // Pick only keys with types extending the given `Condition` type.
  Base[Key] extends Condition? Key : never}[keyof Base] */ js.Any
  ]
}
