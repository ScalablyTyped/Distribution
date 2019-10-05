package typings.winrt.Windows.ApplicationModel.Resources.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexedResourceQualifier extends js.Object {
  var qualifierName: String
  var qualifierValue: String
}

object IIndexedResourceQualifier {
  @scala.inline
  def apply(qualifierName: String, qualifierValue: String): IIndexedResourceQualifier = {
    val __obj = js.Dynamic.literal(qualifierName = qualifierName, qualifierValue = qualifierValue)
  
    __obj.asInstanceOf[IIndexedResourceQualifier]
  }
}

