package typings
package unzipperLib.unzipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unzipper", "Open")
@js.native
object OpenNs extends js.Object {
  def buffer(data: nodeLib.Buffer): stdLib.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def file(filename: java.lang.String): stdLib.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def s3(client: js.Any, params: js.Any): stdLib.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def url(request: nodeLib.httpMod.ClientRequest, opt: java.lang.String): stdLib.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
  def url(request: nodeLib.httpMod.ClientRequest, opt: nodeLib.httpMod.RequestOptions): stdLib.Promise[unzipperLib.unzipperMod.CentralDirectory] = js.native
}

