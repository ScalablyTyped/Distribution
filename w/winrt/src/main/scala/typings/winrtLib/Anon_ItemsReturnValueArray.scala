package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArray extends js.Object {
  var items: js.Array[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[
      java.lang.String, 
      winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
    ]
  ]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArray {
  @scala.inline
  def apply(
    items: js.Array[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[
        java.lang.String, 
        winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
      ]
    ],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueArray = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArray]
  }
}

