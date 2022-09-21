package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "RuntimeModule")
@js.native
open class RuntimeModule protected () extends Module {
  def this(name: String) = this()
  def this(name: String, stage: Double) = this()
  
  def attach(compilation: Compilation, chunk: Chunk): Unit = js.native
  def attach(compilation: Compilation, chunk: Chunk, chunkGraph: ChunkGraph): Unit = js.native
  
  var chunk: Chunk = js.native
  
  var chunkGraph: ChunkGraph = js.native
  
  var compilation: Compilation = js.native
  
  var dependentHash: Boolean = js.native
  
  var fullHash: Boolean = js.native
  
  def generate(): String = js.native
  
  def getGeneratedCode(): String = js.native
  
  var name: String = js.native
  
  def shouldIsolate(): Boolean = js.native
  
  var stage: Double = js.native
}
object RuntimeModule {
  
  @JSImport("webpack", "RuntimeModule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Runtime modules which attach to handlers of other runtime modules
  	 */
  /* static member */
  @JSImport("webpack", "RuntimeModule.STAGE_ATTACH")
  @js.native
  def STAGE_ATTACH: Double = js.native
  inline def STAGE_ATTACH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_ATTACH")(x.asInstanceOf[js.Any])
  
  /**
  	 * Runtime modules with simple dependencies on other runtime modules
  	 */
  /* static member */
  @JSImport("webpack", "RuntimeModule.STAGE_BASIC")
  @js.native
  def STAGE_BASIC: Double = js.native
  inline def STAGE_BASIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_BASIC")(x.asInstanceOf[js.Any])
  
  /**
  	 * Runtime modules without any dependencies to other runtime modules
  	 */
  /* static member */
  @JSImport("webpack", "RuntimeModule.STAGE_NORMAL")
  @js.native
  def STAGE_NORMAL: Double = js.native
  inline def STAGE_NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_NORMAL")(x.asInstanceOf[js.Any])
  
  /**
  	 * Runtime modules which trigger actions on bootstrap
  	 */
  /* static member */
  @JSImport("webpack", "RuntimeModule.STAGE_TRIGGER")
  @js.native
  def STAGE_TRIGGER: Double = js.native
  inline def STAGE_TRIGGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_TRIGGER")(x.asInstanceOf[js.Any])
}
