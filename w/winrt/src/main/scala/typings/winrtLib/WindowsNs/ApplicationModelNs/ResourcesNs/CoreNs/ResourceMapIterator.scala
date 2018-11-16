package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
@js.native
class ResourceMapIterator ()
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, NamedResource]
    ] {
  /* CompleteClass */
  override var current: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, NamedResource] = js.native
  /* CompleteClass */
  override var hasCurrent: scala.Boolean = js.native
  /* CompleteClass */
  override def getMany(): winrtLib.Anon_ItemsReturnValueArrayT[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, NamedResource]
  ] = js.native
  /* CompleteClass */
  override def moveNext(): scala.Boolean = js.native
}

