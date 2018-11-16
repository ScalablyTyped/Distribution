package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IResourceIndexer extends js.Object {
  def indexFileContentsAsync(file: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IndexedResourceCandidate]
  ]
  def indexFilePath(filePath: winrtLib.WindowsNs.FoundationNs.Uri): IndexedResourceCandidate
}

