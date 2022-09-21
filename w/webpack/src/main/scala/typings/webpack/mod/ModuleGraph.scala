package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable6
import typings.std.Map
import typings.webpack.anon.TypeofModuleGraphConnecti
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ModuleGraph")
@js.native
open class ModuleGraph () extends StObject {
  
  def addExplanation(dependency: Dependency, explanation: String): Unit = js.native
  
  def addExtraReason(module: Module, explanation: String): Unit = js.native
  
  def cached[T /* <: js.Array[Any] */, V](
    fn: js.Function2[/* moduleGraph */ this.type, /* args */ T, V],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): V = js.native
  
  def cloneModuleAttributes(sourceModule: Module, targetModule: Module): Unit = js.native
  
  def copyOutgoingModuleConnections(
    oldModule: Module,
    newModule: Module,
    filterConnection: js.Function1[/* arg0 */ ModuleGraphConnection, Boolean]
  ): Unit = js.native
  
  def dependencyCacheProvide(dependency: Dependency, args: Any*): Any = js.native
  
  def freeze(): Unit = js.native
  def freeze(cacheStage: String): Unit = js.native
  
  def getConnection(dependency: Dependency): js.UndefOr[ModuleGraphConnection] = js.native
  
  def getDepth(module: Module): Double = js.native
  
  def getExportInfo(module: Module, exportName: String): ExportInfo = js.native
  
  def getExportsInfo(module: Module): ExportsInfo = js.native
  
  def getIncomingConnections(module: Module): js.Iterable[ModuleGraphConnection] = js.native
  
  def getIncomingConnectionsByOriginModule(module: Module): Map[js.UndefOr[Module], js.Array[ModuleGraphConnection]] = js.native
  
  def getIssuer(module: Module): Null | Module = js.native
  
  def getMeta(): js.Object = js.native
  def getMeta(thing: Any): js.Object = js.native
  
  def getMetaIfExisting(): js.Object = js.native
  def getMetaIfExisting(thing: Any): js.Object = js.native
  
  def getModule(dependency: Dependency): Module = js.native
  
  def getOptimizationBailout(module: Module): js.Array[String | (js.Function1[/* requestShortener */ RequestShortener, String])] = js.native
  
  def getOrigin(dependency: Dependency): Module = js.native
  
  def getOutgoingConnections(module: Module): js.Iterable[ModuleGraphConnection] = js.native
  
  def getOutgoingConnectionsByModule(module: Module): js.UndefOr[Map[js.UndefOr[Module], js.Array[ModuleGraphConnection]]] = js.native
  
  def getParentBlock(dependency: Dependency): DependenciesBlock = js.native
  
  def getParentBlockIndex(dependency: Dependency): Double = js.native
  
  def getParentModule(dependency: Dependency): Module = js.native
  
  def getPostOrderIndex(module: Module): Double = js.native
  
  def getPreOrderIndex(module: Module): Double = js.native
  
  def getProfile(module: Module): Null | ModuleProfile = js.native
  
  def getProvidedExports(module: Module): Null | `true` | js.Array[String] = js.native
  
  def getReadOnlyExportInfo(module: Module, exportName: String): ExportInfo = js.native
  
  def getResolvedModule(dependency: Dependency): Module = js.native
  
  def getResolvedOrigin(dependency: Dependency): Module = js.native
  
  def getUsedExports(module: Module, runtime: RuntimeSpec): Null | Boolean | SortableSet[String] = js.native
  
  def isAsync(module: Module): Boolean = js.native
  
  def isExportProvided(module: Module, exportName: String): Null | Boolean = js.native
  def isExportProvided(module: Module, exportName: js.Array[String]): Null | Boolean = js.native
  
  def moveModuleConnections(
    oldModule: Module,
    newModule: Module,
    filterConnection: js.Function1[/* arg0 */ ModuleGraphConnection, Boolean]
  ): Unit = js.native
  
  def removeAllModuleAttributes(): Unit = js.native
  
  def removeConnection(dependency: Dependency): Unit = js.native
  
  def removeModuleAttributes(module: Module): Unit = js.native
  
  def setAsync(module: Module): Unit = js.native
  
  def setDepth(module: Module, depth: Double): Unit = js.native
  
  def setDepthIfLower(module: Module, depth: Double): Boolean = js.native
  
  def setIssuer(module: Module): Unit = js.native
  def setIssuer(module: Module, issuer: Module): Unit = js.native
  
  def setIssuerIfUnset(module: Module): Unit = js.native
  def setIssuerIfUnset(module: Module, issuer: Module): Unit = js.native
  
  def setModuleMemCaches(moduleMemCaches: Map[Module, WeakTupleMap[Any, Any]]): Unit = js.native
  
  def setParents(dependency: Dependency, block: DependenciesBlock, module: Module): Unit = js.native
  def setParents(dependency: Dependency, block: DependenciesBlock, module: Module, indexInBlock: Double): Unit = js.native
  
