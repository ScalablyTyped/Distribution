package typings.testcafeSafeStorage

import typings.testcafeSafeStorage.libErrorsMod.CODES
import typings.testcafeSafeStorage.libErrorsMod.RAU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("testcafe-safe-storage", JSImport.Default)
  @js.native
  open class default[T] () extends SafeStorage[T] {
    def this(validator: Validator[T]) = this()
    def this(validator: Unit, cryptoContext: typings.testcafeSafeStorage.libCryptoMod.default) = this()
    def this(validator: Validator[T], cryptoContext: typings.testcafeSafeStorage.libCryptoMod.default) = this()
  }
  
  @JSImport("testcafe-safe-storage", "SafeStorage")
  @js.native
  open class SafeStorage[T] () extends StObject {
    def this(validator: Validator[T]) = this()
    def this(validator: Unit, cryptoContext: typings.testcafeSafeStorage.libCryptoMod.default) = this()
    def this(validator: Validator[T], cryptoContext: typings.testcafeSafeStorage.libCryptoMod.default) = this()
    
    /* private */ var _decrypt: Any = js.native
    
    /* private */ var _encrypt: Any = js.native
    
    def _safeLoad(): js.Promise[Any] = js.native
    
    /* private */ var cryptoContext: Any = js.native
    
    def load(): js.Promise[T] = js.native
    
    def save(data: T): js.Promise[Unit] = js.native
    
    def tryLoad[D](): js.Promise[js.UndefOr[T | D]] = js.native
    def tryLoad[D](options: TryLoadOptions[D]): js.Promise[js.UndefOr[T | D]] = js.native
    
    /* private */ var validator: Any = js.native
  }
  
  object errors {
    
    @JSImport("testcafe-safe-storage", "errors.CODES")
    @js.native
    object CODES extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.testcafeSafeStorage.libErrorsMod.CODES & Double] = js.native
      
      /* 1 */ val E001: typings.testcafeSafeStorage.libErrorsMod.CODES.E001 & Double = js.native
      
      /* 2 */ val E002: typings.testcafeSafeStorage.libErrorsMod.CODES.E002 & Double = js.native
      
      /* 3 */ val E003: typings.testcafeSafeStorage.libErrorsMod.CODES.E003 & Double = js.native
    }
    
    @JSImport("testcafe-safe-storage", "errors.LoadedDataInvalid")
    @js.native
    open class LoadedDataInvalid[T /* <: RAU */] ()
      extends typings.testcafeSafeStorage.libErrorsMod.LoadedDataInvalid[T]
    
    @JSImport("testcafe-safe-storage", "errors.MultipleSavedDataDetected")
    @js.native
    open class MultipleSavedDataDetected[T /* <: RAU */] ()
      extends typings.testcafeSafeStorage.libErrorsMod.MultipleSavedDataDetected[T]
    
    @JSImport("testcafe-safe-storage", "errors.SavedDataNotDetected")
    @js.native
    open class SavedDataNotDetected[T /* <: RAU */] ()
      extends typings.testcafeSafeStorage.libErrorsMod.SavedDataNotDetected[T]
  }
  
  type ErrorSuppressor = CODES | js.Function
  
  trait TryLoadOptions[T] extends StObject {
    
    var default: js.UndefOr[T] = js.undefined
    
    var suppress: js.UndefOr[js.Array[ErrorSuppressor]] = js.undefined
  }
  object TryLoadOptions {
    
    inline def apply[T](): TryLoadOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TryLoadOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TryLoadOptions[?], T] (val x: Self & TryLoadOptions[T]) extends AnyVal {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setSuppress(value: js.Array[ErrorSuppressor]): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
      
      inline def setSuppressUndefined: Self = StObject.set(x, "suppress", js.undefined)
      
      inline def setSuppressVarargs(value: ErrorSuppressor*): Self = StObject.set(x, "suppress", js.Array(value*))
    }
  }
  
  type Validator[T] = js.Function1[/* a */ Any, /* is T */ Boolean]
}
