package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "DllReferencePlugin")
@js.native
open class DllReferencePlugin protected () extends StObject {
  def this(options: DllReferencePluginOptions) = this()
  
  @JSName("apply")
  def apply(): Unit = js.native
  @JSName("apply")
  def apply(compiler: Any): Unit = js.native
  
  var options: DllReferencePluginOptions = js.native
}
