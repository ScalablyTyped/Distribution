package typings.tsLoader.servicesHostMod

import typings.tsLoader.interfacesMod.TSInstance
import typings.tsLoader.interfacesMod.WebpackError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/servicesHost", "getSolutionErrors")
@js.native
object getSolutionErrors extends js.Object {
  
  def apply(instance: TSInstance, context: String): js.Array[WebpackError] = js.native
}
