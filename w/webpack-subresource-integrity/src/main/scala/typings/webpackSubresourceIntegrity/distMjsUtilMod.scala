package typings.webpackSubresourceIntegrity

import typings.node.bufferMod.global.Buffer
import typings.std.Generator
import typings.std.Map
import typings.std.Record
import typings.std.ReturnType
import typings.std.Set
import typings.webpack.mod.AssetInfo
import typings.webpack.mod.Chunk
import typings.webpack.mod.Compilation
import typings.webpack.mod.Compiler
import typings.webpack.mod.Source
import typings.webpackSubresourceIntegrity.anon.FnCall
import typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsUtilMod {
  
  @JSImport("webpack-subresource-integrity/dist/mjs/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addIfNotExist[T](set: Set[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addIfNotExist")(set.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def allChunksInChunkIterable(chunk: Chunk): Generator[Chunk, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("allChunksInChunkIterable")(chunk.asInstanceOf[js.Any]).asInstanceOf[Generator[Chunk, Any, Any]]
  
  inline def allChunksInGroupIterable(chunkGroup: ChunkGroup): Generator[Chunk, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("allChunksInGroupIterable")(chunkGroup.asInstanceOf[js.Any]).asInstanceOf[Generator[Chunk, Any, Any]]
  
  inline def allChunksInPrimaryChunkIterable(chunk: Chunk): Generator[Chunk, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("allChunksInPrimaryChunkIterable")(chunk.asInstanceOf[js.Any]).asInstanceOf[Generator[Chunk, Any, Any]]
  
  inline def assert(value: Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  inline def computeIntegrity(hashFuncNames: js.Array[String], source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIntegrity")(hashFuncNames.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def computeIntegrity(hashFuncNames: js.Array[String], source: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIntegrity")(hashFuncNames.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findChunks(chunk: Chunk): Set[Chunk] = ^.asInstanceOf[js.Dynamic].applyDynamic("findChunks")(chunk.asInstanceOf[js.Any]).asInstanceOf[Set[Chunk]]
  
  inline def flatMap[T, TResult](collections: js.Iterable[T], fn: js.Function1[/* item */ T, js.Iterable[TResult]]): Generator[TResult, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(collections.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Generator[TResult, Any, Any]]
  
  inline def generateSriHashPlaceholders(chunks: js.Iterable[Chunk], hashFuncNames: Array[String]): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSriHashPlaceholders")(chunks.asInstanceOf[js.Any], hashFuncNames.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  inline def getTagSrc(tag: HtmlTagObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagSrc")(tag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def hasOwnProperty_[X /* <: js.Object */](obj: X, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[X /* <: js.Object */](obj: X, prop: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[X /* <: js.Object */](obj: X, prop: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersect[T](sets: js.Iterable[Set[T]]): Generator[T, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(sets.asInstanceOf[js.Any]).asInstanceOf[Generator[T, Any, Any]]
  
  inline def intersectSets[T](setsToIntersect: js.Iterable[Set[T]]): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectSets")(setsToIntersect.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
  
  inline def makePlaceholder(hashFuncNames: js.Array[String], id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makePlaceholder")(hashFuncNames.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def makePlaceholder(hashFuncNames: js.Array[String], id: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makePlaceholder")(hashFuncNames.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def map[T, TResult](items: js.Iterable[T], fn: js.Function1[/* item */ T, TResult]): Generator[TResult, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Generator[TResult, Any, Any]]
  
  inline def normalizePath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def notNil[TValue](): /* is TValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notNil")().asInstanceOf[/* is TValue */ Boolean]
  inline def notNil[TValue](value: TValue): /* is TValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notNil")(value.asInstanceOf[js.Any]).asInstanceOf[/* is TValue */ Boolean]
  
  @JSImport("webpack-subresource-integrity/dist/mjs/util", "placeholderPrefix")
  @js.native
  val placeholderPrefix: /* "*-*-*-CHUNK-SRI-HASH-" */ String = js.native
  
  @JSImport("webpack-subresource-integrity/dist/mjs/util", "placeholderRegex")
  @js.native
  val placeholderRegex: js.RegExp = js.native
  
  inline def replaceInSource(compiler: Compiler, source: Source, path: String, replacements: Map[String, String]): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceInSource")(compiler.asInstanceOf[js.Any], source.asInstanceOf[js.Any], path.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[Source]
  
  @JSImport("webpack-subresource-integrity/dist/mjs/util", "sriHashVariableReference")
  @js.native
  val sriHashVariableReference: /* "__webpack_require__.sriHashes" */ String = js.native
  
  inline def tryGetSource(source: Source): js.UndefOr[String | Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryGetSource")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Buffer]]
  
  inline def unionSet[T](sets: js.Iterable[T]*): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unionSet")(sets.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Set[T]]
  
  inline def updateAsset(
    compilation: Compilation,
    assetPath: String,
    source: Source,
    integrity: String,
    onUpdate: js.Function1[/* assetInfo */ AssetInfo, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAsset")(compilation.asInstanceOf[js.Any], assetPath.asInstanceOf[js.Any], source.asInstanceOf[js.Any], integrity.asInstanceOf[js.Any], onUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def usesAnyHash(assetInfo: AssetInfo): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usesAnyHash")(assetInfo.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ChunkGroup = ReturnType[FnCall]
}
