package typings.webpack.mod

import typings.webpack.anon.Ident
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type __TypeWebpackOptions = (data : object): string | {  ident :string | undefined,   loader :string | undefined,   options :string | {[index: string] : any} | undefined} | webpack.webpack.__TypeWebpackOptions | std.Array<webpack.webpack.RuleSetUseItem>
}}}
to avoid circular code involving: 
- webpack.webpack.RuleSetUse
- webpack.webpack.RuleSetUseItem
- webpack.webpack.__TypeWebpackOptions
*/
@js.native
trait TypeWebpackOptions
  extends StObject
     with _RuleSetUse
     with _RuleSetUseItem {
  
  def apply(data: js.Object): String | Ident | TypeWebpackOptions | js.Array[RuleSetUseItem] = js.native
}
