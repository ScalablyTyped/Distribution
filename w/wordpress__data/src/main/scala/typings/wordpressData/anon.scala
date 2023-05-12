package typings.wordpressData

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressData.buildTypesReduxStoreMetadataReducerMod.StateValue
import typings.wordpressData.wordpressDataStrings.FAIL_RESOLUTION
import typings.wordpressData.wordpressDataStrings.FAIL_RESOLUTIONS
import typings.wordpressData.wordpressDataStrings.FINISH_RESOLUTION
import typings.wordpressData.wordpressDataStrings.FINISH_RESOLUTIONS
import typings.wordpressData.wordpressDataStrings.INVALIDATE_RESOLUTION
import typings.wordpressData.wordpressDataStrings.INVALIDATE_RESOLUTION_FOR_STORE
import typings.wordpressData.wordpressDataStrings.INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR
import typings.wordpressData.wordpressDataStrings.START_RESOLUTION
import typings.wordpressData.wordpressDataStrings.START_RESOLUTIONS
import typings.wordpressData.wordpressDataStrings.error
import typings.wordpressData.wordpressDataStrings.finished
import typings.wordpressData.wordpressDataStrings.resolving
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `type`: INVALIDATE_RESOLUTION_FOR_STORE
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("INVALIDATE_RESOLUTION_FOR_STORE")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setType(value: INVALIDATE_RESOLUTION_FOR_STORE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Args extends StObject {
    
    var args: js.Array[Any]
    
    var selectorName: String
    
    var `type`: START_RESOLUTION
  }
  object Args {
    
    inline def apply(args: js.Array[Any], selectorName: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("START_RESOLUTION")
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: START_RESOLUTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArgsSelectorName extends StObject {
    
    var args: js.Array[js.Array[Any]]
    
    var selectorName: String
    
    var `type`: FINISH_RESOLUTIONS
  }
  object ArgsSelectorName {
    
    inline def apply(args: js.Array[js.Array[Any]], selectorName: String): ArgsSelectorName = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FINISH_RESOLUTIONS")
      __obj.asInstanceOf[ArgsSelectorName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArgsSelectorName] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: FINISH_RESOLUTIONS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var args: js.Array[Any]
    
    var error: js.Error | Any
    
    var selectorName: String
    
    var `type`: FAIL_RESOLUTION
  }
  object Error {
    
    inline def apply(args: js.Array[Any], error: js.Error | Any, selectorName: String): Error = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FAIL_RESOLUTION")
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setError(value: js.Error | Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: FAIL_RESOLUTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorStatus
    extends StObject
       with StateValue {
    
    var error: js.Error | Any
    
    var status: error
  }
  object ErrorStatus {
    
    inline def apply(error: js.Error | Any): ErrorStatus = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = "error")
      __obj.asInstanceOf[ErrorStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorStatus] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error | Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors extends StObject {
    
    var args: js.Array[Any]
    
    var errors: js.Array[js.Error | Any]
    
    var selectorName: String
    
    var `type`: FAIL_RESOLUTIONS
  }
  object Errors {
    
    inline def apply(args: js.Array[Any], errors: js.Array[js.Error | Any], selectorName: String): Errors = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FAIL_RESOLUTIONS")
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setErrors(value: js.Array[js.Error | Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: (js.Error | Any)*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: FAIL_RESOLUTIONS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetActions extends StObject {
    
    def getActions(): StringDictionary[js.Function2[/* key */ Any, /* repeated */ Any, Any]]
    
    def getSelectors(): StringDictionary[js.Function2[/* key */ Any, /* repeated */ Any, Any]]
    
    def subscribe(): js.Function0[js.Function0[Unit]]
  }
  object GetActions {
    
    inline def apply(
      getActions: () => StringDictionary[js.Function2[/* key */ Any, /* repeated */ Any, Any]],
      getSelectors: () => StringDictionary[js.Function2[/* key */ Any, /* repeated */ Any, Any]],
      subscribe: () => js.Function0[js.Function0[Unit]]
    ): GetActions = {
      val __obj = js.Dynamic.literal(getActions = js.Any.fromFunction0(getActions), getSelectors = js.Any.fromFunction0(getSelectors), subscribe = js.Any.fromFunction0(subscribe))
      __obj.asInstanceOf[GetActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetActions] (val x: Self) extends AnyVal {
      
      inline def setGetActions(value: () => StringDictionary[js.Function2[/* key */ Any, /* repeated */ Any, Any]]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setGetSelectors(value: () => StringDictionary[js.Function2[/* key */ Any, /* repeated */ Any, Any]]): Self = StObject.set(x, "getSelectors", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: () => js.Function0[js.Function0[Unit]]): Self = StObject.set(x, "subscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait SelectorName extends StObject {
    
    var args: js.Array[Any]
    
    var selectorName: String
    
    var `type`: FINISH_RESOLUTION
  }
  object SelectorName {
    
    inline def apply(args: js.Array[Any], selectorName: String): SelectorName = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FINISH_RESOLUTION")
      __obj.asInstanceOf[SelectorName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorName] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: FINISH_RESOLUTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectorNameString extends StObject {
    
    var selectorName: String
    
    var `type`: INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR
  }
  object SelectorNameString {
    
    inline def apply(selectorName: String): SelectorNameString = {
      val __obj = js.Dynamic.literal(selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR")
      __obj.asInstanceOf[SelectorNameString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorNameString] (val x: Self) extends AnyVal {
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: INVALIDATE_RESOLUTION_FOR_STORE_SELECTOR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectorNameType extends StObject {
    
    var args: js.Array[Any]
    
    var selectorName: String
    
    var `type`: INVALIDATE_RESOLUTION
  }
  object SelectorNameType {
    
    inline def apply(args: js.Array[Any], selectorName: String): SelectorNameType = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("INVALIDATE_RESOLUTION")
      __obj.asInstanceOf[SelectorNameType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorNameType] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: INVALIDATE_RESOLUTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status
    extends StObject
       with StateValue {
    
    var status: resolving | finished
  }
  object Status {
    
    inline def apply(status: resolving | finished): Status = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: resolving | finished): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var args: js.Array[js.Array[Any]]
    
    var selectorName: String
    
    var `type`: START_RESOLUTIONS
  }
  object Type {
    
    inline def apply(args: js.Array[js.Array[Any]], selectorName: String): Type = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selectorName = selectorName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("START_RESOLUTIONS")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setSelectorName(value: String): Self = StObject.set(x, "selectorName", value.asInstanceOf[js.Any])
      
      inline def setType(value: START_RESOLUTIONS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
