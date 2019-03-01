package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayIKeyValuePair extends js.Object {
  var items: js.Array[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[
      java.lang.String, 
      winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
    ]
  ]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayIKeyValuePair {
  @scala.inline
  def apply(
    items: js.Array[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[
        java.lang.String, 
        winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
      ]
    ],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueArrayIKeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayIKeyValuePair]
  }
}

