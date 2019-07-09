package typings
package atTensorflowTfjsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/io", JSImport.Namespace)
@js.native
object distIoMod extends js.Object {
  def fileSystem(path: java.lang.String): atTensorflowTfjsDashNodeLib.distIoFileUnderscoreSystemMod.NodeFileSystem = js.native
  def fileSystem(path: js.Array[java.lang.String]): atTensorflowTfjsDashNodeLib.distIoFileUnderscoreSystemMod.NodeFileSystem = js.native
  def nodeHTTPRequest(path: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def nodeHTTPRequest(path: java.lang.String, requestInit: stdLib.RequestInit): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
  def nodeHTTPRequest(path: java.lang.String, requestInit: stdLib.RequestInit, weightPathPrefix: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler = js.native
}

