package typings.styledJsx

import typings.std.TemplateStringsArray
import typings.styledJsx.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macroMod {
  
  @JSImport("styled-jsx/macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve(chunks: TemplateStringsArray, args: Any*): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(scala.List(chunks.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ClassName]
}
