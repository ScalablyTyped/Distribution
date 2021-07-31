package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.StorageFile
import typings.winrt.anon.First
import typings.winrt.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Resources {
  
  object Core {
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.NamedResource")
    @js.native
    class NamedResource ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
    @js.native
    class ResourceCandidate ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate {
      
      /* CompleteClass */
      override def getQualifierValue(qualifierName: String): String = js.native
      
      /* CompleteClass */
      override def getValueAsFileAsync(): IAsyncOperation[StorageFile] = js.native
      
      /* CompleteClass */
      var isDefault: Boolean = js.native
      
      /* CompleteClass */
      var isMatch: Boolean = js.native
      
      /* CompleteClass */
      var isMatchAsDefault: Boolean = js.native
      
      /* CompleteClass */
      var qualifiers: IVectorView[typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
      
      /* CompleteClass */
      var valueAsString: String = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView")
    @js.native
    class ResourceCandidateVectorView ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView {
      
      /* CompleteClass */
      override def first(): IIterator[typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
    @js.native
    class ResourceContext ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext
    /* static members */
    object ResourceContext {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def createMatchingContext(result: IIterable[typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier]): typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createMatchingContext")(result.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext]
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView")
    @js.native
    class ResourceContextLanguagesVectorView ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView {
      
      /* CompleteClass */
      override def first(): IIterator[String] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
    @js.native
    class ResourceManager ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager {
      
      /* CompleteClass */
      var allResourceMaps: IMapView[String, typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
      
      /* CompleteClass */
      var defaultContext: typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
      
      /* CompleteClass */
      override def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
      
      /* CompleteClass */
      var mainResourceMap: typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
      
      /* CompleteClass */
      override def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
    }
    /* static members */
    object ResourceManager {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager.current")
      @js.native
      def current: typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager = js.native
      @scala.inline
      def current_=(x: typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def isResourceReference(resourceReference: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResourceReference")(resourceReference.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMap")
    @js.native
    class ResourceMap ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap {
      
      /* CompleteClass */
      override def first(): IIterator[
            IKeyValuePair[String, typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource]
          ] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def split(): First[String, typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
    @js.native
    class ResourceMapIterator ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapIterator {
      
      /* CompleteClass */
      var current: IKeyValuePair[String, typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource] = js.native
      
      /* CompleteClass */
      override def getMany(): Items[
            IKeyValuePair[String, typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource]
          ] = js.native
      
      /* CompleteClass */
      var hasCurrent: Boolean = js.native
      
      /* CompleteClass */
      override def moveNext(): Boolean = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
    @js.native
    class ResourceMapMapView ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapView {
      
      /* CompleteClass */
      override def first(): IIterator[
            IKeyValuePair[String, typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap]
          ] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def split(): First[String, typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
    @js.native
    class ResourceMapMapViewIterator ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator {
      
      /* CompleteClass */
      var current: IKeyValuePair[String, typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
      
      /* CompleteClass */
      override def getMany(): Items[
            IKeyValuePair[String, typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap]
          ] = js.native
      
      /* CompleteClass */
      var hasCurrent: Boolean = js.native
      
      /* CompleteClass */
      override def moveNext(): Boolean = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifier")
    @js.native
    class ResourceQualifier ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier {
      
      /* CompleteClass */
      var isDefault: Boolean = js.native
      
      /* CompleteClass */
      var isMatch: Boolean = js.native
      
      /* CompleteClass */
      var qualifierName: String = js.native
      
      /* CompleteClass */
      var qualifierValue: String = js.native
      
      /* CompleteClass */
      var score: Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
    @js.native
    class ResourceQualifierMapView ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView {
      
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[String, String]] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): String = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def split(): First[String, String] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap")
    @js.native
    class ResourceQualifierObservableMap ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap {
      
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[String, String]] = js.native
      
      /* CompleteClass */
      override def getView(): IMapView[String, String] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def insert(key: String, value: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): String = js.native
      
      /* CompleteClass */
      var onmapchanged: js.Any = js.native
      
      /* CompleteClass */
      override def remove(key: String): Unit = js.native
      
      /* CompleteClass */
      var size: Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView")
    @js.native
    class ResourceQualifierVectorView ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView {
      
      /* CompleteClass */
      override def first(): IIterator[typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
    }
  }
  
  object Management {
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate")
    @js.native
    class IndexedResourceCandidate ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate {
      
      /* CompleteClass */
      override def getQualifierValue(qualifierName: String): String = js.native
      
      /* CompleteClass */
      var metadata: IMapView[String, String] = js.native
      
      /* CompleteClass */
      var qualifiers: IVectorView[
            typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier
          ] = js.native
      
      /* CompleteClass */
      var `type`: IndexedResourceType = js.native
      
      /* CompleteClass */
      var uri: Uri = js.native
      
      /* CompleteClass */
      var valueAsString: String = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier")
    @js.native
    class IndexedResourceQualifier ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier {
      
      /* CompleteClass */
      var qualifierName: String = js.native
      
      /* CompleteClass */
      var qualifierValue: String = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
    @js.native
    object IndexedResourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType & Double
          ] = js.native
      
      /* 1 */ val path: typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path & Double = js.native
      
      /* 0 */ val string: typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string & Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.ResourceIndexer")
    @js.native
    class ResourceIndexer protected ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Resources.Management.ResourceIndexer {
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
  }
  
  @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
  @js.native
  class ResourceLoader ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Resources.ResourceLoader {
    def this(name: String) = this()
    
    /* CompleteClass */
    override def getString(resource: String): String = js.native
  }
  /* static members */
  object ResourceLoader {
    
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getStringForReference(uri: Uri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringForReference")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
