package typings
package atTensorflowTfjsDashCoreLib.distIoModelUnderscoreManagementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/model_management", "ModelStoreManagerRegistry")
@js.native
class ModelStoreManagerRegistry protected () extends js.Object {
  var managers: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/model_management", "ModelStoreManagerRegistry")
@js.native
object ModelStoreManagerRegistry extends js.Object {
  var getInstance: js.Any = js.native
  var instance: js.Any = js.native
  def getManager(scheme: java.lang.String): atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelStoreManager = js.native
  def getSchemes(): js.Array[java.lang.String] = js.native
  /**
    * Register a save-handler router.
    *
    * @param saveRouter A function that maps a URL-like string onto an instance
    * of `IOHandler` with the `save` method defined or `null`.
    */
  def registerManager(scheme: java.lang.String, manager: atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelStoreManager): scala.Unit = js.native
}

