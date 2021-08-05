package typings.stylableCore

import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.Root_
import typings.stylableCore.typesMod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@stylable/core/cjs/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cssObjectToAst(cssObject: CSSObject): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cssObjectToAst")(cssObject.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def cssObjectToAst(cssObject: CSSObject, sourceFile: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cssObjectToAst")(cssObject.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def safeParse(css: String): Root_ = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(css.asInstanceOf[js.Any]).asInstanceOf[Root_]
  inline def safeParse(css: String, options: ProcessOptions): Root_ = (^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root_]
  
  type CssParser = js.Function2[/* css */ String, /* options */ js.UndefOr[ProcessOptions], Root_]
}
