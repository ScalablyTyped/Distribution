package typings.typeFest

import typings.std.Set
import typings.typeFest.entryMod.ArrayEntry
import typings.typeFest.entryMod.MapEntry
import typings.typeFest.entryMod.ObjectEntry
import typings.typeFest.entryMod.SetEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entriesMod {
  
  type ArrayEntries[BaseType /* <: js.Array[Any] */] = js.Array[ArrayEntry[BaseType]]
  
  type Entries[BaseType] = ObjectEntries[BaseType] | ArrayEntries[BaseType] | SetEntries[BaseType] | MapEntries[BaseType]
  
  type MapEntries[BaseType] = js.Array[MapEntry[BaseType]]
  
  type ObjectEntries[BaseType] = js.Array[ObjectEntry[BaseType]]
  
  type SetEntries[BaseType /* <: Set[Any] */] = js.Array[SetEntry[BaseType]]
}
