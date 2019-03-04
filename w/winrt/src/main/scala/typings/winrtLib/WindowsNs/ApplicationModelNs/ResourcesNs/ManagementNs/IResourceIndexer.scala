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

object IResourceIndexer {
  @scala.inline
  def apply(
    indexFileContentsAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
        winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IndexedResourceCandidate]
      ]
    ],
    indexFilePath: js.Function1[winrtLib.WindowsNs.FoundationNs.Uri, IndexedResourceCandidate]
  ): IResourceIndexer = {
    val __obj = js.Dynamic.literal(indexFileContentsAsync = indexFileContentsAsync, indexFilePath = indexFilePath)
  
    __obj.asInstanceOf[IResourceIndexer]
  }
}

