package typings.webpack.mod

import typings.node.NodeJS.CallSite
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "WebpackError")
@js.native
/**
	 * Creates an instance of WebpackError.
	 */
open class WebpackError ()
  extends StObject
     with Error {
  def this(message: String) = this()
  
  var chunk: Chunk = js.native
  
  def deserialize(__0: ObjectDeserializerContext): Unit = js.native
  
  var details: Any = js.native
  
  var file: String = js.native
  
  var hideStack: Boolean = js.native
  
  var loc: DependencyLocation = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  var module: Module = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  def serialize(__0: ObjectSerializerContext): Unit = js.native
}
object WebpackError {
  
  @JSImport("webpack", "WebpackError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Create .stack property on a target object
  	 */
  /* static member */
  inline def captureStackTrace(targetObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(targetObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def captureStackTrace(targetObject: js.Object, constructorOpt: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(targetObject.asInstanceOf[js.Any], constructorOpt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
  	 * Optional override for formatting stack traces
  	 */
  /* static member */
  @JSImport("webpack", "WebpackError.prepareStackTrace")
  @js.native
  def prepareStackTrace: js.UndefOr[js.Function2[/* err */ js.Error, /* stackTraces */ js.Array[CallSite], Any]] = js.native
  inline def prepareStackTrace_=(x: js.UndefOr[js.Function2[/* err */ js.Error, /* stackTraces */ js.Array[CallSite], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prepareStackTrace")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webpack", "WebpackError.stackTraceLimit")
  @js.native
  def stackTraceLimit: Double = js.native
  inline def stackTraceLimit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stackTraceLimit")(x.asInstanceOf[js.Any])
}
