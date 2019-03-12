package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceContextStatics extends js.Object {
  def createMatchingContext(result: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[ResourceQualifier]): ResourceContext
}

object IResourceContextStatics {
  @scala.inline
  def apply(
    createMatchingContext: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[ResourceQualifier] => ResourceContext
  ): IResourceContextStatics = {
    val __obj = js.Dynamic.literal(createMatchingContext = js.Any.fromFunction1(createMatchingContext))
  
    __obj.asInstanceOf[IResourceContextStatics]
  }
}

