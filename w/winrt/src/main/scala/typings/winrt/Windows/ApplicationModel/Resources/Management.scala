package typings.winrt.Windows.ApplicationModel.Resources

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  @js.native
  sealed trait IndexedResourceType extends StObject
  @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
  @js.native
  object IndexedResourceType extends StObject {
    
    @js.native
    sealed trait path
      extends StObject
         with IndexedResourceType
    
    @js.native
    sealed trait string
      extends StObject
         with IndexedResourceType
  }
  
  trait IIndexedResourceCandidate extends StObject {
    
    def getQualifierValue(qualifierName: String): String
    
    var metadata: IMapView[String, String]
    
    var qualifiers: IVectorView[IndexedResourceQualifier]
    
    var `type`: IndexedResourceType
    
    var uri: Uri
    
    var valueAsString: String
  }
  object IIndexedResourceCandidate {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IIndexedResourceCandidate] (val x: Self) extends AnyVal {
      
      inline def setGetQualifierValue(value: String => String): Self = StObject.set(x, "getQualifierValue", js.Any.fromFunction1(value))
      
      inline def setMetadata(value: IMapView[String, String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setQualifiers(value: IVectorView[IndexedResourceQualifier]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      inline def setType(value: IndexedResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setValueAsString(value: String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  trait IIndexedResourceQualifier extends StObject {
    
    var qualifierName: String
    
    var qualifierValue: String
  }
  object IIndexedResourceQualifier {
    
    inline def apply(qualifierName: String, qualifierValue: String): IIndexedResourceQualifier = {
      val __obj = js.Dynamic.literal(qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIndexedResourceQualifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IIndexedResourceQualifier] (val x: Self) extends AnyVal {
      
      inline def setQualifierName(value: String): Self = StObject.set(x, "qualifierName", value.asInstanceOf[js.Any])
      
      inline def setQualifierValue(value: String): Self = StObject.set(x, "qualifierValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResourceIndexer extends StObject {
    
    def indexFileContentsAsync(file: Uri): IAsyncOperation[IVectorView[IndexedResourceCandidate]]
    
    def indexFilePath(filePath: Uri): IndexedResourceCandidate
  }
  object IResourceIndexer {
    
    inline def apply(
      indexFileContentsAsync: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]],
      indexFilePath: Uri => IndexedResourceCandidate
    ): IResourceIndexer = {
      val __obj = js.Dynamic.literal(indexFileContentsAsync = js.Any.fromFunction1(indexFileContentsAsync), indexFilePath = js.Any.fromFunction1(indexFilePath))
      __obj.asInstanceOf[IResourceIndexer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResourceIndexer] (val x: Self) extends AnyVal {
      
      inline def setIndexFileContentsAsync(value: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]]): Self = StObject.set(x, "indexFileContentsAsync", js.Any.fromFunction1(value))
      
      inline def setIndexFilePath(value: Uri => IndexedResourceCandidate): Self = StObject.set(x, "indexFilePath", js.Any.fromFunction1(value))
    }
  }
  
  trait IResourceIndexerFactory extends StObject {
    
    def createResourceIndexer(projectRoot: Uri): ResourceIndexer
  }
  object IResourceIndexerFactory {
    
    inline def apply(createResourceIndexer: Uri => ResourceIndexer): IResourceIndexerFactory = {
      val __obj = js.Dynamic.literal(createResourceIndexer = js.Any.fromFunction1(createResourceIndexer))
      __obj.asInstanceOf[IResourceIndexerFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResourceIndexerFactory] (val x: Self) extends AnyVal {
      
      inline def setCreateResourceIndexer(value: Uri => ResourceIndexer): Self = StObject.set(x, "createResourceIndexer", js.Any.fromFunction1(value))
    }
  }
  
  trait IndexedResourceCandidate
    extends StObject
       with IIndexedResourceCandidate
  object IndexedResourceCandidate {
    
    inline def apply(
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
  
  trait IndexedResourceQualifier
    extends StObject
       with IIndexedResourceQualifier
  object IndexedResourceQualifier {
    
    inline def apply(qualifierName: String, qualifierValue: String): IndexedResourceQualifier = {
      val __obj = js.Dynamic.literal(qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedResourceQualifier]
    }
  }
  
  trait ResourceIndexer
    extends StObject
       with IResourceIndexer
  object ResourceIndexer {
    
    inline def apply(
      indexFileContentsAsync: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]],
      indexFilePath: Uri => IndexedResourceCandidate
    ): ResourceIndexer = {
      val __obj = js.Dynamic.literal(indexFileContentsAsync = js.Any.fromFunction1(indexFileContentsAsync), indexFilePath = js.Any.fromFunction1(indexFilePath))
      __obj.asInstanceOf[ResourceIndexer]
    }
  }
}
