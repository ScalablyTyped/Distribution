package typings.winrt.Windows.ApplicationModel.Resources

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IObservableMap
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

object Core {
  
  @js.native
  trait INamedResource extends StObject {
    
    var candidates: IVectorView[ResourceCandidate] = js.native
    
    def resolve(): ResourceCandidate = js.native
    def resolve(resourceContext: ResourceContext): ResourceCandidate = js.native
    
    def resolveAll(): IVectorView[ResourceCandidate] = js.native
    def resolveAll(resourceContext: ResourceContext): IVectorView[ResourceCandidate] = js.native
    
    var uri: Uri = js.native
  }
  
  trait IResourceCandidate extends StObject {
    
    def getQualifierValue(qualifierName: String): String
    
    def getValueAsFileAsync(): IAsyncOperation[StorageFile]
    
    var isDefault: Boolean
    
    var isMatch: Boolean
    
    var isMatchAsDefault: Boolean
    
    var qualifiers: IVectorView[ResourceQualifier]
    
    var valueAsString: String
  }
  object IResourceCandidate {
    
    inline def apply(
      getQualifierValue: String => String,
      getValueAsFileAsync: () => IAsyncOperation[StorageFile],
      isDefault: Boolean,
      isMatch: Boolean,
      isMatchAsDefault: Boolean,
      qualifiers: IVectorView[ResourceQualifier],
      valueAsString: String
    ): IResourceCandidate = {
      val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResourceCandidate]
    }
    
    extension [Self <: IResourceCandidate](x: Self) {
      
      inline def setGetQualifierValue(value: String => String): Self = StObject.set(x, "getQualifierValue", js.Any.fromFunction1(value))
      
      inline def setGetValueAsFileAsync(value: () => IAsyncOperation[StorageFile]): Self = StObject.set(x, "getValueAsFileAsync", js.Any.fromFunction0(value))
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setIsMatchAsDefault(value: Boolean): Self = StObject.set(x, "isMatchAsDefault", value.asInstanceOf[js.Any])
      
      inline def setQualifiers(value: IVectorView[ResourceQualifier]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      inline def setValueAsString(value: String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResourceContext extends StObject {
    
    var languages: IVectorView[String] = js.native
    
    def overrideToMatch(result: IIterable[ResourceQualifier]): Unit = js.native
    
    var qualifierValues: IObservableMap[String, String] = js.native
    
    def reset(): Unit = js.native
    def reset(qualifierNames: IIterable[String]): Unit = js.native
  }
  
  trait IResourceContextStatics extends StObject {
    
    def createMatchingContext(result: IIterable[ResourceQualifier]): ResourceContext
  }
  object IResourceContextStatics {
    
    inline def apply(createMatchingContext: IIterable[ResourceQualifier] => ResourceContext): IResourceContextStatics = {
      val __obj = js.Dynamic.literal(createMatchingContext = js.Any.fromFunction1(createMatchingContext))
      __obj.asInstanceOf[IResourceContextStatics]
    }
    
    extension [Self <: IResourceContextStatics](x: Self) {
      
      inline def setCreateMatchingContext(value: IIterable[ResourceQualifier] => ResourceContext): Self = StObject.set(x, "createMatchingContext", js.Any.fromFunction1(value))
    }
  }
  
  trait IResourceManager extends StObject {
    
    var allResourceMaps: IMapView[String, ResourceMap]
    
    var defaultContext: ResourceContext
    
    def loadPriFiles(files: IIterable[IStorageFile]): Unit
    
    var mainResourceMap: ResourceMap
    
    def unloadPriFiles(files: IIterable[IStorageFile]): Unit
  }
  object IResourceManager {
    
    inline def apply(
      allResourceMaps: IMapView[String, ResourceMap],
      defaultContext: ResourceContext,
      loadPriFiles: IIterable[IStorageFile] => Unit,
      mainResourceMap: ResourceMap,
      unloadPriFiles: IIterable[IStorageFile] => Unit
    ): IResourceManager = {
      val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
      __obj.asInstanceOf[IResourceManager]
    }
    
    extension [Self <: IResourceManager](x: Self) {
      
      inline def setAllResourceMaps(value: IMapView[String, ResourceMap]): Self = StObject.set(x, "allResourceMaps", value.asInstanceOf[js.Any])
      
      inline def setDefaultContext(value: ResourceContext): Self = StObject.set(x, "defaultContext", value.asInstanceOf[js.Any])
      
      inline def setLoadPriFiles(value: IIterable[IStorageFile] => Unit): Self = StObject.set(x, "loadPriFiles", js.Any.fromFunction1(value))
      
      inline def setMainResourceMap(value: ResourceMap): Self = StObject.set(x, "mainResourceMap", value.asInstanceOf[js.Any])
      
      inline def setUnloadPriFiles(value: IIterable[IStorageFile] => Unit): Self = StObject.set(x, "unloadPriFiles", js.Any.fromFunction1(value))
    }
  }
  
  trait IResourceManagerStatics extends StObject {
    
    var current: ResourceManager
    
    def isResourceReference(resourceReference: String): Boolean
  }
  object IResourceManagerStatics {
    
    inline def apply(current: ResourceManager, isResourceReference: String => Boolean): IResourceManagerStatics = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], isResourceReference = js.Any.fromFunction1(isResourceReference))
      __obj.asInstanceOf[IResourceManagerStatics]
    }
    
