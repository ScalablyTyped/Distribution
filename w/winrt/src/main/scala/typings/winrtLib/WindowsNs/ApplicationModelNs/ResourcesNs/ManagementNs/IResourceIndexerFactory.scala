package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceIndexerFactory extends js.Object {
  def createResourceIndexer(projectRoot: winrtLib.WindowsNs.FoundationNs.Uri): ResourceIndexer
}

object IResourceIndexerFactory {
  @scala.inline
  def apply(createResourceIndexer: js.Function1[winrtLib.WindowsNs.FoundationNs.Uri, ResourceIndexer]): IResourceIndexerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResourceIndexer")(createResourceIndexer)
    __obj.asInstanceOf[IResourceIndexerFactory]
  }
}

