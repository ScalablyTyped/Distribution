package typings.tufJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTmpfileMod {
  
  @JSImport("tuf-js/dist/utils/tmpfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withTempFile[T](handler: TempFileHandler[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTempFile")(handler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  type TempFileHandler[T] = js.Function1[/* file */ String, js.Promise[T]]
}
