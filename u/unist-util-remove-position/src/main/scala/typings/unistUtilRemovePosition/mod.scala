package typings.unistUtilRemovePosition

import typings.unist.mod.Data
import typings.unistUtilRemovePosition.unistUtilRemovePositionBooleans.`false`
import typings.unistUtilRemovePosition.unistUtilRemovePositionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-remove-position", "removePosition")
  @js.native
  val removePosition: (js.Function2[
    /* tree */ typings.unist.mod.Node[Data], 
    /* force */ js.UndefOr[`false`], 
    typings.unist.mod.Node[Data]
  ]) & (js.Function2[/* tree */ typings.unist.mod.Node[Data], `true`, typings.unist.mod.Node[Data]]) = js.native
  
  type Node = typings.unist.mod.Node[Data]
}
