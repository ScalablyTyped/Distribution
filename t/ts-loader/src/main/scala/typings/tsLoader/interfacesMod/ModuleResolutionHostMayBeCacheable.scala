package typings.tsLoader.interfacesMod

import typings.std.NonNullable
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleResolutionHostMayBeCacheable
  extends StObject
     with ModuleResolutionHost
     with HostMayBeCacheable {
  
  @JSName("directoryExists")
  var directoryExists_ModuleResolutionHostMayBeCacheable: NonNullable[js.UndefOr[js.Function1[/* directoryName */ String, Boolean]]] = js.native
  
  @JSName("getCurrentDirectory")
  var getCurrentDirectory_ModuleResolutionHostMayBeCacheable: NonNullable[js.UndefOr[js.Function0[String]]] = js.native
  
  def getDefaultLibFileName(options: CompilerOptions): String = js.native
  @JSName("getDefaultLibFileName")
  var getDefaultLibFileName_Original: NonNullable[js.Function1[/* options */ CompilerOptions, String]] = js.native
  
  @JSName("getDirectories")
  var getDirectories_ModuleResolutionHostMayBeCacheable: NonNullable[js.UndefOr[js.Function1[/* path */ String, js.Array[String]]]] = js.native
  
  var getNewLine: NonNullable[js.UndefOr[js.Function0[String]]] = js.native
  
  var readDirectory: NonNullable[
    js.UndefOr[
      js.Function5[
        /* path */ String, 
        /* extensions */ js.UndefOr[js.Array[String]], 
        /* exclude */ js.UndefOr[js.Array[String]], 
        /* include */ js.UndefOr[js.Array[String]], 
        /* depth */ js.UndefOr[Double], 
        js.Array[String]
      ]
    ]
  ] = js.native
  
  def readFile(filePath: String, encoding: String): js.UndefOr[String] = js.native
  
  @JSName("trace")
  var trace_ModuleResolutionHostMayBeCacheable: NonNullable[js.UndefOr[js.Function1[/* s */ String, Unit]]] = js.native
  
  @JSName("useCaseSensitiveFileNames")
  var useCaseSensitiveFileNames_ModuleResolutionHostMayBeCacheable: NonNullable[js.UndefOr[js.Function0[Boolean]]] = js.native
}
