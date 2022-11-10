package typings.webpack.mod

import typings.webpack.anon.Read
import typings.webpack.anon.Write
import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dependency extends StObject {
  
  def category: String = js.native
  
  def couldAffectReferencingModule(): Boolean | js.Symbol = js.native
  
  def createIgnoredModule(context: String): Module = js.native
  
  def deserialize(__0: Read): Unit = js.native
  
  def disconnect: Any = js.native
  
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
  
  def `type`: String = js.native
  
  /**
  	 * Update the hash
  	 */
  def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit = js.native
  
  var weak: Boolean = js.native
}
