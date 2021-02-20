package typings.winrt.Windows.ApplicationModel.Resources

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  @js.native
  sealed trait IndexedResourceType extends StObject
  @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
  @js.native
  object IndexedResourceType extends StObject {
    
    @js.native
    sealed trait path extends IndexedResourceType
    
    @js.native
    sealed trait string extends IndexedResourceType
  }
  
  @js.native
  trait IIndexedResourceCandidate extends StObject {
    
    def getQualifierValue(qualifierName: String): String = js.native
    
    var metadata: IMapView[String, String] = js.native
    
    var qualifiers: IVectorView[IndexedResourceQualifier] = js.native
    
    var `type`: IndexedResourceType = js.native
    
    var uri: Uri = js.native
    
    var valueAsString: String = js.native
  }
  object IIndexedResourceCandidate {
    
    @scala.inline
    def apply(
      getQualifierValue: String => String,
      metadata: IMapView[String, String],
      qualifiers: IVectorView[IndexedResourceQualifier],
      `type`: IndexedResourceType,
      uri: Uri,
      valueAsString: String
    ): IIndexedResourceCandidate = {
      val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), metadata = metadata.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIndexedResourceCandidate]
    }
    
    @scala.inline
    implicit class IIndexedResourceCandidateMutableBuilder[Self <: IIndexedResourceCandidate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetQualifierValue(value: String => String): Self = StObject.set(x, "getQualifierValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMetadata(value: IMapView[String, String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifiers(value: IVectorView[IndexedResourceQualifier]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IndexedResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueAsString(value: String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IIndexedResourceQualifier extends StObject {
    
    var qualifierName: String = js.native
    
    var qualifierValue: String = js.native
  }
  object IIndexedResourceQualifier {
    
    @scala.inline
    def apply(qualifierName: String, qualifierValue: String): IIndexedResourceQualifier = {
      val __obj = js.Dynamic.literal(qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIndexedResourceQualifier]
    }
    
    @scala.inline
    implicit class IIndexedResourceQualifierMutableBuilder[Self <: IIndexedResourceQualifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQualifierName(value: String): Self = StObject.set(x, "qualifierName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierValue(value: String): Self = StObject.set(x, "qualifierValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResourceIndexer extends StObject {
    
    def indexFileContentsAsync(file: Uri): IAsyncOperation[IVectorView[IndexedResourceCandidate]] = js.native
    
    def indexFilePath(filePath: Uri): IndexedResourceCandidate = js.native
  }
  object IResourceIndexer {
    
    @scala.inline
    def apply(
      indexFileContentsAsync: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]],
      indexFilePath: Uri => IndexedResourceCandidate
    ): IResourceIndexer = {
      val __obj = js.Dynamic.literal(indexFileContentsAsync = js.Any.fromFunction1(indexFileContentsAsync), indexFilePath = js.Any.fromFunction1(indexFilePath))
      __obj.asInstanceOf[IResourceIndexer]
    }
    
    @scala.inline
    implicit class IResourceIndexerMutableBuilder[Self <: IResourceIndexer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexFileContentsAsync(value: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]]): Self = StObject.set(x, "indexFileContentsAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexFilePath(value: Uri => IndexedResourceCandidate): Self = StObject.set(x, "indexFilePath", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IResourceIndexerFactory extends StObject {
    
    def createResourceIndexer(projectRoot: Uri): ResourceIndexer = js.native
  }
  object IResourceIndexerFactory {
    
    @scala.inline
    def apply(createResourceIndexer: Uri => ResourceIndexer): IResourceIndexerFactory = {
      val __obj = js.Dynamic.literal(createResourceIndexer = js.Any.fromFunction1(createResourceIndexer))
      __obj.asInstanceOf[IResourceIndexerFactory]
    }
    
    @scala.inline
    implicit class IResourceIndexerFactoryMutableBuilder[Self <: IResourceIndexerFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateResourceIndexer(value: Uri => ResourceIndexer): Self = StObject.set(x, "createResourceIndexer", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IndexedResourceCandidate extends IIndexedResourceCandidate
  object IndexedResourceCandidate {
    
    @scala.inline
    def apply(
      getQualifierValue: String => String,
      metadata: IMapView[String, String],
      qualifiers: IVectorView[IndexedResourceQualifier],
      `type`: IndexedResourceType,
      uri: Uri,
      valueAsString: String
    ): IndexedResourceCandidate = {
      val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), metadata = metadata.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedResourceCandidate]
    }
  }
  
  @js.native
  trait IndexedResourceQualifier extends IIndexedResourceQualifier
  object IndexedResourceQualifier {
    
    @scala.inline
    def apply(qualifierName: String, qualifierValue: String): IndexedResourceQualifier = {
      val __obj = js.Dynamic.literal(qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedResourceQualifier]
    }
  }
  
  @js.native
  trait ResourceIndexer extends IResourceIndexer
  object ResourceIndexer {
    
    @scala.inline
    def apply(
      indexFileContentsAsync: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]],
      indexFilePath: Uri => IndexedResourceCandidate
    ): ResourceIndexer = {
      val __obj = js.Dynamic.literal(indexFileContentsAsync = js.Any.fromFunction1(indexFileContentsAsync), indexFilePath = js.Any.fromFunction1(indexFilePath))
      __obj.asInstanceOf[ResourceIndexer]
    }
  }
}
