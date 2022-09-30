package typings.swcNodeRegister

import typings.swcNodeRegister.anon.CompilerOptionsfallbackTo
import typings.swcNodeRegister.anon.PartialCompilerOptionsfal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swcNodeRegisterMod {
  
  @JSImport("@swc-node/register/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(sourcecode: String, filename: String, options: CompilerOptionsfallbackTo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(sourcecode.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def register(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[js.Function0[Unit]]
  inline def register(options: Unit, hookOpts: js.Object): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(options.asInstanceOf[js.Any], hookOpts.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def register(options: PartialCompilerOptionsfal): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def register(options: PartialCompilerOptionsfal, hookOpts: js.Object): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(options.asInstanceOf[js.Any], hookOpts.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
