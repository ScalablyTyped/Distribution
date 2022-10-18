package typings.testcafeSafeStorage

import typings.std.Error
import typings.testcafeSafeStorage.libUtilsTemplateMod.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorsMod {
  
  @js.native
  sealed trait CODES extends StObject
  @JSImport("testcafe-safe-storage/lib/errors", "CODES")
  @js.native
  object CODES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CODES & Double] = js.native
    
    @js.native
    sealed trait E001
      extends StObject
         with CODES
    /* 1 */ val E001: typings.testcafeSafeStorage.libErrorsMod.CODES.E001 & Double = js.native
    
    @js.native
    sealed trait E002
      extends StObject
         with CODES
    /* 2 */ val E002: typings.testcafeSafeStorage.libErrorsMod.CODES.E002 & Double = js.native
    
    @js.native
    sealed trait E003
      extends StObject
         with CODES
    /* 3 */ val E003: typings.testcafeSafeStorage.libErrorsMod.CODES.E003 & Double = js.native
  }
  
  @JSImport("testcafe-safe-storage/lib/errors", "LoadedDataInvalid")
  @js.native
  open class LoadedDataInvalid[T /* <: RAU */] ()
    extends StObject
       with BaseError[T] {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName("template")
    var template_LoadedDataInvalid: Template[js.Array[Any]] = js.native
  }
  
  @JSImport("testcafe-safe-storage/lib/errors", "MultipleSavedDataDetected")
  @js.native
  open class MultipleSavedDataDetected[T /* <: RAU */] ()
    extends StObject
       with BaseError[T] {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName("template")
    var template_MultipleSavedDataDetected: Template[js.Array[Any]] = js.native
  }
  
  @JSImport("testcafe-safe-storage/lib/errors", "SavedDataNotDetected")
  @js.native
  open class SavedDataNotDetected[T /* <: RAU */] ()
    extends StObject
       with BaseError[T] {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName("template")
    var template_SavedDataNotDetected: Template[js.Array[Any]] = js.native
  }
  
  @js.native
  trait BaseError[T /* <: js.Array[Any] */]
    extends StObject
       with Error {
    
    /* private */ var args: Any = js.native
    
    var code: CODES = js.native
    
    @JSName("message")
    def message_MBaseError: String = js.native
    
    var template: Template[T] = js.native
  }
  
  type RAU = js.Array[Any]
}
