package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotebookControllerAffinity extends StObject
@JSImport("vscode", "NotebookControllerAffinity")
@js.native
object NotebookControllerAffinity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotebookControllerAffinity & Double] = js.native
  
  /**
    * Default affinity.
    */
  @js.native
  sealed trait Default
    extends StObject
       with NotebookControllerAffinity
  /* 1 */ val Default: typings.vscode.mod.NotebookControllerAffinity.Default & Double = js.native
  
  /**
    * A controller is preferred for a notebook.
    */
  @js.native
  sealed trait Preferred
    extends StObject
       with NotebookControllerAffinity
  /* 2 */ val Preferred: typings.vscode.mod.NotebookControllerAffinity.Preferred & Double = js.native
}
