package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
@js.native
class ResourceLoader () extends IResourceLoader {
  def this(name: java.lang.String) = this()
  /* CompleteClass */
  override def getString(resource: java.lang.String): java.lang.String = js.native
}

@JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
@js.native
object ResourceLoader extends js.Object {
  def getStringForReference(uri: winrtLib.WindowsNs.FoundationNs.Uri): java.lang.String = js.native
}

