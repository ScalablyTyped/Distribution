package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceIndexerFactory extends js.Object {
  def createResourceIndexer(projectRoot: Uri): ResourceIndexer
}

object IResourceIndexerFactory {
  @scala.inline
  def apply(createResourceIndexer: Uri => ResourceIndexer): IResourceIndexerFactory = {
    val __obj = js.Dynamic.literal(createResourceIndexer = js.Any.fromFunction1(createResourceIndexer))
    __obj.asInstanceOf[IResourceIndexerFactory]
  }
}

