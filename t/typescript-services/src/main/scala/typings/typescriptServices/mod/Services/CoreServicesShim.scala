package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.ICoreServicesHost
import typings.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.CoreServicesShim")
@js.native
class CoreServicesShim protected ()
  extends typings.typescriptServices.TypeScript.Services.CoreServicesShim {
  def this(factory: IShimFactory, host: ICoreServicesHost) = this()
}
