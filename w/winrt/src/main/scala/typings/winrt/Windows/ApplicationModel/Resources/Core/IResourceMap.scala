package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceMap extends IMapView[String, NamedResource] {
  var uri: Uri = js.native
  def getSubtree(reference: String): ResourceMap = js.native
  def getValue(resource: String): ResourceCandidate = js.native
  def getValue(resource: String, context: ResourceContext): ResourceCandidate = js.native
}

