package typings.teenyRequest.mod

import typings.node.httpsMod.Agent
import typings.node.streamMod.Transform
import typings.teenyRequest.teenyRequestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends Transform {
  
  var agent: Agent | `false` = js.native
  
  var headers: Headers = js.native
  
  var href: js.UndefOr[String] = js.native
}
