package typings.unistUtilVisit

import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unistUtilIs.libMod.Test
import typings.unistUtilVisit.libMod.BuildVisitor
import typings.unistUtilVisit.unistUtilVisitBooleans.`false`
import typings.unistUtilVisit.unistUtilVisitBooleans.`true`
import typings.unistUtilVisit.unistUtilVisitStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-visit", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit", "visit")
  @js.native
  val visit: (js.Function4[
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
