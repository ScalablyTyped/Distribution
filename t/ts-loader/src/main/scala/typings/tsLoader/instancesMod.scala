package typings.tsLoader

import typings.tsLoader.anon.Error
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.interfacesMod.TSInstance
import typings.typescript.mod.OutputFile
import typings.typescript.mod.ResolvedProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancesMod {
  
  @JSImport("ts-loader/dist/instances", "forEachResolvedProjectReference")
  @js.native
  def forEachResolvedProjectReference[T](
    resolvedProjectReferences: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* resolvedProjectReference */ ResolvedProjectReference, js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  @JSImport("ts-loader/dist/instances", "forEachResolvedProjectReference")
  @js.native
  def forEachResolvedProjectReference[T](
    resolvedProjectReferences: js.Array[js.UndefOr[ResolvedProjectReference]],
    cb: js.Function1[/* resolvedProjectReference */ ResolvedProjectReference, js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  
  @JSImport("ts-loader/dist/instances", "getEmitFromWatchHost")
  @js.native
  def getEmitFromWatchHost(instance: TSInstance): js.UndefOr[js.Array[OutputFile]] = js.native
  @JSImport("ts-loader/dist/instances", "getEmitFromWatchHost")
  @js.native
  def getEmitFromWatchHost(instance: TSInstance, filePath: String): js.UndefOr[js.Array[OutputFile]] = js.native
  
  @JSImport("ts-loader/dist/instances", "getEmitOutput")
  @js.native
  def getEmitOutput(instance: TSInstance, filePath: String): js.Array[OutputFile] = js.native
  
  @JSImport("ts-loader/dist/instances", "getTypeScriptInstance")
  @js.native
  def getTypeScriptInstance(
    loaderOptions: LoaderOptions,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any
  ): Error = js.native
  
  @JSImport("ts-loader/dist/instances", "isReferencedFile")
  @js.native
  def isReferencedFile(instance: TSInstance, filePath: String): Boolean = js.native
}
