package typings.winrt.global.Windows.ApplicationModel.Resources

import typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Management")
@js.native
object Management extends js.Object {
  @js.native
  class IndexedResourceCandidate ()
    extends typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate {
    /* CompleteClass */
    override var metadata: IMapView[String, String] = js.native
    /* CompleteClass */
    override var qualifiers: IVectorView[
        typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier
      ] = js.native
    /* CompleteClass */
    override var `type`: IndexedResourceType = js.native
    /* CompleteClass */
    override var uri: Uri = js.native
    /* CompleteClass */
    override var valueAsString: String = js.native
    /* CompleteClass */
    override def getQualifierValue(qualifierName: String): String = js.native
  }
  
  @js.native
  class IndexedResourceQualifier ()
    extends typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier {
    /* CompleteClass */
    override var qualifierName: String = js.native
    /* CompleteClass */
    override var qualifierValue: String = js.native
  }
  
  @js.native
  class ResourceIndexer protected ()
    extends typings.winrt.Windows.ApplicationModel.Resources.Management.ResourceIndexer {
    def this(projectRoot: Uri) = this()
    /* CompleteClass */
    override def indexFileContentsAsync(file: Uri): IAsyncOperation[
        IVectorView[
          typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate
        ]
      ] = js.native
    /* CompleteClass */
    override def indexFilePath(filePath: Uri): typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate = js.native
  }
  
  @js.native
  object IndexedResourceType extends js.Object {
    /* 1 */ val path: typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path with Double = js.native
    /* 0 */ val string: typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType with Double
      ] = js.native
  }
  
}

