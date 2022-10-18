package typings.swcNodeRegister

import typings.swcNodeCore.mod.Options
import typings.swcNodeRegister.anon.PartialCompilerOptionsfal
import typings.swcNodeRegister.swcNodeRegisterStrings.`inline`
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReadDefaultTsconfigMod {
  
  @JSImport("@swc-node/register/lib/read-default-tsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSourcemapOption(options: CompilerOptions): Boolean | `inline` = ^.asInstanceOf[js.Dynamic].applyDynamic("createSourcemapOption")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean | `inline`]
  
  inline def readDefaultTsConfig(): PartialCompilerOptionsfal = ^.asInstanceOf[js.Dynamic].applyDynamic("readDefaultTsConfig")().asInstanceOf[PartialCompilerOptionsfal]
  inline def readDefaultTsConfig(tsConfigPath: String): PartialCompilerOptionsfal = ^.asInstanceOf[js.Dynamic].applyDynamic("readDefaultTsConfig")(tsConfigPath.asInstanceOf[js.Any]).asInstanceOf[PartialCompilerOptionsfal]
  
  inline def tsCompilerOptionsToSwcConfig(options: CompilerOptions, filename: String): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCompilerOptionsToSwcConfig")(options.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Options]
}