    extension [Self <: IResourceManagerStatics](x: Self) {
      
      inline def setCurrent(value: ResourceManager): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setIsResourceReference(value: String => Boolean): Self = StObject.set(x, "isResourceReference", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IResourceMap
    extends StObject
       with IMapView[String, NamedResource] {
    
    def getSubtree(reference: String): ResourceMap = js.native
    
    def getValue(resource: String): ResourceCandidate = js.native
    def getValue(resource: String, context: ResourceContext): ResourceCandidate = js.native
    
    var uri: Uri = js.native
  }
  
  trait IResourceQualifier extends StObject {
    
    var isDefault: Boolean
    
    var isMatch: Boolean
    
    var qualifierName: String
    
    var qualifierValue: String
    
    var score: Double
  }
  object IResourceQualifier {
    
    inline def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): IResourceQualifier = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResourceQualifier]
    }
    
    extension [Self <: IResourceQualifier](x: Self) {
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setQualifierName(value: String): Self = StObject.set(x, "qualifierName", value.asInstanceOf[js.Any])
      
      inline def setQualifierValue(value: String): Self = StObject.set(x, "qualifierValue", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NamedResource
    extends StObject
       with INamedResource
  
  trait ResourceCandidate
    extends StObject
       with IResourceCandidate
  object ResourceCandidate {
    
    inline def apply(
      getQualifierValue: String => String,
      getValueAsFileAsync: () => IAsyncOperation[StorageFile],
      isDefault: Boolean,
      isMatch: Boolean,
      isMatchAsDefault: Boolean,
      qualifiers: IVectorView[ResourceQualifier],
      valueAsString: String
    ): ResourceCandidate = {
      val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceCandidate]
    }
  }
  
  @js.native
  trait ResourceCandidateVectorView
    extends StObject
       with IVectorView[ResourceCandidate]
  
  @js.native
  trait ResourceContext
    extends StObject
       with IResourceContext
  
  @js.native
  trait ResourceContextLanguagesVectorView
    extends StObject
       with IVectorView[String]
  
  trait ResourceManager
    extends StObject
       with IResourceManager
  object ResourceManager {
    
    inline def apply(
      allResourceMaps: IMapView[String, ResourceMap],
      defaultContext: ResourceContext,
      loadPriFiles: IIterable[IStorageFile] => Unit,
      mainResourceMap: ResourceMap,
      unloadPriFiles: IIterable[IStorageFile] => Unit
    ): ResourceManager = {
      val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
      __obj.asInstanceOf[ResourceManager]
    }
  }
  
  @js.native
  trait ResourceMap
    extends StObject
       with IResourceMap
  
  trait ResourceMapIterator
    extends StObject
       with IIterator[IKeyValuePair[String, NamedResource]]
  object ResourceMapIterator {
    
    inline def apply(
      current: IKeyValuePair[String, NamedResource],
      getMany: () => Items[IKeyValuePair[String, NamedResource]],
      hasCurrent: Boolean,
      moveNext: () => Boolean
    ): ResourceMapIterator = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[ResourceMapIterator]
    }
  }
  
  trait ResourceMapMapView
    extends StObject
       with IMapView[String, ResourceMap]
  object ResourceMapMapView {
    
    inline def apply(
      first: () => IIterator[IKeyValuePair[String, ResourceMap]],
      hasKey: String => Boolean,
      lookup: String => ResourceMap,
      size: Double,
      split: () => First[String, ResourceMap]
    ): ResourceMapMapView = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
      __obj.asInstanceOf[ResourceMapMapView]
    }
  }
  
  trait ResourceMapMapViewIterator
    extends StObject
       with IIterator[IKeyValuePair[String, ResourceMap]]
  object ResourceMapMapViewIterator {
    
    inline def apply(
      current: IKeyValuePair[String, ResourceMap],
      getMany: () => Items[IKeyValuePair[String, ResourceMap]],
      hasCurrent: Boolean,
      moveNext: () => Boolean
    ): ResourceMapMapViewIterator = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[ResourceMapMapViewIterator]
    }
  }
  
  trait ResourceQualifier
    extends StObject
       with IResourceQualifier
  object ResourceQualifier {
    
    inline def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): ResourceQualifier = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceQualifier]
    }
  }
  
  trait ResourceQualifierMapView
    extends StObject
       with IMapView[String, String]
  object ResourceQualifierMapView {
    
    inline def apply(
      first: () => IIterator[IKeyValuePair[String, String]],
      hasKey: String => Boolean,
      lookup: String => String,
      size: Double,
      split: () => First[String, String]
    ): ResourceQualifierMapView = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
      __obj.asInstanceOf[ResourceQualifierMapView]
    }
  }
  
  trait ResourceQualifierObservableMap
    extends StObject
       with IObservableMap[String, String]
  object ResourceQualifierObservableMap {
    
    inline def apply(
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[String, String]],
      getView: () => IMapView[String, String],
      hasKey: String => Boolean,
      insert: (String, String) => Boolean,
      lookup: String => String,
      onmapchanged: js.Any,
      remove: String => Unit,
      size: Double
    ): ResourceQualifierObservableMap = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceQualifierObservableMap]
    }
  }
  
  @js.native
  trait ResourceQualifierVectorView
    extends StObject
       with IVectorView[ResourceQualifier]
}
