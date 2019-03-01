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
    createMatchingContext: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[ResourceQualifier], 
      ResourceContext
    ]
  ): IResourceContextStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createMatchingContext")(createMatchingContext)
    __obj.asInstanceOf[IResourceContextStatics]
  }
}

