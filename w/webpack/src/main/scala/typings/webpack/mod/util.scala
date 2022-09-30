package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable0
import typings.webpack.webpackBooleans.`true`
import typings.webpack.webpackInts.`-1`
import typings.webpack.webpackInts.`0`
import typings.webpack.webpackInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("webpack", "util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleverMerge[T, O](first: T, second: O): T | O | (T & O) = (^.asInstanceOf[js.Dynamic].applyDynamic("cleverMerge")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[T | O | (T & O)]
  
  object comparators {
    
    @JSImport("webpack", "util.comparators")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webpack", "util.comparators.compareChunkGroupsByIndex")
    @js.native
    def compareChunkGroupsByIndex: js.Function2[/* a */ ChunkGroup, /* b */ ChunkGroup, `0` | `1` | `-1`] = js.native
    inline def compareChunkGroupsByIndex_=(x: js.Function2[/* a */ ChunkGroup, /* b */ ChunkGroup, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChunkGroupsByIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareChunks")
    @js.native
    def compareChunks: ParameterizedComparator[ChunkGraph, Chunk] = js.native
    
    @JSImport("webpack", "util.comparators.compareChunksById")
    @js.native
    def compareChunksById: js.Function2[/* a */ Chunk, /* b */ Chunk, `0` | `1` | `-1`] = js.native
    inline def compareChunksById_=(x: js.Function2[/* a */ Chunk, /* b */ Chunk, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChunksById")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareChunksNatural")
    @js.native
    def compareChunksNatural: js.Function1[/* chunkGraph */ ChunkGraph, Comparator[Chunk]] = js.native
    inline def compareChunksNatural_=(x: js.Function1[/* chunkGraph */ ChunkGraph, Comparator[Chunk]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChunksNatural")(x.asInstanceOf[js.Any])
    
    inline def compareChunks_=(x: ParameterizedComparator[ChunkGraph, Chunk]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareChunks")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareIds")
    @js.native
    def compareIds: js.Function2[/* a */ String | Double, /* b */ String | Double, `0` | `1` | `-1`] = js.native
    inline def compareIds_=(x: js.Function2[/* a */ String | Double, /* b */ String | Double, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareIds")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareIterables")
    @js.native
    def compareIterables: js.Function1[/* elementComparator */ Comparator[Any], Comparator[js.Iterable[Any]]] = js.native
    inline def compareIterables_=(x: js.Function1[/* elementComparator */ Comparator[Any], Comparator[js.Iterable[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareIterables")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareLocations")
    @js.native
    def compareLocations: js.Function2[/* a */ DependencyLocation, /* b */ DependencyLocation, `0` | `1` | `-1`] = js.native
    inline def compareLocations_=(x: js.Function2[/* a */ DependencyLocation, /* b */ DependencyLocation, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareLocations")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareModulesById")
    @js.native
    def compareModulesById: ParameterizedComparator[ChunkGraph, Module] = js.native
    
    @JSImport("webpack", "util.comparators.compareModulesByIdOrIdentifier")
    @js.native
    def compareModulesByIdOrIdentifier: ParameterizedComparator[ChunkGraph, Module] = js.native
    inline def compareModulesByIdOrIdentifier_=(x: ParameterizedComparator[ChunkGraph, Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareModulesByIdOrIdentifier")(x.asInstanceOf[js.Any])
    
    inline def compareModulesById_=(x: ParameterizedComparator[ChunkGraph, Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareModulesById")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareModulesByIdentifier")
    @js.native
    def compareModulesByIdentifier: js.Function2[/* a */ Module, /* b */ Module, `0` | `1` | `-1`] = js.native
    inline def compareModulesByIdentifier_=(x: js.Function2[/* a */ Module, /* b */ Module, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareModulesByIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareModulesByPostOrderIndexOrIdentifier")
    @js.native
    def compareModulesByPostOrderIndexOrIdentifier: ParameterizedComparator[ModuleGraph, Module] = js.native
    inline def compareModulesByPostOrderIndexOrIdentifier_=(x: ParameterizedComparator[ModuleGraph, Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareModulesByPostOrderIndexOrIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareModulesByPreOrderIndexOrIdentifier")
    @js.native
    def compareModulesByPreOrderIndexOrIdentifier: ParameterizedComparator[ModuleGraph, Module] = js.native
    inline def compareModulesByPreOrderIndexOrIdentifier_=(x: ParameterizedComparator[ModuleGraph, Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareModulesByPreOrderIndexOrIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareNumbers")
    @js.native
    def compareNumbers: js.Function2[/* a */ Double, /* b */ Double, `0` | `1` | `-1`] = js.native
    inline def compareNumbers_=(x: js.Function2[/* a */ Double, /* b */ Double, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareNumbers")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareSelect")
    @js.native
    def compareSelect: js.Function2[/* getter */ Selector[Any, Any], /* comparator */ Comparator[Any], Comparator[Any]] = js.native
    inline def compareSelect_=(
      x: js.Function2[/* getter */ Selector[Any, Any], /* comparator */ Comparator[Any], Comparator[Any]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareSelect")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.compareStrings")
    @js.native
    def compareStrings: js.Function2[/* a */ String, /* b */ String, `0` | `1` | `-1`] = js.native
    
    @JSImport("webpack", "util.comparators.compareStringsNumeric")
    @js.native
    def compareStringsNumeric: js.Function2[/* a */ String, /* b */ String, `0` | `1` | `-1`] = js.native
    inline def compareStringsNumeric_=(x: js.Function2[/* a */ String, /* b */ String, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareStringsNumeric")(x.asInstanceOf[js.Any])
    
    inline def compareStrings_=(x: js.Function2[/* a */ String, /* b */ String, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareStrings")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.concatComparators")
    @js.native
    def concatComparators: js.Function3[
        /* c1 */ Comparator[Any], 
        /* c2 */ Comparator[Any], 
        /* repeated */ Comparator[Any], 
        Comparator[Any]
      ] = js.native
    inline def concatComparators_=(
      x: js.Function3[
          /* c1 */ Comparator[Any], 
          /* c2 */ Comparator[Any], 
          /* repeated */ Comparator[Any], 
          Comparator[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatComparators")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.comparators.keepOriginalOrder")
    @js.native
    def keepOriginalOrder: js.Function1[/* iterable */ js.Iterable[Any], Comparator[Any]] = js.native
    inline def keepOriginalOrder_=(x: js.Function1[/* iterable */ js.Iterable[Any], Comparator[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keepOriginalOrder")(x.asInstanceOf[js.Any])
  }
  
  inline def createHash(algorithm: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  inline def createHash(algorithm: Instantiable0[Hash]): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  object runtime {
    
    @JSImport("webpack", "util.runtime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webpack", "util.runtime.compareRuntime")
    @js.native
    def compareRuntime: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, `0` | `1` | `-1`] = js.native
    inline def compareRuntime_=(x: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, `0` | `1` | `-1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareRuntime")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.filterRuntime")
    @js.native
    def filterRuntime: js.Function2[
        /* runtime */ RuntimeSpec, 
        /* filter */ js.Function1[/* arg0 */ RuntimeSpec, Boolean], 
        js.UndefOr[String | Boolean | SortableSet[String]]
      ] = js.native
    inline def filterRuntime_=(
      x: js.Function2[
          /* runtime */ RuntimeSpec, 
          /* filter */ js.Function1[/* arg0 */ RuntimeSpec, Boolean], 
          js.UndefOr[String | Boolean | SortableSet[String]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterRuntime")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.forEachRuntime")
    @js.native
    def forEachRuntime: js.Function3[
        /* runtime */ RuntimeSpec, 
        /* fn */ js.Function1[/* arg0 */ String, Unit], 
        /* deterministicOrder */ js.UndefOr[Boolean], 
        Unit
      ] = js.native
    inline def forEachRuntime_=(
      x: js.Function3[
          /* runtime */ RuntimeSpec, 
          /* fn */ js.Function1[/* arg0 */ String, Unit], 
          /* deterministicOrder */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forEachRuntime")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.getEntryRuntime")
    @js.native
    def getEntryRuntime: js.Function3[
        /* compilation */ Compilation, 
        /* name */ String, 
        /* options */ js.UndefOr[EntryOptions], 
        RuntimeSpec
      ] = js.native
    inline def getEntryRuntime_=(
      x: js.Function3[
          /* compilation */ Compilation, 
          /* name */ String, 
          /* options */ js.UndefOr[EntryOptions], 
          RuntimeSpec
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getEntryRuntime")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.getRuntimeKey")
    @js.native
    def getRuntimeKey: js.Function1[/* runtime */ RuntimeSpec, String] = js.native
    inline def getRuntimeKey_=(x: js.Function1[/* runtime */ RuntimeSpec, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRuntimeKey")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.intersectRuntime")
    @js.native
    def intersectRuntime: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec] = js.native
    inline def intersectRuntime_=(x: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intersectRuntime")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.keyToRuntime")
    @js.native
    def keyToRuntime: js.Function1[/* key */ String, RuntimeSpec] = js.native
    inline def keyToRuntime_=(x: js.Function1[/* key */ String, RuntimeSpec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyToRuntime")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.mergeRuntime")
    @js.native
    def mergeRuntime: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec] = js.native
    
    @JSImport("webpack", "util.runtime.mergeRuntimeCondition")
    @js.native
    def mergeRuntimeCondition: js.Function3[
        /* a */ RuntimeCondition, 
        /* b */ RuntimeCondition, 
        /* runtime */ RuntimeSpec, 
        RuntimeCondition
      ] = js.native
    
    @JSImport("webpack", "util.runtime.mergeRuntimeConditionNonFalse")
    @js.native
    def mergeRuntimeConditionNonFalse: js.Function3[
        /* a */ js.UndefOr[String | `true` | SortableSet[String]], 
        /* b */ js.UndefOr[String | `true` | SortableSet[String]], 
        /* runtime */ RuntimeSpec, 
        js.UndefOr[String | `true` | SortableSet[String]]
      ] = js.native
    inline def mergeRuntimeConditionNonFalse_=(
      x: js.Function3[
          /* a */ js.UndefOr[String | `true` | SortableSet[String]], 
          /* b */ js.UndefOr[String | `true` | SortableSet[String]], 
          /* runtime */ RuntimeSpec, 
          js.UndefOr[String | `true` | SortableSet[String]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeRuntimeConditionNonFalse")(x.asInstanceOf[js.Any])
    
    inline def mergeRuntimeCondition_=(
      x: js.Function3[
          /* a */ RuntimeCondition, 
          /* b */ RuntimeCondition, 
          /* runtime */ RuntimeSpec, 
          RuntimeCondition
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeRuntimeCondition")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.mergeRuntimeOwned")
    @js.native
    def mergeRuntimeOwned: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec] = js.native
    inline def mergeRuntimeOwned_=(x: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeRuntimeOwned")(x.asInstanceOf[js.Any])
    
    inline def mergeRuntime_=(x: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeRuntime")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.runtimeConditionToString")
    @js.native
    def runtimeConditionToString: js.Function1[/* runtimeCondition */ RuntimeCondition, String] = js.native
    inline def runtimeConditionToString_=(x: js.Function1[/* runtimeCondition */ RuntimeCondition, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtimeConditionToString")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.runtimeEqual")
    @js.native
    def runtimeEqual: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, Boolean] = js.native
    inline def runtimeEqual_=(x: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtimeEqual")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.runtimeToString")
    @js.native
    def runtimeToString: js.Function1[/* runtime */ RuntimeSpec, String] = js.native
    inline def runtimeToString_=(x: js.Function1[/* runtime */ RuntimeSpec, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtimeToString")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "util.runtime.subtractRuntime")
    @js.native
    def subtractRuntime: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec] = js.native
    
    @JSImport("webpack", "util.runtime.subtractRuntimeCondition")
    @js.native
    def subtractRuntimeCondition: js.Function3[
        /* a */ RuntimeCondition, 
        /* b */ RuntimeCondition, 
        /* runtime */ RuntimeSpec, 
        RuntimeCondition
      ] = js.native
    inline def subtractRuntimeCondition_=(
      x: js.Function3[
          /* a */ RuntimeCondition, 
          /* b */ RuntimeCondition, 
          /* runtime */ RuntimeSpec, 
          RuntimeCondition
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtractRuntimeCondition")(x.asInstanceOf[js.Any])
    
    inline def subtractRuntime_=(x: js.Function2[/* a */ RuntimeSpec, /* b */ RuntimeSpec, RuntimeSpec]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtractRuntime")(x.asInstanceOf[js.Any])
  }
  
  object serialization {
    
    @JSImport("webpack", "util.serialization")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webpack", "util.serialization.NOT_SERIALIZABLE")
    @js.native
    val NOT_SERIALIZABLE: js.Object = js.native
    
    @JSImport("webpack", "util.serialization.buffersSerializer")
    @js.native
    val buffersSerializer: Serializer = js.native
    
    @JSImport("webpack", "util.serialization.createFileSerializer")
    @js.native
    def createFileSerializer: js.Function2[/* fs */ js.UndefOr[Any], /* hashFunction */ js.UndefOr[Any], Serializer] = js.native
    inline def createFileSerializer_=(x: js.Function2[/* fs */ js.UndefOr[Any], /* hashFunction */ js.UndefOr[Any], Serializer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFileSerializer")(x.asInstanceOf[js.Any])
    
    inline def register(Constructor: Constructor, request: String, name: String, serializer: ObjectSerializer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(Constructor.asInstanceOf[js.Any], request.asInstanceOf[js.Any], name.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerLoader(regExp: js.RegExp, loader: js.Function1[/* arg0 */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLoader")(regExp.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerNotSerializable(Constructor: Constructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNotSerializable")(Constructor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
