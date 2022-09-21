package typings.treeChangesHook

import typings.treeChanges.typesMod.Data
import typings.treeChanges.typesMod.KeyType
import typings.treeChanges.typesMod.TreeChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tree-changes-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Data */](value: T): TreeChanges[KeyType[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[TreeChanges[KeyType[T, T]]]
  
  inline def treeChanges[P /* <: Data */, D /* <: Data */, K](previousData: P, data: D): TreeChanges[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeChanges")(previousData.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[TreeChanges[K]]
}
