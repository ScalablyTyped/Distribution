package typings.winrt

import typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayIKeyValuePair extends js.Object {
  var items: js.Array[IKeyValuePair[String, ResourceMap]]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayIKeyValuePair {
  @scala.inline
  def apply(items: js.Array[IKeyValuePair[String, ResourceMap]], returnValue: Double): Anon_ItemsReturnValueArrayIKeyValuePair = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayIKeyValuePair]
  }
}

