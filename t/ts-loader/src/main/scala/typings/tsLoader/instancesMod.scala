package typings.tsLoader

import typings.tsLoader.anon.Error
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.interfacesMod.TSInstance
import typings.typescript.mod.OutputFile
import typings.typescript.mod.ResolvedProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancesMod {
  
  @JSImport("ts-loader/dist/instances", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def forEachResolvedProjectReference[T](
    resolvedProjectReferences: js.Array[js.UndefOr[ResolvedProjectReference]],
    cb: js.Function1[/* resolvedProjectReference */ ResolvedProjectReference, js.UndefOr[T]]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachResolvedProjectReference")(resolvedProjectReferences.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def forEachResolvedProjectReference[T](
    resolvedProjectReferences: Unit,
    cb: js.Function1[/* resolvedProjectReference */ ResolvedProjectReference, js.UndefOr[T]]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachResolvedProjectReference")(resolvedProjectReferences.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def getEmitFromWatchHost(instance: TSInstance): js.UndefOr[js.Array[OutputFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmitFromWatchHost")(instance.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[OutputFile]]]
  @scala.inline
  def getEmitFromWatchHost(instance: TSInstance, filePath: String): js.UndefOr[js.Array[OutputFile]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmitFromWatchHost")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[OutputFile]]]
  
  @scala.inline
  def getEmitOutput(instance: TSInstance, filePath: String): js.Array[OutputFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmitOutput")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Array[OutputFile]]
  
  @scala.inline
  def getTypeScriptInstance(
    loaderOptions: LoaderOptions,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any
  ): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptInstance")(loaderOptions.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  @scala.inline
  def isReferencedFile(instance: TSInstance, filePath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferencedFile")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
