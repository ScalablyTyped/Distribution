package typings.treeChangesHook

import typings.treeChanges.distTypesMod.Data
import typings.treeChanges.distTypesMod.TreeChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tree-changes-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: Data */, D /* <: Data */, K](previousData: P, data: D): TreeChanges[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(previousData.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[TreeChanges[K]]
  
  inline def treeChanges[P /* <: Data */, D /* <: Data */, K](previousData: P, data: D): TreeChanges[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeChanges")(previousData.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[TreeChanges[K]]
}
