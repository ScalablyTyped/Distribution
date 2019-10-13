package typings.winston.libWinstonTransportsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.Agent
import typings.winston.Anon_Password
import typings.winstonDashTransport.winstonDashTransportMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpTransportInstance
  extends ^
     with Instantiable0[HttpTransportInstance]
     with Instantiable1[/* options */ HttpTransportOptions, HttpTransportInstance] {
  var agent: js.UndefOr[Agent | Null] = js.native
  var auth: js.UndefOr[Anon_Password] = js.native
  var host: String = js.native
  var name: String = js.native
  var path: String = js.native
  var port: Double = js.native
  var ssl: Boolean = js.native
}

