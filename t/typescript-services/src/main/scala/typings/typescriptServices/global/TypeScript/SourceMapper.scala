package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SourceMapper")
@js.native
class SourceMapper protected ()
  extends typings.typescriptServices.TypeScript.SourceMapper {
  def this(
    jsFile: typings.typescriptServices.TypeScript.TextWriter,
    sourceMapOut: typings.typescriptServices.TypeScript.TextWriter,
    document: typings.typescriptServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}
object SourceMapper {
  
  @JSGlobal("TypeScript.SourceMapper")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SourceMapper.MapFileExtension")
  @js.native
  def MapFileExtension: String = js.native
  @scala.inline
  def MapFileExtension_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MapFileExtension")(x.asInstanceOf[js.Any])
}
