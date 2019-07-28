package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrt.Anon_First
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
@js.native
class ResourceQualifierMapView () extends IMapView[String, String] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, String]] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): String = js.native
  /* CompleteClass */
  override def split(): Anon_First[String, String] = js.native
}

