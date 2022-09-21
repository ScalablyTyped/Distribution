package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.IShimFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.ShimBase")
@js.native
open class ShimBase protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.ShimBase {
  def this(factory: IShimFactory) = this()
  
  /* CompleteClass */
  override def dispose(dummy: Any): Unit = js.native
  
  /* private */ /* CompleteClass */
  var factory: Any = js.native
}
