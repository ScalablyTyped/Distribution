package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.libConfigLoaderMod.ExplicitParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegisterMod {
  
  @JSImport("tsconfig-paths/lib/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[js.Function0[Unit]]
  inline def register(params: RegisterParams): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  trait RegisterParams
    extends StObject
       with ExplicitParams {
    
    /**
      * Defaults to `--project` CLI flag or `process.cwd()`
      */
    var cwd: js.UndefOr[String] = js.undefined
  }
  object RegisterParams {
    
    inline def apply(baseUrl: String, paths: StringDictionary[js.Array[String]]): RegisterParams = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterParams] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
}
