package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "GLSLDataSender")
@js.native
open class GLSLDataSender protected ()
  extends typings.wonderJs.distEs2015RendererProgramGlsldatasenderMod.GLSLDataSender {
  def this(program: typings.wonderJs.distEs2015RendererProgramProgramMod.Program) = this()
}
/* static members */
object GLSLDataSender {
  
  @JSImport("wonder.js/dist/es2015", "GLSLDataSender")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(program: typings.wonderJs.distEs2015RendererProgramProgramMod.Program): typings.wonderJs.distEs2015RendererProgramGlsldatasenderMod.GLSLDataSender = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(program.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.distEs2015RendererProgramGlsldatasenderMod.GLSLDataSender]
}
