package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzipper", "Open")
@js.native
object OpenNs extends js.Object {
  def buffer(data: nodeLib.Buffer): js.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def file(filename: java.lang.String): js.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def s3(client: js.Any, params: js.Any): js.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def url(request: nodeLib.httpMod.ClientRequest, opt: java.lang.String): js.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def url(request: nodeLib.httpMod.ClientRequest, opt: nodeLib.httpMod.RequestOptions): js.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
}

