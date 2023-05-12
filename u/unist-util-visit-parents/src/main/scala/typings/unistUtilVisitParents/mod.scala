package typings.unistUtilVisitParents

import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unistUtilIs.libMod.Test
import typings.unistUtilVisitParents.libMod.BuildVisitor
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`false`
import typings.unistUtilVisitParents.unistUtilVisitParentsBooleans.`true`
import typings.unistUtilVisitParents.unistUtilVisitParentsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-visit-parents", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit-parents", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit-parents", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit-parents", "visitParents")
  @js.native
  val visitParents: (js.Function4[
    /* tree */ Node[Data], 
    /* test */ Test, 
    /* visitor */ BuildVisitor[Node[Data], Test], 
    /* reverse */ js.UndefOr[Boolean | Null], 
    Unit
  ]) & (js.Function3[
    /* tree */ Node[Data], 
    /* visitor */ BuildVisitor[Node[Data], String], 
    /* reverse */ js.UndefOr[Boolean | Null], 
    Unit
  ]) = js.native
}
