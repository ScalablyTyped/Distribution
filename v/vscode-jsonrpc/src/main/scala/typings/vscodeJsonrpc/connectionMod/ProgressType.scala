package typings.vscodeJsonrpc.connectionMod

import typings.vscodeJsonrpc.messagesMod._EM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/connection", "ProgressType")
@js.native
open class ProgressType[PR] () extends StObject {
  
  /**
    * Clients must not use these properties. They are here to ensure correct typing.
    * in TypeScript
    */
  val __ : js.UndefOr[js.Tuple2[PR, _EM]] = js.native
  
  val _pr: js.UndefOr[PR] = js.native
}
