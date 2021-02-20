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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait IResourceCandidate extends StObject {
    
    def getQualifierValue(qualifierName: String): String = js.native
    
    def getValueAsFileAsync(): IAsyncOperation[StorageFile] = js.native
    
    var isDefault: Boolean = js.native
    
    var isMatch: Boolean = js.native
    
    var isMatchAsDefault: Boolean = js.native
    
    var qualifiers: IVectorView[ResourceQualifier] = js.native
    
    var valueAsString: String = js.native
  }
  object IResourceCandidate {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IResourceCandidateMutableBuilder[Self <: IResourceCandidate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetQualifierValue(value: String => String): Self = StObject.set(x, "getQualifierValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueAsFileAsync(value: () => IAsyncOperation[StorageFile]): Self = StObject.set(x, "getValueAsFileAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMatchAsDefault(value: Boolean): Self = StObject.set(x, "isMatchAsDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifiers(value: IVectorView[ResourceQualifier]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueAsString(value: String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait IResourceContextStatics extends StObject {
    
    def createMatchingContext(result: IIterable[ResourceQualifier]): ResourceContext = js.native
  }
  object IResourceContextStatics {
    
    @scala.inline
    def apply(createMatchingContext: IIterable[ResourceQualifier] => ResourceContext): IResourceContextStatics = {
      val __obj = js.Dynamic.literal(createMatchingContext = js.Any.fromFunction1(createMatchingContext))
      __obj.asInstanceOf[IResourceContextStatics]
    }
    
    @scala.inline
    implicit class IResourceContextStaticsMutableBuilder[Self <: IResourceContextStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateMatchingContext(value: IIterable[ResourceQualifier] => ResourceContext): Self = StObject.set(x, "createMatchingContext", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IResourceManager extends StObject {
    
    var allResourceMaps: IMapView[String, ResourceMap] = js.native
    
    var defaultContext: ResourceContext = js.native
    
    def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
    
    var mainResourceMap: ResourceMap = js.native
    
    def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
  }
  object IResourceManager {
    
    @scala.inline
    def apply(
      allResourceMaps: IMapView[String, ResourceMap],
      defaultContext: ResourceContext,
      loadPriFiles: IIterable[IStorageFile] => Unit,
      mainResourceMap: ResourceMap,
      unloadPriFiles: IIterable[IStorageFile] => Unit
    ): IResourceManager = {
      val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
      __obj.asInstanceOf[IResourceManager]
    }
    
    @scala.inline
    implicit class IResourceManagerMutableBuilder[Self <: IResourceManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllResourceMaps(value: IMapView[String, ResourceMap]): Self = StObject.set(x, "allResourceMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultContext(value: ResourceContext): Self = StObject.set(x, "defaultContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadPriFiles(value: IIterable[IStorageFile] => Unit): Self = StObject.set(x, "loadPriFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMainResourceMap(value: ResourceMap): Self = StObject.set(x, "mainResourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnloadPriFiles(value: IIterable[IStorageFile] => Unit): Self = StObject.set(x, "unloadPriFiles", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IResourceManagerStatics extends StObject {
    
    var current: ResourceManager = js.native
    
    def isResourceReference(resourceReference: String): Boolean = js.native
  }
  object IResourceManagerStatics {
    
    @scala.inline
    def apply(current: ResourceManager, isResourceReference: String => Boolean): IResourceManagerStatics = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], isResourceReference = js.Any.fromFunction1(isResourceReference))
      __obj.asInstanceOf[IResourceManagerStatics]
    }
    
    @scala.inline
    implicit class IResourceManagerStaticsMutableBuilder[Self <: IResourceManagerStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: ResourceManager): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResourceReference(value: String => Boolean): Self = StObject.set(x, "isResourceReference", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IResourceMap extends IMapView[String, NamedResource] {
    
    def getSubtree(reference: String): ResourceMap = js.native
    
    def getValue(resource: String): ResourceCandidate = js.native
    def getValue(resource: String, context: ResourceContext): ResourceCandidate = js.native
    
    var uri: Uri = js.native
  }
  
  @js.native
  trait IResourceQualifier extends StObject {
    
    var isDefault: Boolean = js.native
    
    var isMatch: Boolean = js.native
    
    var qualifierName: String = js.native
    
    var qualifierValue: String = js.native
    
    var score: Double = js.native
  }
  object IResourceQualifier {
    
    @scala.inline
    def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): IResourceQualifier = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResourceQualifier]
    }
    
    @scala.inline
    implicit class IResourceQualifierMutableBuilder[Self <: IResourceQualifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierName(value: String): Self = StObject.set(x, "qualifierName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierValue(value: String): Self = StObject.set(x, "qualifierValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NamedResource extends INamedResource
  
  @js.native
  trait ResourceCandidate extends IResourceCandidate
  object ResourceCandidate {
    
    @scala.inline
    def apply(
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
  trait ResourceCandidateVectorView extends IVectorView[ResourceCandidate]
  
  @js.native
  trait ResourceContext extends IResourceContext
  
  @js.native
  trait ResourceContextLanguagesVectorView extends IVectorView[String]
  
  @js.native
  trait ResourceManager extends IResourceManager
  object ResourceManager {
    
    @scala.inline
    def apply(
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
  trait ResourceMap extends IResourceMap
  
  @js.native
  trait ResourceMapIterator extends IIterator[IKeyValuePair[String, NamedResource]]
  object ResourceMapIterator {
    
    @scala.inline
    def apply(
      current: IKeyValuePair[String, NamedResource],
      getMany: () => Items[IKeyValuePair[String, NamedResource]],
      hasCurrent: Boolean,
      moveNext: () => Boolean
    ): ResourceMapIterator = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[ResourceMapIterator]
    }
  }
  
  @js.native
  trait ResourceMapMapView extends IMapView[String, ResourceMap]
  object ResourceMapMapView {
    
    @scala.inline
    def apply(
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
  
  @js.native
  trait ResourceMapMapViewIterator extends IIterator[IKeyValuePair[String, ResourceMap]]
  object ResourceMapMapViewIterator {
    
    @scala.inline
    def apply(
      current: IKeyValuePair[String, ResourceMap],
      getMany: () => Items[IKeyValuePair[String, ResourceMap]],
      hasCurrent: Boolean,
      moveNext: () => Boolean
    ): ResourceMapMapViewIterator = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[ResourceMapMapViewIterator]
    }
  }
  
  @js.native
  trait ResourceQualifier extends IResourceQualifier
  object ResourceQualifier {
    
    @scala.inline
    def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): ResourceQualifier = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceQualifier]
    }
  }
  
  @js.native
  trait ResourceQualifierMapView extends IMapView[String, String]
  object ResourceQualifierMapView {
    
    @scala.inline
    def apply(
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
  
  @js.native
  trait ResourceQualifierObservableMap extends IObservableMap[String, String]
  object ResourceQualifierObservableMap {
    
    @scala.inline
    def apply(
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
  trait ResourceQualifierVectorView extends IVectorView[ResourceQualifier]
}
