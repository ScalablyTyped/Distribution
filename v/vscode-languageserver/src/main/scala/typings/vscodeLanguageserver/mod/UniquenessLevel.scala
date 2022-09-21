package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UniquenessLevel {
  
  /**
    * The moniker is only unique inside a document
    */
  @JSImport("vscode-languageserver", "UniquenessLevel.document")
  @js.native
  val document: /* "document" */ String = js.native
  
  /**
    * The moniker is globally unique
    */
  @JSImport("vscode-languageserver", "UniquenessLevel.global")
  @js.native
  val global: /* "global" */ String = js.native
  
  /**
    * The moniker is unique inside the group to which a project belongs
    */
  @JSImport("vscode-languageserver", "UniquenessLevel.group")
  @js.native
  val group: /* "group" */ String = js.native
  
  /**
    * The moniker is unique inside a project for which a dump got created
    */
  @JSImport("vscode-languageserver", "UniquenessLevel.project")
  @js.native
  val project: /* "project" */ String = js.native
  
  /**
    * The moniker is unique inside the moniker scheme.
    */
  @JSImport("vscode-languageserver", "UniquenessLevel.scheme")
  @js.native
  val scheme: /* "scheme" */ String = js.native
}
