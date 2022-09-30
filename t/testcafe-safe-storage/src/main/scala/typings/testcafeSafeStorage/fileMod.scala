package typings.testcafeSafeStorage

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("testcafe-safe-storage/lib/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("testcafe-safe-storage/lib/file", "CRYPTO_DIR")
  @js.native
  val CRYPTO_DIR: /* ".tcpk" */ String = js.native
  
  @js.native
  sealed trait FILE_TYPE extends StObject
  @JSImport("testcafe-safe-storage/lib/file", "FILE_TYPE")
  @js.native
  object FILE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FILE_TYPE & Double] = js.native
    
    @js.native
    sealed trait AUTH_TAG
      extends StObject
         with FILE_TYPE
    /* 2 */ val AUTH_TAG: typings.testcafeSafeStorage.fileMod.FILE_TYPE.AUTH_TAG & Double = js.native
    
    @js.native
    sealed trait NONCE
      extends StObject
         with FILE_TYPE
    /* 1 */ val NONCE: typings.testcafeSafeStorage.fileMod.FILE_TYPE.NONCE & Double = js.native
    
    @js.native
    sealed trait PASSPHRASE
      extends StObject
         with FILE_TYPE
    /* 4 */ val PASSPHRASE: typings.testcafeSafeStorage.fileMod.FILE_TYPE.PASSPHRASE & Double = js.native
    
    @js.native
    sealed trait PRIVATE_KEY
      extends StObject
         with FILE_TYPE
    /* 3 */ val PRIVATE_KEY: typings.testcafeSafeStorage.fileMod.FILE_TYPE.PRIVATE_KEY & Double = js.native
    
    @js.native
    sealed trait STORAGE
      extends StObject
         with FILE_TYPE
    /* 0 */ val STORAGE: typings.testcafeSafeStorage.fileMod.FILE_TYPE.STORAGE & Double = js.native
  }
  
  @JSImport("testcafe-safe-storage/lib/file", "STORAGE_DIR")
  @js.native
  val STORAGE_DIR: /* ".tcss" */ String = js.native
  
  inline def load(`type`: FILE_TYPE): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def save(`type`: FILE_TYPE, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def save(`type`: FILE_TYPE, data: Buffer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
