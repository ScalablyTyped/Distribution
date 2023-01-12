package typings.webpackManifestPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.Number
import typings.std.Record
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import typings.webpackManifestPlugin.distHelpersMod.FileDescriptor
import typings.webpackManifestPlugin.webpackManifestPluginBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("webpack-manifest-plugin/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webpack-manifest-plugin/dist", "WebpackManifestPlugin")
  @js.native
  open class WebpackManifestPlugin protected ()
    extends StObject
       with WebpackPluginInstance {
    def this(opts: ManifestPluginOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var options: Any = js.native
  }
  
  inline def getCompilerHooks(compiler: Compiler): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type EmitCountMap = Map[Any, Any]
  
  trait InternalOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var assetHookStage: Double
    
    var basePath: String
    
    var fileName: String
    
    def filter(file: FileDescriptor): Boolean
    
    def generate(seed: Record[Any, Any], files: js.Array[FileDescriptor], entries: Record[String, js.Array[String]]): Manifest
    
    def map(file: FileDescriptor): FileDescriptor
    
    var publicPath: String
    
    var removeKeyHash: js.RegExp | `false`
    
    var seed: Record[Any, Any]
    
    def serialize(manifest: Manifest): String
    
    def sort(fileA: FileDescriptor, fileB: FileDescriptor): Number
    
    var transformExtensions: js.RegExp
    
    var useEntryKeys: Boolean
    
    var useLegacyEmit: Boolean
    
    var writeToFileEmit: Boolean
  }
  object InternalOptions {
    
    inline def apply(
      assetHookStage: Double,
      basePath: String,
      fileName: String,
      filter: FileDescriptor => Boolean,
      generate: (Record[Any, Any], js.Array[FileDescriptor], Record[String, js.Array[String]]) => Manifest,
      map: FileDescriptor => FileDescriptor,
      publicPath: String,
      removeKeyHash: js.RegExp | `false`,
      seed: Record[Any, Any],
      serialize: Manifest => String,
      sort: (FileDescriptor, FileDescriptor) => Number,
      transformExtensions: js.RegExp,
      useEntryKeys: Boolean,
      useLegacyEmit: Boolean,
      writeToFileEmit: Boolean
    ): InternalOptions = {
      val __obj = js.Dynamic.literal(assetHookStage = assetHookStage.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filter = js.Any.fromFunction1(filter), generate = js.Any.fromFunction3(generate), map = js.Any.fromFunction1(map), publicPath = publicPath.asInstanceOf[js.Any], removeKeyHash = removeKeyHash.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize), sort = js.Any.fromFunction2(sort), transformExtensions = transformExtensions.asInstanceOf[js.Any], useEntryKeys = useEntryKeys.asInstanceOf[js.Any], useLegacyEmit = useLegacyEmit.asInstanceOf[js.Any], writeToFileEmit = writeToFileEmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalOptions] (val x: Self) extends AnyVal {
      
      inline def setAssetHookStage(value: Double): Self = StObject.set(x, "assetHookStage", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: FileDescriptor => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setGenerate(value: (Record[Any, Any], js.Array[FileDescriptor], Record[String, js.Array[String]]) => Manifest): Self = StObject.set(x, "generate", js.Any.fromFunction3(value))
      
      inline def setMap(value: FileDescriptor => FileDescriptor): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setRemoveKeyHash(value: js.RegExp | `false`): Self = StObject.set(x, "removeKeyHash", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: Record[Any, Any]): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: Manifest => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSort(value: (FileDescriptor, FileDescriptor) => Number): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setTransformExtensions(value: js.RegExp): Self = StObject.set(x, "transformExtensions", value.asInstanceOf[js.Any])
      
      inline def setUseEntryKeys(value: Boolean): Self = StObject.set(x, "useEntryKeys", value.asInstanceOf[js.Any])
      
      inline def setUseLegacyEmit(value: Boolean): Self = StObject.set(x, "useLegacyEmit", value.asInstanceOf[js.Any])
      
      inline def setWriteToFileEmit(value: Boolean): Self = StObject.set(x, "writeToFileEmit", value.asInstanceOf[js.Any])
    }
  }
  
  type Manifest = Record[String, Any]
  
  /* Inlined std.Partial<webpack-manifest-plugin.webpack-manifest-plugin/dist.InternalOptions> */
  trait ManifestPluginOptions extends StObject {
    
    var assetHookStage: js.UndefOr[Double] = js.undefined
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* file */ FileDescriptor, Boolean]] = js.undefined
    
    var generate: js.UndefOr[
        js.Function3[
          /* seed */ Record[Any, Any], 
          /* files */ js.Array[FileDescriptor], 
          /* entries */ Record[String, js.Array[String]], 
          Manifest
        ]
      ] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* file */ FileDescriptor, FileDescriptor]] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
    
    var removeKeyHash: js.UndefOr[js.RegExp | `false`] = js.undefined
    
    var seed: js.UndefOr[Record[Any, Any]] = js.undefined
    
    var serialize: js.UndefOr[js.Function1[/* manifest */ Manifest, String]] = js.undefined
    
    var sort: js.UndefOr[js.Function2[/* fileA */ FileDescriptor, /* fileB */ FileDescriptor, Number]] = js.undefined
    
    var transformExtensions: js.UndefOr[js.RegExp] = js.undefined
    
    var useEntryKeys: js.UndefOr[Boolean] = js.undefined
    
    var useLegacyEmit: js.UndefOr[Boolean] = js.undefined
    
    var writeToFileEmit: js.UndefOr[Boolean] = js.undefined
  }
  object ManifestPluginOptions {
    
    inline def apply(): ManifestPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManifestPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ManifestPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setAssetHookStage(value: Double): Self = StObject.set(x, "assetHookStage", value.asInstanceOf[js.Any])
      
      inline def setAssetHookStageUndefined: Self = StObject.set(x, "assetHookStage", js.undefined)
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFilter(value: /* file */ FileDescriptor => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGenerate(
        value: (/* seed */ Record[Any, Any], /* files */ js.Array[FileDescriptor], /* entries */ Record[String, js.Array[String]]) => Manifest
      ): Self = StObject.set(x, "generate", js.Any.fromFunction3(value))
      
      inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      inline def setMap(value: /* file */ FileDescriptor => FileDescriptor): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setRemoveKeyHash(value: js.RegExp | `false`): Self = StObject.set(x, "removeKeyHash", value.asInstanceOf[js.Any])
      
      inline def setRemoveKeyHashUndefined: Self = StObject.set(x, "removeKeyHash", js.undefined)
      
      inline def setSeed(value: Record[Any, Any]): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSerialize(value: /* manifest */ Manifest => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setSort(value: (/* fileA */ FileDescriptor, /* fileB */ FileDescriptor) => Number): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTransformExtensions(value: js.RegExp): Self = StObject.set(x, "transformExtensions", value.asInstanceOf[js.Any])
      
      inline def setTransformExtensionsUndefined: Self = StObject.set(x, "transformExtensions", js.undefined)
      
      inline def setUseEntryKeys(value: Boolean): Self = StObject.set(x, "useEntryKeys", value.asInstanceOf[js.Any])
      
      inline def setUseEntryKeysUndefined: Self = StObject.set(x, "useEntryKeys", js.undefined)
      
      inline def setUseLegacyEmit(value: Boolean): Self = StObject.set(x, "useLegacyEmit", value.asInstanceOf[js.Any])
      
      inline def setUseLegacyEmitUndefined: Self = StObject.set(x, "useLegacyEmit", js.undefined)
      
      inline def setWriteToFileEmit(value: Boolean): Self = StObject.set(x, "writeToFileEmit", value.asInstanceOf[js.Any])
      
      inline def setWriteToFileEmitUndefined: Self = StObject.set(x, "writeToFileEmit", js.undefined)
    }
  }
}
