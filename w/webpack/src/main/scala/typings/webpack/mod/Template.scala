package typings.webpack.mod

import typings.webpack.anon.RenderContextcodeGenerati
import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Template")
@js.native
open class Template () extends StObject
object Template {
  
  @JSImport("webpack", "Template")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("webpack", "Template.NUMBER_OF_IDENTIFIER_CONTINUATION_CHARS")
  @js.native
  def NUMBER_OF_IDENTIFIER_CONTINUATION_CHARS: Double = js.native
  inline def NUMBER_OF_IDENTIFIER_CONTINUATION_CHARS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_OF_IDENTIFIER_CONTINUATION_CHARS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webpack", "Template.NUMBER_OF_IDENTIFIER_START_CHARS")
  @js.native
  def NUMBER_OF_IDENTIFIER_START_CHARS: Double = js.native
  inline def NUMBER_OF_IDENTIFIER_START_CHARS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_OF_IDENTIFIER_START_CHARS")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def asString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asString(str: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def getFunctionContent(fn: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionContent")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def getModulesArrayBounds(modules: js.Array[WithId]): `false` | (js.Tuple2[Double, Double]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getModulesArrayBounds")(modules.asInstanceOf[js.Any]).asInstanceOf[`false` | (js.Tuple2[Double, Double])]
  
  /* static member */
  inline def indent(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def indent(s: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def numberToIdentifier(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToIdentifier")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def numberToIdentifierContinuation(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToIdentifierContinuation")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def prefix(s: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(s.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def prefix(s: js.Array[String], prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(s.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def renderChunkModules(
    renderContext: ChunkRenderContext,
    modules: js.Array[Module],
    renderModule: js.Function1[/* arg0 */ Module, Source]
  ): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChunkModules")(renderContext.asInstanceOf[js.Any], modules.asInstanceOf[js.Any], renderModule.asInstanceOf[js.Any])).asInstanceOf[Source]
  inline def renderChunkModules(
    renderContext: ChunkRenderContext,
    modules: js.Array[Module],
    renderModule: js.Function1[/* arg0 */ Module, Source],
    prefix: String
  ): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChunkModules")(renderContext.asInstanceOf[js.Any], modules.asInstanceOf[js.Any], renderModule.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Source]
  
  /* static member */
  inline def renderChunkRuntimeModules(runtimeModules: js.Array[RuntimeModule], renderContext: RenderContext): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChunkRuntimeModules")(runtimeModules.asInstanceOf[js.Any], renderContext.asInstanceOf[js.Any])).asInstanceOf[Source]
  
  /* static member */
  inline def renderRuntimeModules(runtimeModules: js.Array[RuntimeModule], renderContext: RenderContextcodeGenerati): Source = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRuntimeModules")(runtimeModules.asInstanceOf[js.Any], renderContext.asInstanceOf[js.Any])).asInstanceOf[Source]
  
  /* static member */
  inline def toComment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toComment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def toIdentifier(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIdentifier")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def toNormalComment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNormalComment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def toPath(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPath")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
