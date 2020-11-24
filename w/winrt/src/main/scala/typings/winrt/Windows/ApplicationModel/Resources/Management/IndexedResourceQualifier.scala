package typings.winrt.Windows.ApplicationModel.Resources.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedResourceQualifier extends IIndexedResourceQualifier
object IndexedResourceQualifier {
  
  @scala.inline
  def apply(qualifierName: String, qualifierValue: String): IndexedResourceQualifier = {
    val __obj = js.Dynamic.literal(qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedResourceQualifier]
  }
}
