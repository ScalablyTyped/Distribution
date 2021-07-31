package typings.styledJsx

import typings.std.TemplateStringsArray
import typings.styledJsx.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @scala.inline
  def apply(chunks: TemplateStringsArray, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].apply(chunks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("styled-jsx/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def global(chunks: TemplateStringsArray, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("global")(chunks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def resolve(chunks: TemplateStringsArray, args: js.Any*): ClassName = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(chunks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassName]
}
