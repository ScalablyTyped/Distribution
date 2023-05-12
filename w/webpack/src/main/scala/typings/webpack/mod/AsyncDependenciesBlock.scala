package typings.webpack.mod

import typings.webpack.anon.namestringundefinedentryO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "AsyncDependenciesBlock")
@js.native
open class AsyncDependenciesBlock protected ()
  extends StObject
     with DependenciesBlock {
  def this(groupOptions: namestringundefinedentryO) = this()
  def this(groupOptions: namestringundefinedentryO, loc: RealDependencyLocation) = this()
  def this(groupOptions: namestringundefinedentryO, loc: SyntheticDependencyLocation) = this()
  def this(groupOptions: namestringundefinedentryO, loc: Unit, request: String) = this()
  def this(groupOptions: namestringundefinedentryO, loc: RealDependencyLocation, request: String) = this()
  def this(groupOptions: namestringundefinedentryO, loc: SyntheticDependencyLocation, request: String) = this()
  
  /**
  	 * Adds a DependencyBlock to DependencyBlock relationship.
  	 * This is used for when a Module has a AsyncDependencyBlock tie (for code-splitting)
  	 */
  /* CompleteClass */
  override def addBlock(block: AsyncDependenciesBlock): Unit = js.native
  
  /* CompleteClass */
  override def addDependency(dependency: Dependency): Unit = js.native
  
  /* CompleteClass */
  var blocks: js.Array[AsyncDependenciesBlock] = js.native
  
  var chunkName: String = js.native
  
  /**
  	 * Removes all dependencies and blocks
  	 */
  /* CompleteClass */
  override def clearDependenciesAndBlocks(): Unit = js.native
  
  /* CompleteClass */
  var dependencies: js.Array[Dependency] = js.native
  
  /* CompleteClass */
  override def deserialize(__0: ObjectDeserializerContext): Unit = js.native
  
  /* CompleteClass */
  override def getRootBlock(): DependenciesBlock = js.native
  
  var groupOptions: namestringundefinedentryO = js.native
  
  var loc: js.UndefOr[SyntheticDependencyLocation | RealDependencyLocation] = js.native
  
  var module: Any = js.native
  
  /* CompleteClass */
  var parent: DependenciesBlock = js.native
  
  /* CompleteClass */
  override def removeDependency(dependency: Dependency): Unit = js.native
  
  var request: js.UndefOr[String] = js.native
  
  /* CompleteClass */
  override def serialize(__0: ObjectSerializerContext): Unit = js.native
  
  /* CompleteClass */
  override def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit = js.native
}