  def setPostOrderIndex(module: Module, index: Double): Unit = js.native
  
  def setPostOrderIndexIfUnset(module: Module, index: Double): Boolean = js.native
  
  def setPreOrderIndex(module: Module, index: Double): Unit = js.native
  
  def setPreOrderIndexIfUnset(module: Module, index: Double): Boolean = js.native
  
  def setProfile(module: Module): Unit = js.native
  def setProfile(module: Module, profile: ModuleProfile): Unit = js.native
  
  def setResolvedModule(originModule: Module, dependency: Dependency, module: Module): Unit = js.native
  
  def unfreeze(): Unit = js.native
  
  def updateModule(dependency: Dependency, module: Module): Unit = js.native
}
object ModuleGraph {
  
  @JSImport("webpack", "ModuleGraph")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("webpack", "ModuleGraph.ModuleGraphConnection")
  @js.native
  open class ModuleGraphConnection protected ()
    extends typings.webpack.mod.ModuleGraphConnection {
    def this(originModule: Null, dependency: Null, module: Module) = this()
    def this(originModule: Null, dependency: Dependency, module: Module) = this()
    def this(originModule: Module, dependency: Null, module: Module) = this()
    def this(originModule: Module, dependency: Dependency, module: Module) = this()
    def this(originModule: Null, dependency: Null, module: Module, explanation: String) = this()
    def this(originModule: Null, dependency: Dependency, module: Module, explanation: String) = this()
    def this(originModule: Module, dependency: Null, module: Module, explanation: String) = this()
    def this(originModule: Module, dependency: Dependency, module: Module, explanation: String) = this()
    def this(originModule: Null, dependency: Null, module: Module, explanation: String, weak: Boolean) = this()
    def this(originModule: Null, dependency: Null, module: Module, explanation: Unit, weak: Boolean) = this()
    def this(originModule: Null, dependency: Dependency, module: Module, explanation: String, weak: Boolean) = this()
    def this(originModule: Null, dependency: Dependency, module: Module, explanation: Unit, weak: Boolean) = this()
    def this(originModule: Module, dependency: Null, module: Module, explanation: String, weak: Boolean) = this()
    def this(originModule: Module, dependency: Null, module: Module, explanation: Unit, weak: Boolean) = this()
    def this(originModule: Module, dependency: Dependency, module: Module, explanation: String, weak: Boolean) = this()
    def this(originModule: Module, dependency: Dependency, module: Module, explanation: Unit, weak: Boolean) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: `false`
    ) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: `false`
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: `false`
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Null,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Null,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: String,
      weak: Unit,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Boolean,
      condition: `false`
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: js.Function2[
            /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
            /* arg1 */ RuntimeSpec, 
            ConnectionState
          ]
    ) = this()
    def this(
      originModule: Module,
      dependency: Dependency,
      module: Module,
      explanation: Unit,
      weak: Unit,
      condition: `false`
    ) = this()
  }
  /* static member */
  /* was `typeof ModuleGraphConnection` */
  @JSImport("webpack", "ModuleGraph.ModuleGraphConnection")
  @js.native
  def ModuleGraphConnection: TypeofModuleGraphConnecti & (Instantiable6[
    /* originModule */ Null | Module, 
    /* dependency */ Null | Dependency, 
    /* module */ Module, 
    /* explanation */ js.UndefOr[String], 
    /* weak */ js.UndefOr[Boolean], 
    /* condition */ js.UndefOr[
      `false` | (js.Function2[
        /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
        /* arg1 */ RuntimeSpec, 
        ConnectionState
      ])
    ], 
    typings.webpack.mod.ModuleGraphConnection
  ]) = js.native
  inline def ModuleGraphConnection_=(
    x: TypeofModuleGraphConnecti & (Instantiable6[
      /* originModule */ Null | Module, 
      /* dependency */ Null | Dependency, 
      /* module */ Module, 
      /* explanation */ js.UndefOr[String], 
      /* weak */ js.UndefOr[Boolean], 
      /* condition */ js.UndefOr[
        `false` | (js.Function2[
          /* arg0 */ typings.webpack.mod.ModuleGraphConnection, 
          /* arg1 */ RuntimeSpec, 
          ConnectionState
        ])
      ], 
      typings.webpack.mod.ModuleGraphConnection
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModuleGraphConnection")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def clearModuleGraphForModule(module: Module): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearModuleGraphForModule")(module.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def getModuleGraphForModule(module: Module, deprecateMessage: String, deprecationCode: String): ModuleGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleGraphForModule")(module.asInstanceOf[js.Any], deprecateMessage.asInstanceOf[js.Any], deprecationCode.asInstanceOf[js.Any])).asInstanceOf[ModuleGraph]
  
  /* static member */
  inline def setModuleGraphForModule(module: Module, moduleGraph: ModuleGraph): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModuleGraphForModule")(module.asInstanceOf[js.Any], moduleGraph.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
