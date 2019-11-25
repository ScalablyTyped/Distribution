package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberResourceQualifier extends js.Object {
  /** The objects in the view that start at startIndex. */ var items: ResourceQualifier
  /** The number of objects returned. */ var returnValue: Double
}

object Anon_ItemsReturnValueNumberResourceQualifier {
  @scala.inline
  def apply(items: ResourceQualifier, returnValue: Double): Anon_ItemsReturnValueNumberResourceQualifier = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberResourceQualifier]
  }
}

