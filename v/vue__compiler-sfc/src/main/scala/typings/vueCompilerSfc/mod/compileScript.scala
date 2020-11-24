package typings.vueCompilerSfc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-sfc", "compileScript")
@js.native
object compileScript extends js.Object {
  
  def apply(sfc: SFCDescriptor): SFCScriptBlock = js.native
  def apply(sfc: SFCDescriptor, options: SFCScriptCompileOptions): SFCScriptBlock = js.native
}
