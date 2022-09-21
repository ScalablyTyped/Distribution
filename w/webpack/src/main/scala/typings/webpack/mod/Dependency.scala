package typings.webpack.mod

import typings.webpack.anon.Read
import typings.webpack.anon.Write
import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Dependency")
@js.native
open class Dependency () extends StObject {
  
  val category: String = js.native
  
  def couldAffectReferencingModule(): Boolean | js.Symbol = js.native
  
  def createIgnoredModule(context: String): Module = js.native
  
  def deserialize(__0: Read): Unit = js.native
  
  val disconnect: Any = js.native
  
  def getCondition(moduleGraph: ModuleGraph): Null | `false` | (js.Function2[/* arg0 */ ModuleGraphConnection, /* arg1 */ RuntimeSpec, ConnectionState]) = js.native
  
  def getContext(): js.UndefOr[String] = js.native
  
  /**
  	 * Returns errors
  	 */
  def getErrors(moduleGraph: ModuleGraph): js.Array[WebpackError] = js.native
  
  /**
  	 * Returns the exported names
  	 */
  def getExports(moduleGraph: ModuleGraph): js.UndefOr[ExportsSpec] = js.native
  
  def getModuleEvaluationSideEffectsState(moduleGraph: ModuleGraph): ConnectionState = js.native
  
  /**
  	 * implement this method to allow the occurrence order plugin to count correctly
  	 */
  def getNumberOfIdOccurrences(): Double = js.native
  
  /**
  	 * Returns the referenced module and export
  	 */
  def getReference(moduleGraph: ModuleGraph): scala.Nothing = js.native
  
  /**
  	 * Returns list of exports referenced by this dependency
  	 */
  def getReferencedExports(moduleGraph: ModuleGraph, runtime: RuntimeSpec): js.Array[js.Array[String] | ReferencedExport] = js.native
  
  def getResourceIdentifier(): Null | String = js.native
  
  /**
  	 * Returns warnings
  	 */
  def getWarnings(moduleGraph: ModuleGraph): js.Array[WebpackError] = js.native
  
  var loc: DependencyLocation = js.native
  
  var module: Any = js.native
  
  var optional: Boolean = js.native
  
  def serialize(__0: Write): Unit = js.native
  
  def setLoc(): Unit = js.native
  def setLoc(startLine: Any): Unit = js.native
  def setLoc(startLine: Any, startColumn: Any): Unit = js.native
  def setLoc(startLine: Any, startColumn: Any, endLine: Any): Unit = js.native
  def setLoc(startLine: Any, startColumn: Any, endLine: Any, endColumn: Any): Unit = js.native
  def setLoc(startLine: Any, startColumn: Any, endLine: Unit, endColumn: Any): Unit = js.native
  def setLoc(startLine: Any, startColumn: Unit, endLine: Any): Unit = js.native
  def setLoc(startLine: Any, startColumn: Unit, endLine: Any, endColumn: Any): Unit = js.native
  def setLoc(startLine: Any, startColumn: Unit, endLine: Unit, endColumn: Any): Unit = js.native
  def setLoc(startLine: Unit, startColumn: Any): Unit = js.native
  def setLoc(startLine: Unit, startColumn: Any, endLine: Any): Unit = js.native
  def setLoc(startLine: Unit, startColumn: Any, endLine: Any, endColumn: Any): Unit = js.native
  def setLoc(startLine: Unit, startColumn: Any, endLine: Unit, endColumn: Any): Unit = js.native
  def setLoc(startLine: Unit, startColumn: Unit, endLine: Any): Unit = js.native
  def setLoc(startLine: Unit, startColumn: Unit, endLine: Any, endColumn: Any): Unit = js.native
  def setLoc(startLine: Unit, startColumn: Unit, endLine: Unit, endColumn: Any): Unit = js.native
  
  val `type`: String = js.native
  
  /**
  	 * Update the hash
  	 */
  def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit = js.native
  
  var weak: Boolean = js.native
}
object Dependency {
  
  @JSImport("webpack", "Dependency")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("webpack", "Dependency.EXPORTS_OBJECT_REFERENCED")
  @js.native
  def EXPORTS_OBJECT_REFERENCED: js.Array[js.Array[String]] = js.native
  inline def EXPORTS_OBJECT_REFERENCED_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPORTS_OBJECT_REFERENCED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webpack", "Dependency.NO_EXPORTS_REFERENCED")
  @js.native
  def NO_EXPORTS_REFERENCED: js.Array[js.Array[String]] = js.native
  inline def NO_EXPORTS_REFERENCED_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_EXPORTS_REFERENCED")(x.asInstanceOf[js.Any])
  
  /* static member */
  /* was `typeof TRANSITIVE` */
  @JSImport("webpack", "Dependency.TRANSITIVE")
  @js.native
  def TRANSITIVE: js.Symbol = js.native
  inline def TRANSITIVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITIVE")(x.asInstanceOf[js.Any])
}
